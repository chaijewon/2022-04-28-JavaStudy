import java.util.Scanner;
public class 달력만들기_전역변수 {
    
    static void userInput()
    {
    	Scanner scan=new Scanner(System.in);
		System.out.print("년도 입력:");
		year=scan.nextInt();
		
		System.out.print("월 입력:");
		month=scan.nextInt();
    }
    static void getWeek()
    {
    	int total=(year-1)*365
				 +(year-1)/4
				 -(year-1)/100
				 +(year-1)/400;
		// 2022 -> 5  ==> 2021.12.31
		// 2-2. 전달까지의 총날  수
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
		week=total%7;
    }
    static void print()
    {
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
    static void process()
    {
    	userInput();
    	getWeek();
    	print();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        process();
	}
	static int year,month,week;// 자동으로 초기화 (0) => 클래스변수,공유변수
    /*
     *   int => 0
     *   double => 0.0
     *   long => 0L
     *   String => null => 모든 클래스는 null초기화 
     *   배열 => null
     */
    static int[] lastday={31,28,31,30,31,30,
		                 31,31,30,31,30,31};
    
}
