import java.util.Arrays;

public class 자바메소드_호출3 {
    static int[] lotto()
    {
    	int[] arr=new int[6];
    	for(int i=0;i<arr.length;i++)
    	{
    		arr[i]=(int)(Math.random()*45)+1;//1~45
    	}
    	return arr;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr=lotto();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        
        arr=lotto();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        
        arr=lotto();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        
        arr=lotto();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        
        arr=lotto();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
	}

}
