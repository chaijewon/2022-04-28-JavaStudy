package com.sist.exception;
/*
 *    1. 파일 입출력 ========> IOException
 *    2. 데이터베이스 연결 ** ==> SQLException
 *    3. 네트워크 ==> MalformedURLException 
 *    ------------------------------------ 컴파일시에 예외처리 여부 확인 
 *    
 *                  javac                      java
 *    A.java ====================== A.class ============== 실행
 *    ------                        -------
 *    원시소스                         바이트 코드
 *    프로그래머만 인식하는 언어           컴퓨터가 인식 
 *                    |                          |
 *                  컴파일                       인터프리터
 *                  ------ 에러                  -------- 에러 
 *                  컴파일시 에러                   실행에러 
 *                  ----------
 *                  CheckException              UnCheckException
 *                  --------------              -----------------
 *                   반드시 예외 처리                 필요시에만 예외처리 
 *   예외처리 
 *     정의 : 프로그램 실행시에 발생할 수 있는 에러에 대비하는 코드 
 *           에러방지 
 *           에러 : 프로그래머의 실수 (디버깅)
 *                 사용자의 입력 (유효성 검사)
 *                 ------------ 
 *     목적 : 비정상종료를 방지하고 정상상태를 유지 
 *     
 *   => 에러 (414)
 *      에러 : 심각한 에러 (소스상에서 변경할 수 없는 에러)
 *            예) 메모리가 부족 => 종료 
 *      예외 : 가벼운 에러 (소스상에서 수정이 가능한 에러)
 *            예) 사이트연결 (주소가 틀리다)
 *               파일읽기 (경로)
 *               서버연결 => IP
 *      ***** 예외처리를 하면 => 에러를 잡아서 해결해준다(X)
 *            
 *            int a=10/0;==== 에러발생 
 *            System.out.println(a);
 *            
 *            => 0으로 나눌 수 없다  ==> if
 *   => 예외처리 클래스 구조 
 *      ---------------
 *           Object
 *           ------
 *             |
 *          Throwable
 *          ----------
 *             |
 *     -------------------------------
 *     |                             |
 *    Error                        Exception 
 *                                   |
 *                       ---------------------------------
 *                       |                               |
 *                      CheckException           UnCheckException
 *                      => 반드시 예외처리            => 필요시에만 예외처리
 *                      --------------           -----------------
 *                           |                           |
 *                       ***IOException           RuntimeException
 *                        => 파일입출력                     |
 *                                                ArrayIndexOutOfBoundsException 
 *                                                  배열범위를 벗어난 경우 
 *                                                NumberFormatException 
 *                                                  정수 변환이 안되는 경우 
 *                       ***SQLException          ArithmeticException(계산기)
 *                        => 오라클 연결                0으로 나눌 경우에 
 *                       MalformedURLException    ClassCastException
 *                        => 네트워크(Jsoup)            class형변환을 잘못한 경우 
 *                       ClassNotFoundException   NullPointerException
 *                        => 메모리 할당 (new가 없는 상태)  주소값이 없는 경우 
 *                       InterrupedException
 *                        => 쓰레드 (충돌방지)
 *      
 *           
 */
class A
{
	
}
class B extends A
{
	
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*try
		{
		int a=10/0;
		System.out.println(a);
		}catch(Exception ex) {System.out.println("0으로 나눌 수 없습니다");}*/
		//A a=new B();
		//B b=(B)a;
		
		
	}

}
