package com.sist.include;
/*
 *   page 316
 *   포함 클래스 : 있는 그대로 사용 (재사용) => has-a
 *   class A
 *   {
 *   }
 *   class B
 *   {
 *      public void disp()
 *      {
 *          A a=new A(); => 포함 클래스가 아니다 => 멤버
 *      }
 *   }
 *   class C
 *   {
 *       A a=new A(); // C클래스 전체적으로 사용이 가능 
 *   }
 *   -------------------------------------------
 *   상속 : 수정해서 사용 (오버라이딩) , 단일 상속 
 *   포함 : 수정하지 않고 재사용 , 여러개 클래스 사용이 가능 (실제적으로는 많이 사용)
 *   
 *   class A
 *   {
 *   }
 *   class B
 *   {
 *   }
 *   class C
 *   {
 *   }
 *   class D extends A,B,C => 오류
 *   {
 *   }
 *   
 *   class A
 *   {
 *   }
 *   class B extends A
 *   {
 *       => A가 가지고 있는 메소드 변경해서 사용 
 *   }
 *   class C extends B
 *   {
 *       => A,B가 가지고 있는 메소드 변경해서 사용
 *   }
 *   class D extends C
 *   {
 *       => A,B,C가 가지고 있는 메소드 변경해서 사용
 *   }
 *   
 *   class E
 *   {
 *       // 변경이 가능하게 만들어져 있다 => 내부클래스 (익명의 클래스)
 *       A a=new A();
 *       B b=new B();
 *       C c=new C();
 *   }
 *   
 *   class A extends JFrame
 *   {
 *       JButton b=new JButton();
 *   }
 *   
 */
class Human
{
	private String name;
	private String address;
	private String tel;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
}
// 수정 (오버라이딩) => 상속 
// 수정없이 사용 => 포함 
/*
 *     --------------- 포함해서 사용 (데이터베이스 연결)
 *     Connection : 오라클 연결
 *     Statement : 오라클에서는 자바가 실행되는 것이 아니다 (SQL)
 *     ResultSet : 실행된 결과 받기  
 *     ---------------
 */
class Student
{
	Human h=new Human();// 포함 클래스 
	public Student(String n,String a, String t)
	{
		h.setName(n);
		h.setAddress(a);
		h.setTel(t);
		
	}
	public void display()
	{
		System.out.println("이름:"+h.getName());
		System.out.println("주소:"+h.getAddress());
		System.out.println("전화:"+h.getTel());
	}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student s=new Student("심청이", "부산", "010-0000-0000");
        s.display();
	}

}
