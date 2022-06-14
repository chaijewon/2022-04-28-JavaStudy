package com.sist.collection;
// Collections => 666page
import java.util.*;
import static java.util.Collections.*;
/*
 *    import static java.lang.Math.*; 
 *    
 *    Math.random() ==> random()
 */
// Collections가 가지고 있는 메소드는 그냥이 가능 
public class MainClass17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList list=new ArrayList();
        addAll(list,1,2,3,4,5);// 여러개를 동시에 첨부 (******)
        System.out.println(list);
        rotate(list, 2);// 오른쪽으로 2칸이동 
        System.out.println(list);
        
        swap(list,0,2);
        System.out.println(list); 
        
        sort(list);//*******
        System.out.println(list);
        
        System.out.println(max(list));
        System.out.println(min(list));
	}

}







