package com.sist.include;
class Parent
{
	int a=100;
	void display()
	{
		System.out.println("Parent:display() Call...");
	}
}
class Child extends Parent
{
	int a=200;
	int b=300;
	void display()
	{
		System.out.println("Child:display() Call...");
	}
	void aaa()
	{
		
	}
}
/*
 *    class A
 *    class B extends A
 *    A a=new A(); => A
 *    B b=new B(); => B
 *    A a=new B();
 *    --- --------
 *    *******변수 => 클래스명 
 *    *******메소드 => 생성자
 *    상위클래스는 하위클래스를 제어 할 수 없다 
 *    
 *     
 */
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Parent p=new Parent();
        System.out.println(p.a);
        p.display();
        // p가 가지고 있는 a,display()
        
        Child c=new Child();
        System.out.println(c.a);
        c.display();
        // c => a,b,display(),aaa()
        // List list=new ArrayList()
        // Map map=nwew HashMap()
        // Set set=new TreeSet()
        Parent p1=new Child();// 추상 ,인터페이스 
        // a,display() => 오버라이딩 display()
        // 변수 => 클래스형 => Parent
        // 메소드 => 생성자 => Child=> display()
        // p1은 b에 접근을 못한다 
        System.out.println(p1.a);
        p1.display();
        // p1이 접근이 가능한 것은 => 오버라이딩일때만 접근이 가능
        
	}

}
