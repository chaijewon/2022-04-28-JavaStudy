/*
 *      => 프로그램 (변수,연산자,제어문) => 오라클 , 자바스크립트 , VueJS
 *                                   JSTL , React 
 *         클래스 
 *          변수 + 메소드 
 *                ----
 *                 연산자+제어문 
 *         객체지향 => 재사용 (묶어둔다)
 *      삼항연산자 (웹에서 => 페이지(이전/다음)) => if~else
 *      1) 형식 : 
 *               (조건)?값1:값2
 *                    --- ---
 *                     |   | 조건이 false일때 수행하는 값
 *                    조건 true일때 수행하는 값
 *         예)
 *            int a=10;
 *             a%2==0?"짝수":"홀수" => 짝수
 *             ------
 *              true 
 */
import java.util.Scanner;
// 정수입력 => 홀수/짝수 
public class 삼항연산자 {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //1. Scanner => 키보드 입력 받기 
		Scanner scan=new Scanner(System.in);
		/*System.out.print("정수 입력:");
		int num=scan.nextInt();
		// 짝수/홀수 => 처리 
		char result=num%2==0?'짝':'홀';
		System.out.println(result+"수");*/
		// scanner는 문자를 받을 수 없다 / 문자열 (String)
		System.out.print("알파벳 입력:");
		String alpha=scan.next();
		// charAt(0) => 첫글자를 char로 읽어 온다 
		// "ABCD" charAt(0) , charAt(1), charAt(2) charAt(3)
		char result=(alpha.charAt(0)>='A' && alpha.charAt(0)<='Z')?'대':'소';
		System.out.println(result+"문자");
	}

}






