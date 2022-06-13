package com.sist.collection;
/*
 *    Set 
 *    ----
 *      HashSet  / TreeSet(검색)
 *      ------- 중복 제거 
        add()
        addAll()
        clear()
        isEmpty()
        size()
        iterator() 
        ----------------- 1) 순서가 존재하지 않는다 
                          2) 데이터 중복을 허용하지 않는다 
                             --------------------- Primary Key
 */
import java.util.*;
public class MainClass8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 631 => Set의 대표적인 클래스 => HashSet 
		ArrayList list=new ArrayList();//데이터 중복 
		list.add("red");
		list.add("red");
		list.add("red");
		list.add("red");
		list.add("red");
		System.out.println("=====ArrayList=====");
		for(Object obj:list)
		{
			System.out.println(obj);
		}
		
		HashSet set=new HashSet();// 데이터 중복이 없다 
		// Set set=new HashSet() => set=new TreeSet()
		set.add("red");
		set.add("red");
		set.add("red");
		set.add("red");
		set.add("red");
		//  Iterator 사용이 편리하다 
		System.out.println("======HashSet =====");
		for(Object obj:set)
		{
			System.out.println(obj);
		}
		
		
		
	}

}










