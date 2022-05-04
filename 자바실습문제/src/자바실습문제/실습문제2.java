package 자바실습문제;
/*
 *   2.	정수 한 개를 입력 받아서, 그 수가 3의 배수인지 판단해보자.
 *   if~else
 */
import java.util.*;
public class 실습문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("정수 입력:");
        int num=scan.nextInt();
        if(num%3==0)//3배수 처리
        {
        	System.out.println(num+"은(는) 3의 배수입니다");
        }
        else
        {
        	//3배가 아닌 경우 처리 
        	System.out.println(num+"은(는) 3의 배수가 아닙니다");
        }
	}

}
