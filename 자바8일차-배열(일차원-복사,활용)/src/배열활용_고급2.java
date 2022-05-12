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
        // 1. 전년도까지 총날 수를 구한다 
        // 2. 전달까지 총날 수를 구한다
        // 3. +1
        // ----------------------- 누적 % 7 (1년 1월 1일 = 월)
        // 0~6 0(일) ~~ 토(6)
        // 달력 출력 
        
        
	}

}





