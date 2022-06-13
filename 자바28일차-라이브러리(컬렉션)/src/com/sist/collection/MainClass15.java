package com.sist.collection;
// Properties => Hashtable 상속을 받아서 구현 (키,값) => 키는 중복이 없다
// => 파일 => .properties (DataBase의 정보) , 메뉴 저장 
import java.util.*;
public class MainClass15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Properties prop=new Properties();
        prop.setProperty("driver", "oracle.jdbc.driver.OracleDriver");
        prop.setProperty("url", "jdbc:oracle:thin:@localhost:1521;XE");
        prop.setProperty("username", "hr");
        prop.setProperty("password", "happy");
        
        System.out.println("driver:"+prop.getProperty("driver"));
        System.out.println("url:"+prop.getProperty("url"));
        System.out.println("username:"+prop.getProperty("username"));
        System.out.println("password:"+prop.getProperty("password"));
        
        
	}

}
