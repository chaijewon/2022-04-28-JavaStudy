/*
 *    1. 문자열을 입력 받는다 
 *    2. 좌우대칭여부 확인 
 *       ABBA 
 *       ABBBA
 */
import java.util.Scanner;
public class 제어문_반복문예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("문자열 입력:");
        String data=scan.next();
        // 오류 처리 => 오류 처리가 불가능 (예외처리 try~catch)
        if(data.length()%2!=0)
        	System.out.println("잘못된 입력입니다!!");
        else
        {
        	boolean bCheck=false;
        	for(int i=0;i<data.length()/2;i++)
        	{
        		/*
        		 *    ABBBBA
        		 *    012345
        		 *       ---
        		 *    0-5
        		 *    1-4
        		 *    2-3
        		 */
        		char c1=data.charAt(i);
        		int j=data.length()-1;
        		char c2=data.charAt(j-i);
        		if(c1!=c2)
        		{
        			bCheck=true;
        			break;
        		}
        		
        	}
        	if(bCheck==true)
        	{
        		System.out.println(data+" 문자열은 좌우대칭이 아닙니다");
        	}
        	else
        	{
        		System.out.println(data+" 문자열은 좌우대칭입니다");
        	}
        }
	}

}
