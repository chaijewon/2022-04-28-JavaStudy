package com.sist.music;

import java.util.Scanner;

// 상위 클래스 ==> 지니뮤직,멜론뮤직 
// 공통적인 기능을 모아서 처리 => 공통 모듈 
public class MusicSystem {
	   static Music[] music=new Music[100]; // 데이터 모음 (공유)
	  
	   public void musicRead()
	   {
		   
	   }
	  
	   //2. 검색
	   public void musicFind()
	   {
		   Scanner scan=new Scanner(System.in);
		   System.out.print("Music 번호 요청:");
		   int no=scan.nextInt();
		   try
		   {
			   Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe http://youtube.com/embed/"+music[no].getKey());
		   }catch(Exception ex){}
	   }
	   //3. 상세 보기
	   public void musicDetail()
	   {
		   System.out.println("뮤직 상세보기 입니다..");
	   }
	   //4. 메뉴
	   public int musicMenu()
	   {
		   System.out.println("===== Menu =====");
		   System.out.println("1.목록");
		   System.out.println("2.검색");
		   System.out.println("3.상세보기");
		   System.out.println("9.종료");
		   Scanner scan=new Scanner(System.in);
		   System.out.println("================");
		   System.out.print("메뉴 선택:");
		   return scan.nextInt();
	   }
	   //5. 조립 
	   public void process()
	   {
		   while(true)
		   {
			   int m=musicMenu();
			   if(m==9)
			   {
				   System.out.println("프로그램 종료");
				   break;
			   }
		   }
	   }
}
