package com.sist.data;
import java.io.*;
import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import com.sist.vo.*;
public class MusicData {
    public static void musicAllData()
    {
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
    				//Elements etc=doc.select("tr.list span.rank span.rank");
    				for(int j=0;j<title.size();j++)
    				{
    				  try {
    					   System.out.println(
    						   mno+" "
	    					   +title.get(j).text()+" "
	    					   +singer.get(j).text()+" "
	    					   +ablum.get(j).text()+" "
	    					   +poster.get(j).attr("src")+" "
							/* +etc.get(j).text()+" " */
	    					  );
    				  }catch(Exception ex){}
    				     mno++;
    				}
    				System.out.println("===================");
    			  
    			}
    		}
    	}catch(Exception ex){}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        musicAllData();
	}

}
