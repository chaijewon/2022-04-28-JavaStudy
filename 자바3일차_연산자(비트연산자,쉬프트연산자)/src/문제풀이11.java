/*
 *  사용자로부터 두 개의 정수를 입력 받아서 뺄셈과 
 *  곱셈 연산의 결과를 출력하는 프로그램을 작성
 */
import java.util.Scanner;
public class 문제풀이11 {
   public static void main(String[] args) {
	  Scanner scan=new Scanner(System.in);
	  System.out.print("첫번째 정수 입력:");
	  int num1=scan.nextInt();
	  System.out.print("두번째 정수 입력:");
	  int num2=scan.nextInt();
	  System.out.printf("%d-%d=%d\n",num1,num2,num1-num2);
	  System.out.printf("%d*%d=%d\n",num1,num2,num1*num2);
	  /*
	   *   int a=10;// 메모리 만들어서 저장 
	   *   int a=20;// 메모리 만들어서 저장 
	   *   
	   *   int a=10;// 메모리 만들어서 저장
	   *   a=20;// 10대신 20으로 변경 
	   */
   }
}
