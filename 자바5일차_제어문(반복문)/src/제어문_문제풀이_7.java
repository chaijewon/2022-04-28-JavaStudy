/*
 *  7)	 1부터 30까지의 정수에서 짝수만 한 줄에 3개씩 출력하라
 *  
 *  for => 156~157page
 *  
 */
public class 제어문_문제풀이_7 {

	public static void main(String[] args) {
		int j=0;//3개씩 나눠주는 변수 
		for(int i=2;i<=30;i+=2)
		{
			if(j%3==0 && j!=0)
				System.out.println();
			
			System.out.printf("%2d\t",i);
			j++;
		}
	}

}
