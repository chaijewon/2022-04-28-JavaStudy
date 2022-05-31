package com.sist.music;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*GenieMusic gm=new GenieMusic();
        gm.process();
        MelonMusic mm=new MelonMusic();
        mm.process();*/
		MusicSystem ms=new GenieMusic();
		ms.musicRead();
		// double d=10;
		/*
		 *   MusicSystem : double
		 *   
		 *   GenieMusic: int
		 *   MelonMusic: char
		 *   
		 *   double d=10;
		 *   d='A';
		 *   
		 *   MusicSystem d=new GenieMusic();
		 *   d=MelonMusic();
		 *   
		 *   1. 관련된 클래스를 모아서 한개의 이름으로 제어 
		 *      => 상속 (클래스)
		 *      => 구현 (인터페이스)
		 *      ----------------
		 *   2. 모든 클래스를 모아서 관리 (한개의 이름으로 제어) 
		 *      --------- Object
		 */
		ms=new MelonMusic();//클래스 BI
		ms.musicRead();
        
        
	}

}
