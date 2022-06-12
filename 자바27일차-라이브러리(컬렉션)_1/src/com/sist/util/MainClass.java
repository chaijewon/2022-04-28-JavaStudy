package com.sist.util;
/*
 *    웹 (자바) => JSP / SpringFramework / SpringBoot
 *    ----------------------------------------------
 *               => JSP(라이브러리) , Spring(라이브러리)
 *     필요한 자바 : => JSP / Spring 라이브러리(자바,오라클,HTML,JS)
 *           기본 : 클래스 , 예외처리 (8장)
 *           ------------------------
 *           사용되는 라이브러리 (자바 => 데이터관리) => HTML(화면 출력)
 *                          ----
 *     요구사항 =======> 데이터베이스 설계  =====> 데이터 수집 ===> 화면 UI ====> 구현  ====> 테스팅 => 배포
 *     ----- 아키텍쳐 (PM)    DBA             웹개발자        퍼블리셔       웹개발자     테스터    
 *                          |
 *                         오라클             자바          HTML/CSS     자바  
 *  
 *     데이터를 관리 => 메모리 저장 => CURD(추가,검색,수정,삭제)
 *     ---------- 배열 (고정적 , 같은 데이터형) => 
 *                클래스 => 여러개 저장 (가변형으로) => 컬렉션 
 *     컬렉션프레임워크 => 표준 (모든 클래스가 같은 메소드를 가지고 있다)
 *     ------------ 데이터를 모아서 관리(메모리) , 표준화 
 *                                         ------
 *                                            |
 *                                          인터페이스 
 *     => 메소드명이 동일 , 프로그램 구조 => 소스(X)
 *        ----------------------- 
 *      
 *        컬렉션 
 *        ------
 *      ---------------------------------  
 *             Collection
 *                |
 *         ----------------------
 *         |          |         |
 *       List        Set       Map
 *      --------------------------------- 인터페이스 
 *      List 
 *      ----
 *        |
 *        ArrayList 
 *        Vector 
 *        LinkedList 
 *        
 *      Set
 *      ----
 *        |
 *        TreeSet
 *        HashSet
 *        
 *      Map
 *      ----
 *        |
 *       Hashtable
 *       HashMap 
 *       
 *      --------------> Stack,Queue
 *      
 *      List 
 *      -----
 *        1. 순서가 있다 (인덱스번호 => 자동으로)
 *           0 1 2 3 4 5 
 *                -- 제거
 *           0 1 2 3 4 ==> 순차적 
 *           => 속도가 늦다 
 *        2. 데이터 중복이 가능 
 *        3. 사용처 => 데이터베이스 관련 (핵심)
 *        4. 구현클래스 
 *           ***1) ArrayList : 비동기 
 *           2) Vector : 동기 => 보완 (ArrayList) => 네트워크의 사용자 정보 저장 
 *           3) LinkedList : C호환 
 *           
 *      Set 
 *      ----
 *        1. 순서가 없다 
 *        2. 데이터중복을 허용하지 않는다 
 *        3. => List에 중복데이터를 제거 
 *        4. 구현된 클래스 
 *           1) TreeSet
 *           2) HashSet (***)
 *           
 *      Map
 *      ----
 *        1. 키와 값을 쌍으로 저장 
 *        2. 데이터중복 허용 , 키는 중복이 불가능 
 *        3. 사용클래스 (웹 => request,response,session,cookie)
 *        4. 구현된 클래스 
 *           1) Hashtable 
 *           2) HashMap(Hashtable을 단점을 보완) 
 *              -------- 웹소켓 (웹 채팅) 
 *        5. 사용처 => 클래스를 모아서 관리 (스프링)
 *                   => 마이바티스 (데이터베이스 관리) 
 *      ===> ArrayList 
 *           HashMap
 *           
 *      List의 주요기능(메소드) => 컬랙션 (데이터 관리)
 *      -------------------         --------- 수정,삭제,추가,검색
 *                                            CURD
 *      CURD (Create(추가) , Update , Read(검색) , Delete)
 *         => Insert        Update   Select      Delete => SQL(DML)
 *      -------------------
 *      C => 추가 add(Object obj) , add(int index,Object obj)
 *           =>  맨뒤에 추가          => 원하는 위치에 추가 (속도가 저하)
 *               (권장)             => 대용량으로 저장 
 *      U => 수정 set(int index,Object obj)
 *      R => 읽기 get(int index)
 *      D => 삭제 remove(int index)
 *      --------------------------
 *      = int size() => 저장된 갯수 
 *      = void clear() => 전체 데이터 삭제 
 *      = boolean isEmpty() => 데이터가 빈상태 확인 
 *      
 *      ====> ArrayList , Vector , LinkedList
 *      ====> 저장 (Object) => 모든 데이터 추가가 가능 
 *           add(1)
 *           add("")
 *           add(10.5)
 *           add(true)
 *           add(sa)
 *           ===> 순서가 존재(반복문 => for , while) 
 *           ===> 권장 사항 (같은 데이터형을 추가하는 것을 권장)
 *           ===> 데이터를 받을때 => 형변환 
 *           ===> 데이터형을 통일 (형변환없이 사용) => 제네릭스 (12장)
 *           
 *        class A
 *        {
 *           int a,b;
 *           void c(){} ==> B가 가지고 있는 c()
 *           void d(){}
 *        }
 *        class B extends A
 *        {
 *           void e(){}
 *           void c(){} => 오버라이딩
 *           void d(){}
 *           ----------------------
 *           int a,b;
 *           
 *           ----------------------
 *        }
 *        
 *        A a=new A() ==> a,b,c:A,d
 *        B b=new B() ==> a,b,d,e,c:B
 *        A c=new B() ==> a,b,c:B,d:B
 *            ------- A가 가지고 있는 메소드중에 오버라이딩된 메소드로 변경
 *        *** 상위클래스는 상위클래스에 있는 데이터,메소드 접근이 가능 
 *            
 */
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList list=new ArrayList();
        // 추가 => 5명 
        list.add("홍길동");// 0
        list.add("이순신");// 1
        list.add("강감찬");// 2
        list.add("심청이");// 3
        list.add("박문수");// 4
        //list.add(100);// String s=100;
        // 전체 출력 
        for(Object obj:list)
        {
        	String name=(String)obj;
        	System.out.println(name);
        }
        System.out.println("=============");
        for(int i=0;i<list.size();i++)
        {
        	String name=(String)list.get(i);
        	System.out.println(name);
        }
        System.out.println("=============");
        //람다의 단점 => 재사용이 불가능 
        list.forEach(name->System.out.println(name));
        
        // 데이터 추가 
        list.add("춘향이");// 권장 
        list.add(2,"을지문덕");
        list.add(3,"전봉준");
        /*
         *  홍길동 0
			이순신 1
			을지문덕 2
			강감찬 3
			심청이 4
			박문수 5
			춘향이 6
			
			홍길동 0
			이순신 1
			을지문덕 2
			전봉준 3
			강감찬 4
			심청이 5
			박문수 6
			춘향이 7
         */
        System.out.println("============");
        for(Object obj:list)
        {
        	String name=(String)obj;
        	//System.out.println(name);
        	System.out.println(name);
        	
        }
        
        System.out.println("===== 수정 ======");
        list.set(0, "홍길수");
        
        for(Object obj:list)
        {
        	String name=(String)obj;
        	//System.out.println(name);
        	System.out.println(name);
        	
        }
        
        System.out.println("====== 삭제 ======");
        // index 번호 변경 
        /*
         *  홍길수 0
			이순신 1
			을지문덕 2 === 삭제 
			전봉준 3
			강감찬 4
			심청이 5
			박문수 6
			춘향이 7
			
			홍길수 0
			이순신 1
			전봉준 2
			강감찬 3
			심청이 4
			박문수 5
			춘향이 6  === 순차적으로 유지 
         */
         list.remove(2);
         for(int i=0;i<list.size();i++)
         {
        	 String name=(String)list.get(i);
        	 System.out.println(name+":"+i);
         }
         System.out.println("====== 저장된 갯수 =====");
         System.out.println("총인원:"+list.size());
         System.out.println("====== 전체 삭제 =====");
         list.clear();
         System.out.println("총인원:"+list.size());
         System.out.println("====== 데이터 존재여부 =====");
         if(list.isEmpty()) // => 존재여부 확인후 데이터 출력 
        	 System.out.println("저장공간이 비워있다");
         else
        	 System.out.println("저장공간에 데이터가 존재한다");
        
	}

}






