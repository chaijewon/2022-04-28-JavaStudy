package com.sist.inter2;
// interface문법 => public(모든 메소드,모든 변수) => 자동 추가가 된다 
interface A
{
	void display1(); // public abstract 
	public void display2();// abstract
	abstract void display3();// public 
	//protected void display4(); // 모든 메소드 선언은 public만 가능
	int a=10; // 오류발생 (상수형) => public final static
	final int b=20;//public static
	static int c=30;//public final
	public int d=40;// static final 
	//private int e=50;
	//protected int k=60;
	public static final int k=60;
}
// JDK => 
interface B
{
	void display(); // public abstract void display();
	default void click(){} // default => 구현이된 메소드를 제작 
	// public 생략이 가능 1.8이상 
	static void mouseOut(){}
	// public 생략이 가능 
	// 1.7
}
/*
 *    오버라이딩 
 *    ------- 
 *     1. 같은 메소드명 
 *     2. 리턴형 동일
 *     3. 매개변수가 동일 
 *     4. 접근지정어가 확대는 가능 / 축소는 불가능 
 */
class C implements B
{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
	
}
class D implements B
{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
	
}
class E implements B
{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
	
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
