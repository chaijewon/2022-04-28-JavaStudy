/*
 *  5)	 B,D,F,H,J,L,N을 출력하는 프로그램을 작성하라 (for 사용)
 *       초기값 : char c='B';
 *       조건식 : c<='N'
 *       증가식 : c+=2;
 *       
 *       A a B b C c D d E e
 */
public class 제어문_문제풀이_5 {
  public static void main(String[] args) {
	  //for(char c='B';c<='N';c+=2)
		 // System.out.print(c+" ");
	  char c='A';
	  for(int i=1;i<=5;i++)
	  {
		  System.out.print(c + " ");
		  System.out.print((char)(c+32)+" ");
		  c++;
	  }
  }
}
