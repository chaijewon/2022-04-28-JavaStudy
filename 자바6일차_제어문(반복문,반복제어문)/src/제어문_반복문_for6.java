// 주사위 2개 ==> 두개의 합 6일 경우의 수를 출력 한다 
/*
 *   [1,5] ,[2,4] ,[3,3] ,[4,2] ,[5,1]
 */
import java.util.Scanner;
public class 제어문_반복문_for6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력(2~12):");
		int num=scan.nextInt();
        for(int i=1;i<=6;i++)// 첫번째 주사위
        {
        	for(int j=1;j<=6;j++) // 두번째 주사위
        	{
        		if(i+j==num)
        		{
        			System.out.printf("[%d,%d]\n",i,j);
        		}
        	}
        }
	}

}
