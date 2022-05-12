/*
 *  1) 정수를 10개 저장하는 배열을 만들고 1에서 10까지 범위의 정수를 랜덤하게 생성하여 배열에 저장하라. 그리고 배열에 든 숫자들과 평균을 출력하라.
예) 랜덤한 정수들 : 3 6 3 6 1 3 8 9 6 9 
평균은 5.4
[Hint] 1에서 10까지 범위의 정수를 랜덤하게 생성할 때는 다음 코드를 이용하라.
int i  = (int)(Math.random()*10)+1;


2) 다음과 같이 임의의 정수(5)를 배열로 선언하고 정렬해서 출력하는 프로그램을 작성하시오

3) int[] num = { 94, 85, 95, 88, 90 };

다음 배열에서 최대값,최소값을 출력하는 프로그램을 작성하시오
----------------------------------------------------------배열 
일반 for
4) 10~99까지 정수중에 같은 자리의 정수를 출력하시오(11,22,33,44,55,66,77,88,99)
for
5) 100~999 사이의 4의배수가 아닌 수의 갯수,합을 출력하는 프로그램 작성
for
6) 100~999사이에 7의 배수의 갯수와 합을 출력하는 프로그램 작성
for
7) 1~1000까지에서 7의 배수의 합 ,9의 배수의 합

 */
public class 문제풀이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int i=10;i<=99;i++)
        {
        	// 11/10  1   11%10 =1 
        	/*int a=i/10;
        	int b=i%10;
        	if(a==b)
        	{
        		System.out.print(i+" ");
        	}*/
        	String s=String.valueOf(i);//"10"
        	char[] c=s.toCharArray();
        	if(c[0]==c[1])
        		System.out.print(i+" ");
        	/*String[] ss=s.split("");//String[] => {"1","0"}
        	
        	if(ss[0].equals(ss[1]))
        	{
        		System.out.print(i+" ");
        	}*/
        }
		/*int sum=0;
		int count=0;
		for(int i=100;i<=999;i++)
		{
			if(i%4!=0)
			{
				sum+=i;
				count++;
			}
		}
		System.out.println("합:"+sum);
		System.out.println("갯수:"+count);*/
	}

}
