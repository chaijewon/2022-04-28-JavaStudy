package com.sist.main;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
/*
 *   객체 지향 
 *      => 제어어 
 *         -----
 *         접근제어어(지정어) : 접근 범위를 설정 
 *           private : 자신의 클래스에서만 접근이 가능 (다른 클래스에서는 접근 금지) 
 *                     private int age;
 *                     private String name;
 *           default : 같은 패키지에 있는 클래스까지 접근이 가능
 *                     --------- src 
 *                     int age;
 *                     String name;
 *           protected : 같은 패키지에 있는 클래스까지 접근이 가능
 *                       상속을 받은 경우에는 상속을 내린 클래스에 접근이 가능 
 *                       -----------(다른 패키지도 가능)
 *                       -----------사용빈도가 거의 없다 
 *                       protected int age;
 *                       protected String name
 *           public : 패키지와 관계없이 모든 클래스에 접근이 가능 
 *                      public int age
 *                      public String name;
 *           => 멤버변수 
 *              인스턴스변수 
 *                [접근지정어] 데이터형 변수명 
 *                [접근지정어][static/final] 데이터형 변수명 
 *           => 메소드 : public => 다른 클래스와 통신을 할때 사용 
 *                     ------
 *           => 생성자 : public => 다른 클래스에서 메모리 할당이 가능 
 *           
 *           => 변수:private , 메소드,생성자 => public 
 *           -------------------------------------
 *              *** private을 사용하게 되면  반드시 getter/setter
 *                  getter (읽기 기능)/ setter (쓰기 기능)
 *           => this : 생성된 객체의 자신 주소
 *              ------
 *                멤버변수 = 지역변수명이 동일 => 구분 
 *                this는 생성자 / 인스턴스메소드에서만 사용이 가능
 *                static메소드에서는 사용 할 수 없다 
 *           => 지역변수는 final만 사용이 가능하다 
 *                      ------
 *                      private,protected,public,static (X)
 *           접근지정어의 크기 
 *           ------------
 *            private < default < protected < public => 348page
 *            => 오버라이딩 : (접근지정어의 축소는 불가능 ,확장은 가능하다)
 *            public class A
 *            {
 *                void display(){}
 *            }
 *            
 *            public class B extends A
 *            {
 *                void display(){} (O)
 *                protected void display() (O)
 *                public void display() (O)
 *                private void display() (X)
 *            }
 *            
 *            interface I
 *            {
 *               (public) void display();
 *            }
 *            public class A implments I
 *            {
 *                void display(){} (X)
 *                protected void display(){} (X)
 *                public void display(){} (O)
 *            }
 *              
 *            1. 생략 
 *               ***= import java.lang.*; => String , System , Math
 *               ***= 생성자 (모든 클래스에는 생성자가 필요하다) 
 *                 (디폴트 생성자가 만들어진다)
 *               ***= 메소드는 종료시에 반드시 return(void 생략)
 *               = public class A (extends Object)
 *               = interface I
 *                 {
 *                    메소드 선언
 *                    [public abstract] void display(); 
 *                    변수 선언 
 *                    [public static final] int a;(X)
 *                    [public static final] int a=10;
 *                 }
 *         기타 옵션 
 *         public class Sawon
 *         {
 *            private int sabun;
 *            private String name;
 *            private String dept;
 *            private String job;
 *            private int pay;
 *            protected String compony;
 *            public String aaa;
 *         }
 *          UML(객체지향 설계언어) => 클래스/시퀀스 ===> 데이터베이스 설계 
 *         --------------
 *             Sawon => 클래스명
 *         --------------
 *          -sabun:int  =========> private (-)
 *         --------------
 *          -name:String
 *         --------------
 *          -dept:String
 *         --------------
 *          -job:String
 *         --------------
 *          -pay:int
 *         --------------
 *          #compony:String  =====> protected (#)
 *         --------------
 *          +aaa:String     =======>  public(+)
 *         --------------
 *           +수강신청을 한다
 *         --------------
 *           +성적을 열람 
 *         --------------
 *           +변경요청한다
 *         --------------
 *         
 *         --------------
 *         조합 
 *          = public static(공유) 
 *          = public abstract
 *          = public final 
 *          ------------------ 멤버변수(인스턴스변수만) private 
 *   1) 캡슐화 : 데이터 보호 => 데이터베이스 (뷰) , PL/SQL  
 *             ---------
 *             데이어를 감추고 (은닉화 : private)
 *             필요시에만 사용이 가능하게 만든다  (메소드 => public)
 *   2) 상속 / 포함 : 재사용 (변경해서 사용 , 변경하니 않고 사용)
 *                       -----------  ---------------
 *                         상속           포함 (*****)
 *                         
 *                  예)                    포함            상속 => 오버라이딩
 *                      일반 게시판   ===>  묻고답하기 ====> 갤러리게시판 
 *                      --------         일반 게시판      글쓰기 => 파일 올리기
 *                       글쓰기            답변하기        목록 출력 => 이미지 출력
 *                       목록출력 
 *                       내용보기 
 *                       수정하기 
 *                       삭제하기
 *                       찾기 
 *   3) 다형성 : 메소드 변경 (modify), 메소드 추가 (new)
 *             --------   ---------
 *              오버라이딩     오버로딩 
 *   ------------------- 객체 지향 3대 요소 
 *     ****** 재사용 목적 , 수정,추가 용이하게 만든다 
 *            (유지보수) == 대규모 
 *            => 데이터보호 (캡슐화) ***************
 *            => 재사용 : 중복 코딩의 제거 => 공통점을 추출 
 *     -------------------------------------------
 *     
 *   관련된 클래스를 묶어서 관리 => 웹(폴더) , 자바 (패키지)
 *   --------------------
 *     사이트 
 *       => 게시판 (8개의 클래스)
 *       => 회원가입 (가입,탈퇴,수정,찾기)
 *       => 공지사항
 *       => 영화 
 *       => 예매 
 *       => 추천 
 *   ------------------- 재사용 import를 이용해서 사용 
 *   import는 라이브러리만 사용하는 것이 아니고 사용자정의도 import를 사용 
 *   ==> 다른 패키지에 있는 클래스를 읽어 올때 사용 
 *   ==> 같은 패키지는 import를 사용하지 않고 사용이 가능 
 *        
 *   
 */

@Getter
@Setter
public class Music {
    private int mno;
    private String title;
    private String singer;
    private String album;
    private String poster;
    
	/*public int getMno() {
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
	}*/
	  
}
