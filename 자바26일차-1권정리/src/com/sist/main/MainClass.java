package com.sist.main;
/*
 *    1권 ==> 문법 (1장~8장) 9장 => 라이브러리 => 조립
 *       ==> 자바 프로그램 (네트워크 , 데이터베이스)
 *                              ----------- 웹
 *     1) 변수 설정 
 *        = 데이터의 종류 
 *        = 기본형 
 *            정수형 : byte , int , long 
 *                   ----- IO/Network (웹 : 업로드 , 다운로드)
 *            실수형 : double
 *            문자형 : char
 *            논리형 : boolean 
 *        = 사용자 정의
 *             기본형 여러개를 묶어서 한번 저장할 목적 => class 
 *        = 변수 종류 
 *          = 멤버변수 (인스턴스 변수)
 *          = 공유변수 (정적 변수) => 메모리 공간이 1개만 생성 
 *          = 지역변수 (메소드안에서 선언되는 변수)
 *          = 프로그램 종료시까지 사용 , 한번 사용후 제거
 *          = 예) 다른 클래스에서 사용 , 값을 변경해서 사용 
 *        --------------------------------------------- 30%
 *     2) 처리 (요청,연산처리) 
 *        연산자 / 제어문 = 메소드 
 *        -----
 *          단항연산자 ( ++ , -- , ! , (type))
 *          이항연산자 ( 산술 , 대입 , 논리 , 비교 )
 *          삼항연산자 ( ?: )
 *        제어문 
 *        ----- 
 *          if , if~else , if~else if~else if... else
 *          for , while 
 *          break
 *          ------------------------------------------
 *          for()
 *          {
 *             for()
 *             {
 *             }
 *          }
 *          
 *          for()
 *          {
 *             while()
 *             {
 *             }
 *          }
 *          -------------------
 *      3) 메소드 
 *         형식) 접근지정어 옵션 리턴형 메소드명(매개변수...)
 *              ------- [static|final|abstract]
 *              private , default , protected , public 
 *                                              ------- 다른 클래스 연결
 *              옵션 접근지정어 리턴형 메소드명(매개변수..)
 *              
 *         => 리턴형 1개 , 매개변수는 여러개 사용이 가능 
 *                              ---------
 *                               3개이상 배열 , 클래스를 이용한다 
 *         유형)
 *              ------------------------------
 *                 리턴형      매개변수 
 *              ------------------------------
 *                   O         O
 *                   public String substring(int s, int e)
 *                   매개변수 => 사용자 요청값 
 *                   예)
 *                       로그인 
 *                       public boolean isLogin(String id,String pwd)
 *              ------------------------------
 *                   O         X
 *                   public String trim()
 *                   public static double random()
 *              ------------------------------
 *                   X         O
 *                   = void
 *                   = return 생략 (컴파일러가 자동 첨부)
 *                   public void print(String s)
 *              ------------------------------
 *                   X         X
 *                   = void
 *                   = return 생략 (컴파일러가 자동 첨부)
 *                   public void println()
 *              ------------------------------
 *         3) 관련된 내용을 묶어서 관리 => 객체지향 프로그램 
 *            -------------------
 *             = 변수 => 데이터 보호 (캡슐화)
 *             = 재사용 => 상속 / 포함 
 *             = 수정 , 추가 => 다형성 
 *            -------------------- 목적 (유지보수) 
 *            
 *         4) 클래스의 종류 
 *            => 추상클래스 
 *            => 인터페이스 
 *            
 *        -------------------------------------- 기본 문법 
 *         5) 견고한 프로그램을 만든다 (에러를 사전에 방지) 
 *            예외처리 
 *        --------------------------------------
 *         제작이 어려운 기능 => 라이브러리 
 *         ------------------------
 *         => 사용자정의 + 라이브러리 = 프로그램 
 *         => 데이터관리 + 네트워크 게임 
 *            => 라이브러리 
 *               -------- 자바,외부 
 *                        ---
 *                        기본 자바 => J2SE 
 *                        웹 자바  => J2EE
 *                        모바일 자바 => J2ME => Kotlin 
 *               //public int add()
 *               //fun add:int()
 *            => java.lang
 *                Object
 *                  => finalize() , toString(),clone() ,equals()
 *                String
 *                  => equals() , substring() , indexOf()
 *                     lastIndexOf() , trim() , valueOf
 *                     format() , split() , startsWith()
 *                     endsWith() , contains() , length()
 *                StringBuffer
 *                  => append()
 *                Math
 *                   => random() , ceil()
 *                System
 *                   => println() ,print(),printf(),gc() 
 *                Wrapper (Integer,Double,Long,Boolean)
 *                   => parseInt() ...
 *            => java.util
 *               -------------- 날짜 / 시간 
 *               Calendar : 요일 구하기 , 마지막 날짜 
 *               Date
 *               -------------- 
 *               StringTokenizer
 *                 => counterTokens(), hasMoreTokens() , nextToken()
 *               Random
 *                 => nextInt()
 *            => java.io
 *            => java.text
 *            => java.net
 *            => java.sql
 *            -------------- 
 *          
 */
public class MainClass {

	static public void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
