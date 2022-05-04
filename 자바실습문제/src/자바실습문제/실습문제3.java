package 자바실습문제;
/*
 *   3.	사용자로부터 두 개의 정수를 입력받아,
 *    그 수들의 최대값과 최소값, 합계와 평균을 구해보자.
 */
import java.util.*;
public class 실습문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 정수 두개 받기
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 2개 입력(10 20):");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		
		int max=0,min=0;
		if(num1<num2) // 최대값 , 최소값
		{
			min=num1;
			max=num2;
		}
		//Math.max(num1, num2)
		System.out.println("최소값:"+min);
		System.out.println("최대값:"+max);
		System.out.println("합:"+(min+max));
		System.out.printf("평균:%.2f",(min+max)/2.0);
	}

}
