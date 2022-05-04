/*
 *    다중 조건문 => 실행이 한개만 
 *    형식)
 *         if(조건문)
 *         {
 *            조건이 true일때 실행문장 => 실행후에 종료 
 *            조건이 false일때
 *                   ↓
 *         }   
 *         else if(조건문)
 *         {
 *            조건이 true일때 실행문장 => 실행후에 종료 
 *            조건이 false일때
 *                   ↓
 *         }
 *         else if(조건문)
 *         {
 *            조건이 true일때 실행문장 => 실행후에 종료 
 *            조건이 false일때
 *                   ↓
 *         }
 *         else if(조건문)
 *         {
 *            조건이 true일때 실행문장 => 실행후에 종료 
 *            조건이 false일때
 *                   ↓
 *         }
 *         else
 *         {
 *            디폴트 (해당 조건이 없는 경우에 실행되는 문장) => 생략
 *         }
 *         
 *         사칙연산 => +,-,*,/ 입력이 안된 경우 => 연산자 없다 
 *         
 *         
 */
import java.util.Scanner;
public class 다중조건문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("첫번째 정수 입력:");
        int num1=scan.nextInt();// nextDouble() , nextBoolean()
        System.out.print("두번째 정수 입력:");
        int num2=scan.nextInt();
        
        //연산자 
        System.out.print("연산자 입력(+,-,*,/):");
        String strOp=scan.next();//문자열 
        char op=strOp.charAt(0);// 문자열에 char 추출 
        /*
         *   Hello Java
         *   0123456789
         *   
         *   +
         *   
         */
        if(op=='+')
        {
        	System.out.printf("%d+%d=%d\n",num1,num2,num1+num2);
        }
        else if(op=='-')
        {
        	System.out.printf("%d-%d=%d\n",num1,num2,num1-num2);
        }
        else if(op=='*')
        {
        	System.out.printf("%d*%d=%d\n",num1,num2,num1*num2);
        }
        else if(op=='/')
        {
        	// 중첩 
        	if(num2==0)
        		System.out.println("0으로 나눌 수 없다");
        	else
        		System.out.printf("%d/%d=%.2f\n",num1,num2,num1/(double)num2);
        }
        else //default => 생략이 가능 
        {
        	System.out.println("잘못된 연산자입니다!!");
        }
        
        
        
	}

}








