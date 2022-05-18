import java.util.Arrays;
import java.util.Scanner;
/*
 *    3자리 
 *    123 => 156 => 1S-0B
 *    123 => 516 => 0S-1B
 *    
 *    ------------------------------
 *    1. 변수 
 *       => 루프변수 : 1~10까지 (반복문) 
 *       => 일반변수(지역변수) => main에서만 사용하는 변수 
 *          => 여러개일때 사용 => 배열 
 *          ----------------------------------------
 *          멤버변수 / 공유변수 => 클래스영역 
 *                            -----
 *                            기능 => 메소드 
 *                            사용자정의 데이터형 => 변수 
 *          ----------------------------------------
 *       => 변수 => 한개 데이터만 저장하는 메모리 공간의 이름 
 *    2. 처리 => 연산자 , 제어문 
 *       연산자 
 *         => ++,-- 
 *            전치(먼저 증가) , 후치(나중에 증가)
 *            우대사항 
 *              = VueJS / ReactJS 
 *              = 정보처리기사 
 *              = 가산점 (10) = 개인 프로젝트 
 *         => 산술연산자 (+ , %)
 *            => 정보처리 (화페매수) => 정렬 , 배열 
 *            숫자를 단위별로 나눠서 처리 => % , / 
 *            356 => 3,5,6
 *            ---    
 *            356/100 => 3
 *            (356%100)/10 = 5
 *            ---------
 *              56/10 => 5
 *            356%10 ==> 6
 *         => 논리연산자 / 비교연산자(==) => boolean 
 *            && (범위 포함)
 *            || (오류 처리)
 *            
 *         => 제어문 
 *            while / for / if
 *            if => 단일 if / 선택 if~else
 *            for => 1차 , 2차 
 *            while => while(true) => 종료시점 정하기 
 *         => 반복제어문 
 *            break(반복문 종료),continue(while-조건식,for-증가식)
 *            while => 처음부터 시작 -> 조건식 (continue)
 *    
 */
public class 숫자야구게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //1. 변수 설정 
		int[] com=new int[3];//난수
		int[] user=new int[3];// 사용자 입력값 
		//2. 컴퓨터 난수 => 중복이 없는 난수 발생 
		//////////////////////////////////////////////////
		int su=0; // 난수를 저장하는 변수 
		boolean bCheck=false; // 중복여부 확인
		/*
		 *   com[0]=2;
		 *   com[1]=3;
		 *   com[2]=3;
		 *   ---------
		 *   su=3;
		 *   if(su==com[i])
		 *   {
		 *      bCheck=true; => while문을 수행
		 *   }
		 *   else
		 *   {
		 *      bCheck=false; => while문을 종료하고 com배열 저장 
		 *   }
		 */
		for(int i=0;i<3;i++)
		{
			//중복 체크 
			// bCheck=true => 다시 난수 발생 
			// bCheck=false => com에 저장 
			bCheck=true;
			while(bCheck)
			{
				//난수 발생 
				su=(int)(Math.random()*9)+1; // 1~9
				bCheck=false;
				//비교 => 저장된 숫자 중복여부 확인
				for(int j=0;j<i;j++)
				{
					if(su==com[j])
					{
						bCheck=true; //while문 수행
						break;
					}
					
				}
			}
					
			com[i]=su;
		}
		////////////////////////////////////////////
		//System.out.println("com="+Arrays.toString(com));
		// ====== 반복문 => while
		//3. 사용자 입력 
		//3-1. 정상적 입력여부 확인 => continue; => if
		//4. 난수 비교 => for 
		//5. 힌트 제공 
		//6. 종료여부 ==> break 
		// ======
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			System.out.print("세자리 정수 입력:");
			int input=scan.nextInt();
			// 오류 => 잘못된 입력 
			if(input<100 || input>999)//input>=100 && input<=999
			{
				System.out.println("잘못된 입력입니다!!");
				continue;//while의 조건식으로 이동
			}
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]=input%10;
			//break;
			//같은 수를 입력하면 안된다 
			if(user[0]==user[1] || user[0]==user[2] || user[1]==user[2])
			{
				System.out.println("같은 수는 입력할 수 없습니다!!");
				continue;
			}
			//오류처리 => 0을 포함하면 안된다 
			if(user[0]==0|| user[1]==0 || user[2]==0)
			{
				System.out.println("\"0\"은 사용 할 수 없습니다!!");
				continue;
			}
			// 비교 
			int s=0,b=0;
			for(int i=0;i<3;i++) //com
			{
				for(int j=0;j<3;j++)//user
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
			// 종료 여부 
			if(s==3)
			{
				System.out.println("Game Over!!");
				break;
			}
			
		}
		//ystem.out.println("user="+Arrays.toString(user));
	}

}






