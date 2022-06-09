package com.sist.util;
/*
 *     StringTokenizer => 단어별 분리 => split()
 *     ---------------
 *     1) 생성자 
 *        new StringTokenizer(데이터,구분문자)
 *     2) countTokens()
 *     3) hasMoreTokens()
 *     4) nextToken()
 */
import java.util.*;
public class MainClass8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String data="red,green,blue,black,yellow,pink,magenta";
        String[] colors=data.split(",");
        System.out.println("갯수:"+colors.length);
        for(String c:colors)
        {
        	System.out.println(c);
        }
        //StringTokenizer st=new StringTokenizer(data, ",");
        //System.out.println("color의 총갯수:"+st.countTokens());
        /*System.out.println(st.nextToken());
        System.out.println(st.nextToken());
        System.out.println(st.nextToken());
        System.out.println(st.nextToken());
        System.out.println(st.nextToken());
        System.out.println(st.nextToken());
        System.out.println(st.nextToken());*/
        //while(st.hasMoreTokens())
        //{
        	//System.out.println(st.nextToken());
        //}
	}

}






