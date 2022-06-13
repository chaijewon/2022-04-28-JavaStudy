package com.sist.collection;
import java.util.*;
// TreeSet => 검색 , 검색범위 => 자바 => REGEXP
public class MainClass10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        TreeSet set=new TreeSet();
        for(int i=0;i<10;i++)
        {
        	int score=(int)(Math.random()*101);
        	set.add(score);
        }
        
        Iterator it=set.iterator();
        while(it.hasNext())
        {
        	System.out.print(it.next()+" ");
        }
        // 오라클 => BETWEEN ~ AND 
        System.out.println("====== 60점이하 ======");
        System.out.println(set.headSet(60));
        System.out.println("====== 60점이상 ======");
        System.out.println(set.tailSet(60));
	}

}
