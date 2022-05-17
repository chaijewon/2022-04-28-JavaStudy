// 로그인 처리 => id,pwd
import java.util.Scanner;
// 중첩 if 
/*
 *   리턴형 : 경우의 수 
 *   경우의 수 => String , int  
 *   ID가 없는 경우
 *   비밀번호가 틀린 경우
 *   로그인 경우 
 */
public class 메소드제작_5 {
    static String isLogin(String id,String pwd)
    {
    	//1.id 존재여부 
    	//2.id있는 경우(비밀번호) / 없는 경우 
    	final String MYID="admin";
    	final String MYPWD="1234";
    	String result="";
    	if(MYID.equalsIgnoreCase(id))
    	{
    		// 대소문 구분없이 비교 : equalsIgnoreCase
    		// Admin , ADMIN 
    		if(MYPWD.equals(pwd))
    		{
    			// 대소문자 구분 : equals
    			result="로그인되었습니다 메인화면으로 이동";
    		}
    		else
    		{
    			result="비밀번호가 틀립니다";
    		}
    	}
    	else
    	{
    		result="아이디가 존재하지 않습니다";
    	}
    	return result;
    }
    static void process()
    {
    	Scanner scan=new Scanner(System.in);
    	System.out.print("아이디 입력:");
    	String id=scan.next();
    	
    	System.out.print("비밀번호 입력:");
    	String pwd=scan.next();
    	
    	String res=isLogin(id, pwd);
    	System.out.println(res);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        process();
	}

}
