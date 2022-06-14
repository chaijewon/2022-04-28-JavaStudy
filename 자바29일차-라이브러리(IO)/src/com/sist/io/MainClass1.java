package com.sist.io;
// 868page => 14장(람다식) => 자바스크립트 => 스프링 
// 오라클 => 연동 (JDBC/DBCP/ORM) 
// 라이브러리 => java.io => CheckException (반드시 예외처리)
/*
 *   자바 입출력 
 *   IO ==> Input/Output 
 *   -------------------- 표준 IO : System.in , System.out
 *                                -----------  ----------
 *                                 입력            출력 
 *                                 => in : InputStream 
 *                                 => out: OutputStream 
 *   => Stream : 데이터 이동 통로 : 단방향 
 *      -------------------------------- IO 빨대 
 *   => 스트림의 종류
 *      1. InputStream / OutputStream 
 *         => 읽기 / 쓰기 => 1byte 
 *            => read  , write , close
 *            단점 : 한글이 깨진다 
 *            주로 사용처 : 업로드, 다운로드 
 *            
 *         FileInputStream / FileOutputStream
 *         *** 한글은 1글자당 2byte
 *      2. Reader   /  Writer
 *         => 읽기 / 쓰기 => 2byte
 *            => read , write , close
 *         FileReader / FileWriter
 *      3. 보조스트림 : 속도  ==> Buffered~
 */
import java.io.*;
import java.util.*;
public class MainClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	FileReader fis=
        			new FileReader("C:\\javaDev\\javaStudy\\자바29일차-라이브러리(IO)\\src\\com\\sist\\io\\MainClass1.java");
        	int i=0;// int read() => 문자코드번호 =>  A 65
        	while((i=fis.read())!=-1) //-1 EOF
        	{
        		System.out.print((char)i);
        	}
        	fis.close();
        }catch(Exception ex){}
	}

}
