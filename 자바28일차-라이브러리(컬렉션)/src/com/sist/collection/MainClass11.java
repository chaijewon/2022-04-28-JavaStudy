package com.sist.collection;
import java.util.*;
public class MainClass11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[] data={"aaa","abc","adf","abb","aKK",
        		       "bbb","bDc","bke","bhu","boi",
        		       "ccc","cfg","chj","cko","cff",
        		       "ddd","def","dfff","dnnnn"};
        TreeSet set=new TreeSet();
        for(String s:data)
        {
        	set.add(s);
        }
        
        System.out.println("====== 데이터 출력 =====");
        for(Object obj:set)
        {
        	System.out.print(obj+" ");
        }
        System.out.println();
        
        System.out.println(set.subSet("b", "dec"));
	}

}
