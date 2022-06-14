package com.sist.io;
/*
 *    웹에서 사용되는 클래스 
 *    File : File에 대한 모든 정보 
 *    ------------------------
 *    File 제어 
 *      => 읽기/쓰기 
 *         1byte      
 *           FileInputStream 
 *           FileOutputStream 
 *           ----------------
 *           보조 스트림 
 *           BufferedInputStream 
 *           BufferedOutputStream 
 *           
 *         2byte 
 *           FileReader 
 *           FileWriter
 *           BufferedReader
 *           BufferedWriter
 *         객체단위 (시리얼라이즈) 
 *           ObjectInputStream
 *           ObjectOutputStream 
 *           
 *     File : XML, properties , CSV , json => 라이브러리 
 *            jaxb,jaxp         CsvWriter => json-simple,jackson
 *                              CsvReader
 *            naver => api 
 *            daum  => api  ====> xml,json
 *                              설정파일 => Front(RestFul)
 *     ------------------------------------
 *     데이터 
 *     -----
 *      비정형화 : txt (구분) => 제어하기 어렵다 
 *      반정형화 : xml,html,json,csv,properties : 구분
 *           
 *      정형화 : rdbms (오라클)
 *      
 *      ---------------------------------------------
 *      파일 정보 읽기  
 *      -----------
 *      파일 (File) => 실제 파일 , 디렉토리 (폴더)
 *      생성자 
 *        File dir=new File("c:\\javaDev") => 폴더 
 *        File file=new File("c:\\javaDev\\melon.txt") => 파일 
 *      1) 파일에 대한 정보 
 *         = getName() => melon.txt
 *         = getPath() => c:\\javaDev\\melon.txt
 *         = getParent() => c:\\javaDev
 *      2) 파일 특성 (boolean)
 *         = canRead()  ==> 읽기 전용 
 *         = canWrite() ==> 쓰기 전용
 *         = isHidden() ==> 숨김
 *      3) 파일의 종류 
 *         = isFile()
 *         = isDirectory()  ==> can~ , is~ => boolean
 *      4) 파일 / 디렉토리 만들기 
 *         = createNewFile()
 *         = mkdir()
 *      5) 삭제 
 *         = delete() => 파일 1개 삭제 (폴더 삭제시에는 안에 있는 모든 파일 삭제후 삭제)
 *           rm -rf 파일명,폴더명
 *      6) 존재여부 확인 
 *         = exists => 다운로드 (폴더)
 *      7) 수정날짜
 *         = lastModified 
 *      8) 파일 크기 
 *         = length() => Byte , KB  , MB 
 *                             /1024 , (/1024)/1024 
 *   ---------------------------------------------------   
 *      
 *      
 */
// 구분 (DIR , FILE) => FILE 정보 => 
import java.io.*;
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	// 1. File 객체 생성 
        	File dir=new File("c:\\javaDev");
        	// 2. javaDev에 있는 모든 폴더/파일을 읽어 온다 
        	File[] list=dir.listFiles();
        	// 3. 출력 
        	for(File f:list)
        	{
        		//System.out.println(f.getName());
        		if(f.isFile()) 
        		{
        			System.out.println(f.getName()+"(file)");
        			// f.isFile() true(file) , false(dir)
        		}
        		else
        		{
        			System.out.println(f.getName()+"(DIR)");
        			// f.isDirectory()
        		}
        	}
        }catch(Exception ex)
        {
        	ex.printStackTrace(); // 에러 복구 (에러 확인)
        }
	}

}









