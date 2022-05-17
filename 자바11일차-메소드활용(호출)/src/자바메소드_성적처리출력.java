// 국어 영어 수학 점수 입력 => 총점 , 평균 , 학점
import java.util.Scanner;
public class 자바메소드_성적처리출력 {
    // 입력
	static int jumsuInput(String subject)
	{
		Scanner scan=new Scanner(System.in);
        System.out.print(subject+" 입력:");
        int jumsu=scan.nextInt();
        return jumsu;
	}
	static int total(int kor,int eng,int math)
	{
		return kor+eng+math;
	}
	static double avg(int total)
	{
		return total/3.0;
	}
	static char hakjum(double avg)
	{
		char c='A';
        if(avg>=90)
        	c='A';
        else if(avg>=80)
        	c='B';
        else if(avg>=70)
        	c='C';
        else if(avg>=60)
        	c='D';
        else
        	c='F';
        
        return c;
	}
	static void print(int kor,int eng,int math,int total,double avg,char c)
	{
		System.out.println("국어점수:"+kor);
        System.out.println("영어점수:"+eng);
        System.out.println("수학점수:"+math);
        System.out.println("총점:"+total);
        System.out.printf("평균:%.2f\n",avg);
        System.out.println("학점:"+c);
	}
	static void process()
	{
		int kor=jumsuInput("국어");
		int eng=jumsuInput("영어");
		int math=jumsuInput("수학");
		
		int total=total(kor, eng, math);
		double avg=avg(total);
		char c=hakjum(avg);
		print(kor, eng, math, total, avg, c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
        /*Scanner scan=new Scanner(System.in);
        System.out.print("국어 입력:");
        int kor=scan.nextInt();
        
        System.out.print("영어 입력:");
        int eng=scan.nextInt();
        
        System.out.print("수학 입력:");
        int math=scan.nextInt();
        
        // 총점 
        int total=kor+eng+math;
        // 평균
        double avg=total/3.0;
        // 학점 
        char c='A';
        if(avg>=90)
        	c='A';
        else if(avg>=80)
        	c='B';
        else if(avg>=70)
        	c='C';
        else if(avg>=60)
        	c='D';
        else
        	c='F';
        // 출력 
        System.out.println("국어점수:"+kor);
        System.out.println("영어점수:"+eng);
        System.out.println("수학점수:"+math);
        System.out.println("총점:"+total);
        System.out.printf("평균:%.2f\n",avg);
        System.out.println("학점:"+c);*/
        
	}

}
