import java.util.Scanner;// 월,수,목
public class 데이터저장_뮤직배열 {
    // 목록 출력 => 가수명 => 페이지 나누기 
	static void musicList(int page)
	{
		int j=0;// 10개씩 나눠주는 변수 
		int pagecnt=(page*10)-10;// 시작 위치 
		/*
		 *   1page => 0~9 
		 *     => 1*10 - 10  => 0
		 *   2page => 10~19
		 *     => 2*10 -10   => 10
		 *   3page => 20~29
		 *     => 3*10 -10   => 20
		 *   ---
		 *   ---
		 */
		for(int i=0;i<뮤직데이터베이스.title.length;i++)
		{
			if(j<10 && i>=pagecnt)
			{
				//System.out.println(뮤직데이터베이스.title[i]);
				System.out.println("순위:"+(i+1));
				System.out.println("곡명:"+뮤직데이터베이스.title[i]);
				System.out.println("가수명:"+뮤직데이터베이스.singer[i]);
				System.out.println("앨범:"+뮤직데이터베이스.album[i]);
				String s="";
				if(뮤직데이터베이스.state[i].equals("상승"))
				{
					s="▲";
				}
				else if(뮤직데이터베이스.state[i].equals("하강"))
				{
					s="▼";
				}
				else
				{
					s="-";
				}
				System.out.println("상태:"+s+" "+(뮤직데이터베이스.modify[i]==0?"":뮤직데이터베이스.modify[i]));
				System.out.println("---------------------------------------");
				j++;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        int totalpage=(int)(Math.ceil(뮤직데이터베이스.title.length/10.0));
        System.out.print("페이지 입력:(1~"+totalpage+")");
        int page=scan.nextInt();
        musicList(page);
	}

}
