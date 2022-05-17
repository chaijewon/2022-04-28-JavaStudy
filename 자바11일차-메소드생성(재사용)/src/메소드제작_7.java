// 년도 , 월 , 일 => 무슨 요일 
// ==> Calendar => 10장 
import java.util.Scanner;
public class 메소드제작_7 {
    //1. 입력 
	static int input(String str)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print(str+" 입력:");
		int a=scan.nextInt();
		return a;
	}
	//2. 요일 계산 
	static void process()
	{
		int year=input("년도");
		int month=input("월");
		int day=input("일");
		System.out.println(year+"년도 "+month+"월 "+day+"일");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        process();
	}

}
