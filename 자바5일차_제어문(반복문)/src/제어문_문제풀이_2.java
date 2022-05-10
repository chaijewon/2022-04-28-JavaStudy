/*
 *  정수 2개와 연산자(+,-,*,/)를 입력 받아 사칙 연산하는 
    프로그램을 만들어라 (switch~case 사용) 

 */
import java.util.Scanner;
public class 제어문_문제풀이_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);//클래스를 저장후에 사용 
        // 클래스 저장시에 반드시 => new (malloc(sizeof(클래스))) => 동적메모리 할당 
        // new => 메모리 크기를 알 수 없다 (기본형) 
        System.out.print("첫번째 정수 입력:");
        int num1=scan.nextInt();
        
        System.out.print("두번째 정수 입력:");
        int num2=scan.nextInt();
        
        System.out.print("연산자 입력:");
        String op=scan.next();
        
        switch(op)
        {
          case "+":
        	  System.out.printf("%d+%d=%d\n",num1,num2,num1+num2);
        	  break;
          case "-":
        	  System.out.printf("%d-%d=%d\n",num1,num2,num1-num2);
        	  break;
          case "*":
        	  System.out.printf("%d*%d=%d\n",num1,num2,num1*num2);
        	  break;
          case "/":
        	  if(num2==0)
        		  System.out.println("0으로 나눌 수 없다!!");
        	  else //0이 아니라면
        		  System.out.printf("%d/%d=%d\n",num1,num2,num1/num2);
        	  break;
          default:
        	  System.out.println("해당 연산자가 없습니다");
        }
        
	}

}
