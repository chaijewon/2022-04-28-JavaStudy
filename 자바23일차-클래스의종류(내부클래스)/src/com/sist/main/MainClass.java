package com.sist.main;
/*
 *    1. 객체지향 프로그램 (개념=면접) => 6,7,8,11,12,15
 *    -------------------------------------------
 *       6장 정리 
 *       ------
 *         = 클래스 개념 (속성 / 동작) => 한명,한개에 대한 정보 (저장을 여러개 가능)
 *                    => new (새로운 메모리가 생성)
 *                    => 변수 => 메소드 
 *           => 변수+메소드 = 부품 (저장 => 재사용)
 *         = 구성 요소 
 *           = 변수
 *             = 각각 저장하는 변수 ========> 인스턴스
 *             = 공통으로 사용되는 변수 (1개)==> static 
 *           = 메소드
 *             = 변수를 활용한 기능 
 *             = 특별한 경우가 아니면 대부분은 인스턴스 메소드 
 *           = 생성자 / 초기화 블록 (변수에 초기화) 
 *             => 파일을 읽기 , 크롤링 , 데이터베이스 => 필요할때 마다 사용 
 *             => 순서 
 *                명시적 초기화 => 초기화 블록 => 생성자 
 *                             --------- 자동으로 인식 (상속에서 예외)
 *                변수 => 인스턴스 (생성자)
 *                       static (초기화 블록) => MyBatis(XML)
 *         = 접근지정어 
 *           ***private : 변수(은닉화)
 *           protected
 *           default
 *           ***public : 메소드(통신:다른 클래스와 연결) , 생성자 , class
 *           private < default < protected < public 
 *            
 *         = 생성자 
 *            => 리턴형이 없다 / 클래스명과 동일 / 오버로딩이 가능 
 *            => 오버로딩 
 *               ------
 *               1) 메소드명 동일 
 *               2) 매개변수 다르다( 갯수, 데이터형)
 *               3) 리턴형은 관계없다 
 *               => 여러개 생성자를 만들어서 사용이 가능 
 *               => *** 생성자가 없는 경우에는 자동으로 컴파일러가 
 *                  디폴트 생성자를 만들어 준다
 *               => 시작과 동시에 처리 (자동 로그인 ,  Cookie처리 , 서버연결) 
 *                  변수에 초기화 
 *               => 호출시에는 반드시 new 생성자();
 *       7장 정리(재사용법 , 클래스의 종류)
 *           1. 재사용법 , 수정 , 추가 
 *           2. 클래스의 종류 
 *              => 설계 => 메모리 할당이 불가능 , 상속을 받아서 하위 클래스를 통해서 
 *                        메모리 할당  => 관련 클래스를 모아서 관리 
 *                 추상 클래스 => 단일 상속만 가능 
 *                 public abstract class ClassName
 *                 {
 *                    -------------------
 *                     변수 설정 
 *                    -------------------
 *                     구현된 메소드 
 *                    -------------------
 *                     구현이 안된 메소드 (선언)
 *                    -------------------
 *                 }
 *                 인터페이스 => 추상 클래스 보완 => 다중 상속이 가능 
 *                 public interface interfaceName
 *                 {
 *                    -----------------------
 *                     변수 => 상수형 변수 
 *                     int a=10; ==========> public static final
 *                          ---- 값을 부여 
 *                    -----------------------
 *                     메소드 => 구현이 안된 메소드 
 *                     void display(); ======> public abstract
 *                    ----------------------- JDK 1.8 추가 
 *                     메소드 => 구현된 메소드 
 *                     default void display(){} => public 
 *                    -----------------------
 *                     static void display(){} => public 
 *                    -----------------------
 *                 }
 *                 
 *                 => 재정의 (오버라이딩) 
 *                    1) 메소드명이 동일 
 *                    2) 매개변수 동일 
 *                    3) 리턴형 동일 
 *                    4) 접근지정어 확대가능 , 축소불가능 
 *                    
 *                 public interface A
 *                 {
 *                     (public) void disp();
 *                 }
 *                 public class C implements A
 *                 {
 *                     void disp(){} => 오류 (접근 범위 축소)
 *                     public void disp(){}
 *                 }
 *                 
 *                 상속 
 *                        extends (class는 단일 상속) 
 *                   class =====> class
 *                             implements
 *                   interface =====> class
 *                             extends 
 *                   interface =====> interface 
 *                   
 *                   class  (extends)  
 *                           ========> class
 *                   interface (implements)
 *                   
 *                   class A
 *                   interface B
 *                   class C extends A implements B
 *                   
 *                   class A
 *                   interface B
 *                   interface C
 *                   class D extends A implements B,C
 *                   
 *                   포함 => 변경없이 사용 
 *                   
 *                   class A
 *                   class B
 *                   {
 *                       A a=new A();
 *                   }
 *                   
 *                   ===> is-a , has-a => 클래스의 크기 비교가 가능 
 *                        (상속)  (포함)
 *                        
 *                   class A
 *                   class B extends A   ==> A > B
 *                   B에서 => A를 받는다 => 형변환 
 *                   A에서 => B를 받는다 => 형변환하지 않는다 
 *                   
 *                   A a=new B();
 *                   B b=(B)a;
 *                   A c=b;
 *                   
 *              => 공동으로 사용하는 변수나 메소드가 있는 경우 
 *                 내부 클래스 (403page) => 네트워크(쓰레드),윈도우 => Application
 *                 --------              웹에서는 사용빈도가 거의 없다 (JPA)
 *                                       데이터베이스 (JDBC,MyBatis,ORM,DBCP)
 *                                       => ORM (MyBatis, JPA, Hibernate)
 *                                       => SpringFramework => MyBatis
 *                                       => Spring-Boot => JPA + React 
 *                                          ------------------- 우대사항
 *                    => 윈도우 / 네트워크 
 *                       -------------
 *                       장점 : 다른 클래스와 연결해서 사용하기 쉽다 
 *                             코드의 복잡성을 줄일 수 있다 
 *                             class A
 *                             {
 *                             }
 *                             class B
 *                             {
 *                             }
 *                             
 *                             =>  class A(Server)
 *                                 {
 *                                     class B(Thread)
 *                                     {
 *                                     }
 *                                 }
 *                       단점  : 객체 생성이 어렵다 
 *                              A a=new A();
 *                              A.B b=a.new B();
 *                 1) 멤버 클래스 
 *                    = 인스턴스 멤버(***)
 *                      class A
 *                      {
 *                         변수
 *                         메소드 aaa()
 *                         class B
 *                         {
 *                            변수
 *                            메소드 
 *                            aaa()
 *                         }
 *                         ==> A,B가 서로 변수,메소드를 마음대로 사용이 가능 
 *                      }
 *                    = static 멤버 
 *                      class A
 *                      {
 *                         static class B
 *                         {
 *                         }
 *                      }
 *                      
 *                      A a=new A();
 *                      //
 *                      A.B b=new A.B()
 *                 2) ***익명의 클래스 : 상속이 오버라이딩이 가능 
 *                    웹은 상속이 많이 없다 => 오버라이딩 
 *                    class A
 *                    {
 *                     
 *                    }
 *                    class B
 *                    {
 *                        public void display(){}
 *                    }
 *                    
 *                    ==>
 *                       class A extends B
 *                       {
 *                          public void display(){}
 *                       }
 *                       
 *                       class A
 *                       {
 *                           B b=new B(){
 *                              public void display(){}
 *                           };
 *                       }
 *                 3) 지역 클래스 
 *                    class A
 *                    {
 *                       public void display()
 *                       {
 *                          class B
 *                          {
 *                             public void print(){}
 *                          }
 *                          
 *                          B b=new B();
 *                          b.print();
 *                       }
 *                    }
 *                   
 *                   인스턴스 / 익명의 클래스 => (웹=>AI)
 *                   AI => 데이터수집 = 데이터 분석 = 컴퓨터 인식 = 시각화 
 *                   ------------------------------------------
 *                   지능형웹 => 루씬  
 */
/*
 *   class Server
 *   {
 *      => IP / PORT
 *   }// 서버구동 
 *   class Client ==> 여러개의 프로그램을 동시에 실행 => 쓰레드 
 *   {
 *      IP/PORT
 *   }// 통신
 *   
 *   // 클래스와 클래스 사이에 공유하는 데이터.메소드가 있는 경우 => 내부클래스 
 *   class Server
 *   {
 *       IP/PORT
 *       class Client
 *       {
 *          // Server가 가지고 있는 모든 데이터를 마음대로 사용이 가능 
 *       }
 *   }
 */
// 멤버 클래스 (접근하는 방식) 
class Outer{
	private String name="홍길동";
	class Inner{
		int a=10;
		public void print()
		{
			System.out.println("Inner:print() Call...:name="+name);
		}
	}
}
class Outer2{
	static class Inner{
		public void print()
		{
			System.out.println("Inner:print() Call...");
		}
	}
}
class Outer3{
	public void print()
	{
		class Inner{
			public void print()
			{
				System.out.println("지역 클래스:Inner:print() Call...");
			}
		}
		Inner i=new Inner();
		i.print();
	}
}
class Outer4{
	Inner4 in=new Inner4() {
		public void print() {
			System.out.println("Outer4에서 print()를 오버라이딩...");
		}
	};
}
class Inner4{
	public void print()
	{
		System.out.println("Inner4:print() Call...");
	}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=======인스턴스 멤버(***)========");
        Outer p=new Outer();
        Outer.Inner c=p.new Inner();
        System.out.println(c.a);
        c.print();
        
        System.out.println("=====static 멤버 ===========");
        Outer2.Inner c1=new Outer2.Inner();
        c1.print();
        System.out.println("========지역클래스 =========");
        Outer3 o=new Outer3();
        o.print();
        System.out.println("========익명의 클래스(***)==========");
        Inner4 i1=new Inner4();
        i1.print();
        Outer4 i2=new Outer4();
        i2.in.print();
        
	}

}
