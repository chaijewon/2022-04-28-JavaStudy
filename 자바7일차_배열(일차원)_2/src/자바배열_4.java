import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

// https://www.genie.co.kr/chart/top200?ditc=D&ymd=20220511&hh=15&rtm=Y&pg=2

public class 자바배열_4 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// 데이터 읽기 => 메모리에 저장 
		for(int i=1;i<=4;i++)
		{
			// 저장 공간 
			Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20220511&hh=15&rtm=Y&pg="+i).get();
			Elements title=doc.select("tr.list a.albumtitle");
			System.out.println(title.toString());
			for(int j=0;j<title.size();j++)
			{
				System.out.println("\""+title.get(j).text()+"\",");
			}
		}

	}

}
