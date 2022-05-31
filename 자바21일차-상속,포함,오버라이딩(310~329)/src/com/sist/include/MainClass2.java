package com.sist.include;
/*
 *    객체지향 프로그램 
 *    ***1. 변수 => 캡슐화 처리 (데이터 은닉화)
 *       변수: private 
 *       메소드 : 읽기 / 쓰기 ==> getter/setter => public 
 *    2. 생성자 : public 
 *    3. 재사용 기법
 *       = 상속 : 한개의 클래스를 이용해서 사용 (변경 후 사용)
 *         extends => 기존의 클래스 확장 
 *       = 포함 : 여러개 클래스를 이용할 때 (변경없이 사용)
 *         ------- 멤버로 클래스를 사용할 때 사용 
 *    4. 수정/추가 => 다형성 
 *       오버라이딩
 *         = 상속이 있는 경우 
 *         = 메소드명이 동일 
 *         = 리턴형이 동일 
 *         = 매개변수 동일  
 *         = 접근지정어 => 확장이 가능 
 *           private < default < protected < public 
 *           *** 모든 메소드는 public 
 *       오버로딩 
 *         = 한개의 클래스내에서 
 *         = 메소드명 동일 
 *         = 리턴형은 관계없다 
 *         = 매개변수의 갯수,데이터형이 다른 경우 
 *           --------------------------
 *    
 */
/*
 *        Object (동물)
 *          |
 *      -------------
 *      |           |
 *    String (개)  StringBuffer(소)
 *    StringBuffer sb=new StringBuffer();
 *    String s=(String)sb; ==> 오류 
 *    클래스는 상속,포함 => 크기를 비교할 수 있다 
 *    ---------------------------------- 형변환 
 *    
 *    => 남자 a=(남자)여자; ==> 오류 
 *       남자 a=(남자)동물; 
 */
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Object obj=new Object();
        String s=new String();
        StringBuffer sb=new StringBuffer();
        
        if(s instanceof Object) //String은 Object다 
        {
        	System.out.println("Ok");
        }
        if(sb instanceof Object)
        {
        	System.out.println("Ok");
        }
        if(obj instanceof String)
        {
        	System.out.println("Ok");
        }
        
        	
	}

}
