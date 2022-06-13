package com.sist.collection;
import java.util.*;
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList list1=new ArrayList();
        list1.add("홍길동");
        list1.add("심청이");
        list1.add("박문수");
        list1.add("심청이");
        list1.add("홍길동");
        list1.add("박문수");
        
        /*ArrayList list2=new ArrayList();
        list2.addAll(list1);
        
        for(Object obj:list2)
        {
        	System.out.println(obj);
        }*/
        HashSet set=new HashSet();
        set.addAll(list1);
        for(Object obj:set)
        {
        	System.out.println(obj);
        }
        
        ArrayList list2=new ArrayList();
        list2.addAll(set);
        for(Object obj:list2)
        {
        	System.out.println(obj);
        }
        // 영화 장르 , 부서명 , 근무지 ==> DISTINCT
	}

}
