/*
 *   ** 단항연산자 (-,+) 
 *      int a=1
 *      a=-a;//음수 
 *   이항연산자 : 피연산자(연산대상) 2개일때 
 *             a+b
 *             - -
 *   => 산술 연산자 ( + , -  , *  ,  /  , % )
 *      + :  실제 산술 , 문자열 결합(***) => 크롤링
 *      - , * :  산술
 *      / => 0으로 나눌 수 없다 , 정수/정수=정수 (오라클 , JSTL => 실수)
 *      % => 남는 값은 왼쪽부호를 따라 간다 
 *      
 *      우선순위 : * , / , % 우선순위 , +,- 나중 순위
 *       
 */
// 3개의 정수를 받아서 총점 / 평균을 구한다 
import java.util.Scanner;
public class 이항연산자_산술연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //변수 선언 
		int kor,eng,math;
		int total;
		double avg;
		
		//변수 초기화 
		Scanner scan=new Scanner(System.in); // 사용자 입력값 (도스에서 사용)
		// System.in => 키보드 입력값을 가지고 온다 
		System.out.print("국어점수 입력:");
		kor=scan.nextInt();
		
		System.out.print("영어점수 입력:");
		eng=scan.nextInt();
		
		System.out.print("수학점수 입력:");
		math=scan.nextInt();
		
		// 총점 
		total=kor+eng+math;
		// 평균 
		avg=total/3.0; // 소수점 => 실수로 나눠준다 
		//화면 출력 
		System.out.println("국어점수:"+kor);
		System.out.println("영어점수:"+eng);
		System.out.println("수학점수:"+math);
		System.out.println("총점:"+total);
		System.out.printf("평균:%.2f\n",avg);//반올림 
	}

}
