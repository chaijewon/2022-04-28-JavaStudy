
public class 문제풀이6 {
	public static void main(String[] arg) 
	{
	       int num1=10, num2=10;   
	       int a, b;   
	       a = ++num1;// 전치
	     //    --- 1    => num1=11
	     //  -- 2       => a=11
	       b = num2++;// 후치 
	     // --- 1 b=10
	     //    ------ 2 num2=11

	       System.out.printf("%d, %d \n", b, num2);//10,11
	}

}
