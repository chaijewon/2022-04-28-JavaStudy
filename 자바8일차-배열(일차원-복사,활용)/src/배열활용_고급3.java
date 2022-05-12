// 3명의 학생 => 국어,영어,수학 점수를 받아서 => 총점 / 평균 / 학점 / 등수를 출력
import java.util.Scanner;
public class 배열활용_고급3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int ROW=3;
        int[] kor=new int[ROW];
        int[] eng=new int[ROW];
        int[] math=new int[ROW];
        int[] total=new int[ROW];
        double[] avg=new double[ROW];
        char[] score=new char[ROW];
        int[] rank=new int[ROW];
        //1. 값을 입력 => 초기화 
        Scanner scan=new Scanner(System.in);
        for(int i=0;i<ROW;i++)
        {
        	System.out.printf("%d 번째 국어점수 입력:",i+1);
        	kor[i]=scan.nextInt();
        	System.out.printf("%d 번째 영어점수 입력:",i+1);
        	eng[i]=scan.nextInt();
        	System.out.printf("%d 번째 수학점수 입력:",i+1);
        	math[i]=scan.nextInt();
        	// 총점 구하기 
        	total[i]=kor[i]+eng[i]+math[i];
        	avg[i]=total[i]/(double)ROW;
        	
        	switch((int)(avg[i]/10))
        	{
        	case 10:case 9:
        		score[i]='A';
        		break;
        	case 8:
        		score[i]='B';
        		break;
        	case 7:
        		score[i]='C';
        		break;
        	case 6:
        		score[i]='D';
        		break;
        	default:
        		score[i]='F';
        	}
        }
        // 학점 
        for(int i=0;i<ROW;i++)
        {
        	rank[i]=1;
        	for(int j=0;j<ROW;j++)
        	{
        		if(total[i]<total[j])
        		{
        			rank[i]++;
        		}
        	}
        }
        // 등수 
        //출력 
        for(int i=0;i<ROW;i++)
        {
        	System.out.printf("%-5d%-5d%-5d%-6d%-7.2f%-3c%-3d\n",
        			kor[i],eng[i],math[i],total[i],avg[i],score[i],
        			rank[i]);
        }
	}

}
