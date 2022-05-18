import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.net.*;
import java.io.*;
public class 자바메소드응용_음악사이트 {
    static int menu()
    {
    	//가요POPOST트롯JAZZCLASSIC
    	System.out.println("===== 메뉴 =====");
    	System.out.println("1. Music Top50");
    	System.out.println("2. 가요");
    	System.out.println("3. POP");
    	System.out.println("4. OST");
    	System.out.println("5. 트롯");
    	System.out.println("6. JAZZ");
    	System.out.println("7. CLASSIC");
    	System.out.println("9. 종료");
    	System.out.println("===============");
    	Scanner scan=new Scanner(System.in);
    	System.out.print("메뉴 선택:");
    	int m=scan.nextInt();
    	return m;
    }
    static void musicData(int type)
    {
    	String[] site={
    		"https://www.genie.co.kr/chart/top200",
    		"https://www.genie.co.kr/chart/genre?ditc=D&ymd=20220516&genrecode=M0100",
    		"https://www.genie.co.kr/chart/genre?ditc=D&ymd=20220516&genrecode=M0200",
    		"https://www.genie.co.kr/chart/genre?ditc=D&ymd=20220516&genrecode=M0300",
    		"https://www.genie.co.kr/chart/genre?ditc=D&ymd=20220516&genrecode=M0107",
    		"https://www.genie.co.kr/chart/genre?ditc=D&ymd=20220516&genrecode=M0500",
    		"https://www.genie.co.kr/chart/genre?ditc=D&ymd=20220516&genrecode=M0600"
    	};
    	try
    	{
    		//Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe "+site[type-1]);
    		/*URL url=new URL(site[type-1]);
    		HttpURLConnection conn=
    				(HttpURLConnection)url.openConnection();
    		if(conn!=null)
    		{
    			BufferedReader br=
    				new BufferedReader(new InputStreamReader(conn.getInputStream(),"UTF-8"));
    			while(true)
    			{
    				String s=br.readLine();
    				if(s==null)break;
    				System.out.println(s);
    			}
    		}*/
    		Document doc=Jsoup.connect(site[type-1]).get();
    		//System.out.println(doc.toString());
    		Elements title=doc.select("table.list-wrap td.info a.title");
    		//System.out.println(title.toString());
    		for(int i=0;i<title.size();i++)
    		{
    			System.out.println((i+1)+"."+title.get(i).text());
    		}
    	}catch(Exception ex){}
    }
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
    		else
    		{
    			musicData(m);
    		}
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        process();
        
        
	}

}
