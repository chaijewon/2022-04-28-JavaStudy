package com.sist.music;
// 사용자 정의 데이터형 (Music) , 공통기능 => 오버라이딩 (수정 용이)
/*
 *      자바 오버라이딩 (필수) 
 *     -------------------------------------
 *         오버라이딩(수정)        오버로딩(추가) 
 *     -------------------------------------
 *      1. 메소드명이 동일         메소드명이 동일 
 *     -------------------------------------
 *      2. 매개변수가 동일        매개변수의 갯수,데이터형이 다르다 
 *     -------------------------------------
 *      3. 리턴형이 동일         리턴형은 관게없다 
 *     -------------------------------------
 *      4. 접근지정어가 축소는 불가능 , 확대는 가능 
 *         class A
 *         {
 *            void display(){}
 *         }
 *         class B extends A
 *         {
 *            void display(){}
 *            protected void display(){}
 *            public void display(){}
 *            private void display(){} => (X)
 *         }
 *         
 *         private < default < protected < public 
 *     -------------------------------------
 *      5. 상속이 있어야 한다      한개의 클래스에서 제작 
 *     -------------------------------------
 *     *** 내부 클래스를 사용하면 => 상속없이 오버라이딩이 가능 
 *     
 */
public class GenieMusic extends MusicSystem{
	   public void musicRead()
	   {
		   
	   }
}








