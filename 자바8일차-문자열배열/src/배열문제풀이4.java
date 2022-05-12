//10~99까지 정수중에 같은 자리의 정수를 출력하시오(11,22,33,44,55,66,77,88,99)
public class 배열문제풀이4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //1.정수 
		for(int i=10;i<=99;i++)
		{
			int a=i/10;  // 10/10 = 1 11/10 =1...
			int b=i%10;  // 10%10 =0 11%10 =1 
			if(a==b)
			{
				System.out.print(i+" ");
			}
		}
		System.out.println();
		//2.문자열
		for(int i=10;i<=99;i++)
		{
			// 정수를 문자열 변환 => valueOf()
			String s=String.valueOf(i);//"11" "1" "1"
			/*String[] ss=s.split(""); // {"1","1"}
			if(ss[0].equals(ss[1]))
			{
				System.out.print(i+" ");
			}*/
			/*char c1=s.charAt(0);
			char c2=s.charAt(1);
			if(c1==c2)
				System.out.print(i+" ");*/
			String s1=s.substring(0,1);
			String s2=s.substring(1);
			if(s1.equals(s2))
				System.out.print(i+" ");
		}
		//3.char
		System.out.println();
		for(int i=10;i<=99;i++)
		{
			String s=String.valueOf(i);
			char[] c=s.toCharArray();
			if(c[0]==c[1])
				System.out.print(i+" ");
		}
	}

}
