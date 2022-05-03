/*
 *  두 개의 정수를 입력 받아서 첫째 수를 둘째 수로 나눈 나머지를 
 *  출력하는 프로그램을 작성해 보자.
 */
import java.util.Scanner;
public class 문제풀이13 {
   public static void main(String[] args) {
	  Scanner scan=new Scanner(System.in);
	  System.out.print("정수 두개 입력:(10 20)");
	  int n1=scan.nextInt();
	  int n2=scan.nextInt();
	  System.out.printf("%d %% %d=%d",n1,n2,n1%n2);
   }
}
