package 자바실습문제;
/*
 *  8.	정수 2개와 연산자(+,-,*,/)를 입력 받아 사칙 연산하는 
 *      프로그램을 만들어라
 *      중복 => 단일 
 *      중복없는 경우 => 다중 
 *      => 다중 조건문 
 *         if(조건문)
 *         {
 *             조건 true => 실행 => 종료
 *             조건 false 
 *         }        ↓
 *         else if(조건문)
 *         {
 *             조건 true => 실행 => 종료
 *             조건 false 
 *         }        ↓
 *         else if(조건문)
 *         {
 *            조건 true => 실행 => 종료
 *            조건 false 
 *         }
 *         else
 *         {
 *             해당조건이 없는 경우에 처리(생략이 가능)
 *         }
 */
import java.util.*;
public class 실습문제8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("첫번째 정수:");
        int num1=scan.nextInt();
        System.out.print("두번째 정수:");
        int num2=scan.nextInt();
        
        System.out.print("연산자 입력(+,-,*,/):");
        String strOp=scan.next();
        char op=strOp.charAt(0);
        
        // 다중 조건문 ==> switch~case
        int num3=0;
        int k=0;
        
        if(op=='+')
        {
        	num3=num1+num2;
        }
        else if(op=='-')
        {
        	num3=num1-num2;
        }
        else if(op=='*')
        {
        	num3=num1*num2;
        }
        else if(op=='/')
        {
        	if(num2==0)
        		k=1;
        	else
        	{
        		k=0;
        		num3=num1/num2;
        	}
        }
        
        if(k==0)
        {
            System.out.printf("%d %c %d = %d\n",num1,op,num2,num3);	
        }
        else
        {
        	System.out.println("0으로 나눌 수 없다");
        }
        
	}

}








