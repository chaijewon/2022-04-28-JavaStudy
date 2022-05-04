/*
 *   String : 문자열을 저장하는 데이터형(참조형)
 *            데이터형 / 클래스형(기능) / 확장해서 사용 할 수 없다
 *            => 제공한 그대로 사용 (종단 클래스)
 *            => System,Math
 *   형식) 
 *        String 변수명="문자열";
 *        
 *        => 기능 
 *           equals : (==) => 문자열 자체를 비교 
 */
// 1. 로그인 처리 
// 사용자가 ID,PWD => 저정된 ID,PWD => 
import java.util.*;
public class 선택조건문_3 {
    public static void isLogin()
    {
    	// TODO Auto-generated method stub
    			// 상수 => 반드시 선언에 동시에 초기화 => 변경할 수 없다 
    	        final String MYID="admin";//ADMIN Admin ADmin..
    	        final String MYPWD="1234";
    	        // => JVM에 명령을 내린다 
    	        // 1. 입력값을 받는다 
    	        Scanner scan=new Scanner(System.in);
    	        System.out.print("ID 입력:");
    	        String id=scan.next();//문자열을 읽어 와라 
    	        
    	        System.out.print("비밀번호 입력:");
    	        String pwd=scan.next();
    	        // 2. 처리 
    	        // equalsIgnoreCase : 대소문자 구분없이 비교
    	        // equals:대소문자 구분
    	        if(id.equalsIgnoreCase(MYID) && pwd.equals(MYPWD))
    	        {
    	        	System.out.println(id+"님 로그인되었습니다");
    	        }
    	        else
    	        {
    	        	System.out.println("아이디나 비밀번호가 틀립니다!!");
    	        }
    	        // 3. 처리된 결과 출력 
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 상수 => 반드시 선언에 동시에 초기화 => 변경할 수 없다 
        final String MYID="admin";//ADMIN Admin ADmin..
        final String MYPWD="1234";
        // => JVM에 명령을 내린다 
        // 1. 입력값을 받는다 
        Scanner scan=new Scanner(System.in);
        System.out.print("ID 입력:");
        String id=scan.next();//문자열을 읽어 와라 
        
        System.out.print("비밀번호 입력:");
        String pwd=scan.next();
        // 2. 처리 
        // equalsIgnoreCase : 대소문자 구분없이 비교
        // equals:대소문자 구분
        if(id.equalsIgnoreCase(MYID) && pwd.equals(MYPWD))
        {
        	System.out.println(id+"님 로그인되었습니다");
        }
        else
        {
        	System.out.println("아이디나 비밀번호가 틀립니다!!");
        }
        // 3. 처리된 결과 출력 
	}

}







