package com.sist.lang;
class Member /*extends Object*/
{
	String name; // null값 초기화 
	// 값을 출력 
	public void display()
	{
		System.out.println("name="+name);
	}
	// 초기화 
	public Member(String name)
	{
		this.name=name;
	}
}
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Object obj=new Member("홍길동"); // obj는 (name,display가 없다)
        //Member m=(Member)obj;
        //(Member)obj.display()
        ((Member)obj).display();// 많이 등장
        // 라이브러리 => 매개변수가 Object로 되어 있다 
        /*
         *   Object는 모든 값을 저장 할 수 있다 (데이터형 가장 큰데이터형)
         */
       //Object[] arr= {10.5,"",'C',10,true};
        
        
        
	}

}
