/*
 *   단일 조건문 : 조건식 ( 비교연산자 , 범위(논리연산자))
 *                     -------- 문자열 
 *   => 형식 
 *      if(조건문)
 *         실행문장 ==> 조건문이 true일때 실행되는 문장 
 *                   조건문이 false면 실행을 못하고 다음문장 내려간다
 *      if(조건문)
 *      {
 *         실행문장
 *         실행문장
 *         ...
 *      }
 *   사칙연산 => 중첩조건문 
 *            --------
 *            if(조건문)
 *            {
 *               if(조건문)
 *               {
 *               }
 *            }
 *   ---------------------
 *   정수 2개 , 연산자 
 */
import java.util.Scanner;
public class 자바조건문_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("첫번째 정수 입력:");
        int num1=scan.nextInt();
        System.out.print("두번째 정수 입력:");
        int num2=scan.nextInt();
        // 연산자 받기
        System.out.print("연산자 입력(+,-,*,/):");
        String strOp=scan.next();
        char op=strOp.charAt(0);// String strOp="+" => 
        if(op=='+') // 비교연산자 , 논리연산자 , 부정연산자 => true/false
        	System.out.printf("%d+%d=%d\n",num1,num2,num1+num2);
        if(op=='-')
        	System.out.printf("%d-%d=%d\n",num1,num2,num1-num2);
        if(op=='*')
        	System.out.printf("%d*%d=%d\n",num1,num2,num1*num2);
        if(op=='/')
        {
        	// 중첩 조건문 
        	if(num2==0)
        		System.out.println("0으로 나눌 수 없습니다");
        	if(num2!=0)
        	    System.out.printf("%d/%d=%.2f\n",num1,num2,
        	    		num1/(double)num2);
        }
	}

}







