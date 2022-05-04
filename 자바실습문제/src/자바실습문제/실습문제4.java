package 자바실습문제;

import java.util.Random;

/*
 *   4.	정수 한 개를 입력받아, 입력받은 수가 짝수인지 홀수인지 판단해보자.
 *   if~else
 */
public class 실습문제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Random rnd=new Random();
        int num=rnd.nextInt(100)+1; //1~100
        if(num%2==0)
        {
        	System.out.println(num+"는(은) 짝수입니다");
        }
        else
        {
        	System.out.println(num+"는(은) 홀수입니다");
        }
	}

}
