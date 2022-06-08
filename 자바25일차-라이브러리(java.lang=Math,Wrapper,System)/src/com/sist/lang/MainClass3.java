package com.sist.lang;
// length , indexOf , lastIndexOf 
// 웹 => 모든 데이터가 문자열 
import java.util.*;
import java.io.*;
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("문자열 입력:");
        String ss=scan.nextLine();// next():공백을 허용하지 않는다 , nextLine:공백 허용
        System.out.println("입력한 문자열:"+ss);
        System.out.println("글자수:"+ss.length());
        // 글자수가 벗어난 경우  ( ... )
        if(ss.length()>10)
        {
        	ss=ss.substring(0,10)+"...";
        }
        System.out.println(ss);
        
        System.out.println("===== lastIndexOf =====");
        Set<String> set=new HashSet<String>();
        try
        {
        	File dir=new File("c:\\javaDev");
        	File[] list=dir.listFiles();
        	for(File f:list)
        	{
        		if(f.isFile()) // 폴더 제거 
        		{
        		  System.out.println(f.getName());
        		  String name=f.getName();
        		  String ext=name.substring(name.lastIndexOf(".")+1);
        		  //System.out.println(ext);
        		  set.add(ext);
        		}
        	}
        }catch(Exception ex){}
        
        for(String s:set)
        {
        	System.out.println(s);
        }
	}

}
