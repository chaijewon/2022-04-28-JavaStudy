package com.sist.lang;
/*
 *   StringBuffer : 문자열 결합 (임시저장 장소) => 많이 있는 경우 
 *                  최적화 
 *                  => append() : 문자열 결합 
 */
import java.io.*;//CheckException
/*
 *   java.io
 *   java.net
 *   java.sql 
 *   => 웹 (network) => 예외처리 
 */
public class MainClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	//String data="";
        	StringBuffer data=new StringBuffer();
        	long start=System.currentTimeMillis();
        	FileReader fr=new FileReader("c:\\javaDev\\recipe.txt");
        	int i=0;
        	while((i=fr.read())!=-1)
        	{
        		//data+=String.valueOf((char)i);
        		data.append((char)i);
        	}
        	long end=System.currentTimeMillis();
        	System.out.println(data.toString());
        	System.out.println("걸린 시간:"+(end-start));
        }catch(Exception ex){}
	}

}








