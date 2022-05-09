import java.util.Scanner;

/*
 *   경우의 수 
 *   ------- if , 여러개 (switch) 
 *      경우의 수가 2개 (if~else)
 *      경우의 수가 1개 (if)
 *      경우의 수가 여러개 (2개이상) => if~else if ~ , switch
 *      -----------------------------------------------
 *      가위바위보 
 *        com / player
 *        ----  ------
 *         0-가위
 *         1-바위 
 *         2-보 
 *         => 중첩 switch  (156page)
 *         com   player
 *          가위
 *               가위
 *               바위
 *               보
 *          바위 
 *               가위
 *               바위 
 *               보
 *          보
 *               가위
 *               바위 
 *               보
 *          --------------------- 다중 if , switch
 *          
 */
public class 선택문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        final int 가위=0;//상수 => 변경할 수 없는 값 
        final int 바위=1;
        final int 보=2;
        
        // 1. 컴퓨터 (난수) => 임의로 추출 
        int com=(int)(Math.random()*3); // 0,1,2
        /*           ------------------ 1
         *              0.0~0.99 * 3  ==> 0~2
         *       ---- 2 => 소수점 제외 0~2
         *       
         */
        // 2. 사용자 입력 
        Scanner scan=new Scanner(System.in);
        System.out.print("가위(0),바위(1),보(2):");
        int player=scan.nextInt();
        
        // 결과 출력 
        switch(com)
        {
          case 0:
        	  System.out.println("컴퓨터:가위");
        	  break;
          case 1:
        	  System.out.println("컴퓨터:바위");
        	  break;
          case 2:
        	  System.out.println("컴퓨터:보");
        	  break;
        }
        
        switch(player)
        {
          case 0:
        	  System.out.println("사용자:가위");
        	  break;
          case 1:
        	  System.out.println("사용자:바위");
        	  break;
          case 2:
        	  System.out.println("사용자:보");
        	  break;
        }
        
        // 결과 출력 
        switch(com)
        {
          case 가위:
        	switch(player)
        	{
        	  case 가위:
        		  System.out.println("비겼다!!");
        		  break;
        	  case 바위:
        		  System.out.println("Player Win!!");
        		  break;
        	  case 보:
        		  System.out.println("Compute Win!!");
        		  break;
        	}
        	break;
          case 바위:
        	  // if~else if
        	  /*switch(player)
          	  {
          	  case 가위:
          		  System.out.println("Compute Win!!");
          		  break;
          	  case 바위:
          		  System.out.println("비겼다!!");
          		  break;
          	  case 보:
          		  System.out.println("Player Win!!");
          		  break;
          	  }*/
        	  if(player==가위)
        		  System.out.println("Compute Win!!");
        	  else if(player==바위)
        		  System.out.println("비겼다!!");
        	  else if(player==보)
        		  System.out.println("Player Win!!");
        	break;
          case 보:
        	  switch(player)
          	  {
          	  case 가위:
          		  System.out.println("Player Win!!");
          		  break;
          	  case 바위:
          		  System.out.println("Compute Win!!");
          		  break;
          	  case 보:
          		  System.out.println("비겼다!!");
          		  break;
          	  }
        	break;
        }
        
	}

}







