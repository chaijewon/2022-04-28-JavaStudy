package 자바16일차_변수응용1;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

class Category{
	 int cateno;//1~30 => 맛집 => 상세
	 String title;
	 String subject;
}
class Food{
	
}
public class 맛집데이터베이스 {
    static Category[] cate=new Category[30];//초기값
    // 구현 (크롤링X)
    static {
    	// 초기화 블록 => 초기화 : 크롤링 , 파일 => 자동 호출 
    	try
        {
        	Document doc=Jsoup.connect("https://www.mangoplate.com/").get();
        	Elements title=doc.select("div.top_list_slide span.title");
        	Elements subject=doc.select("div.top_list_slide p.desc");
        	Elements poster=doc.select("div.top_list_slide img.center-croping");
        	Elements link=doc.select("div.top_list_slide ul.list-toplist-slider a");
        	for(int i=0;i<title.size();i++)
        	{
        		cate[i]=new Category();
        		cate[i].cateno=i+1;
        		cate[i].title=title.get(i).text();
        		cate[i].subject=subject.get(i).text();
        		System.out.println((i+1));
        		System.out.println("\""+title.get(i).text()+"\"");
        		System.out.println(subject.get(i).text());
        		
        		System.out.println("==================================================");
        	}
        }catch(Exception ex){}
    }
    
}
