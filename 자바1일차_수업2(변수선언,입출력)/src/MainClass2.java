/*
 *    국어,영어 ,수학 점수를 입력 받아서 출력하시오 
 *    1. 저장 공간 (국어,영어 ,수학) =>  
 *    2. 총점 출력 , 평균 출력 
 */
//1. 입력 받기 => 라이브러리 가지고 온다 
import java.util.Scanner; // scanf() => 이용해서 만든 클래스 
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 1. Scanner클래스를 저장 
		Scanner scan=new Scanner(System.in);//40page
		//  System.in => 키보드 입력값을 읽어 와라 
		System.out.print("국어 점수 입력:");//입력후에 엔터=>메모리에 저장 
		// 저장될 메모리 선언 => 변수 
		int kor=scan.nextInt();//키보드로 입력한 정수값을 읽어서 kor메모리에 저장 
		
		System.out.print("영어 점수 입력:");
		int eng=scan.nextInt();
		
		System.out.print("수학 점수 입력:");
		int math=scan.nextInt();
		
		// 받아서 저장된 점수를 출력 
		System.out.printf("%-5d%-5d%-5d",kor,eng,math);
		System.out.print('\n');
		System.out.println("총점:"+(kor+eng+math));
		System.out.println("평균:"+(kor+eng+math)/3.0);
		System.out.printf("평균:%.2f",(kor+eng+math)/3.0);
		// f=실수 출력 
		// 정수/정수=정수   5/2 => 2
	}

}
