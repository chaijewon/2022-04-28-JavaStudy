package com.sist.lang;
/*
 *    Wrapper => 제네릭스 타입 (데이터형의 표준화)
 *    ========
 *    Integer  => Integer.parseInt(String s)
 *    Double   => Double.parseDouble(String s) 
 *    Boolean  => Boolean.parseBoolean(String s)
 *    Long     => Long.parseLong(String s)
 */
import java.util.*;
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*int a=10;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toHexString(a));
        System.out.println(Integer.toOctalString(a));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);*/
		Integer i=100; 
		
		int ii=i;
		// => 웹에서 해당데이터형으로 변경 
		System.out.println(i);
		System.out.println(ii);
		
	}

}
