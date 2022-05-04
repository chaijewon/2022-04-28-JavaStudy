package 자바실습문제;
/*
 *  1.	정수 한 개를 입력 받아서, 그 수가 50 이상의 수인지 
 *      50미만의 수인지 판단해보자.
 *      
 *      => if~else
 *      => 프로그램은 순차적으로 수행 
 *         조건에 따라 어느때는 건너뛰고 , 반복수행 
 *         프로그램의 흐름 제어 => 제어문 
 *         
 *      형식)
 *           if(조건문)
 *           {
 *              조건문이 true일때 처리하는 문장 
 *           }
 *           else
 *           {
 *              조건문이 false일때 처리하는 문장 
 *           }
 *           
 *           짝수/홀수 , 대문자/소문자 , 로그인여부확인 , 아이디중복여부
 */
import java.util.*;
public class 실습문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Random rnd=new  Random();
        int num=rnd.nextInt(100)+1; //1~100 => 추출 
        System.out.println("num="+num);
        if(num>=50)
        {
        	System.out.println("50이상입니다");
        }
        else
        {
        	System.out.println("50미만입니다");
        }
	}

}







