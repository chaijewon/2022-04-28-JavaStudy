// 국어/영어/수학 => 평균 , 총점 , 학점 출력 => 단일 조건문 
import java.util.Scanner;
public class 자바조건문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 입력값 받기 
		Scanner scan=new Scanner(System.in);
		System.out.print("국어점수 입력:");//입력 => 엔터 
		int kor=scan.nextInt();
		
		System.out.print("영어점수 입력:");//입력 => 엔터 
		int eng=scan.nextInt();
		
		System.out.print("수학점수 입력:");//입력 => 엔터 
		int math=scan.nextInt();
		
		// 출력 (처리)
		System.out.println("국어점수:"+kor);
		System.out.println("영어점수:"+eng);
		System.out.println("수학점수:"+math);
		System.out.println("총점:"+(kor+eng+math));
		System.out.printf("평균:%.2f\n",(kor+eng+math)/3.0);
		
		// 학점 출력 
		int score=(kor+eng+math)/3; // 90점 => D
		// 단일 조건문은 모든 if을 수행한다 (독립적으로 수행 => if마다 따로 실행)
		char hakjum='A';
		if(score>=90 /*&& score<=100*/)
			hakjum='A';
		if(score>=80 /*&& score<90*/)
			hakjum='B';
		if(score>=70 /*&& score<80*/)
			hakjum='C';
		if(score>=60 /*&& score<70*/)
			hakjum='D';
		if(score<60)
			hakjum='F';
		System.out.println("학점:"+hakjum);
		
		
	}

}
