
import java.io.*;
import java.util.StringTokenizer;
public class MovieManager {
    static Movie[] movie=new Movie[1938];
    static 
    {
    	try
        {
        	FileReader fr=new FileReader("c:\\javaDev\\movie.txt");
        	StringBuffer sb=new StringBuffer();
        	int i=0;
        	while((i=fr.read())!=-1)
        	{
        		
        		sb.append((char)i);
        	}
        	//System.out.println(sb.toString());
        	
        	String[] mo=sb.toString().split("\n");
        	int k=0;
        	/*
        	 *  1584
				녹터널 애니멀스
				드라마, 스릴러
				https://movie-phinf.pstatic.net/20161223_27/1482473208056HzFgF_JPEG/movie_image.jpg?type=m77_110_2
				에이미 아담스(수잔), 제이크 질렌할(에드워드), 마이클 섀넌(바비)
				2017 .01.11 개봉
				청소년 관람불가
				톰 포드
        	 */
        	for(String s:mo)
        	{
        		//System.out.println(s);
        		StringTokenizer st=new StringTokenizer(s,"|");
        		movie[k]=new Movie();
        		movie[k].mno=Integer.parseInt(st.nextToken());
        		movie[k].title=st.nextToken();
        		movie[k].genre=st.nextToken();
        		movie[k].poster=st.nextToken();
        		movie[k].actor=st.nextToken();
        		movie[k].regdate=st.nextToken();
        		movie[k].grade=st.nextToken();
        		movie[k].director=st.nextToken();
        		//System.out.println("=======================");
        		k++;
        	}
        }catch(Exception ex){}
    }
}
