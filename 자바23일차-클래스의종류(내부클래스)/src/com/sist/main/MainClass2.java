package com.sist.main;
/*
 *   class A => 게임 
 *   {
 *      배경 
 *      class B => 비행기
 *      {
 *         int x,y
 *      }
 *      class C => 총알 
 *      {
 *         x+=3....
 *      }
 *   }
 */
class Outer5{
	int value=10;
	public void display()
	{
		Inner i=new Inner();
		i.method();
	}
	// Inner클래스는 Outer의 메소드를 제어 => 많이 사용된다 
	class Inner{
		int value=20;
		public void method()
		{
			int value=30;
			System.out.println("value="+value);
			// 지역변수 우선순위 => 30
			System.out.println("value="+this.value); // 20
			System.out.println("value="+Outer5.this.value);//10
		}
	}
}
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Outer5 o=new Outer5();
        //Outer5.Inner i=o.new Inner();
        //i.method();
        o.display();
	}

}
