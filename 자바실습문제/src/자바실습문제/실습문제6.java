package 자바실습문제;
/*
 *  6.	Scanner 클래스를 이용하여 한 개의 정수를 입력 받아 
 *      정수의 절대값을 출력하라 (1=>1 , -1=>1)
 */
import java.util.*;
public class 실습문제6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("정수 입력:");
        int num=scan.nextInt();
        if(num<0)
        {
        	System.out.println(num+"의 절대값은 "+Math.abs(num)+"입니다");
        	System.out.println(num+"의 절대값은 "+(-num)+"입니다");
        }
        else
        {
        	System.out.println(num+"의 절대값은 "+Math.abs(num)+"입니다");
        	System.out.println(num+"의 절대값은 "+(num)+"입니다");
        }
        
        // Math.abs(num) 
	}

}
