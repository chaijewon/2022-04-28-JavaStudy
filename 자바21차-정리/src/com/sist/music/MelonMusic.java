package com.sist.music;
/*
 *   상속 => 제외 (static , 생성자 , 초기화 블록)
 */
import java.io.*;
import java.util.*;
public class MelonMusic extends MusicSystem{
	   public static void main(String[] args) {
		   MelonMusic m=new MelonMusic();
		   m.musicRead();
		   m.musicFind();
	   }
	   public void musicRead()
	   {
		   try
		   {
			   FileReader fr=
					   new FileReader("c:\\javaDev\\melon.txt");
			   int i=0;
			   String data="";
			   while((i=fr.read())!=-1) // -1 (EOF)
			   {
				   data+=String.valueOf((char)i);
			   }
			   //System.out.println(data);
			   String[] music2=data.split("\n");
			   // 90|Blueming|이무진|Love poem|D1PvIWdJ8xo
			   int k=0;
			   for(String mm:music2)
			   {
				   StringTokenizer st=
						   new StringTokenizer(mm,"|");
				   Music mu=new Music();
				   mu.setNo(Integer.parseInt(st.nextToken()));
				   // 문장열을 정수형으로 변경 
				   mu.setTitle(st.nextToken());
				   mu.setSinger(st.nextToken());
				   mu.setAlbum(st.nextToken());
				   mu.setKey(st.nextToken());
				   
				   music[k]=mu;
				   k++;
			   }
		   }catch(Exception ex){}
	   }
}






