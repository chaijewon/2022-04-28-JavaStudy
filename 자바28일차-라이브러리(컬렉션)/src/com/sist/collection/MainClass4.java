package com.sist.collection;
/*
 *    Iterator , ListIterator , 열거형 
 *    --------
 *    Set => HashSet
 *      => 저장 , 출력 (데이터 읽기=> Iterator) 
 *    Map => HashMap => 저장 (push), 값읽기 (get)
 *    ---------------------------------------- 외부라이브러리
 *         => 스프링 , MyBatis , JPA => XML,Annotation=> Map 
 *         request.setAttribute("name","홍길동")
 *         cookie=new Cookie("image","이미지파일")
 *         ------------------------------------------------
 *    => Iterator 
 *         => hasNext() : while() => 데이터가 있는 갯수만큼 
 *         => next() : 실제데이터 읽기 
 *         
 *    여러개 사용 ==> 한개의 이름 제어 
 *    
 *    => 데이터가 여러개 ==> 배열 
 *    => 클래스가 여러개 ==> 인터페이스 
 *    ---------------------------
 */
import java.util.*;
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List list=new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        // Iterator => 데이터를 모아서 순차적으로 접근이 용이하게 만드는 라이브러리 
        // => 표준화 
        Iterator iter=list.iterator();
        
        while(iter.hasNext())
        {
        	System.out.println(iter.next());
        }
        
        list=new Vector();
        list.add("11");
        list.add("22");
        list.add("33");
        list.add("44");
        list.add("55");
        
        iter=list.iterator();
        while(iter.hasNext())
        {
        	System.out.println(iter.next());
        }
        
        list=new LinkedList();
        list.add("111");
        list.add("222");
        list.add("332");
        list.add("444");
        list.add("555");
        
        iter=list.iterator();
        while(iter.hasNext())
        {
        	System.out.println(iter.next());
        }
	}

}









