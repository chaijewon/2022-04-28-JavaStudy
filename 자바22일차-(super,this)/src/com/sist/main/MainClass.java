package com.sist.main;
/*
 *    super , super() ==> 상위 클래스의 주소 
 *    this , this() ===> 모든 클래스는 자신의 객체주소
 *                       ==> super (Object:최상위 클래스) 
 *                       
 *    상속 => 상위 클래스는 본인이 가지고 있는 데이터 사용 (this)
 *           하위 클래스는 본인 / 상위 클래스의 데이터도 사용이 가능 
 *           this,super
 *    *** 클래스 
 *    
 *        = 자바 지원, 외부 지원 => 라이브러리 (모든 클래스 => Object) 
 *        = 사용자 정의 클래스 (Object 상속)
 *        = 모든 클래스에서는 Object가 가지고 있는 모든 메소드 메소드 사용이 가능
 */
class Super //extends Object
{
	int a=100;
	// super => Object
	public Super()
	{
		
		System.out.println("Super:생성자 Call...");
	}
	public void display()
	{
		System.out.println("Super:display() Call...");
	}
}
class Sub extends Super
{
	int a=200;
	public Sub()
	{
		super();// 첫줄에 사용 => 거의 사용빈도가 없다 this()
		System.out.println("Sub:생성자 Call...");
	}
	public void display()
	{
		System.out.println("Sub:display() Call...");
	}
	public void print()
	{
		System.out.println("Super.a="+super.a);//100
		System.out.println("Sub.a="+this.a);//200
		super.display();
		this.display(); // this를 생략 
	}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Sub sub=new Sub(); // 상위 클래스 메모리 할당 => 하위 클래스 메모리 할당
	    sub.print();
	}

}
