package com.sist.lang;
// equals => String (오버라이딩) 
// Object의 기능은 모든 클래스가 가지고 있다 
/*
 *            Object
 *            ------
 *            |     |
 *     MainClass2   MainClass => Object가 가지고 있는 모든 메소드를 가지고 있다 
 */
class Value{
	int value;
	Value(int value)
	{
		this.value=value;
	}
}
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Value v1=new Value(100);
        Value v2=new Value(100);
        System.out.println("v1="+v1);
        System.out.println("v2="+v2);
        if(v1.equals(v2)) // 저장된 주소
        	System.out.println("v1과 v2가 같다");
        else
        	System.out.println("v1과 v2가 다르다");
        
        v1=v2;
        System.out.println("v1="+v1);
        System.out.println("v2="+v2);
        if(v1.equals(v2))
        	System.out.println("v1과 v2가 같다");
        else
        	System.out.println("v1과 v2가 다르다");
        /*
         *   equals=>가지고 있는 값
         *   == => 주소값 (메모리)
         */
        
	}

}





