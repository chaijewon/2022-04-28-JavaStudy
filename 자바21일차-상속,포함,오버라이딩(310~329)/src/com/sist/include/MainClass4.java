package com.sist.include;
class A
{
	int a=100;
	void display(){System.out.println(1);}
	// void display() {System.out.println(2);}
}
class B extends A
{
	int a=200;
	int d=3000;
	void display() {System.out.println(2);}
}
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        A aa=new A(); // aa.a=100 , aa.display() => 1
        B bb=new B(); // bb.a=200 , bb.display() => 2
        
        A cc=new B(); // aa.display() => bb.display() 변경
        // 변수 => A cc , 메소드 =>new B() => 오버라이딩 
        // A cc=> B가가지고 있는 데이터에 접근이 안됨 
        
	}

}
