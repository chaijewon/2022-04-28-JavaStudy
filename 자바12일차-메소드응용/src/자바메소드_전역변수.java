// 음악 
/*
 *    1. 목록 => 페이지나누기 (일차 for)
 *             ---------- 구구단 (이차 for)
 *    2. 상세보기 
 *    3. 노래 찾기 
 *    4. 가수명 => 노래 제목 찾기 
 *    ----------------------- 메소드 제작 
 *    => 메뉴 
 */
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
public class 자바메소드_전역변수 {
    static String[] title=new String[200];
    static String[] singer=new String[200];
    static
    {
    	// 초기화
    	try
    	{
    	   int k=0;
    	   for(int i=1;i<=4;i++)
    	   {
    		   Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20220518&hh=15&rtm=Y&pg="+i).get();
    		   Elements mt=doc.select("table.list-wrap td.info a.title");
    		   Elements ms=doc.select("table.list-wrap td.info a.artist");
    		   for(int j=0;j<mt.size();j++)
    		   {
    			   try
    			   {
    				   title[k]=mt.get(j).text();
    				   singer[k]=ms.get(j).text();
    			   }catch(Exception ex){}
    			   k++;
    		   }
    		
    	   }
    	}catch(Exception ex){}
    	
    }
	static int menu()
	{
		System.out.println("===== 메뉴 =====");
		System.out.println("1.음악 목록");
		System.out.println("2.상세보기");
		System.out.println("3.노래찾기");
		System.out.println("4.가수명으로 노래찾기");
		System.out.println("9.종료");
		System.out.println("===============");
		Scanner scan=new Scanner(System.in);
		System.out.print("메뉴 선택:");
		int m=scan.nextInt();
		return m;
	}
	static void musicList()
	{
		// 전체 목록 출력 
		for(int i=0;i<title.length;i++)
		{
			System.out.println((i+1)+"."+title[i]);
		}
	}
	static void musicDetail()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("1~200 사이의 노래번호를 입력:");
		int no=scan.nextInt();
		System.out.println("============= 상세보기 ===========");
		System.out.println("노래 제목:"+title[no-1]);
		System.out.println("가수명:"+singer[no-1]);
		System.out.println("===============================");
		
	}
	static void musicFind()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("검색어 입력:");
		String ss=scan.next();
		for(String t:title)
		{
			if(t.contains(ss))
			{
				System.out.println(t);
			}
		}
	}
	static void singerFind()
	{
		
	}
	// 조립기 
	static void process()
	{
		while(true)
		{
			int m=menu();
			if(m==9)
			{
				System.out.println("프로그램 종료");
				break;
			}
			else if(m==1)
			{
				musicList();
			}
			else if(m==2)
			{
				musicDetail();
			}
			else if(m==3)
			{
				musicFind();
			}
			else if(m==4)
			{
				
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        process();
	}

}
