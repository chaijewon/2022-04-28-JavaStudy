import java.util.Arrays;

public class 메소드활용_2 {
    static void getRand(int[] arr)
    {
    	for(int i=0;i<arr.length;i++)
    	{
    		arr[i]=(int)(Math.random()*100)+1;
    	}
    }
    static int sum(int[] arr)
    {
    	int s=0;
    	for(int i:arr)
    	{
    		s+=i;
    	}
    	return s;
    }
    static void process()
    {
    	int[] arr=new int[5];
    	getRand(arr);
    	System.out.println(Arrays.toString(arr));
    	int s=sum(arr);
    	System.out.println("합:"+s);
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        process();
	}

}
