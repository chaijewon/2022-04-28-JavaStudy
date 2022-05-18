/*
 *  문자열을 거꾸로 출력하는 메소드 구현
 */
import java.util.*;
public class 문제6 {
    static void change()
    {
    	Scanner scan=new Scanner(System.in);
    	System.out.print("문자열 입력:");
    	String ss=scan.nextLine();
    	String res="";
    	for(int i=ss.length()-1;i>=0;i--)
    	{
    		res+=ss.charAt(i);
    	}
    	System.out.println(res);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        change();
	}

}
