package com.sist.ann;
// 어노테이션 : 기능은 없다 , 검색 => 인덱스 => if문 대신 사용이 가능 
/*
 *     @ => TYPE (클래스 찾기)
 *     public class A
 *     {
 *        -----------
 *          @ => FIELD  (멤버변수 찾기)
 *          변수 
 *        -----------
 *          @ => CONSTRUCTOR (생성자 찾기)
 *          생성자(@ => PARAMETER ) => 매개변수 찾기 
 *        -----------
 *          @ => METHOD (메소드 찾기)
 *          메소드 
 *        -----------
 *     }
 *     
 *     => 어노테이션 (위,옆) 
 *        => 아래 , 옆에 있는 내용을 제어 
 *        
 */
import java.util.*;
interface I
{
	public void display();
}
class A implements I
{
	public void display()
	{
		System.out.println("A:display() Call..");
	}
}
class B implements I
{
	public void display()
	{
		System.out.println("B:display() Call..");
	}
}
class C implements I
{
	public void display()
	{
		System.out.println("C:display() Call..");
	}
}
// => interface , Map , annotation 
//    ---------         ----------
public class MainClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("입력(a,b,c):");
        String cmd=scan.next();
        I i=null;
        if(cmd.equals("a"))
        {
        	i=new A();
        	
        }
        else if(cmd.equals("b"))
        {
        	
        	i=new B();
        }
        else if(cmd.equals("c"))
        {
        	i=new C();
        }
        
        i.display();
        	
	}

}
