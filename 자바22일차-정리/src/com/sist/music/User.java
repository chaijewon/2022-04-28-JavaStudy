package com.sist.music;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MusicInterface m=new MelonMusic();
        m.fileRead();
        m.musicList();
        m.musicDetail();
        System.out.println("==============================");
        m=new GenieMusic();
        m.fileRead();
        m.musicList();
        m.musicFind();
	}

}
