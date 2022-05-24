package 자바16일차_변수응용1;
import java.util.Scanner;
public class 사용자_데이터베이스이용 {
    // 30 => 1~12 , 13~18 , 19~30
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("====================");
		System.out.println("1. 믿고 보는 맛집리스트");
		System.out.println("2. 지역별 맛집 리스트");
		System.out.println("3. 인기메뉴별 맛집 리스트");
		System.out.println("====================");
		System.out.print("카테고리 선택:");
		int no=scan.nextInt();
		
        for(int i=0;i<맛집데이터베이스.cate.length;i++)
        {
        	if(no==1)
        	{
        		if(i>=0 && i<12)
        		{
	        	System.out.println("카테고리 번호:"+맛집데이터베이스.cate[i].cateno);
	        	System.out.println("제목:"+맛집데이터베이스.cate[i].title);
	        	System.out.println("부제목:"+맛집데이터베이스.cate[i].subject);
	        	System.out.println("===================================");
        	
        		}
        	}
        	else if(no==2)
        	{
        		if(i>=12 && i<18)
        		{
	        	System.out.println("카테고리 번호:"+맛집데이터베이스.cate[i].cateno);
	        	System.out.println("제목:"+맛집데이터베이스.cate[i].title);
	        	System.out.println("부제목:"+맛집데이터베이스.cate[i].subject);
	        	System.out.println("===================================");
        	
        		}
        	}
        	else if(no==3)
        	{
        		if(i>=18 && i<30)
        		{
	        	System.out.println("카테고리 번호:"+맛집데이터베이스.cate[i].cateno);
	        	System.out.println("제목:"+맛집데이터베이스.cate[i].title);
	        	System.out.println("부제목:"+맛집데이터베이스.cate[i].subject);
	        	System.out.println("===================================");
        	
        		}
        	}
        }
	}

}
