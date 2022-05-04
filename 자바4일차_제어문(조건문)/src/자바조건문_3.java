// 가위바위보 게임 
/*
 *   0 => 가위 
 *   1 => 바위
 *   2 => 보 
 *   
 *   경우의 수 ========> 3의 조건문 변경 
 *   컴퓨터     사용자 
 *    0(가위)    0(가위)
 *              1(바위)
 *              2(보)
 *    1(바위)    0(가위)
 *              1(바위)
 *              2(보)
 *    2(보)     0(가위)
 *              1(바위)
 *              2(보)
 *    데이터베이스 => 묻고답하기 (500줄)
 *                MyBatis (50줄) 
 *                JPA(10줄)
 */
import java.util.*;
public class 자바조건문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 컴퓨터 
		int com=(int)(Math.random()*3); //0,1,2
		//           0.0~0.99 ==> 0~2
		
		
		//사용자 
		Scanner scan=new Scanner(System.in);
		System.out.print("가위(0),바위(1),보(2) 입력:");
		int user=scan.nextInt();
		if(user==0)
			System.out.println("사용자:가위");
		if(user==1)
			System.out.println("사용자:바위");
		if(user==2)
			System.out.println("사용자:보");
		
		if(com==0)
			System.out.println("컴퓨터:가위");
		if(com==1)
			System.out.println("컴퓨터:바위");
		if(com==2)
			System.out.println("컴퓨터:보");
		
		/*
		 *   com         user
		 *   
		 *   com-user
		 *   컴퓨터        사용자
		 *   0(가위)      0(가위)  = 0  (S)
		 *               1(바위)  = -1 (P)
		 *               2(보)   = -2  (C)
		 *   ------------------
		 *   1(바위)      0(가위)  = 1  (C)
		 *               1(바위)  = 0  (S)
		 *               2(보)    = -1 (P)
		 *   ------------------
		 *   2(보)       0(가위)  = 2  (P)
		 *               1(바위) = 1   (C)
		 *               2(보)  = 0   (S)
		 *               
		 *   C ==> -2, 1
		 *   P ==> -1,2
		 *   S ==> 0
		 * 
		 */
		int res=com-user;
		if(res==-2 || res==1)
		  System.out.println("컴퓨터 Win!!");
		if(res==2 || res==-1)
		  System.out.println("사용자 Win!!");
		if(res==0)
			System.out.println("비겼다");
		/*// 결과 출력 
		
		// 0=> 가위  => 가위
		if(com==0 && user==0)
			System.out.println("비겼다");
		//  가위       바위
		if(com==0 && user==1)
			System.out.println("사용자 Win!!");
		// 가위       보
		if(com==0 && user==2)
			System.out.println("컴퓨터 Win!!");
		// 바위
		if(com==1 && user==0)
			System.out.println("컴퓨터 Win!!");
		if(com==1 && user==1)
			System.out.println("비겼다");
		if(com==1 && user==2)
			System.out.println("사용자 Win!!");
		// 보
		if(com==2 && user==0)
			System.out.println("사용자 Win!!");
		if(com==2 && user==1)
			System.out.println("컴퓨터 Win!!");
		if(com==2 && user==2)
			System.out.println("비겼다");*/
	}

}







