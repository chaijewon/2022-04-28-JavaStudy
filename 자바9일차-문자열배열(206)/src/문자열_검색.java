import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
// https://movie.naver.com/movie/sdb/rank/rmovie.naver?sel=pnt&date=20220512&page=40
/*
 *  <td class="title">
		<div class="tit5"> => class(.) , id(#)
		 <a href="/movie/bi/mi/basic.naver?code=125414" title="스타트렉 비욘드">스타트렉 비욘드</a>
		</div>
	</td>
 */
public class 문자열_검색 {
    public static void find()
    {
    	Scanner scan=new Scanner(System.in);
		System.out.print("검색어 입력:");
		String fd=scan.next();
        try
        {
        	for(int i=1;i<=40;i++)
        	{
        		// 저장 => 정적 (Jsoup) , 동적 ()
        		Document doc=Jsoup.connect("https://movie.naver.com/movie/sdb/rank/rmovie.naver?sel=pnt&date=20220512&page="+i).get();
        		Elements title=doc.select("div.tit5 a");
        		for(int j=0;j<title.size();j++)
        		{
        			if(title.get(j).text().contains(fd))
        			// => 검색 
        			//if(title.get(j).text().startsWith(fd))
        			// => 자동완성기 
        			//if(title.get(j).text().endsWith(fd))
        			//if(title.get(j).text().equals(fd))
        				// 상세보기 , 수정 , 삭제 
        			{
        			 System.out.println((j+1)+"."+title.get(j).text());
        		 
        			}
        		}
        	}
        }catch(Exception ex){}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// contains : 포함 문자열 
		Scanner scan=new Scanner(System.in);
		System.out.print("검색어 입력:");
		String fd=scan.next();
        try
        {
        	for(int i=1;i<=40;i++)
        	{
        		// 저장 => 정적 (Jsoup) , 동적 ()
        		Document doc=Jsoup.connect("https://movie.naver.com/movie/sdb/rank/rmovie.naver?sel=pnt&date=20220512&page="+i).get();
        		Elements title=doc.select("div.tit5 a");
        		for(int j=0;j<title.size();j++)
        		{
        			//if(title.get(j).text().contains(fd))
        			// => 검색 
        			//if(title.get(j).text().startsWith(fd))
        			// => 자동완성기 
        			//if(title.get(j).text().endsWith(fd))
        			if(title.get(j).text().equals(fd))
        				// 상세보기 , 수정 , 삭제 
        			{
        			 System.out.println((j+1)+"."+title.get(j).text());
        		 
        			}
        		}
        	}
        }catch(Exception ex){}
	}

}
