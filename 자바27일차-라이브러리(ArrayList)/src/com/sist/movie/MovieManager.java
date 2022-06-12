package com.sist.movie;
import java.util.*;
import java.io.*;
public class MovieManager {
    private static ArrayList list=new ArrayList();
    // 초기화 
    static
    {
    	try
    	{
    		FileReader fr=new FileReader("c:\\javaDev\\movie.txt");
    		int i=0;
    		StringBuffer sb=new StringBuffer();
    		while((i=fr.read())!=-1)
    		{
    			sb.append((char)i);
    		}
    		fr.close();
    		
    		// 데이터 구분 
    		String data=sb.toString();
    		String[] movies=data.split("\n");
    		for(String line:movies)
    		{
    			//1|쇼생크 탈출|드라마|https://movie-phinf.pstatic.net/20160119_278/14531650465287bcuk_JPEG/movie_image.jpg?type=m77_110_2|팀 로빈스(앤디 듀프레인), 모건 프리먼(엘리스 보이드 레드 레딩)|2016 .02.24 재개봉, 1995 .01.28 개봉|15세 관람가|프랭크 다라본트
    		    StringTokenizer st=new StringTokenizer(line,"|");
    		    Movie movie=new Movie();
    		    movie.setMno(Integer.parseInt(st.nextToken()));
    		    movie.setTitle(st.nextToken());
    		    movie.setGenre(st.nextToken());
    		    movie.setPoster(st.nextToken());
    		    movie.setActor(st.nextToken());
    		    movie.setRegdate(st.nextToken());
    		    movie.setGrade(st.nextToken());
    		    movie.setDirector(st.nextToken());
    		    
    		    list.add(movie);
    		}
    	}catch(Exception ex){}
    }
    // 목록 출력 (윈도우 , 브라우저 => 데이터 전송 (리턴형)
    public ArrayList movieListData(int page)
    {
    	ArrayList mList=new ArrayList();
    	int j=0;
    	int pagecnt=(page*8)-8;
    	/*             i  j
    	 *    1page => 0~19
    	 *    2page => 20~39 skip
    	 *    3page => 40~59
    	 */
    	for(int i=0;i<list.size();i++)
    	{
    		if(j<8 && i>=pagecnt)
    		{
    			Movie m=(Movie)list.get(i);
    			mList.add(m);
    			j++;
    		}
    	}
    	return mList;
    }
    public static int movieTotalPage()
    {
    	return (int)(Math.ceil(list.size()/8.0));
    }
}







