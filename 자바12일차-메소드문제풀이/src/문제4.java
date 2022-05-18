/*
 *  두 정수를 나눗셈 결과를 구해주는 메소드 구현
 *  => 자체 처리 
 *  => 리턴형/매개변수
 */
import java.util.Scanner;
public class 문제4 {
	// 매개변수 다르면 => 다른 메소드로 인식 (오버로딩)
    static void munje4()
    {
    	Scanner scan=new Scanner(System.in);
    	System.out.print("두개의 정수 입력(10 20):");
    	int num1=scan.nextInt();
    	int num2=scan.nextInt();
    	
    	if(num2==0)
    		System.out.println("0으로 나눌 수 없다");
    	else
    		System.out.printf("%d/%d=%.2f\n",num1,num2,num1/(double)num2);
    }
    static String munje4(int a, int b)
    {
    	String result="";
    	if(b==0)
    		result="0으로 나눌 수 없다";
    	else
    		result=String.format("%d/%d=%.2f\n",a,b,a/(double)b);
    	return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        munje4();
        Scanner scan=new Scanner(System.in);
        System.out.print("두개의 정수 입력(10 20):");
    	int num1=scan.nextInt();
    	int num2=scan.nextInt();
    	String result=munje4(num1, num2);
    	System.out.println(result);
    	
        
	}

}
