/*
 *   변수 선언 , 초기값 
 *   1. 변수 선언 => 메모리 공간 확보 
 *      데이터형 변수명; => 메모리 한개를 만들어라 
 *      -----------
 *   2. 변수가 많은 경우 
 *      int a,b,c,d,e...
 *   3. 선언에 동시에 초기화 
 *      int a=10;
 *      int a;
 *      a=10;
 *      
 *      int a=10,b=20,c=30;
 *      1) 데이터형이 동일 
 *   4. 미리선언된 값을 가지고 올 수 있다 
 *      int a=10;
 *      int b=a;
 *      int c=a+10;
 */
public class 문제풀이1 {
	public  static void main(String[] arg) 
	{  
	   int a;   
	   int b; 
	   //int a,b;
	   a=3;   
	   b=a+5;    
	   // 3+5 ==> b=8
	   System.out.printf("a의 값: %d \n", a); // 3   
	   System.out.printf("b의 값: %d \n", b); // 8
	}

}
