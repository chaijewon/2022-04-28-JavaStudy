import java.util.Scanner;
public class 숫자야구게임_메소드 {
    // 난수 발생 
	static int[] getRand()
	{
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
		return com;
	}
	static int[] userInput()
	{
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
			
			break;
		}
		return user;
	}
	static int compare(int[] com,int[] user)
	{
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
		hint(user,s,b);
		return s;
	}
	static void hint(int[] user,int s,int b)
	{
		System.out.printf("Input Number:%d%d%d,Result:%dS-%dB\n",
				user[0],user[1],user[2],s,b);
	}
	static boolean isEnd(int s)
	{
		if(s==3)
		  return true;
		else
			return false;
	}
	static void process()
	{
		int[] com=getRand();
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			int[] user=userInput();
			int s=compare(com, user);
			
			if(isEnd(s))
			{
				System.out.print("게임의 다시 할까요?(y|Y):");
				String msg=scan.next();
				char c=msg.charAt(0);
				if(c=='y' || c=='Y')
				{
					process();
				}
				else
				{
					System.out.println("Game Over!!");
					System.exit(0);
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        process();
	}

}
