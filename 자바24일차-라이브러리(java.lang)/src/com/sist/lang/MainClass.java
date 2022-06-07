package com.sist.lang;
import java.text.SimpleDateFormat;
// 9장 ~ 라이브러리 => 오버라이딩  
/*
 *   라이브러리 (자바)
 *   -------------
 *   1. 자바에서 지원 
 *       = 기본 라이브러리 (J2SE)  => java 
 *       = 웹 라이브러리 (J2EE)  => javax
 *   2. 외부에서 지원 
 *       = Jsoup / 크롤링 
 *       = Spring 
 *       = XML/JSON => 자바~자바스크립트연동 
 *       = MyBatis , JPA , Hibernate 
 *   3. 문법 => 라이브러리 => 한개의 프로그램(조립)
 *      
 *   4. 자바에서 지원하는 라이브러리 => import를 사용해서 라이브러리를 로딩  
 *      java.lang (import를 생략할 수 있다)  => 기본이 되는 라이브러리
 *        ***Object 
 *        ***String 
 *        ***Math
 *        ***System
 *        Wrapper 
 *        StrinBuffer 
 *      java.util (유용한 클래스의 집합)
 *        ***Scanner
 *        StringTokenizer 
 *        10장
 *        Date
 *        Calendar 
 *        *** Collection (11,12장)
 *      java.io (입출력) 
 *        File , FileReader , FileWriter ...
 *      java.net 
 *        ServerSocket,Socket,URL 
 *      ***java.sql 
 *        
 *      java.text 
 *         SimpleDateFormat()
 *         MessageFormat() ==> 10장 
 *    --------------
 *      메모리 할당 => new , Class.forName("") => Spring
 *      
 *      450page 
 *      --------
 *       java.lang => 라이브러리 
 *       ---------- import를 자동으로 추가 
 *     
 *       1. Object 
 *          => 모든 클래스 (라이브러리 / 사용자 클래스의 최상위 클래스)
 *             Object로부터 상속을 받는다 
 *             class A extends Object => 생략 
 *          => 기능 (자바)
 *             1) clone() : 복제 (메모리 복제) => 스프링 (prototype)
 *             2) toString() : 객체를 문자열화 => 주소(생략이 가능) 
 *                Date date=new Date();
 *                System.out.println(date.toString())
 *                                       ------------ 자동 호출 
 *             3) equals() : 비교 => 주소값이 아니라 가지고 데이터
 *             4) finalize() : 소멸자 
 *             --------------- 
 *      
 */
// 객체 생명주기와 관련된 기능 
class Sawon
{
	String name; //null
	public Sawon(String name)
	{
		this.name=name;
		System.out.println("Sawon 객체 생성!!");
	}
	public void display()
	{
		System.out.println("name="+name);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "사원의 이름은 "+name+"입니다";
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Sawon 객체 메모리 해제");
	}
	
	
}
public class MainClass {
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Sawon s=new Sawon("홍길동");
        System.out.println(s);// .toString() 생략 
        s.display();
        s=null; // 메모리 해제 => GC(사용하지 않는다,null) 
        System.gc();// 직접 호출 => 동영상 => 멀티미디어 , 화상 회의 
	}

}





