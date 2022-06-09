package com.sist.util;
import java.util.*;
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("년도 입력:");
        int year=scan.nextInt();
        System.out.print("월 입력:");
        int month=scan.nextInt();
        
        System.out.println(year+"년도 "+month+"월");
        System.out.println();
        String[] strWeek={"일","월","화","수","목","금","토"};
        for(String week:strWeek)
        {
        	System.out.print(week+"\t");
        }
        System.out.println();
        // 1일자 => 요일 
        Calendar cal=Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        // month = 0 (1) => 6(5)
        cal.set(Calendar.MONTH, month-1);
        cal.set(Calendar.DATE, 1);
        
        // week
        int week=cal.get(Calendar.DAY_OF_WEEK)-1;
        
        //System.out.println(strWeek[week-1]);
        // 1~7 
        int lastday=cal.getActualMaximum(Calendar.DATE);
        
        for(int i=1;i<=lastday;i++)
        {
        	if(i==1)
        	{
        		for(int j=0;j<week;j++)
        		{
        			System.out.print("\t");
        		}
        	}
        	System.out.printf("%2d\t",i);
        	
        	week++;
        	if(week>6)
        	{
        		week=0;
        		System.out.println();
        	}
        }
        
	}

}
