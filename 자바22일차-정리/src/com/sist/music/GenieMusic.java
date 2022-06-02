package com.sist.music;

import java.io.FileReader;
import java.util.StringTokenizer;

public class GenieMusic implements MusicInterface{

	@Override
	public void fileRead() {
		// TODO Auto-generated method stub
		try
		   {
			   FileReader fr=
					   new FileReader("c:\\javaDev\\genie.txt");
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
