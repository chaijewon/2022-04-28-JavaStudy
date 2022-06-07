package com.sist.lang;
// 메모리 할당  => new , clone() => 다른 메모리 생성 
// 기타적으로 메모리 할당 
class Human
{
	public void display()
	{
		System.out.println("Human:display() Call...");
	}
}
public class MainClass6 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
        // 463page 
		Human h1=new Human(); // 기본 메모리 할당 => 결합성이 높은 프로그램
        h1.display(); //new를 사용하지 말라 (권장)
        
        ///// 웹 
        Human h2=new Human().getClass().
        		 getDeclaredConstructor().newInstance();
        h2.display();
        
        Human h3=Human.class.getDeclaredConstructor().newInstance();
        
        h3.display();
        
        Human h4=(Human)Class.forName("com.sist.lang.Human").
        		   getDeclaredConstructor().newInstance();
        h4.display();
	}

}
