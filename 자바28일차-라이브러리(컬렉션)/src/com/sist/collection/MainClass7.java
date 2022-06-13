package com.sist.collection;
// 624page => 배열 => ArrayList 변경 , sort
import java.util.*;
public class MainClass7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[] names={"kim","shim","hong","lee","park"};
        Arrays.sort(names);
        List list=Arrays.asList(names);// asList=>List
        Iterator it=list.iterator();
        while(it.hasNext())
        {
        	System.out.println(it.next());
        }
	}

}
