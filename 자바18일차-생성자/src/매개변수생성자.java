/*
 *    매개변수 : 
 *        사용처 => 사용자의 입력값을 받아서 초기화 
 *        형식)
 *             클래스명(매개변수,매개변수...){
 *             }
 */
import java.util.Scanner;
class Member{
	String name;
	String sex;
	String address;
	String tel;
	int age;
	static int kkk;
	// 생성자 => 초기화만 담당
	Member(String n,String s,String ad,String t,int a)
	{
		name=n;
		sex=s;
		address=ad;
		tel=t;
		age=a;
	}
	void print() // 멤버메소드 
	{
		System.out.println("이름:"+name);
		System.out.println("성별:"+sex);
		System.out.println("주소:"+address);
		System.out.println("전화:"+tel);
		System.out.println("나이:"+age);
	}
	// 별도의 메소드기 때문에 => 멤버를 사용하기 위해서는 반드시 메모리 할당후에 사용
	static void print2()
	{
		Member m1=new Member("홍길동", "남자", "서울", "011-1111-1111", 20);
		System.out.println("이름:"+m1.name);
		System.out.println("성별:"+m1.sex);
		System.out.println("주소:"+m1.address);
		System.out.println("전화:"+m1.tel);
		System.out.println("나이:"+m1.age);
	}
	// 278 페이지 
	
}
public class 매개변수생성자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Member m1=new Member("홍길동", "남자", "서울", "011-1111-1111", 20);
        Member m2=new Member("심청이", "여자", "서울", "011-1111-1111", 20);
        Member m3=new Member("박문수", "남자", "서울", "011-1111-1111", 20);
	    m1.print();
	    m2.print();
	    m3.print();
	}

}
