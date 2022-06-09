package com.sist.util;
/*
 *    java.lang => Object , String ,StringBuffer , Math , Wrapper
 *    java.util => Scanner , StringTokenizer 
 *                           ---------------- split
 *                 java.util.regex => Pattern / Matcher
 *                 Date , Calendar
 *                 java.text => SimpleDateFormat 
 *                              ChoiceMessage 
 *                 => Collection => 데이터를 모아서 브라우저 전송 
 *                 ---------------------------------------
 *                 1권 (8장) => 라이브러리(웹)
 *                 -----------------------
 *   500page 
 *   ------- Random => 웹 (예약일) => 관리자 / 사용자 
 *                                        ------
 *   
 *                                 
 *                  
 */
import java.util.*;
public class MainClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 인스턴스 메소드를 가지고 있다 
		Random r=new Random();
		int a=r.nextInt(100)+1; // int범위 => 0~99발생 => 100은 제외 
		System.out.println(a);
	}

}











