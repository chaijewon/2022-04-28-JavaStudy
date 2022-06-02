package com.sist.main;
// 클래스 형변환 => 계속 (라이브러리 => 리턴형 (Object)
/*
 *   class A
 *   {
 *      int a=10;
 *      public void aaa()
 *      {
 *      }
 *   }
 *   class B extends A
 *   {
 *     int b=20;
 *     public void aaa() //오버라이딩
 *     {
 *     }
 *     public void bbb()
 *     {
 *     }
 *   }
 *   
 *   A a=new A(); => a,aaa() 
 *   B b=new B(); => b,aaa(),bbb(),a
 *   A c=new B(); => a,aaa()=> aaa() 오버라이딩된 메소드가 호출 
 *   ------------- bbb() , b 불가능 
 *   --- 
 *   클래스 크기 => 상속 , 포함 => 관계가 없는 클래스는 같은 데이터형으로 본다 
 *   
 *   class A
 *   class B   => A = B
 *   
 *   class A
 *   class B extends A  A>B
 *   
 *   class A
 *   class B            B>A
 *   {
 *      A a=new A();
 *   }
 *   
 *   ==> 하위클래스 -> 상위 클래스 (UpCasting) => 생략이 가능  
 *   ==> 상위클래스 -> 하위 클래스 (DownCasting) => 생략이 불가능 
 *       상위 클래스 (double)
 *       하위 클래스 (int)
 *       
 *       DownCasting 
 *       int => double 
 *       int a=(int)10.5;
 *       UpCasting
 *       double => int 
 *       double d=100;
 *       
 *       A => B 
 *       A a=new B();
 *       B b=new A(); (X)
 *       B b=(B)a;
 */
import java.util.*;
class Super1
{
	public void display() 
	{
		System.out.println("Super1:display() Call...");
	}
}
class Sub1 extends Super1
{
	public void display() 
	{
		System.out.println("Sub1:display() Call...");
	}
}
// 추상클래스 / 인터페이스 => 자신이 메모리 할당이 안된다 (new)
// 사용자가 구현 => 하위 클래스를 통해서 메모리 할당을 한다 
// List list=new ArrayList()
// list=new Vector()
// list=new LinkedList() => 11,12,15
// String  
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*Super1 s1=new Super1();
        Sub1 s2=new Sub1();
        Super1 s3=new Sub1();
        Sub1 s4=(Sub1)s3;*/
		// instanceof => 객체 크기를 연산
		/*
		 *    362page 
		 */
		Object obj=new Object();
		String str=new String();
		StringBuffer sb=new StringBuffer();
		/*
		 *      Object 
		 *        |
		 *    -------------------
		 *    |                 |
		 *   String           StringBuffer (관계없는 클래스)
		 */
		if(str instanceof Object)
		{
			System.out.println("OK");
		}
		if(sb instanceof Object)
		{
			System.out.println("OK");
		}
		if(obj instanceof String)
		{
			System.out.println("OK");
		}
		
		
		
	}

}







