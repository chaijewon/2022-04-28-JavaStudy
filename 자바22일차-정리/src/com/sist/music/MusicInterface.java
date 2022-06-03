package com.sist.music;
import java.io.IOException;
/*
 *    설계 / 구현 (인도)
 *    ---  ----
 *    아키텍처 프로그래머(상속 => 구현)
 *    ------UML (추상 , 인터페이스) 
 *    
 *    추상 클래스 (단일상속) / 인터페이스 (다중상속) => 보완 
 *    ------------------------------------------
 *      설계 => 공통적으로 사용해야되는 부분 
 *            ------------
 *    지니 
 *    멜론 
 *    ----- 파일읽기 (데이터베이스) 
 *          목록출력
 *          검색 
 *          상세보기 
 *          메뉴 
 *          -------- 
 *          기타적으로 default / static => 구현이 가능 
 *    
 *    -------------------------------------------
 *    
 *    interface ==> interface 
 *           extends 
 *    interface ==> class
 *           implments
 *    class ==> class
 *           extends 
 *    
 *    class => class (interface)
 *    class A extends B implements I
 */
import java.util.*;
public interface MusicInterface {
   Music[] music=new Music[100]; // public static final
   public void fileRead();//public abstract
   // MelonMusic / GenieMusic => 읽어오는 파일이 다르다 => 따로 구현 
   public default void musicList(){
	   // default => 기능이 비슷하다 => 오버라이딩 (필요시에만 구현)
	   for(Music m:music)
	   {
		   System.out.println((m.getNo()+1)+"."+m.getTitle());
	   }
   }
   public default void musicFind(){
	   Scanner scan=new Scanner(System.in);
	   System.out.print("곡명 입력:");
	   String ss=scan.next();
	   for(Music m:music)
	   {
		   if(m.getTitle().contains(ss))
		   {
			   System.out.println(m.getTitle());
		   }
	   }
   }
   public default void musicDetail(){
	   Scanner scan=new Scanner(System.in);
	   System.out.print("1~100 번호 입력:");
	   int no=scan.nextInt();
	   Music m=music[no-1];
	   System.out.println("===== 상세보기 =====");
	   System.out.println("곡명:"+m.getTitle());
	   System.out.println("가수명:"+m.getSinger());
	   System.out.println("앨범:"+m.getAlbum());
	   System.out.println("포스터:"+m.getPoster());
	   System.out.print("동영상을 실행 할까요(y/n)?");
	   char yn=scan.next().charAt(0);
	   if(yn=='Y'||yn=='y')
	   {
		   //try
		   //{
			   try {
				Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe http://youtube.com/embed/"+m.getKey());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   //}catch(Exception ex){}
	   }
   }
   public default int musicMenu()
   {
	   return 0;
   }
}











