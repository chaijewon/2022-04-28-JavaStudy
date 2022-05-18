/*
 *  1~10까지 합을 구하는 메소드 구현
 *    = void => 자체 출력 
 *    = 리턴형 => int
 */
public class 문제2 {
    // 자체 처리 
	static void munje2_1()
	{
		int sum=0;
		for(int i=1;i<=10;i++)
		{
			sum+=i;
		}
		System.out.println("1~10까지 합:"+sum);
	}
	static int munje2_2()
	{
		int sum=0;
		for(int i=1;i<=10;i++)
		{
			sum+=i;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        munje2_1();
        int sum=munje2_2();
        //sum 다시 사용
        System.out.println("1~10까지 합:"+sum);
	}

}
