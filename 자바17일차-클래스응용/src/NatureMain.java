import java.util.Scanner;
class SeoulLocation
{
	// 메뉴 
		int menu()
		{
			System.out.println("===== 서울 자연/관광 메뉴 =====");
			System.out.println("1. 명소 목록");
			System.out.println("2. 상세 보기");
			System.out.println("3. 검색(이름)");
			System.out.println("4. 검색(주소)");
			System.out.println("9. 종료");
			System.out.println("===================");
			Scanner scan=new Scanner(System.in);//in static
			// static InputStream in
			System.out.print("메뉴 선택:");
			int m=scan.nextInt();
			return m;
		}
		// 목록 
		// 상세보기
		// 찾기
		// 조립 
		Location[] locationList(int page)
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
			 *   Location[] Locations=new Location[10];
			 *   Location[0]=...
			 *   Location[7]...
			 *   
			 *   Location[8]=null
			 *   Location[9]=null
			 *   
			 */
			Location[] locations=new Location[10];// 컬렉션 (11장) 
			int j=0; //10개씩 
			int pagecnt=(page*10)-10;
			/*
			 *    1page => 0~9
			 *    2page => 10~19
			 *    3page => 20~29....
			 *    i=0~1937
			 */
			/*for(int i=0;i<LocationManager.Location.length;i++)
			{
				if(j<10 && i>=pagecnt)
				{
					Location m=new Location();
					m.mno=LocationManager.Location[i].mno;
					m.title=LocationManager.Location[i].title;
					Locations[j]=m;//0~9
					j++;
				}
			}*/
			int k=0;
			// 1page    0         10(9)
			// 2page    10        20(19)
			for(int i=pagecnt;i<pagecnt+10;i++)
			{
				
				Location m=new Location();
				m.no=LocationManager.loc[i].no;
				m.title=LocationManager.loc[i].title;
				locations[k]=m;
				k++;
			}
			return locations;
		}
		//void LocationList(int page)
		//{
			// 메소드안에서 출력 => void
		//}
		// 상세보기 
		Location locationDetail(int mno)
		{
			Location m=LocationManager.loc[mno-1];// 1 => 0
			return m;
		}
		// 찾기 => 영화명 , 출연 , 장르 => 예매하기 => 마이페이지 
		void findTitle(String title)
		{
			for(Location m:LocationManager.loc)
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
					Location[] Location=locationList(page);
					// 받은 데이터 출력
					
						for(Location mm:Location)
						{
						  if(mm!=null)
						  {
							System.out.println(mm.no+"."+mm.title);
						  }
						}
					
				}
				else if(m==2)
				{
					Scanner scan=new Scanner(System.in);
					System.out.print("1~110번 사이의 정수입력:");
					int mno=scan.nextInt();
					Location mm=locationDetail(mno);
					System.out.println("===== 상세보기 =====");
					System.out.println("명칭:"+mm.title);
					System.out.println("소개:"+mm.msg);
					System.out.println("주소:"+mm.address);
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
class SeoulNature
{
	// 메뉴 
	int menu()
	{
		System.out.println("===== 서울 자연/관광 메뉴 =====");
		System.out.println("1. 자연 목록");
		System.out.println("2. 상세 보기");
		System.out.println("3. 검색(이름)");
		System.out.println("4. 검색(주소)");
		System.out.println("9. 종료");
		System.out.println("===================");
		Scanner scan=new Scanner(System.in);//in static
		// static InputStream in
		System.out.print("메뉴 선택:");
		int m=scan.nextInt();
		return m;
	}
	// 목록 
	// 상세보기
	// 찾기
	// 조립 
	Nature[] natureList(int page)
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
		 *   Nature[] Natures=new Nature[10];
		 *   Nature[0]=...
		 *   Nature[7]...
		 *   
		 *   Nature[8]=null
		 *   Nature[9]=null
		 *   
		 */
		Nature[] natures=new Nature[10];// 컬렉션 (11장) 
		int j=0; //10개씩 
		int pagecnt=(page*10)-10;
		/*
		 *    1page => 0~9
		 *    2page => 10~19
		 *    3page => 20~29....
		 *    i=0~1937
		 */
		/*for(int i=0;i<NatureManager.Nature.length;i++)
		{
			if(j<10 && i>=pagecnt)
			{
				Nature m=new Nature();
				m.mno=NatureManager.Nature[i].mno;
				m.title=NatureManager.Nature[i].title;
				Natures[j]=m;//0~9
				j++;
			}
		}*/
		int k=0;
		// 1page    0         10(9)
		// 2page    10        20(19)
		for(int i=pagecnt;i<pagecnt+10;i++)
		{
			
			Nature m=new Nature();
			m.no=NatureManager.nature[i].no;
			m.title=NatureManager.nature[i].title;
			natures[k]=m;
			k++;
		}
		return natures;
	}
	//void NatureList(int page)
	//{
		// 메소드안에서 출력 => void
	//}
	// 상세보기 
	Nature natureDetail(int mno)
	{
		Nature m=NatureManager.nature[mno-1];// 1 => 0
		return m;
	}
	// 찾기 => 영화명 , 출연 , 장르 => 예매하기 => 마이페이지 
	void findTitle(String title)
	{
		for(Nature m:NatureManager.nature)
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
				Nature[] nature=natureList(page);
				// 받은 데이터 출력
				
					for(Nature mm:nature)
					{
					  if(mm!=null)
					  {
						System.out.println(mm.no+"."+mm.title);
					  }
					}
				
			}
			else if(m==2)
			{
				Scanner scan=new Scanner(System.in);
				System.out.print("1~110번 사이의 정수입력:");
				int mno=scan.nextInt();
				Nature mm=natureDetail(mno);
				System.out.println("===== 상세보기 =====");
				System.out.println("명칭:"+mm.title);
				System.out.println("소개:"+mm.msg);
				System.out.println("주소:"+mm.address);
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
public class NatureMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //SeoulNature sn=new SeoulNature();
        //sn.process();
		SeoulLocation sl=new SeoulLocation();
		sl.process();
	}

}
