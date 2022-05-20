// => 실수값을 받아서 출력
// 입력 / 출력 
/*
 *   1. 입력 
 *   ------
 *   2. 출력 
 *   ------
 */
import java.util.Scanner;
public class 메소드정리_2 {
    static double input()
    {
    	Scanner scan=new Scanner(System.in);
    	System.out.print("실수 입력:");
    	return scan.nextDouble();
    }
    static void output(double d)
    {
    	System.out.println("입력받은 실수값:"+d);
    }
    static void process() // 메소드를 조립 
    {
    	double d=input();
    	output(d);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 실행 위치
		process();
	}

}
