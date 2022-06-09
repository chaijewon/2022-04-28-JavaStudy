package com.sist.util;
//  변환 => 숫자 , 날짜 
import java.text.*;
import java.util.Date;
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        DecimalFormat df=new DecimalFormat("###,###,###");
        int data=12345678;
        System.out.println(df.format(data)); // 오라클 
        Date date=new Date();
        /*
         *   년도 => yyyy
         *   월  => MM
         *   일  => dd
         *   시간 => hh
         *   분  => mm
         *   초  => ss
         */
        SimpleDateFormat sdf=
        		new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println(sdf.format(date));
        
        System.out.println("=========================");
        double[] limit={59,60,70,80,90};
        // 0~59 , 60~69 , 70~79 , 80~89 , 90~
        String[] grade= {"F","D","C","B","A"};
        
        int[] score={100,90,85,99,45,67,78};
        ChoiceFormat form=new ChoiceFormat(limit,grade);
        
        for(int i=0;i<score.length;i++)
        {
        	System.out.println(score[i]+":"+form.format(score[i]));
        }
        
        System.out.println("=========================");
        
        String mag="Name:{0}\nTel:{1}\nAddress:{2}\nSex:{3}\nAge:{4}";
        Object[] data2={"홍길동","010-1111-1111","서울","남자",25};
        String result=MessageFormat.format(mag, data2);
        System.out.println(result);
        
        
	}

}






