/*
 *   ☆
 *   ☆☆
 *   ☆☆☆
 *   ☆☆☆☆
 *   
 *   줄수(i)   별표(j)
 *    1         1      ==> i==j  => j=i
 *    2         2
 *    3         3
 *    4         4
 *   
 *   ☆☆☆☆
 *   ☆☆☆
 *   ☆☆
 *   ☆
 *   
 *   줄수(i)   별표(j)
 *    1         4  ↓    ==> i+j=5  => j=5-i
 *    2         3
 *    3         2
 *    4         1
 *    
 *   입력한 갯수만큼 출력 => 7
 *   ☆
 *   ☆☆
 *   ☆☆☆
 *   ☆☆☆☆
 *   ☆☆☆☆☆
 *   ☆☆☆☆☆☆
 *   ☆☆☆☆☆☆☆
 *   
 *   
 */
import java.util.Scanner;
public class 제어문_반복문_for5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		int num=scan.nextInt();
        for(int i=1;i<=num;i++)
        {
        	for(int j=1;j<=(num+1)-i;j++)
        	{
        		System.out.print("★");
        	}
        	System.out.println();
        }
	}

}
