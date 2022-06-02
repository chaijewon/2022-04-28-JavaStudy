package com.sist.inter3;
interface A
{
	public void displayA();
}
interface B
{
	public void displayB();
}
class C implements A,B
{

	@Override
	public void displayB() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayA() {
		// TODO Auto-generated method stub
		
	}
	
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        A a=new C(); // displayA()
        // => A가 가지고 있는 모든 데이터를 사용한다 
        // => 단 메소드는 C클래스에서 오버라이딩 메소드를 사용한다 
        a.displayA();
        B b=new C(); // displayB()
        
        b.displayB();
        C c=new C(); // displayA(),displayB()
        c.displayA();
        c.displayB();
	}

}
