package com.sist.main;
/*
 *   1. 메소드 (264page) => 웹 
 *                       ----- HttpServletRequest => 요청 
 *                       ----- HttpServletResponse => 응답 
 *      => 다른 클래스와 통신 (전송=> 매개변수)
 *      => 매개변수
 *         기본형 데이터 (Call By Value) ==> 일반 값만 전송 
 *                      => 메모리가 따로 생성 
 *         참조형 데이터 (Call By Reference) ==> 메모리 주소 전송
 *                      => 같은 메모리에서 작업 (배열 , 클래스)
 *                      => 제외 (String)
 */
class Data
{
	int a=10;
	int b=20;
}
class BasicType
{
	public void change(int x,int y)
	{
		int temp=x;
		x=y;
		y=temp;
		System.out.println("===BasicType:change Call===");
		System.out.printf("x=%d,y=%d\n",x,y);
	}
	// String => 클래스(기본형) => Call by Value
	public void change(String s,String s1)
	{
		// 오버로딩 
		String temp=s;
		s=s1;
		s1=temp;
		System.out.println("===BasicType:change Call===");
		System.out.printf("s=%s,s1=%s\n",s,s1);
	}
	public void change(int[] arr)
	{
		System.out.println("change:"+arr);
		int temp=arr[0];
		arr[0]=arr[1];
		arr[1]=temp;
		System.out.println("===BasicType:change Call===");
		System.out.printf("arr[0]=%d,arr[1]=%d\n",arr[0],arr[1]);
	}
	public void change(Data d)
	{
		int temp=d.a;
		d.a=d.b; 
		d.b=temp;
		
		System.out.println("===BasicType:change Call===");
		System.out.printf("d.a=%d,d.b=%d\n",d.a,d.b);
	}
}

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 인스턴스 메소드 => 저장공간 만들기 
		BasicType bt=new BasicType(); // 메소드 저장 
		int a=10;
		int b=20;
		System.out.println("=== MainClass:main 전 ===");
		System.out.printf("a=%d,b=%d\n",a,b);
		
		bt.change(a, b);
		
		System.out.println("=== MainClass:main 후 ===");
		System.out.printf("a=%d,b=%d\n",a,b);
		
		String ss="Hello";
		String ss1="Java";
		System.out.println("=== MainClass:main 전 ===");
		System.out.printf("ss=%s,ss1=%s\n",ss,ss1);
		
		// => 정수 : %d , 문자열 : %s , 문자 : %c , 실수 : %f
		bt.change(ss, ss1);
		System.out.println("=== MainClass:main 후 ===");
		System.out.printf("ss=%s,ss1=%s\n",ss,ss1);
		System.out.println("==================== Call By Value ===========");
		System.out.println("메소드에서만 변경 => 원본은 그대로 유지");
		
		int[] arr={10,20};
		System.out.println("main="+arr);
		System.out.println("=== MainClass:main 전 ===");
		System.out.printf("arr[0]=%d,arr[1]=%d\n",arr[0],arr[1]);
		
		bt.change(arr);
		System.out.println("=== MainClass:main 후 ===");
		System.out.printf("arr[0]=%d,arr[1]=%d\n",arr[0],arr[1]);
		
		Data d=new Data();
		System.out.println("=== MainClass:main 전 ===");
		System.out.printf("d.a=%d,d.b=%d\n",d.a,d.b);
		
		bt.change(d);
		
		System.out.println("=== MainClass:main 후 ===");
		System.out.printf("d.a=%d,d.b=%d\n",d.a,d.b);
	}

}
