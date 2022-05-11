/*
 *   break : 반복문을 중단  => 게임 (ESC)
 *   continue : 특정부분을 제외 
 *      1 2 3 4 5 6 7 8 9 10
 *      if(i%2==0)
 *        continue;  => 짝수를 제외하고 출력 
 *        ---------  => 예약일이 아닌 경우를 제외하고 
 *   ==> break : switch , 반복문에서만 사용이 가능 
 *       continue : 반복문에서만 사용이 가능 
 *       ==> 메소드 : return 
 *       -----------------------------------
 *       *** break,continue문장은 자신의 반복문만 제어 할 수 있다 
 *       for() // break와 상관 없다
 *       {
 *          for() // break로 제어가 가능 
 *          {
 *             break;
 *          }
 *          break;
 *       }
 */
public class 제어문_반복제어문_break_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // break; 
		for(int i=1;i<=10;i++)
		{
			if(i==5)
				break;// for을 종료한다 
			System.out.println("i="+i);
			//break;//{}안에서 마지막 코딩 
		}
		System.out.println("=== continue ===");
		for(int i=1;i<=10;i++)
		{
			// 2 ==> 출력하지 않고 증가식 => 3
			if(i==3 || i==4 || i==5)
				continue; // 짝수를 제외하고 나머지는 출력한다
			// MVC구조 (핵심)  
			System.out.println("i="+i);
			
		}
	}

}







