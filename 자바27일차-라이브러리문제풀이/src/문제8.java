import java.util.*;
public class 문제8 {
    // 536page
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("년도 입력:");
		int year=scan.nextInt();
		System.out.print("월 입력:");
		int month=scan.nextInt();
		System.out.print("일 입력:");
		int day=scan.nextInt();
		
		Calendar cal=Calendar.getInstance();
		
		cal.set(Calendar.YEAR , year);
		cal.set(Calendar.MONTH,   month-1 ); //0~11 
		cal.set(Calendar.DATE, 1);
		int week=cal.get( Calendar.DAY_OF_WEEK   );
		int lastday=cal.getActualMaximum(Calendar.DATE);
		System.out.println(lastday);
		String[] strWeek={"일","월","화","수","목","금","토"};
		System.out.printf("%d년도 %d월 %d일은 %s요일입니다\n",cal.get(Calendar.YEAR),
				cal.get(Calendar.MONTH)+1,cal.get(Calendar.DATE),strWeek[week-1]);
		for(int i=0;i<7;i++)
		{
			System.out.print(strWeek[i]+"\t");
		}
		System.out.println();
		week=week-1;
		// 날짜 출력 
		for(int i=1;i<=lastday;i++)
		{
			if(i==1)
			{
				for(int j=0;j<week;j++)
				{
					System.out.print("\t");
				}
			}
			System.out.printf("%2d\t",i);
			
			week++;
			if(week>6)// 일요일이면 
			{
				week=0;// 0~6
				System.out.println();// 다음을 출력 
			}
		}

	}

}
