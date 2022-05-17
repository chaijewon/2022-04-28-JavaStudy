// boolean (리턴형)
// 사용자 => 년도입력 (윤년 여부 확인) => 윤년(true) , 윤년아닌 경우(false)
import java.util.Scanner;
public class 메소드제작_6 {
    static boolean isYear(int year)
    {
    	boolean bCheck=false;
    	if((year%4==0 && year%100!=0)||(year%400==0))
    		bCheck=true;
    	//else
    		//bCheck=false;
    	return bCheck;
    }
    static void process()
    {
    	Scanner scan=new Scanner(System.in);
    	System.out.print("년도 입력:");
    	int year=scan.nextInt();
    	
    	boolean bCheck=isYear(year);
    	
    	if(bCheck==true)
    	{
    		System.out.println(year+"년도는 윤년입니다");
    	}
    	else
    	{
    		System.out.println(year+"년도는 윤년아닙니다");
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        process();
	}

}
