package com.sist.data;
import java.io.*;
import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import com.sist.vo.*;
import com.sist.dao.*;
public class MusicData {
    public static void musicAllData()
    {
    	MusicDAO dao=new MusicDAO();
    	ArrayList<Music> list=new ArrayList<Music>();
    	String[] urls={
    		"https://www.genie.co.kr/chart/top200?ditc=D&ymd=20220615&hh=11&rtm=Y&pg=",
    		"https://www.genie.co.kr/chart/genre?ditc=D&ymd=20220613&genrecode=M0100&pg=",
    		"https://www.genie.co.kr/chart/genre?ditc=D&ymd=20220613&genrecode=M0200&pg=",
    		"https://www.genie.co.kr/chart/genre?ditc=D&ymd=20220613&genrecode=M0300&pg=",
    		"https://www.genie.co.kr/chart/genre?ditc=D&ymd=20220613&genrecode=M0107&pg=",
    		"https://www.genie.co.kr/chart/genre?ditc=D&ymd=20220613&genrecode=M0500&pg=",
    		"https://www.genie.co.kr/chart/genre?ditc=D&ymd=20220613&genrecode=M0600&pg="
    	};
    	try
    	{
    		int mno=1;
    		int cno=1;
    		for(String url:urls)
    		{
    			System.out.println(url);
    			for(int i=1;i<=2;i++)
    			{
    				// 데이터가 없는 경우 스킵 
    			    
    				Document doc=Jsoup.connect(url+i).get();
    				Elements title=doc.select("table.list-wrap td.info a.title");
    				//System.out.println(title);
    				Elements singer=doc.select("table.list-wrap td.info a.artist");
    				Elements ablum=doc.select("table.list-wrap td.info a.albumtitle");
    				Elements poster=doc.select("a.cover img");
    				Elements etc=null;
    				if(cno==1)
    				    etc=doc.select("tr.list span.rank span.rank");
    				else
    					etc=doc.select("tr.list span.rank");
    				
    				for(int j=0;j<title.size();j++)
    				{
    					// etc
    					/*
    					 *     5상승 
    					 *     2하강
    					 *     유지
    					 *     new 
    					 */
    					  String state="";
    					  int id=0;
    					  String etc_data=etc.get(j).text();
    					  state=etc_data.replaceAll("[0-9]","");
    					  System.out.println(state);
    					  if(state.equals("유지") || state.equals("new"))
    						  id=0;
    					  else
    						  id=Integer.parseInt(etc_data.replaceAll("[가-힣]",""));
    					  
    				  try {
    					   
    					    System.out.println(
    						   mno+" "
	    					   +title.get(j).text()+" "
	    					   +singer.get(j).text()+" "
	    					   +ablum.get(j).text()+" "
	    					   +poster.get(j).attr("src")+" "
							   +state+" "+id
							   
	    					  );
    					    
    					   Music m=new Music();
    					   m.setMno(mno);
    					   m.setCno(cno);
    					   m.setTitle(title.get(j).text());
    					   m.setSinger(singer.get(j).text());
    					   m.setAlbum(ablum.get(j).text());
    					   m.setPoster(poster.get(j).attr("src"));
    					   m.setState(state);
    					   m.setIdcrement(id);
    					   
    					   //list.add(m);
    					   dao.musicInsert(m);
    				  }catch(Exception ex){}
    				  mno++;
    				}
    				System.out.println("===================");
    			  
    			}
    			cno++;
    			System.out.println("cno="+cno);
    			
    			/*FileOutputStream fos=
    					new FileOutputStream("c:\\java_data\\music.txt");
    			ObjectOutputStream oos=
    					new ObjectOutputStream(fos);
    			oos.writeObject(list);
    			oos.close();
    			fos.close();*/
    			System.out.println("데이터 저장 완료!!");
    		}
    	}catch(Exception ex){}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        musicAllData();
	}

}
