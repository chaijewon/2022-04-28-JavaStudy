import java.util.Scanner;

public class 데이터저장_배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //  배열 => 같은 기능의 변수를 모아서 관리 
		final int ROW=5;
		int[] kor=new int[ROW];
		int[] eng=new int[ROW];
		int[] math=new int[ROW];
		int[] total=new int[ROW];
		double[] avg=new double[ROW];
		String[] name=new String[ROW];
		int[] rank=new int[ROW];
		char[] score=new char[ROW];
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<ROW;i++)
		{
			System.out.print("이름 입력:");
			name[i]=scan.next();
			kor[i]=(int)(Math.random()*101);
			eng[i]=(int)(Math.random()*101);
			math[i]=(int)(Math.random()*101);
			total[i]=kor[i]+eng[i]+math[i];
			avg[i]=total[i]/3.0;
		}
		
		for(int i=0;i<ROW;i++)
		{
			System.out.println("이름:"+name[i]);
			System.out.println("국어:"+kor[i]);
			System.out.println("수학:"+math[i]);
			System.out.println("영어:"+eng[i]);
			System.out.println("총점:"+total[i]);
			System.out.printf("평균:%.2f\n",avg[i]);
			System.out.println("================");
		}
	}

}
