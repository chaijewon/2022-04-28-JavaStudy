/*
 *     형식)
 *     [접근지정어] [옵션] 리턴형 메소드명([매개변수 목록]) : 메소드 선언 
 *     {
 *         구현 
 *         return 값; => 리턴형이 void일경우에는 생략이 가능 
 *     }
 *     *****
 *     접근지정어(private , public , protected , default) 
 *     옵션 (static , abstract , final)
 *     *****
 *     *** 한개만 사용이 가능 
 *     리턴형 : 사용자 요청을 처리하는 기능 => 결과값을 넘겨주는 데이터형 
 *     -----
 *       기본형 / 배열 / 클래스(사용자 정의 클래스 포함)
 *       => 권장사항 (결과값의 데이터형 = 리턴형 일치)
 *                                ------ 큰 데이터형을 사용할 수 있다
 *       int display()
 *       {
 *          return 10;
 *       }
 *       long display()
 *       {
 *          return 10;
 *       }
 *       double display()
 *       {
 *          return 10;
 *       }
 *       ================= 
 *       void : 결과값이 없는 경우 => 출력 (구구단)
 *                               오라클 연동 (Insert,Update,Delete)
 *                               Select(리턴형) 
 *       
 *     매개변수 => 메소드에서 메소드로 값을 전송 
 *               사용자 요청값 
 *               기본형 / 배열 / 클래스(사용자 정의 클래스 포함)
 *               여러개 사용이 가능 (권장 => 3이상이면 : 배열,클래스)
 *               클래스는 한개,한사람의 정보 
 *               -------------------- new : 메모리 다르게 저장
 *    메소드명 : 식별자 (7~10) 
 *    메소드안에서 사용되는 변수 : 지역변수 (메소드안에서만 사용)
 *                         ------- 메소드가 종료하면 자동으로 메모리에서 해제 
 *                         
 *     
 */
// 정수 한개를 입력받아서 출력 
// 입력 / 출력 => 메소드 
import java.util.Scanner;
public class 메소드정리_1 {
    static int input()
    {
    	Scanner scan=new Scanner(System.in);
    	System.out.print("정수 입력:");
    	return scan.nextInt();
    }
    static void output(int a)
    {
    	System.out.println("입력받은 정수값:"+a);
    }
    static void process()
    {
    	int a=input();// 메소드 호출 과정 
    	// 리턴형이 있는 경우는 => 해당 리턴형의 데이터형으로 받는다 
    	// 메소드명(매개변수값 입력)
    	output(a);
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        process();
	}

}
