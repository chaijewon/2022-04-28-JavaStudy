package com.sist.collection;
import java.util.*;
import java.io.*;//예외처리 java.net , java.sql 
// 1. 데이터베이스 정보 저장 
// 2. 유효성 검사 
// 3. 메뉴 
public class MainClass16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	Properties prop=new Properties();
        	prop.load(new FileInputStream("c:\\javaDev\\db.properties"));
        	System.out.println("driver:"+prop.getProperty("driver"));
        	System.out.println("url:"+prop.getProperty("url"));
        	System.out.println("username:"+prop.getProperty("username"));
        	System.out.println("password:"+prop.getProperty("password"));
        	System.out.println("maxActive:"+prop.getProperty("maxActive"));
        	System.out.println("maxIdle:"+prop.getProperty("maxIdle"));
        	System.out.println("maxWait:"+prop.getProperty("maxWait"));
        }catch(Exception ex){}
	}

}
