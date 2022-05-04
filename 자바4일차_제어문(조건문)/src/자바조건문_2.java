// 1. 1~100사이의 정수를 입력 => 3,5,7,9여부 확인 
import java.util.Scanner;
public class 자바조건문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("정수 입력:");
        int num=scan.nextInt();
        
        if(num%3==0)
        	System.out.println(num+"는(은) 3의 배수입니다");
        if(num%5==0)
        	System.out.println(num+"는(은) 5의 배수입니다");
        if(num%7==0)
        	System.out.println(num+"는(은) 7의 배수입니다");
        if(num%9==0)
        	System.out.println(num+"는(은) 9의 배수입니다");
        if(num%3!=0 || num%5!=0 || num%7!=0 || num%9!=0)
        {
        	System.out.println("배수가 없다!!");
        }
	}

}
