//  입력 / 처리 / 출력 
//  처리 => 세분화 
//  두개의 정수 입력 => 최대값을 처리 => 최대값을 받아서 출력 
import java.util.Scanner; // 변수,메소드 
public class 메소드정리_6 {
    // 입력 
	static int input(String msg)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print(msg+" 입력:");
		return scan.nextInt();
	}
	// 처리 
	static int max(int a,int b)
	{
		return a<b?b:a;
	}
	// 출력 
	static void output(int max)
	{
		System.out.println("최대값:"+max);
	}
	// 조립 
	static void process()
	{
		int a=input("첫번째 정수");
		int b=input("두번째 정수");
		
		int m=max(a,b);
		
		output(m);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        process();
	}

}
