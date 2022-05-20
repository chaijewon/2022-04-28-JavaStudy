import java.util.Arrays;

// 매개변수 전송 
/*
 *    Call By Value (값전송) => 복사본(원본은 그대로 유지)
 *    Call By Reference (주소 전송) => 배열 , 클래스 
 *                      => String (일반 변수 제외)
 *                      원본 => 원본 자체 변경 
 */
public class 메소드정리_8 {
    static void input(int[] arr)
    {
    	System.out.println("arr:"+arr.toString());
    	for(int i=0;i<arr.length;i++)
    	{
    		arr[i]=(int)(Math.random()*100)+1;
    	}
    }
    static void process()
    {
    	int[] arr2=new int[5];
    	System.out.println("arr2:"+arr2.toString());
    	System.out.println("====== 변경전 ======");
    	System.out.println(Arrays.toString(arr2));
    	System.out.println("====== 변경후 ======");
    	input(arr2);
    	System.out.println(Arrays.toString(arr2));
    	
    }
    static void input2(int x)
    {
    	x=100;
    }
    static void process2()
    {
    	int a=10;
    	System.out.println("===== 변경전 =====");
    	System.out.println("a="+a);
    	System.out.println("===== 변경후 =====");
    	input2(a);
    	System.out.println("a="+a);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        process();
	}

}
