// 윤년 여부 확인
/*
 *   윤년 조건 
 *   1) 4년마다 윤년 
 *   2) 100년마다 윤년에서 제외
 *   3) 400년마다 윤년 
 *   ---------------------
 *   year%4==0 && year%100!=0 || year%400==0 
 *   ERP (관리프로그램) => 일정표 
 */
import java.util.Scanner;
public class 자바조건문_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("년도 입력:");
        int year=scan.nextInt();
        // 요청에 대해 처리
        if((year%4==0 && year%100!=0)||(year%400==0))
        	System.out.println(year+"년도는 윤년입니다");
        if(!((year%4==0 && year%100!=0)||(year%400==0)))
        	System.out.println(year+"년도는 윤년이 아닙니다");
        
	}

}







