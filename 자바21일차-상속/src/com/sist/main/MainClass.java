package com.sist.main;
/*
 *    *** 프로젝트 : 요구사항 분석 - 데이터베이스 설계 - 크롤링 - 화면 UI - 구현 - 발표
 *    *** 이름이 여러개 있으면 개발이 어렵다 
 *        ---------------- 한개로 제어 a1~a700 => arr[700]
 *        클래스가 여러개 => 배열(X) , ***인터페이스(스프링)
 *                                ----------------  
 *    자바 문법 
 *       = 데이터 저장 (데이터베이스 설계)
 *         --------- 변수 : 묶어서 관리 (배열/클래스) 
 *                         => 클래스 (배열 일부) 
 *         한개 =====  변수
 *         같은 것 여러개 == 배열
 *         다른 것 여러개 == 클래스 
 *         상수 = 한개 
 *         ** 열거형 = 여러개 
 *         
 *         JDK 14 ==> JDK 1.8 ==> regex , 람다 , nio
 *       -------------------------------------------
 *       = 처리 (요청) => 자바 (서버)
 *         브라우저 ==> 처리 (결과값)
 *                   ------------ 자바
 *       = Front-End : HTML/CSS/JavaScript(Jquery,Ajax,Vue,Node,React) 
 *       = Back-End : 오라클 / 자바 / JSP / Spring(80%)
 *       ------------------------------------------------------
 *       => 연산자 / 제어문 
 *          ------------ 메소드 
 *              -------------- 클래스 
 *                    --------------- 패키지 
 *         
 *    클래스 구성요소 
 *      = 변수 (전역변수) 
 *        => 인스턴스변수 : 따로 저장하는 변수 (클래스는 한개 => 메모리에 여러개 저장)
 *        => 공통으로 사용되는 변수 (static)
 *        => private 
 *      = 메소드 (다른 클래스와 연결 / 기능 처리)
 *        => public 
 *      = 초기화 (필요시에만)
 *        = 생성자 (없는 경우에는 자동 추가)
 *        = 초기화 블록 (필요시에만 사용)
 *    객체지향 프로그램 *****
 *      = 데이터 보호 (변경,손실) = 캡슐화 (변수:은닉화 , 메소드로 접근)
 *        변수 : 읽기/쓰기 
 *        = 변수 여러개를 모아서 관리 => 사용자 정의 데이터형 
 *          => 변수 / getter / setter
 *      = 재사용 : 변경해서 사용 (상속:is-a) , 그대로 사용 (포함:has-a)
 *        상속 (310page)
 *        ---
 *         1) 기존의 클래스를 재사용해서 새로운 클래스를 작성 
 *         2) 재사용 => 코드를 줄일 수 있다 (반복 제거)
 *            ----- 공통으로 적용되는 메소드 ,변수
 *                  ----------
 *         3) extends : 확장 
 *         4) 상위 클래스 => 부모 클래스 , 기본 클래스 ,super 클래스
 *            --------- 데이터형 크기 
 *            하위 클래스 => 자식 클래스 , 파생 클래스 ,sub 클래스
 *            -------- 메모리는 크다 
 *         5) 자바에서 사용하는 모든 클래스 : Object 
 *         6) 상속에서 예외조건 : 생성자 , 초기화블록 
 *         7) 단점 : 속도가 늦다 , 다른 클래스 영향력이 많다
 *                             ------------- 결합성 낮게 , 응집력 높게
 *                             ------------- 스프링 (POJO) => 독립적 클래스 
 *         8) 자바:실무중심의 프로그램 => 상속은 단일 상속만 가능
 *         9) 수정 , 추가가 용이 
 *            --- 
 *         ****** 자바은 오버라이딩 기법
 *                     ------- 상속이 존재해야 된다  
 *         ****** 스프링 ==> 전자정부 프레임워크 , 애니 프레임워크 
 *                         => 공기업         => 대기업 
 *                  
 *      = 다형성 : 수정(오버라이딩) , 추가(오버로딩)
 *      = 형변환 => ClassCastException
 *        A a=new B(); => 상속   
 *    예외처리 
 *    라이브러리 => 형변환  
 *    프로그램 응용 
 *    
 *           영화 => 예매
 *            |
 *       --------------
 *       |      |     |
 *      CGV   메가박스  롯데시네마
 *      
 *           책 => 장바구니 
 *           |
 *      --------------
 *      |            |
 *     YES 24      알라딘   ==> 개발시간 줄일 수 있다 
 *     
 *        뮤직 => 포인트 
 *         |
 *     -------------
 *     |      |     |
 *    멜론    지니    mNet => 각 사이트 필요한 추가 
 *    
 *        
 *    
 *      
 */
class 멜론뮤직{
	private int mno; // => 상속 => 접근이 불가능 
	private String title;
	private String singer;
	private String album;
	private String poster;
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	
}
// 상속 => 내리상속 (private(접근 금지)=> getter/setter ,  
// static : 공통적으로 사용이 가능 (상속에서 제외) => 생성자 , 초기화 블록 
// 인스턴스 변수 , 인스턴스 메소드
class 지니뮤직 extends 멜론뮤직{
	/*private int mno; // => 상속 => 접근이 불가능 
	private String title;
	private String singer;
	private String album;
	private String poster;*/
	// 포함 
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        지니뮤직 genie=new 지니뮤직();
        
	}

}








