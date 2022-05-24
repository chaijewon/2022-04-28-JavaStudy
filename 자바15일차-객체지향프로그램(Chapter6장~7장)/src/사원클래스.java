import java.util.*;
// 프로그램마다 , 개발자마다 다르다 (고정)
/*
 *    class Music 
 *    {
 *       int rank;
 *       String title;
 *       String singer;
 *       String album;
 *    }
 *    
 *    class 멜론 extends Music
 *    {
 *        int rank;
 *        String title;
 *        String singer;
 *        String album;
 *        int like
 *    }
 *    class 지니뮤직 extends Music
 *    {
 *       int rank;
 *       String title;
 *       String singer;
 *       String album;
 *       --
 *       --
 *       --
 *    }
 *    
 */
class Sawon{
	int sabun;
	String name;
	String dept;
	String job;
	String loc;
	int pay;
}
public class 사원클래스 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name= {"홍길동","심청이","이순신"};
		String[] dept= {"개발부","영업부","총무부"};
		String[] job= {"과장","대리","사원"};
		String[] loc= {"서울","부산","인천"};
		int[] pay= {4500,3500,3000};
        Sawon[] sawon=new Sawon[3];// 저장 공간은 아직 생성이 안됨 
        Scanner scan=new Scanner(System.in);
        for(int i=0;i<3;i++)
        {
        	//System.out.println(sawon[i]);
        	sawon[i]=new Sawon();//저장 공간 
        	//System.out.println(sawon[i]);
        	sawon[i].sabun=i+1;
        	//System.out.println(sawon[i].sabun);
        	sawon[i].name=name[i];
        	sawon[i].dept=dept[i];
        	sawon[i].job=job[i];
        	sawon[i].loc=loc[i];
        	sawon[i].pay=pay[i];
        	
        }
	}

}





