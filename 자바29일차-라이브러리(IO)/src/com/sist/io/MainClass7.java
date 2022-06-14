package com.sist.io;
/*
 *    라이브러리 : 클래스명 / 메소드명 / 역할 
 *                      ------- 리턴형 / 매개변수 (원형) 
 *              (오라클 , 자바스크립트 , JSP , Spring , AWS)
 *              --------------------------------------- 라이브러리 
 *               => Ajax , VueJS , ReactJS , JQuery
 *               => SpringFrameWork
 *               SpringBoot 
 *               
 *    IO (Input/Output) => 메모리 입출력 , 파일 입출력 , 네트워크 입출력 
 *    -----------------
 *       InputStream   /    OutputStream  => 바이트 스트림 
 *         읽기 / 쓰기 => 1btye씩 처리 
 *       Reader        /    Writer        => 문자 스트림 
 *         읽기 / 쓰기 => 2byte씩 처리 (한글) 
 *         
 *       Stream : 데이터 이동 통로 => 단방향 통신 
 *       ---------------------------------
 *       => FileInputStream / FileOutputStream
 *          ***int read() ==> 문자 1개 
 *             ---- 문자코드 (A=65)
 *          int read(byte[]) ==> 문자 여러개를 동시에 읽기
 *          ***int read(byte[],int,int) ==> 문자 여러개 지정 
 *             ---- 읽은 바이트 수 
 *          byte[] buffer=new byte[1024];
 *          read(buffer,0,1024)
 *            => 문제점 : 1024크기가 아닌 파일도 존재 
 *          close() : 파일은 반드시 닫기 
 *          ------------------------ finally
 *          write(byte[]) => 여러개 문자열 저장 
 *          write(int) => 한글자 저장 
 *          write(byte[],int,int) => 글자수 지정 
 *          ----------------------------------
 *          String s="Hello";
 *          byte[] buffer=(byte)s (X)
 *          => s.getBytes() => 문자열을 바이트 배열로 변경 
 *          close();
 *          
 *          
 *         
 *    
 */
import java.io.*;
public class MainClass7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	/*FileOutputStream fos=
        			new FileOutputStream("c:\\사원\\data.txt");
        	// create => 자동 생성 (파일이 없는 경우)
        	// w(create)   r(readonly)   a(append) => true
        	String data="자바 파일 입출력!!";
        	fos.write(data.getBytes());
        	fos.close();*/
        	// BufferedInputStream 
        	
        	FileInputStream fis=new FileInputStream("c:\\사원\\data.txt");
        	// 한번에 읽기 
        	// 보조 스트림 => 보완 
        	BufferedReader br=
        			new BufferedReader(new InputStreamReader(fis));
        	//                             ------------------
        	//                              InputSream => Reader (2byte)
			/*
			 * int i=0; //System.out.println((char)54861); while((i=fis.read())!=-1) // ? {
			 * System.out.print((char)i); }
			 */
        	while(true)
        	{
        		String data=br.readLine();
        		if(data==null)break;
        		System.out.println(data);
        	}
        	fis.close();
        	
        }catch(Exception ex){}
	}

}







