package com.sist.music;

import java.util.Scanner;

// 기능 ==> 공통적으로 사용되는 기능 : 공통 모듈 
// 장바구니 / 결재 / 찜 / 예매 / 추천 ....
/*
 *      게시판 : CURD 
 *        글쓰기 (Insert)
 *        목록 출력 (Select:셀렉션)
 *        상세 보기 (Select: 디비전)
 *        수정 (Update)
 *        삭제 (Delete)
 *        찾기 (Like)
 *     --------------------------
 *              |
 *      ----------------------------------
 *       |        |          |          |
 *    묻고답하기  갤러리게시판   후기게시판   댓글형 게시판 
 *    
 *    글쓰기      업로드       업로드
 *    목록 출력    => 이미지(오버라이딩) 
 *    상세 보기    다운로드     다운로드
 *    수정 
 *    삭제 
 *    찾기 
 *    
 *    답변 추가                        댓글  
 *    
 *    CTRL C  => CTRL V  => 소스 코딩 
 */
public class MusicSystem {
   static Music[] music=new Music[100]; // 데이터 모음 (공유)
   // 상속을 받으면 => static은 예외 => 공통으로 사용이 가능 
   //1. 읽기 => 크롤링 => 초기화 , 생성자 => 상속 예외 => 메소드 *****
   //메소드 구현 => {} 
   public void musicRead()
   {
	   
   }
   // 사용을 못한다 
   // 
   // 오버라이딩 
   //2. 검색
   public void musicFind()
   {
	   System.out.println("뮤직 검색입니다..");
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
	   System.out.println("4.구매");
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













