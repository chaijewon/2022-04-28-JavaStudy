/*
 *   메소드의 종류 (동작, 다른 클래스 연결) 
 *                   ------------- 매개변수 (메세지)
 *   1) 인스턴스메소드 : 인스턴스변수를 제어 
 *   2) static 메소드 : 인스턴스변수를 제어하지 않고 => static변수만 제어 
 *   --------------------------------------------------------
 *   3) abstract 메소드 : 선언만 하는 메소드 (메모리에 저장되지 않는다) 
 *                      -----프로그래머가 사용시에는 구현해서 사용 
 *                       추상 클래스 / 인터페이스 
 *   4) final 메소드 : 상속이 안된다 
 *   
 *   => 공통으로 사용 기능 : 웹(한글변환) => static , 오라클연결 
 *   
 *   *** static 메소드안에서는 인스턴스메소드나 인스턴스변수를 사용할 수 없다
 *        (this가 존재하지 않는다) 
 *        -> 객체 메모리 할당후 사용  
 *       인스턴스메소드에서는 static변수,메소드 사용이 가능 (this)
 *       
 *       
 *       Sawon s1=new Sawon();
 *       this=s1;
 *       
 *       Sawon s2=new Sawon();
 *       this=s2;
 *       
 *       Sawon s3=new Sawon();
 *       this=s3;
 *       
 *       
 *       class DataBase
 *       {
 *          String url="";
 *          String username="";
 *          String password="";
 *       }
 */
class Sawon
{
	String name,dept,loc;
	static String compony;
	void print()
	{
		System.out.println("이름:"+name);
		System.out.println("부서:"+dept);
		System.out.println("근무지:"+loc);
		compony="SIST";
	}
	//static => 인스턴스 변수 변경 (X) => 278page
	static void display(Sawon s)
	{
		//Sawon s=new Sawon(); => 공통으로 변경 
		// 1. 로고변경 , 2. 회사명 , 3. 데이터베이스 연결 
		s.name="심청이";
		s.dept="총무부";
		s.loc="부산";
		System.out.println("display:s="+s);
		System.out.println("이름:"+s.name);
		System.out.println("부서:"+s.dept);
		System.out.println("근무지:"+s.loc);
	}
}
/*
 *   int a=10;
 *   System.out.println(a);
 *   a=20;
 *   System.out.println(a);
 */
public class 객체지향_메소드 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Sawon s=new Sawon();
        System.out.println("s="+s);
        s.name="홍길동";
        s.dept="개발부";
        s.loc="서울";
        s.print();
        s.display(s);
        s.print();
        Sawon s1=new Sawon();
        s1.display(s1);
        s1.print();
	}

}
