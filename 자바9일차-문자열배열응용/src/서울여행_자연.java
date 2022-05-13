import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
public class 서울여행_자연 {
    static String[] title=new String[120];
    static String[] msg=new String[120];
    static String[] address=new String[120];
    static {
    	// 변수 초기화 => 자동 호출 => 초기화(초기화 블록) 
    	try
    	{
    		//https://korean.visitseoul.net/nature?curPage=15
    		// <a>
    		int k=0;
    		for(int i=1;i<=15;i++)
    		{
    			Document doc=
    					Jsoup.connect("https://korean.visitseoul.net/nature?curPage="+i).get();
    			Elements link=doc.select("ul.article-list li.Item a");
    			// class => 없으면 위에 태그 (class,id) => class => 태그.클래스명
    			//System.out.println("읽은 갯수:"+link.size());
    			for(int j=0;j<link.size();j++)
    			{
    				String temp="https://korean.visitseoul.net"+link.get(j).attr("href");
    				System.out.println(link.get(j).attr("href"));
    				Document doc2=Jsoup.connect(temp).get();
    				Element title1=doc2.selectFirst("h3.h3");
    				Element msg1=doc2.selectFirst("div.text-area");
    				Element address1=doc2.selectFirst("div.detail-map-wrap div.detail-map-infor dl dd");
    				//System.out.println(title1.text());
    				//System.out.println(msg1.text());
    				//System.out.println(address1.text());
    				//System.out.println("==================================");
    			    title[k]=title1.text();
    			    msg[k]=msg1.text();
    			    address[k]=address1.text();
    				k++;
    			}
    		}
    	}catch(Exception ex){}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        // 메뉴 
        while(true)
        {
        	System.out.println("===== 메뉴 =====");
        	System.out.println("1. 목록 출력");
        	System.out.println("2. 상세 보기");
        	System.out.println("3. 명칭 검색");
        	System.out.println("4. 주소 검색");
        	System.out.println("5. 종료");
        	System.out.println("===============");
        	System.out.print("메뉴 선택:");
        	int menu=scan.nextInt();
        	if(menu==5)
        	{
        		System.out.println("프로그램 종료");
        		break;
        	}
        	else if(menu==1)
        	{
        		System.out.println("===== 서울 자연&관광 =====");
        		for(int i=0;i<title.length;i++)
        		{
        			if(title[i]!=null) // 비교연산자 (null)
        			{
        			  System.out.println((i+1)+"."+title[i]);
        			}
        		}
        	}
        	else if(menu==2)
        	{
        		System.out.print("상세보기 번호 입력(0~93):");
        		int detail=scan.nextInt();
        		System.out.println("장소:"+title[detail]);
        		System.out.println("소개:"+msg[detail]);
        		System.out.println("위치:"+address[detail]);
        	}
        	else if(menu==3)
        	{
        		System.out.print("방문지 입력:");
        		String loc=scan.next();
        		
        		for(String s:title)
        		{
        		  if(s!=null)
        		  {  
        			if(s.contains(loc))
        			{
        				System.out.println("★"+s);
        			}
        		  }
        		}
        	}
        	else if(menu==4)
        	{
        		try
        		{
	        		System.out.print("구/동 입력:");
	        		String gu=scan.next();
	        		
		        		for(int i=0;i<94;i++)
		        		{
		        		   
		        			if(address[i].contains(gu))
		        		    {
		        					System.out.println(title[i]);
		        					System.out.println(address[i]);
		        					System.out.println("-----------------------------");
		        		    }
		        			
		        		}
        		}catch(Exception ex) {}
        	}
        	else
        	{
        		System.out.println("없는 메뉴입니다!!");
        	}
        }
	}

}
