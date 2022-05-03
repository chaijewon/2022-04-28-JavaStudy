
public class 문제풀이3 {
	public static void main(String[] arg) 
	{  
	      int num1, num2;   
	      num1 = 10/3;// 정수/정수=정수 ==> 3 (3.3333(X))
	      // 정수/정수 => 소수점이 지워진다 
	       // '몫' 출력   
	      num2 = 10%3; // 1 => 부호(왼쪽부호가 남는다) 
	       // '나머지' 출력
	   System.out.printf("      몫: %d \n", num1); //3   
	   System.out.printf("나머지: %d \n", num2); //1
	}

}
