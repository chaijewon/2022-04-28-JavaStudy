// 증감연산자
/*
 *   a++ => 다음에 증가
 *   ++a => 바로 증가 
 */
public class 문제풀이5 {
	public static void main(String[] arg) 
	{
	      int num1=10;   
	      System.out.printf("%d \n", num1);//10
	      num1++; // 증가 안됨 
	      // 증가 (1)
	      System.out.printf("%d \n", num1);//11
	      ++num1;// 증가됨 
	      System.out.printf("%d \n", num1);//12
	      --num1;//감소 num1=11
	      System.out.printf("%d \n", num1);//11
	      num1--;
	      System.out.printf("%d \n", num1);//10
	}


}
