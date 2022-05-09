// UPDOWN게임 
/*
 *   1. 난수 => 1~100사이의 임의 수 발생 
 *   2. 사용자가 입력을 해서 => 난수를 맞추는 게임 
 *      => 힌트 
 *         UP ==> 입력값보다 큰 값 
 *         DOWN => 입력값보다 작은 값 
 *         
 *    예)
 *        78 (com)
 *        
 *        사용자 입력 : 70  => UP
 *                   80  => DOWN
 *        => 몇번 입력 ? (횟수) => 맞출때까지 => 무한루프 
 *        for(;;) => 종료없이 계속 수행 
 */
import java.util.Scanner;
public class 제어문_반복문_for3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        // 난수 발생 
        int com=(int)(Math.random()*100)+1; //1~100
        //      ------------------------
        //       0~99  +1   1~100
        for(;;)// 무한루프 (반복을 종료하지 않고 반복) => while(true)
        	// 종료시점을 준다 
        {
        	// 사용자 입력값 받기 
        	System.out.print("1~100까지 사이의 정수 입력:");
        	int user=scan.nextInt();
        	if(com>user)
        		System.out.println("입력한 값보다 큰값 입력");
        	else if(com<user)
        		System.out.println("입력한 값보다 작은 값 입력");
        	else
        	{
        		// 맞는 경우에 종료 
        		System.out.println("Game Over!!");
        		break;//종료시에 사용하는 명령어 
        		// System.exit(0) => 프로그램 종료 
        	}
        }
	}

}
