/*
 *  년도를 입력 받아 윤년여부를 확인하는 프로그램 작성
    년도 입력 메소드
    윤년 처리 
    출력 

 */
import java.util.Scanner;
public class 문제3 {
    static int inputYear()
    {
    	Scanner scan=new Scanner(System.in);
    	System.out.print("년도 입력:");
    	//int year=scan.nextInt();
    	return scan.nextInt();
    }
    static boolean isYear(int year)
    {
    	boolean bCheck=false;
    	if((year%4==0 && year%100!=0)||(year%400==0))
    		bCheck=true;
    	
    	return bCheck;
    }
    static void print()
    {
    	int year=inputYear();
    	boolean bCheck=isYear(year);
    	if(bCheck==true)
    		System.out.println("윤년입니다!!");
    	else
    		System.out.println("윤년이 아닙니다!!");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        print();
	}

}
