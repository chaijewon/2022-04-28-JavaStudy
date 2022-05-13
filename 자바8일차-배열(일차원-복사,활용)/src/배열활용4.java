/*
 *    버블정렬 
 *    ------
 *     50 30 10 40 20  => DESC : 50 40 30 20 10, ASC : 10 20 30 40 50
 *     -- --
 *     30 50
 *        -- --
 *        10 50
 *           -- --
 *           40 50
 *              -- --
 *              20 50
 *     --------------- for-1(1round)
 *     30 10 40 20 50 
 *                 --고정 
 *     30 10 40 20 50
 *     -- --
 *     10 30
 *        -- --
 *        30 40
 *           -- --
 *           20 40
 *    ---------------- for-2(2round)
 *    10  30 20 40 50
 *              ----- 고정 
 *    10  30 20 40 50
 *    --  --
 *    10  30
 *        -- --
 *        20 30 
 *    ----------------- for-3(3round)
 *    10  20 30 40 50
 *           --------
 *    10  20 30 40 50
 *    --  --
 *    10  20
 *    ----------------- for-4(4round)
 *    10  20 30 40 50
 *    i    j
 *    0 => 4
 *    1 => 3
 *    2 => 2
 *    3 => 1
 *    
 *    i+j=4  => j=4(arr.length-1)-i
 *                --  arr.length-i 
 *     
 */
// 202-203page => 필수 
public class 배열활용4 {
    public static void sort(int[] arr)
    {
    	for(int i=0;i<arr.length;i++)
        {
        	arr[i]=(int)(Math.random()*100)+1;
        }
        System.out.println("정렬 전:");
        for(int i:arr)
        {
        	System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("정렬 후:");
        // 버블 정렬
        for(int i=0;i<arr.length-1;i++)
        {
        	for(int j=0;j<arr.length-1-i;j++)
        	{
        		if(arr[j]>arr[j+1])
        		{
        			int temp=arr[j];
        			arr[j]=arr[j+1];
        			arr[j+1]=temp;
        		}
        	}
        }
        
        for(int i:arr)
        {
        	System.out.print(i+" ");
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr=new int[5];
        // 초기화 
        for(int i=0;i<arr.length;i++)
        {
        	arr[i]=(int)(Math.random()*100)+1;
        }
        System.out.println("정렬 전:");
        for(int i:arr)
        {
        	System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("정렬 후:");
        // 버블 정렬
        for(int i=0;i<arr.length-1;i++)
        {
        	for(int j=0;j<arr.length-1-i;j++)
        	{
        		if(arr[j]>arr[j+1])
        		{
        			int temp=arr[j];
        			arr[j]=arr[j+1];
        			arr[j+1]=temp;
        		}
        	}
        }
        
        for(int i:arr)
        {
        	System.out.print(i+" ");
        }
        
	}

}






