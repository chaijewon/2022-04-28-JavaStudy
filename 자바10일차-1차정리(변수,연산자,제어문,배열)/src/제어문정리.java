/*
 *   변수 / 명령문 (프로그램 흐름제어) => 명령문을 건너뛴다, 반복적으로 수행
 *                                해당되는 조건에서 처리 ....
 *   ---   -----
 *    |      |
 *   배열    메소드 => 수정 , 추가 , 삭제가 쉽게 할 수 있게 만든다 
 *                  => 문단의 단락을 나눠서 처리 =>  구조적인 프로그램 
 *            => 연산자/제어문
 *   프로그램의 흐름제어 (제어문)
 *   ---------------------
 *     1. 조건문 (필요시 건너뛰는 프로그램, 오류 처리)
 *        if
 *           형식)
 *                if(조건문:부정연산자,논리연산자,비교연산자만 사용이 가능)
 *                {
 *                    조건 : true/false만 나와야 처리가 가능하다 
 *                    => true일때만 처리되는 문장 
 *                }
 *        if~else : true/false일때 나눠서 처리 => 삼항연산자와 동일
 *                  Login => Login=main으로 이동
 *                           Login(X) => back() => 다시 로그인으로 
 *                  이아디 중복 => 결과값이 2개 결과값이 있는 경우 (if~else)
 *           형식)
 *                if(조건문)
 *                {
 *                   조건이 true일때 처리 
 *                }
 *                else
 *                {
 *                   조건이 false일때 처리 문장 
 *                }
 *                
 *        if~else if ~ else if ~ else
 *         => 경우의 수가 많은 경우 => Login
 *                                => ID가 없는 경우
 *                                => 비밀번호가 틀린 경우
 *                                => 로그인 
 *         => 회원가입 
 *     2. 반복적으로 수행되는 문장이 있는 경우 => 처리 (반복문)
 *        for
 *        while
 *     3. 반복수행 => 종료/제외 => 반복제어문 
 *        break
 */
// 정수를 입력받아서 짝수 출력 , 홀수면 건너뛴다...
import java.util.Scanner;
public class 제어문정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 조건문 
		Scanner scan=new Scanner(System.in);//라이브러리
		System.out.print("정수 입력:");
		int input=scan.nextInt();
		// {}없는 경우에는 바로 밑에 있는 문장 1개만 수행 
		/*if(input%2==0)
		{
			System.out.println("짝수입니다!");// if문 
		    System.out.println("프로그램 종료");// if문과 관련없는 문장
		}*/
		if(input%2==0) // 짝수라면 true
		{
			System.out.println("짝수");
		}
		else //짝수가 아니라면 false
		{
			System.out.println("홀수");
		}
		
		System.out.println(input%2==0?"짝수":"홀수");
		//                            true   false
		
	}

}







