package com.sist.io;
import java.io.*;
// 파일 만들기 , 폴더 만들기 
// => 프로그램 => 탐색기 
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	// 1. 폴더 만들기 
        	File dir=new File("c:\\사원");
        	// 2. 확인 
        	if(!dir.exists())// 존재여부 확인 
        	{
        		dir.mkdir();
        		System.out.println("폴더 생성!!");
        	}
        	else
        	{
        		System.out.println("이미 존재하는 폴더입니다..");
        	}
        	
        	File file=new File("c:\\사원\\sawonData.txt");
        	if(!file.exists())
        	{
        		file.createNewFile();
        		System.out.println("파일 만들기 완료!!");
        	}
        	else
        	{
        		System.out.println("이미 존재하는 파일입니다..");
        	}
        }catch(Exception ex) 
        {
        	ex.printStackTrace();
        }
	}

}
