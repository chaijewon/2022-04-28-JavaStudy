// 경우의 수 => 
/*
 *    조건 1 => if 
 *      => true/false => if~else
 *    조건 2 => 다중 조건문 
 */
import java.util.Random;
public class 선택조건문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 정수 => 임의의 수 => 짝수/홀수 
		// 자바 => 웹,모바일,일반자바 => 동일 
	    // 임의의 수를 추출 
		Random rnd=new Random();
		int num=rnd.nextInt(100)+1; //1~100
		System.out.println("num="+num);
		if(num%2==0)
			System.out.println("짝수");
		else
			System.out.println("홀수");
	}

}
