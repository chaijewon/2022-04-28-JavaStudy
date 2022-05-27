/*
 *   1. 10page
 *   ----------
 *   자바 => 클래스명과 저장명이 동일 
 *   ------------------------
 *   public class A
 *   class B  =============> A.java
 *   => java한개의 파일안에서는 public class는 한개만 존재 
 *   
 *   class A
 *   class B
 *   ----------------> 저장명은 A.java,B.java
 *   
 *   => 저장명 => 대소문자 구분 
 *   class A => a.java(X)
 *   
 *   ----------------> 클래스 한개 , 자바파일 한개
 *   
 *   230page => 객체지향 
 *     ** 객체지향에 맞게 코딩을 준비하면 
 *   231page 클래스 / 객체
 *   233page 객체의 구성 
 *           --------- 속성 / 기능 
 *                    ----- -----
 *                    변수    메소드 
 *   235page => 클래스를 저장했을때 메모리 구조 240page 
 *   
 *   243page ~ 244page => 사용자정의 데이터형 => class
 *   
 *   변수와 메소드 
 *   ----------
 *   246~259page 
 *   ------------  261메모리 구조 
 *   -------------------
 *    Method Area | 클래스데이터(static)
 *   -------------------
 *     Stack => 지역변수,매개변수 
 *   -------------------
 *     Heap => 실제데이터 저장 
 *   -------------------
 *   
 *   264~267page 참조변수 
 *      Call By Value
 *      Call By Reference 
 *      
 *   277page => static/instance (278=> 1,2,3) 
 *   
 *   283page => 오버로딩 
 *   
 *   287page => 가변인자 (...)
 *   
 *   291page => 생성자 
 *   300page => 변수 초기화 
 *   -------------------
 *   --------------------------- 객체지향 (7장)
 *   
 */
class Util
{
	/*void print(String s)
	{
		System.out.println(s);
	}
	void print(String s,String s1)
	{
		System.out.println(s+","+s1);
	}
	void print(String s,String s1,String s2)
	{
		System.out.println(s+","+s1+","+s2);
	}*/
	// ---- 5 7 9
	static void print(String...s)
	{
		for(String s1:s)
		{
			System.out.println(s1);
		}
	}
}
class Member
{
	String name;
	String address; // 명시적 초기화 
}
class Database
{
	String url;
	String username;
	String password;// 명시적 초기화 
	
	{
		url="jdbc:oracle:thin:@localhost:1521:XE";
		username="hr";
		password="happy";
	}
	// 생성자를 이용해서 초기화 
	Database() {
		url="jdbc:oracle:thin:@localhost:1521:XE";
		username="hr";
		password="happy";
	}
	
	// 인스턴스는 저장시에 반드시 생성자를 호출 
	// Database d=new Database();
	
	static String driver;
	static {
		driver="oracle.jdbc.driver.OracleDriver";
	}
	// 생성자를 호출할 필요가 없다 
	
	// Database.driver
	
}
class A
{
	static String name;
	static // 자동 호출이 아니다 => 직접 호출 
	{
		name="박문수";
	}
}
public class 변수초기화 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Member m1=new Member();
        m1.name="홍길동";
        m1.address="서울";
        System.out.println(m1.name);
        System.out.println(m1.address);
        
        Member m2=new Member();
        m2.name="심청이";
        m2.address="부산";
        System.out.println(m2.name);
        System.out.println(m2.address);
        
        Member m3=new Member();
        m3.name="박문수";
        m3.address="경기";
        System.out.println(m3.name);
        
        //A aa=new A();
        System.out.println(A.name);
        
        Util.print("Hong");
        Util.print("Hong","Shim");
        Util.print("Hong","Park","Kim");
        Util.print("Hong","Aaa","Bbb","Vvv");
        Util.print("Hong","aaa","bbb","ccc","ddd");
	}

}
