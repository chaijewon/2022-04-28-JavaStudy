package com.sist.io;
import java.io.*;
// 파일 복사 ==> 파일 업로드 
public class MainClass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	// 파일 읽기 => FileInputStream
        	// 파일 쓰기 => FileOutputStream 
        	// 파일 복사 , 파일 다운로드 
        	FileInputStream fis=new FileInputStream("c:\\javaDev\\melon.txt");
        	FileOutputStream fos=new FileOutputStream("c:\\사원\\melon.txt");
        	// FileOutputStream => 파일이 없는 경우에는 자동으로 생성 
        	// w(쓰기) , r(읽기) , a(append) => true
        	// => 한번을 읽을때 => 1024
        	int i=0;
        	byte[] buffer=new byte[1024];//TCP , UDP : 512 
        	while((i=fis.read(buffer, 0, 1024))!=-1)//file 끝날때까지 (EOF)
        	{
        		fos.write(buffer, 0, i);
        	}
        	fis.close();
        	fos.close();
        	System.out.println("파일복사 완료!!");
        }catch(Exception ex) {}
	}

}
