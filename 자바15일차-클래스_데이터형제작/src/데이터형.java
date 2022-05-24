import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

// 영화 => 영화 클래스(영화 정보를 한번에 저장) => class
// 맛집 => 맛집 클래스(맛집 정보를 한번에 저장) => class
// 여행 => 여행 클래스
// 레시피 
// 상품 
// 
// 카테고리 ==> 30
// 클래스의 용도 : 데이터형으로 사용 (변수) => 캡슐화 (데이터 보호)
// 캡슐화 => 변수는 은닉화 , 메소드를 통해서 읽기/쓰기 
//         private int cno;       getter/setter 
//             기능형으로 사용 (메소드)
class Category{
	int cno; // 카테고리 구분 
	String title;
	String subject;
	String poster;
	
}
// 여러개 => 배열을 선언 => 사용 
// 클래스 => 저장 장소를 만들고 데이터를 저장한다 (new)
// https://www.google.com/search?q=%EB%A7%9D%EA%B3%A0%ED%94%8C%EB%A0%88%EC%9D%B4%ED%8A%B8&oq=&aqs=chrome.0.35i39i362l5.1081916111j0j15&sourceid=chrome&ie=UTF-8
class Food{
	int no;//맛집 구분 ==> primary key (기본키) 
	int cno;// 카테고리별 분리 ==> foreign key
	String poster;//.jpg^~.jpg => String[] poster
	String name;
	double score;
	String address;
	String tel;
	String type;
	String price;
	String parking;
	String time;
	String homepage;
	String menu;
}
class Recipe{
	int rno;// 레시피 구분 
	String poster;
	String chef_name;
	String chef_poster;
	String title;
	String content;
	String info1,info2,info3;
	String etc;//재료
	String foodmake;
	String images;
	// 조회수 => trigger
}
public class 데이터형 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		데이터형 fm=new 데이터형();
        fm.foodCategoryData();
        //fm.foodHouseData();
        //fm.foodLocationData();
	}
	public void foodCategoryData()
	{
		//DataDAO dao=new DataDAO();
		//System.out.println("foodCatgorydata():dao="+dao);
		try
        {
        	Document doc=Jsoup.connect("https://www.mangoplate.com/").get();
        	Elements title=doc.select("div.top_list_slide span.title");
        	Elements subject=doc.select("div.top_list_slide p.desc");
        	Elements poster=doc.select("div.top_list_slide img.center-croping");
        	Elements link=doc.select("div.top_list_slide ul.list-toplist-slider a");
        	for(int i=0;i<title.size();i++)
        	{
        		System.out.println((i+1));
        		System.out.println("\""+title.get(i).text()+"\"");
        		System.out.println(subject.get(i).text());
        		System.out.println("\""+poster.get(i).attr("data-lazy")+"\"");
        		System.out.println("==================================================");
        	}
        }catch(Exception ex){}
	}
	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * Category cate=new Category();// => 리플렉션 (스프링) // 객체명 동적 메모리 할당 => 생성자 (변수의
	 * 초기화) // 생성자는 반드시 클래스명과 동일 (대소문자 구분) // new 클래스명() // cate.cno=1;
	 * 
	 * }
	 */

}
