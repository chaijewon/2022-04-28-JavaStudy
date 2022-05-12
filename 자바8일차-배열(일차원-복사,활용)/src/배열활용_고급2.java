// 달력 구현 
/*
 *    1. 2022.5 => 5월 1일 => 무슨요일 
 *       요일 구하기 
 *       -------------------------
 *       1) 전년도까지의 총날수 구한다 
 *          1.1.1 => 2021.12.31
 *          -------------------
 *       2) 전달까지의 총날수 
 *          5 => 1,2,3,4
 *       ------------------------- 윤년 계산
 *       3) +1 
 *       ------------------------ 1일자 총날수 
 *       4) 총날수%7 => 요일을 구한다 
 *   ----------------------------------------
 *    Calendar : 실제로는 
 */
import java.util.Scanner;
public class 배열활용_고급2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("년도 입력:");
        int year=scan.nextInt();
        
        System.out.print("월 입력:");
        int month=scan.nextInt();
        
        // 처리 
        char[] strWeek={'일','월','화','수','목','금','토'};
        
        System.out.println(year+"년도 "+month+"월");
        System.out.println("\n");
        for(char c:strWeek)
        {
        	System.out.print(c+"\t");
        }
        
        // 요일을 구한다 
        // 1. 전년도까지 총날 수를 구한다 2022 => 2021
        int total=(year-1)*365
        		 +(year-1)/4
        		 -(year-1)/100
        		 +(year-1)/400;
        // 2. 전달까지 총날 수를 구한다
        int[] lastday={31,28,31,30,31,30,
        		       31,31,30,31,30,31};
        if((year%4==0 && year%100!=0)||(year%400==0))
        {
        	//윤년이면 ==> 29
        	lastday[1]=29;
        }
        else
        {
        	//윤년이 아니면 ==> 28
        	lastday[1]=28;
        }
        
        for(int i=0;i<month-1;i++)
        {
        	total+=lastday[i];
        }
        // 3. +1
        total++;
        // ----------------------- 누적 % 7 (1년 1월 1일 = 월)
        int week=total%7;
        System.out.println();
        //System.out.println(year+"년도 "+month+"월 1일은 "+
           //strWeek[week]+"입니다");
        // 0~6 0(일) ~~ 토(6)
        // 달력 출력 
        for(int i=1;i<=lastday[month-1];i++)
        {
        	if(i==1)// 맨처음 한번만 수행 => 요일까지 공백 
        	{
        		for(int j=0;j<week;j++)
        		{
        			System.out.print("\t");
        		}
        	}
        	System.out.printf("%2d\t",i);
        	week++;
        	if(week>6)
        	{
        		System.out.println();
        		week=0;
        	}
        }
        
        
	}

}





