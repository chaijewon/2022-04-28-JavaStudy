// UPDOWN => break/continue
import java.util.Scanner;
public class 제어문_문제_while2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        
        // 컴퓨터에서 난수 발생 (1~100)
        int com=(int)(Math.random()*100)+1; 
        while(true)
        {
        	// 입력값 받기 
        	System.out.print("1~100 사이의 정수 입력:");
        	int user=scan.nextInt();
        	//오류 처리 => 웹 (유효성 검사) 
        	if(user<1 || user>100)
        	{
        		System.out.println("잘못된 입력입니다!!");
        		continue; // while 처음으로 돌아간다 
        	}
        	
        	// 결과값 
        	if(com>user)
        	{
        		System.out.println("입력값보다 큰 값 입력!!");
        	}
        	else if(com<user)
        	{
        		System.out.println("입력값보다 작은 값 입력!!");
        	}
        	else
        	{
        		System.out.println("Game Over!!");
        		break; // 게임 종료 => while을 종료 
        	}
        	
        }
        
        
	}

}
