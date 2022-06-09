package com.sist.util;
import java.util.regex.*;
public class MainClass6 {
    // 211.63.89.99 
	// --------- 회사번호 
	// 508page
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String data="HP:010-1111-1111,HOME:02-222-2222";
        //String pattern="(0[0-9]{1,2})-([0-9]{3,4})-([0-9]{4})";
        //  0[0-9]{1,2}  => 0으로 시작 뒤에 숫자가 1개 아니면 2개 존재
        //  [0-9]{3,4} 숫자 (3,4)  [0-9]{4} 숫자 4개 존재 
        String pattern="(0\\d{1,2})-(\\d{3,4})-(\\d{4})";
        // [0-9] ==> \\d
        Pattern p=Pattern.compile(pattern);
        Matcher m=p.matcher(data);
        while(m.find())
        {
        	System.out.println(m.group());// 찾은 문자열 
        	System.out.println(m.group(1));
        	System.out.println(m.group(2));
        	System.out.println(m.group(3));
        }
	}

}
