/*
1)	 2+4+6+....100까지의 정수의 합을 구하고 출력하라 (while 사용)
2)	 5,10,15,20,25,30,35,40,45,50을 출력하는 프로그램을 만들어라 (while 사용)
3)	 B,D,F,H,J,L,N을 출력하는 프로그램을 작성하라 (while 사용)
4)	 한 개의 정수를 입력 받아 1부터 입력 받은 정수까지의 합을 출력하라
5)	 1부터 30까지의 정수에서 짝수만 한 줄에 3개씩 출력하라 
6)	 1-2+3-4+5-6+7-8+9-10 계산 값을 while문을 이용하여 출력하라 
7)	 1~10 사이의 숫자 중 3의 배수를 제외하고 출력하라 (continue 사용)
 */
import java.util.Scanner;
public class 제어문_문제_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*int i=2;
        // 합을 누적하는 변수
        int sum=0;
        while(i<=100)
        {
        	sum+=i;
        	i+=2;
        }
        System.out.println("2+4+6+....100까지의 정수의 합:"+sum);*/
		
		/*int i=5;
		while(i<=50)
		{
			System.out.print(i+" ");
			i+=5;
		}*/
		/*char c='B';
		while(c<='N')
		{
			System.out.print(c+" ");
			c+=2;
		}*/
		
		/*Scanner scan=new Scanner(System.in);
		while(true)
		{
			System.out.print("정수 입력:");
			int num=scan.nextInt();
			
			if(num==999)
			{
				System.out.println("프로그램 종료");
				break;
			}
			// 잘못된 입력 => ||
			if(num<1 || num>100)
			{
				System.out.println("잘못된 입력입니다!!");
				continue;// 처음으로 돌아간다 (while의 조건식으로 이동)
			}
			// 누적 변수 
			int sum=0;
			//for(int i=1;i<=num;i++)
			//{
				//sum+=i;
			//}
			int i=1;
			while(i<=num)
			{
				sum+=i;
				i++;
			}
			System.out.println("1~"+num+"까지의 합:"+sum);
		   
		}*/
		/*int i=1;//1~30까지 
		int j=0;//3개씩 나눠주는 변수 ==> 페이지 나누기 
		while(i<=30)
		{
			if(i%2==0)
			{
				// 중첩 if문 
				if(j==3)
				{
					System.out.println();
					j=0;
				}
				System.out.printf("%2d\t",i);
				
				j++;
			}
			i++;
		}*/
		/*int i=1;
		int sum=0;//누적변수 
		while(i<=10)
		{
			if(i%2==0)
				sum-=i;
			else
				sum+=i;
			i++;
		}
		System.out.println("1-2+3-4+5-6+7-8+9-10의 합:"+sum);*/
		// 1 2 => 3
		/*int i=1;
		while(i<=10)
		{
			if(i%3==0) // 3의 배수 
			{
				i++;
				continue; // 제외한다 => 
				
				    //continue 
				    //for =======> 증가식 => 조건
				    //while =====> 조건식 (무한루프)
				 
			}
			System.out.print(i+" ");
			i++;
			
		}*/
		//1부터 30까지의 정수에서 짝수만 한 줄에 3개씩 출력하라 
		int i=1; //1~30까지 변경 (루프변수)
		int j=0; //3개를 출력했는지 확인 변수
		while(i<=30)
		{
			if(i%2==0)
			{
				// 확인 
				if(j%3==0 && j!=0)
				{
					System.out.println();//3개 출력하고 다음에 출력
					//j=0;
				}
				System.out.printf("%2d\t",i);
				j++;
			}
			i++;
		}
		
		
	}

}
