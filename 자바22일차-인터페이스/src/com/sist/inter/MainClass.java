package com.sist.inter;
/*
 *    interface 
 *    = 추상클래스를 보완 (다중 상속) 
 *    = 추상클래스의 일종 => 미완성된 클래스 (라이브러리)
 *    = 인터페이스는 클래스와 동일 => 메모리 할당이 불가능 
 *    = 사용자가 구현해서 사용 => 오버라이딩 기법 
 *    = 설계만 되어 있다 (기능)
 *    = 인터페이스 작성법 
 *      interface 인터페이스명
 *      {
 *         (public static final) int a=10; // 상수형변수 
 *                    반드시 값을 초기화 => 값을 변경할 수 없다 
 *         ----------------------
 *         (public abstract) void display();
 *         -----------------
 *         구현된 메소드 사용이 가능 (JDK 1.8)
 *         public default void aaa(){}
 *         public static void bbb(){}
 *      }
 *      = 오버라이딩 public메소드로 사용한다 
 *      
 *           extends 
 *      클래스 ==> 클래스 상속
 *      class A
 *      class B extends A
 *      인터페이스 ==> 인터페이스 상속 
 *      interface A
 *      interface B extends A
 *      인터페이스 ==> 클래스 상속 
 *      interface A
 *      class B implements A => 382,383page
 *      --------------------------
 *      클래스  ==> 인터페이스 상속 (X) 
 *      class A
 *      interface B extends A (X)
 *      --------------------------
 *      
 *      interface A
 *      interface B extends A  => A,B
 *      interface C extends B  => A,B,C
 *      
 *      interface A
 *      interface B
 *      interface C extends A,B
 *      ----------------------- 다중상속이 가능 385page
 *      
 *      인터페이스 장점 
 *      -----------
 *      1. 기능 설계 => 개발시간이 단축
 *      2. 표준화 가능 => 같은 메소드를 사용 (스프링=> 결합성이 낮게,표준화)
 *         소스의 통일화 (형식) => 분석하기 쉽다 
 *         RDBMS => (오라클) , MySQL , MS_SQL , MariaDB , DB2 
 *                  SQL(표준화) ==> 함수 , JOIN , LIKE .....
 *         시청 => MS-SQL , 대기업 : 오라클 , 공기업 : DB2
 *         중소기업 => MYSQL , MariaDB => Spring-Boot => Redux
 *         -------------------------------------------------
 *      3. 서로 관계없는 클래스를 연결해서 사용할 수 있다 (*****)
 *         ---------------------------------- 
 *      4. 객체지향 프로그램 : 유지보수 (수정)
 *         --------------------------- 변수/연산자/제어문
 *      5. 독립적으로 사용이 가능 
 *         ----------------- 원격(리모콘)       
 */
// 클래스를 여러개 묶어서 한개의 이름으로 제어 
/*
 *           List (11,12)  
 *            |
 *    ---------------------------------------
 *      |         |         |       |     |
 *    ArrayList Vector LinkedList Queue Stack 
 *    List list=new Vector()
 *    List list=new ArrayList()
 *    
 *    => 웹 : 3대 클래스 
 *           --------- String , List , Integer
 *    
 * 
 */
interface 도형
{
	public void draw();
}
class 원 implements 도형
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("원을 그린다");
	}
	
}
class 삼각형 implements 도형
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("삼각형을 그린다");
	}
	
}
class 사각형 implements 도형
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("사각형을 그린다");
	}
	
}
// 오버라이딩은 상위 클래스를 이용해서 하위클래스 동작을 처리 수행 
// 오버라이딩이 되면 상위클래스로 호출시에 하위클래스에서 오버라이드한 메소드 호출 
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        도형 a=new 원();
        //    -------- 원이 가지고 있는 draw()
        a.draw();
        
        a=new 사각형();
        a.draw();
        
        a=new 삼각형();
        a.draw();
	}

}






