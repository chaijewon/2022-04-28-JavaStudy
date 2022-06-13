package com.sist.collection;
import java.util.*;
public class MainClass6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        
        Iterator it=list.iterator();
        while(it.hasNext())
        {
        	System.out.println(it.next());
        }
        
        System.out.println("========= 재출력 ========");
        while(it.hasNext())
        {
        	System.out.println(it.next());
        }
        ///////////////////////////////////////////
        
        for(Object obj:list)
        {
        	System.out.println(obj);
        }
        System.out.println("======== 재출력 =========");
        for(Object obj:list)
        {
        	System.out.println(obj);
        }
	}

}
