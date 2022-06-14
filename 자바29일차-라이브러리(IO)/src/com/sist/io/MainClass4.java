package com.sist.io;
// 파일에 대한 정보 읽기
import java.util.*; // Date
import java.text.*; // SimpleDateFormat 
import java.io.*; // lastModified : 수정 날짜 => long 
/*
 *   파일 
 *   ---
 *     1. getName() , getPath()
 *     2. length() 
 *     3. createNewFile()
 *     4. mkdir()
 *     5. exists()
 */
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	File file=new File("c:\\javaDev\\melon.txt");
        	System.out.println("수정일:"+file.lastModified());
        	long last=file.lastModified();
        	Date date=new Date(last);
        	System.out.println("수정일:"+date);
        	SimpleDateFormat sdf=new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
        	System.out.println("수정일:"+sdf.format(date));
        	System.out.println("===== 기타 정보 ======");
        	System.out.println("***파일명:"+file.getName());
        	System.out.println("***경로+파일명:"+file.getPath());
        	System.out.println("결로명:"+file.getParent());
        	System.out.println("읽기전용:"+file.canRead());
        	System.out.println("쓰기전용:"+file.canWrite());
        	System.out.println("숨김파일:"+file.isHidden());
        	System.out.println("절대경로:"+file.getAbsolutePath());
        	System.out.println("정규경로:"+file.getCanonicalPath());
        	System.out.println("File.pathSeparator-"+File.pathSeparator);
        	//System.out.println("파일크기:"+file.length());
        	long size=file.length();//***
        	String s="";
        	if(size/1024>0)
        		s=(size/1024)+"KB";
        	else
        		s=size+"Bytes";
        	System.out.println(s);
        }catch(Exception ex)
        {
        	ex.printStackTrace();
        }
	}

}
