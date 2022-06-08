package com.sist.lang;
// startsWith , endsWith , contains 
import java.util.*;
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[] data={
        		"Java & Oracle",
        		"Java와 JSP",
        		"Java와 Spring",
        		"Basic Spring",
        		"Basic Java",
        		"Basic Oracle",
        		"Ajax , JQuery"};
       Scanner scan=new Scanner(System.in);
       System.out.print("검색어 입력:");
       String ss=scan.next();
       
       System.out.println("===== startsWith =====");
       for(String s:data)
       {
    	   // startsWith => 대소문자를 구분 Like 'Java%'
    	   if(s.startsWith(ss))
    	   {
    		   try
    		   {
    			   Thread.sleep(1000);
    		   }catch(Exception ex){}
    		   System.out.println(s);
    	   }
       }
       System.out.println("===== endsWith ======");
       for(String s:data)
       {
    	   // endsWith => 대소문자를 구분 Like '%Java'
    	   if(s.endsWith(ss))
    	   {
    		   try
    		   {
    			   Thread.sleep(1000);
    		   }catch(Exception ex){}
    		   System.out.println(s);
    	   }
       }
       System.out.println("===== contains ======");
       // 영화 찾기 , 게시물 ==> Like '%Java%' ==> 추천 (블로그,카페)
       for(String s:data)
       {
    	   // contains => 대소문자를 구분 
    	   if(s.contains(ss))
    	   {
    		   try
    		   {
    			   Thread.sleep(1000);
    		   }catch(Exception ex){}
    		   System.out.println(s);
    	   }
       }
        
	}

}
