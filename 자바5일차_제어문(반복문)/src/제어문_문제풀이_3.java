/*
 * 3)	 2+4+6+....100까지의 정수의 합을 구하고 출력하라 (for 사용)
 */
public class 제어문_문제풀이_3 {

	public static void main(String[] args) {
	   for(int i=2;i<=100;i++)//증가 2씩 
	   {
		   if(i%2==0)
		    System.out.print(i+" ");
	   }
	   System.out.println();
	   for(int i=2;i<=100;i+=2)//증가 2씩 
	   {
		    System.out.print(i+" ");
	   }
	}

}
