import java.util.Arrays;
import java.util.Scanner;

/*
 *   ***1. 난수 발생 (1~9) => 3개 => 중복이 없는 난수 발생 
 *   2. 사용자 입력 
 *   3. 비교 (난수 / 사용자)
 *   4. 힌트 제공 
 *   5. 종료 여부 확인 
 *   -------------------------------
 *   6. 조립 
 */

public class 숫자야구게임_절차적언어 {

	public static void main(String[] args) {
		// 난수 발생 => 중복이 없는 난수 
		int[] com=new int[3];
		int su=0; // 난수값을 받는다 
		boolean bCheck=false; // 중복여부 확인 
		// false면 => 중복(X) => com에 저장, true=>(O) => 난수 다시 발생
		for(int i=0;i<com.length;i++)
		{
			bCheck=true;
			while(bCheck)
			{
				// 난수 발생 => 1 2 2
				//            su=1
				//            su=2
				//            su=2
				su=(int)(Math.random()*9)+1;//1~9
				bCheck=false;
				// 검색 
				for(int j=0;j<i;j++)
				{
					if(com[j]==su)// 중복되었다면 
					{
						bCheck=true;
						break;
					}
					
				}
			}
			com[i]=su;
		}
		//System.out.println(Arrays.toString(com));
		// 사용자 입력 
		Scanner scan=new Scanner(System.in);
		int[] user=new int[3];
		while(true)
		{
			System.out.print("세자리 정수 입력:");
			int input=scan.nextInt();
			
			// 오류 체크 
			if(input<100 || input>999)
			{
				System.out.println("잘못된 입력입니다!!");
				// 처음부터 다시 시작 
				continue; // while의 조건식으로 이동 , for은 증가식으로 이동 
			}
			// 단위를 나눈다
			// 567
			user[0]=input/100; // 567/100 => 5
			user[1]=(input%100)/10; // 567%100 => 67/10 => 6
			user[2]=input%10; // 567%10 => 7
			
			// 오류체크 
			if(user[0]==user[1]||user[1]==user[2]||user[0]==user[2])
			{
				System.out.println("같은 수는 사용할 수 없습니다!!");
				continue;
			}
			
			//오류체크 
			if(user[0]==0 || user[1]==0 || user[2]==0)
			{
				System.out.println("0은 사용할 수 없습니다!!");
				continue;
			}
			
			// 비교 
			int s=0,b=0;
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					if(com[i]==user[j])
					{
						if(i==j)
							s++;
						else
							b++;
					}
				}
			}
			// 힌트
			System.out.printf("Input Number:%d,Result:%dS-%dB\n",
					input,s,b);
			// 종료 
			if(s==3)
			{
				System.out.println("Game Over!!");
				break;
			}
			
			
		}
	}

}










