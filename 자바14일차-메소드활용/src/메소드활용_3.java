import java.util.Arrays;

// 배열 => 난수 
public class 메소드활용_3 {
    static void getRand(int[] arr)
    {
    	for(int i=0;i<arr.length;i++)
    	{
    		arr[i]=(int)(Math.random()*100)+1;
    	}
    }
    /*
     *     30 10 20 50 40
     *     -- --
     *     10 30
     *        -- --
     *        20 30
     *           -- --
     *           30 50
     *              -- --
     *              40 50
     *      --------------
     *      10 20 30 40 
     *      -- --
     *      10 20
     *         -- --
     *         20 30
     *            -- --
     *            30 40 
     *      --------------
     *      10 20 30 (40,50)
     *      -- --
     *      10 20 
     *         -- --
     *         20 30
     *      ---------------
     *      10 20 (30,40,50)
     *      -- --
     *         
     *         i  j
     *         0  4
     *         1  3
     *         2  2
     *         3  1
     *         ----  i+j=4 => j=4-i
     *         
     *              
     *              
     *              
     */
    static void sort(int[] arr)
    {
    	for(int i=0;i<arr.length-1;i++)
    	{
    		for(int j=0;j<arr.length-1-i;j++)
    		{
    			if(arr[j]<arr[j+1])
    			{
    				int temp=arr[j];
    				arr[j]=arr[j+1];
    				arr[j+1]=temp;
    			}
    		}
    	}
    }
    static void process()
    {
    	int[] arr=new int[5];
    	System.out.println("변경전:");
    	System.out.println(Arrays.toString(arr));
    	System.out.println("변경후:");
    	getRand(arr);
    	System.out.println(Arrays.toString(arr));
    	//sort(arr);
    	Arrays.sort(arr);
    	System.out.println(Arrays.toString(arr));
    	for(int i=arr.length-1;i>=0;i--)
    	{
    		System.out.print(arr[i]+" ");
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        process();
	}

}
