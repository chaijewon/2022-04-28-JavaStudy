package com.sist.collection;
// Map => SQL문장 저장 
//     => Class를 저장시에 주로 사용 
import java.util.*;
class A
{
	public void display()
	{
		System.out.println("A:display() Call...");
	}
}
class B
{
	public void display()
	{
		System.out.println("B:display() Call...");
	}
}
class C
{
	public void display()
	{
		System.out.println("C:display() Call...");
	}
}
// 클래스 관리 A,B,C를 모아서 관리 (스프링) 
class Container{
	private HashMap map=new HashMap();
	public Container()
	{
		map.put("a", new A());
		map.put("b", new B());
		map.put("c", new C());  // 팩토리 패턴 
	}
	// 클래스 찾기 
	public Object getBean(String key)
	{
		return map.get(key);
	}
}
public class MainClass14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Container c=new Container();
         System.out.println("====== A클래스 요청 ======");
         A a=(A)c.getBean("a");
         // new A()
         a.display();
         
         System.out.println("====== B클래스 요청 ======");
         B b=(B)c.getBean("b");
         b.display();
         
         System.out.println("====== C클래스 요청 ======");
         C c1=(C)c.getBean("c");
         //    new C()
         c1.display();
	}

}
