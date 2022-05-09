// 사용자 입력값을 받아서 => 해당 구구단 출력 
import java.util.Scanner;
/*
 *   1. 초기값 => 시작점 
 *   2. 조건식 => 횟수
 *   3. 증감식 => 초기값을 증가 => 조건이 false
 *   ----------------------------------- 앞(증가) , 뒤(감소)
 *   1~10  => i=1 , i<=10 , i++
 *   10~1  => i=10 , i>=0 , i--
 *   *** char는 연산자를 이용하면 정수형으로 변환 
 *   ----------------------------------- 
 *   for() 줄수 (row)
 *   {
 *     for() column => 출력 
 *     {
 *     }
 *   }
 *   =====> 수열 
 *   
 *   for(int i=1;i<=4;i++)
 *   {
 *      for(int j=1;j<=i;j++)
 *      {
 *         System.out.print("*");
 *      }
 *   }
 *   *
 *   **
 *   ***
 *   ****
 *   
 *   for(int i=1;i<=4;i++)
 *   {
 *      for(int j=1;j<=5-i;j++)
 *      {
 *         System.out.print("*");
 *      }
 *   }
 *   ****
 *   ***
 *   **
 *   *
 *   
 *   줄수 (i)  별표(j)
 *    1        4 ↓  => 더한다    i+j=5 => j=5-i 
 *    2        3
 *    3        2
 *    4        1
 *   
 */
public class 제어문_반복문_for1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("단 입력(2~9):");
        int dan=scan.nextInt();
        for(int i=1;i<=9;i++)//줄수 
        {
        	System.out.printf("%d*%d=%d\n",dan,i,dan*i);
        }
	}

}






