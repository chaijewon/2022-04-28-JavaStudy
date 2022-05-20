import java.util.Scanner;
// 사원의 정보 => 사번(int) , 이름(String) , 부서(String), 근무지(String), 연봉(long)
// public은 한개의 자바ㅏ일에서 한번만 사용이 가능
/*
 *   class A
 *   class B  => A.ajav , B.java
 *   
 *   class A
 *   public class B  => B.java
 *   
 *   => 자바는 클래스명 = 파일명이 동일해야 사용이 가능 
 */
// => 다른 데이터형 여러개를 모아서 한번에 저장후에 관리 
class Sawon
{
	// 메모리에서 읽기/쓰기 (변수) 
	int sabun;
	String name;
	String dept;
	String loc;
	long pay;
}
public class 메소드정리_5 {
    static Sawon input()
    {
    	//1. 메모리에 저장 => new
    	Sawon s=new Sawon();
    	Scanner scan=new Scanner(System.in);
    	System.out.print("사번 입력:");
    	s.sabun=scan.nextInt();
    	// . 연산자 => 주소접근 연산자 
    	System.out.print("이름 입력:");
    	s.name=scan.next();
    	System.out.print("부서명 입력:");
    	s.dept=scan.next();
    	System.out.print("근무지 입력:");
    	s.loc=scan.next();
    	System.out.print("연봉 입력:");
    	s.pay=scan.nextLong();
    	return s;
    }
    static void output(Sawon sa)
    {
    	System.out.println("=== 사원정보 ===");
    	System.out.println("사번:"+sa.sabun);
    	System.out.println("이름:"+sa.name);
    	System.out.println("부서:"+sa.dept);
    	System.out.println("근무지:"+sa.loc);
    	System.out.println("연봉:"+sa.pay);
    }
    static void process()
    {
    	Sawon s=input();
    	output(s);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        process();
	}

}
