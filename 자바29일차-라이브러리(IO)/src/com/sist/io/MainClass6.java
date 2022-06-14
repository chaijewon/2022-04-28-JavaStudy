package com.sist.io;
import java.io.*;
/*
 *    1. 데이터 저장 
 *       = 한개  (변수) 
 *       = 같은 데이터형 여러개 (배열) 
 *       = 다른 데이터형 여러개 (클래스)
 *       ------------------------- 메모리 
 *       영구적 저장 장치 
 *       파일 => 보안 취약 , 연결이 어렵다 
 *       RDBMS => 오라클 , MS-SQL , MYSQL , MariaDB , DB2, SQLite
 *                -------------------------------  ----- -------
 *                     중형                          대용량    소형 (핸드폰)
 *             => 빅데이터 (몽고디비,카산드라) => NoSQL
 *       파일 => 임시 저장 => 오라클 
 *             -------- 필요한 데이터 (카페 검색 , 리뷰...)
 *       트위터 => ㅋㅋㅋ ㅎㅎ ㅠㅠ => replaceAll()
 *               ------------
 *    2. 파일 쓰기 
 *       -------
 *       한글 포함 => Reader (2byte) (한글은 한글자당 2byte)
 *                  Writer
 *                  => 문자 스트림 
 *       숫자,영문 => InputStream / OutputStream (1byte)
 *                  => 바이트 스트림
 *                  네트워크 전송 , 파일 업로드 , 파일 다운로드 
 *       ----------------------------------------------
 *       
 *       FileReader / FileWriter 
 *       ----------   ----------- 파일 쓰기 (2byte)
 *        파일 읽기(2byte)
 *        
 *       주요메소드 : 
 *          read(char)
 *          read(String)
 *          close() 
 *          -----------------   write(String) , write(char)
 *                              --------------
 *                              
 *          new FileWriter("경로명") => write() => 새로운 파일 생성 
 *          new FileWriter("경로명",true) => 기존에 파일에 첨부 
 *          
 *    
 */
import java.util.*;
import java.io.*;
class SawonVO
{
	private int sabun;
	private String name;
	private String dept;
	private String loc;
	public int getSabun() {
		return sabun;
	}
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public SawonVO(int sabun, String name, String dept, String loc) {
		this.sabun = sabun;
		this.name = name;
		this.dept = dept;
		this.loc = loc;
	}
	
}
public class MainClass6 {
	private static int sabun=5;
    // 추가 
	public static void insert()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("이름 입력:");
		String name=scan.next();
		
		System.out.print("부서 입력:");
		String dept=scan.next();
		
		System.out.print("근무지 입력:");
		String loc=scan.next();
		
		try
		{
			FileWriter fw=new FileWriter("c:\\javaDev\\sawonData.txt",true);
			String data=(++sabun)+"|"+name+"|"
					   +dept+"|"+loc+"\n";
			fw.write(data);
			fw.close();
		}catch(Exception ex){}
		
		System.out.println("사원 추가 완료!!");
	}
	public static void print()
	{
		
	}
	// 데이터 읽기 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		insert();
        /*ArrayList<SawonVO> list=new ArrayList<SawonVO>();
        list.add(new SawonVO(1,"홍길동","개발부","서울"));
        list.add(new SawonVO(2,"심청이","총무부","부산"));
        list.add(new SawonVO(3,"이순신","영업부","제주"));
        list.add(new SawonVO(4,"강감찬","기획부","경기"));
        list.add(new SawonVO(5,"박문수","자재부","인천"));
        
        // 파일에 저장 
        try
        {
        	FileWriter fw=new FileWriter("c:\\사원\\sawonData.txt");
        	for(SawonVO vo:list)
        	{
        		String sa=vo.getSabun()+"|"+vo.getName()+"|"
        				 +vo.getDept()+"|"+vo.getLoc()+"\n";
        		fw.write(sa);
        	}
        	fw.close();
        	System.out.println("사원 저장 완료!!");
        }catch(Exception ex){}*/
	}

}







