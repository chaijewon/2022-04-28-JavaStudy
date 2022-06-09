package com.sist.util;
/*
 *   String[] title={"aaa","bbb","ccc"}
 *   for(String t:title)
 *   {
 *      
 *   }
 */
import java.io.*;
import java.util.regex.*;
// 1. 단어를 모른다 , 2. 글자수 모른다 , 3. 시작점 => 문자의 형식(패턴) 
// 2. 크롤링 => 데이터 저장 
public class MainClass7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	FileReader fr=new FileReader("c:\\javaDev\\youtube.txt");
        	StringBuffer sb=new StringBuffer();
        	int i=0;
        	while((i=fr.read())!=-1)
        	{
        		sb.append(String.valueOf((char)i));
        	}
        	fr.close();
        	//System.out.println(sb.toString());
        	// /watch?v=9siw4Bt4QWs\u0026t=946s"
        	String data=sb.toString();
        	Pattern p=Pattern.compile("/watch\\?v=[^가-힣]+");
        	Matcher m=p.matcher(data);
        	while(m.find())
        	{
        		String key=m.group();// 찾은 데이터를 읽어 온다 
        		System.out.println(key);
        		key=key.substring(key.indexOf("=")+1,
        				key.indexOf("\""));
        		System.out.println(key);
        	}
        }catch(Exception ex){}
	}

}











