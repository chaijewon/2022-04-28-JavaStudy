package com.sist.util;
class Sawon
{
	public Sawon()
	{
		System.out.println("Sawon 객체 생성...");
	}
	public void display()
	{
		System.out.println("Sawon:display() Call...");
	}
	@Override
	protected void finalize() throws Throwable{
		System.out.println("Sawon클래스 메모리 해제!!");
	}
	
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sawon s=new Sawon();
		s.display();
		s=null; 
		System.gc(); 
	}

}

