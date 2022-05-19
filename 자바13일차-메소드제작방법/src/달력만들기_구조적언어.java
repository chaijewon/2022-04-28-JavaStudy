import java.util.Scanner;
public class 달력만들기_구조적언어 {
    // 사용자 입력 
	static int userInput(String msg)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print(msg+" 입력:");
		int data=scan.nextInt();
		return data;
	}
	// 요일구하기 
	static int getWeek(int year,int month)
	{
		// 처리 
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
		return week;
	}
	// 출력 
	static void print(int year,int month,int week)
	{
		int[] lastday={31,28,31,30,31,30,
			       31,31,30,31,30,31};
		if((year%4==0 && year%100!=0)||(year%400==0))//윤년조건
			 lastday[1]=29;
		else
			lastday[1]=28;
		
		System.out.printf("%d년도 %d월\n",year,month);
		String[] strWeek={"일","월","화","수","목","금","토"};
		for(String s:strWeek)
		{
			System.out.print(s+"\t");
		}
		System.out.println("\n");
		for(int i=1;i<=lastday[month-1];i++)
		{
			if(i==1) // 맨처음 한번만 수행 (요일까지 공백)
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
				week=0;
				System.out.println("\n");
			}
		}
	}
	// 조립 
	static void process()
	{
		int year=userInput("년도");
		int month=userInput("월");// 반복 제거 
		int week=getWeek(year, month);
		print(year, month, week);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        process();
	}

}
