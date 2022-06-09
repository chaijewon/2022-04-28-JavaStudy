package com.sist.util;
/*
 *    2권 => 라이브러리 
 *    -------------- java.util(Colloction) ****** 11,12
 *                   java.io ***** 15
 *                   java.net
 *    10장 
 *    ---- 날짜 / 시간 
 *         변환 (Format) => java.text
 *         
 *         Date ==> new Date() => 시스템의 날짜/시간 
 *         Calendar 
 *         --------
 *         *** 숫자변환 1,000,000 
 *         *** 날짜변환 2022-06-09
 *         메세지변환 
 *         선택변환 
 *                   
 */
import java.util.*;
public class MainClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Date date=new Date();
        //System.out.println(date);// 오라클과 연동 
		Calendar cal=Calendar.getInstance();// 추상클래스
		System.out.println("년도:"+cal.get(Calendar.YEAR));
		System.out.println("월:"+(cal.get(Calendar.MONTH)+1));
		// Month => 0~11 +1
		// out.println()
		System.out.println("일:"+cal.get(Calendar.DATE));
		// 요일 
		String[] week={"","일","월","화","수","목","금","토"};
		// week => 1~7
		int w=cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(week[w]);
		// 달의 마지막날 
		int lastday=cal.getActualMaximum(Calendar.DATE);
		System.out.println(lastday);
		// 오라클 
	}

}









