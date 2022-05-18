import java.io.IOException;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
/*
 *  https://movie.daum.net/ranking/reservation
https://movie.daum.net/ranking/boxoffice/weekly
https://movie.daum.net/ranking/ott
https://movie.daum.net/premovie/netflix
https://movie.daum.net/premovie/watcha
https://movie.daum.net/premovie/kakaopage

 */
public class 자바메소드응용_영화사이트 {
    // 메뉴
	static int menu()
	{
		System.out.println("===== 메뉴 =====");
		System.out.println("1. reservation");
		System.out.println("2. boxoffice");
		System.out.println("3. ott");
		System.out.println("4. netflix");
		System.out.println("5. watcha");
		System.out.println("6. kakaopage");
		System.out.println("7. search");
		System.out.println("9. end");
		System.out.println("===============");
		Scanner scan=new Scanner(System.in);
		System.out.print("메뉴 선택:");
		int m=scan.nextInt();
		return  m;
	}
	// 목록 
	/*
	 *  <strong class="tit_item">
         <a href="/moviedb/main?movieId=122749" class="link_txt" data-tiara-layer="moviename">범죄도시2</a>
         </strong>
	 */
	static void movieData(int type)
	{
		String[] site={
			"https://movie.daum.net/ranking/reservation",
			"https://movie.daum.net/ranking/boxoffice/weekly",
			"https://movie.daum.net/ranking/ott",
			"https://movie.daum.net/premovie/netflix",
			"https://movie.daum.net/premovie/watcha",
			"https://movie.daum.net/premovie/kakaopage"	
		};
		
		try {
			Document doc=Jsoup.connect(site[type-1]).get();
			Elements title=doc.select("strong.tit_item a.link_txt");
			//System.out.println(title.toString());
			for(int i=0;i<title.size();i++)
			{
				System.out.println((i+1)+"."+title.get(i).text());
			}
		}catch (Exception e) {}
		
	}
	// 찾기
	static void searchData(String ss)
	{
		try {
			Document doc=Jsoup.connect("https://movie.daum.net/ranking/reservation").get();
			Elements title=doc.select("strong.tit_item a.link_txt");
			//System.out.println(title.toString());
			for(int i=0;i<title.size();i++)
			{
				if(title.get(i).text().contains(ss))
				{
				  System.out.println((i+1)+"."+title.get(i).text());
				}
			}
		}catch (Exception e) {}
	}
	// 조립 => process()
	static void process()
	{
		while(true)
		{
			int m=menu();
			if(m==9)
			{
				System.out.println("프로그램 종료!!");
				break;
			}
			else if(m==7)
			{
				Scanner scan=new Scanner(System.in);
				System.out.print("검색어 입력:");
				String ss=scan.next();
				searchData(ss);
			}
			else
			{
				movieData(m);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        process();
	}

}
