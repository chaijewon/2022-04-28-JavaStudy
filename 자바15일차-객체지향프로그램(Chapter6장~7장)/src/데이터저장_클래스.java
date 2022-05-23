import java.util.*;
/*
 *   자바 코딩 
 *   1. package 
 *   2. import 
 *   3. class className
 *      {
 *      }
 */
// 한명에 대하 정보를 모아서 => 한번에 저장 => 클래스 
// 영화 => 10 => 클래스 1개 제작 => new를 이용해서 10개 저장 
// 34byte크기의 데이터형을 제작 
class Student
{
	//학교명 
	String name;//4 => 4byte(주소 => int를 벗어나지 않는다)
	int kor;//4
	int eng;//4
	int math;//4
	int total;//4
	double avg;//8
	int rank;//4
	char score;//2
}
// 사용자 정의 데이터형 => 일반 변수와 동일하게 취급 
// => 여러개 (한개의 이름) 
// 18 => 6 => 1
// new를 사용하기 전에는 메모리에 저장이 안된 상태 
// static => 공유 
public class 데이터저장_클래스 {
    public static void main(String[] args) {
		final int ROW=3;
		Student[] std=new Student[ROW];
		Scanner scan=new Scanner(System.in);
		// 초기화 
		for(int i=0;i<ROW;i++)
		{
			//std[i]=new Student(); // 클래스 => 메모리 저장 장소 확보 
			// new => 새로운 메모리를 만든다 
			System.out.print("이름 입력:");
			std[i].name=scan.next();
			std[i].kor=(int)(Math.random()*101);
		    // . 주소 접근 연산자 (참조 변수=> 클랫)
			std[i].eng=(int)(Math.random()*101);
			std[i].math=(int)(Math.random()*101);
			std[i].total=std[i].kor+std[i].eng+std[i].math;
			std[i].avg=std[i].total/3.0;
			
		}
		
		for(int i=0;i<ROW;i++)
		{
			System.out.println("이름:"+std[i].name);
			System.out.println("국어:"+std[i].kor);
			System.out.println("영어:"+std[i].eng);
			System.out.println("수학:"+std[i].math);
			System.out.println("총점:"+std[i].total);
			System.out.printf("평균:%.2f\n",std[i].avg);
			System.out.println("==================");
		}
	}
}








