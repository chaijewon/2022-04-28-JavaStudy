import java.util.Calendar;

/*
 *   달력 => 호텔 (예약) , 영화 , KTX 
 *          프로젝트 
 *           = 예약 
 *           = 추천 
 *           = 코스 
 *           = 장바구니 (쇼핑몰)  
 *           = 도서관 
 *           = 맛집 / 레시피 
 *           = 잡포털 
 *     ========================== IaaS , PaaS , SaaS
 *     
 *     달력 
 *     ---
 *      0. 사용자 입력 => year/month
 *      1. 요일 구하기 => 
 *         => 1년도 1월 1일 ~ 요청한 달의 1일자 => 총날수 구한다 
 *         => %7
 *         => Calendar => 10장 
 *      -----------
 *      2. 출력      => 요일부터 1~
 */
import java.util.Scanner;
public class 달력만들기_절차적언어 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Calendar cal=Calendar.getInstance();
        // 1. 입력값 받기 
		Scanner scan=new Scanner(System.in);
		System.out.print("년도 입력:");
		int year=scan.nextInt();
		
		System.out.print("월 입력:");
		int month=scan.nextInt();
		
		// 2. 요일 구하기 
		// 2-1. 전년도까지의 총날 수 
		int total=(year-1)*365
				 +(year-1)/4
				 -(year-1)/100
				 +(year-1)/400;
		// 2022 -> 5  ==> 2021.12.31
		// 2-2. 전달까지의 총날  수
		int[] lastday={31,28,31,30,31,30,
				       31,31,30,31,30,31};
		if((year%4==0 && year%100!=0)||(year%400==0))//윤년조건
			 lastday[1]=29;
		else
			lastday[1]=28;
		
		for(int i=0;i<month-1;i++)
		{
			total+=lastday[i];
		}
		// 2-3. +1 
		total++;
		// ---------------------+  %7 => 요일을 구할 수 있다
		int week=total%7;
		
		
		
		// 3. 달력 출력
		System.out.printf("%d년도 %d월\n",year,month);
		String[] strWeek={"일","월","화","수","목","금","토"};
		for(String s:strWeek)
		{
			System.out.print(s+"\t");
		}
		System.out.println();
		for(int i=1;i<=lastday[month-1];i++)
		{
			
		}
		
	}

}








