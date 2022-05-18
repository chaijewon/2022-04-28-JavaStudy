/*
 * 1~n까지 합을 구하는 메소드 구현
 * -------------------------
 *   자체 처리 (void)
 *   n=> 전송 => 결과값을 받아서 출력 
 *   - 매개변수   ----- 리턴형
 */
import java.util.Scanner;
public class 문제3 {
    static void munje3_1()
    {
    	Scanner scan=new Scanner(System.in);
    	System.out.print("정수 입력:");
    	int n=scan.nextInt();
    	
    	int sum=0;// 합 누적
    	for(int i=1;i<=n;i++)
    	{
    		sum+=i;
    	}
    	System.out.println("1~"+n+"까지 합:"+sum);
    }
    static int munje3_2(int n)
    {
    	int sum=0;// 합 누적
    	for(int i=1;i<=n;i++)
    	{
    		sum+=i;
    	}
    	return sum;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        munje3_1();
        Scanner scan=new Scanner(System.in);
        System.out.print("정수 입력:");
        int n=scan.nextInt();
        int sum=munje3_2(n);
        System.out.println("1~"+n+"까지 합:"+sum);
        
	}

}
