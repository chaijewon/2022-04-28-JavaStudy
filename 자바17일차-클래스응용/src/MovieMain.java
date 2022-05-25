import java.util.*;
class NaverMovie
{
	int menu()
	{
		System.out.println("===== 영화 메뉴 =====");
		System.out.println("1. 영화 목록");
		System.out.println("2. 상세 보기");
		System.out.println("3. 검색(영화명)");
		System.out.println("4. 검색(출연)");
		System.out.println("5. 검색(장르)");
		System.out.println("9. 종료");
		System.out.println("===================");
		Scanner scan=new Scanner(System.in);//in static
		// static InputStream in
		System.out.print("메뉴 선택:");
		int m=scan.nextInt();
		return m;
	}
	// 목록 => 페이지 나누기 => 메소드 출력 (배열 => 전송)
	Movie[] movieList(int page)
	{
		/*
		 *   int[] m=new int[10];
		 *   
		 *   m[0]=1;
		 *   m[1]=2;...
		 *   
		 *   m[7]=7
		 *   
		 *   m[8]=0 m[9]=0
		 *   
		 *   Movie[] movies=new Movie[10];
		 *   movie[0]=...
		 *   movie[7]...
		 *   
		 *   movie[8]=null
		 *   movie[9]=null
		 *   
		 */
		Movie[] movies=new Movie[10];// 컬렉션 (11장) 
		int j=0; //10개씩 
		int pagecnt=(page*10)-10;
		/*
		 *    1page => 0~9
		 *    2page => 10~19
		 *    3page => 20~29....
		 *    i=0~1937
		 */
		/*for(int i=0;i<MovieManager.movie.length;i++)
		{
			if(j<10 && i>=pagecnt)
			{
				Movie m=new Movie();
				m.mno=MovieManager.movie[i].mno;
				m.title=MovieManager.movie[i].title;
				movies[j]=m;//0~9
				j++;
			}
		}*/
		int k=0;
		// 1page    0         10(9)
		// 2page    10        20(19)
		for(int i=pagecnt;i<pagecnt+10;i++)
		{
			if(page==194 && k>7) // 194 => 1930 ~ 1938 (1940)
			{
					break;
			}
			Movie m=new Movie();
			m.mno=MovieManager.movie[i].mno;
			m.title=MovieManager.movie[i].title;
			movies[k]=m;
			k++;
		}
		return movies;
	}
	//void movieList(int page)
	//{
		// 메소드안에서 출력 => void
	//}
	// 상세보기 
	Movie movieDetail(int mno)
	{
		Movie m=MovieManager.movie[mno-1];// 1 => 0
		return m;
	}
	// 찾기 => 영화명 , 출연 , 장르 => 예매하기 => 마이페이지 
	void findTitle(String title)
	{
		for(Movie m:MovieManager.movie)
		{
			if(m.title.contains(title))
			{
				System.out.println(m.title);
			}
		}
	}
	// => File
	void process()
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
				// 목록 
				Scanner scan=new Scanner(System.in);
				System.out.print("페이지 번호:");
				int page=scan.nextInt();
				Movie[] movie=movieList(page);
				// 받은 데이터 출력
				
					for(Movie mm:movie)
					{
					  if(mm!=null)
					  {
						System.out.println(mm.mno+"."+mm.title);
					  }
					}
				
			}
			else if(m==2)
			{
				Scanner scan=new Scanner(System.in);
				System.out.print("1~1938번 사이의 정수입력:");
				int mno=scan.nextInt();
				Movie mm=movieDetail(mno);
				System.out.println("===== 상세보기 =====");
				System.out.println("영화명:"+mm.title);
				System.out.println("감독:"+mm.director);
				System.out.println("출연:"+mm.actor);
				System.out.println("장르:"+mm.genre);
				System.out.println("등급:"+mm.grade);
				System.out.println("개봉일:"+mm.regdate);
			}
			else if(m==3)
			{
				Scanner scan=new Scanner(System.in);
				System.out.print("검색어 입력:");
				String ss=scan.next();
				findTitle(ss);
			}
		}
	}
}
public class MovieMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        NaverMovie n=new NaverMovie();
        n.process();
	}

}
