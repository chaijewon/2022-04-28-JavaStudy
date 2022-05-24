/*
 *   1. 형식 
 *      [접근지정어][옵션] 리턴형 메소드명([매개변수목록]) // 선언문
 *      {
 *          1) 변수선언 
 *          2) 제어 => 제어문 / 연산자
 *          3) 결과값 => return 
 *             *** void일 경우에만 생략할 수 있다 (컴퍼일러가 자동으로 첨부)
 *      }
 *      참조)
 *           컴파일러가 자동 첨부 
 *           1) public class A [extends Object]
 *              {
 *             
 *              }
 *           2) import java.lang.*;
 *                     ------------ String , System , Math
 *           3) 자바의 모든 클래스는 예외처리 
 *           
 *   2. 리턴형 / 매개변수 
 *      ------------- 매개변수 전송
 *      리턴형 : 사용자가 요청한 결과값 (배열,List)
 *             -----------------
 *      매개변수 
 *         1) 사용자 요청한 데이터 
 *            페이지번호, 로그인(id,pwd),검색(검색어),화면전환 
 *            (int page) , (String id,String pwd) , (String ss) , (int view)
 *         2) 회원가입 , 글쓰기 ,답변 
 *            ------------------
 *             => 클래스이용 
 *             class Member
 *             {
 *             }
 *             class Board
 *             {
 *             }
 *   3. 지역변수 
 *       메소드안에서만 사용되는 변수 (매개변수포함) => 스택메모리(메모리 자체 관리)
 *       => 생성되는 시점 => 메소드 호출시마다  
 *   4. 순차적으로 호출 
 *              ---
 *              1) 리턴형이 있는 경우
 *                 리턴형데이터 변수=메소드()
 *                 double random(); 
 *                 => double d=random();
 *                    ------   --------
 *                             메소드명()
 *              2) 리턴형이 없는 경우
 *                 => 메소드명();
 *              3) 매개변수가 있는 경우 
 *                 => int add(int a, int b)
 *                 => int a=add(10,20)
 *                             -------- 매개변수가 받을 수 있는 실제값
 *              4) 매개변수가 없는 경우 
 *                 => add()
 *                 
 *              5) 다른 클래스에서 호출 
 *                 클래스명.메소드명()
 *   5. ==> 메소드 (변수,연산자,제어문)
 *   ============================
 *   
 */
public class 메소드응용_1 {
	//static int a=10;// method 영역
    static void increment()
    {
    	// 메모리 생성 (지역변수 우선순위)
    	int a=10; //스택
    	System.out.println("a="+a);
    	a++;
    	// 메모리에서 사라진다
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        increment();// a변수 사라진다
        increment();
        increment();
	}

}













