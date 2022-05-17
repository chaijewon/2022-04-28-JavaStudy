/*
 *   리턴형 / 매개변수 
 *   메소드 제작 방식 
 *   ------------
 *   ------------------------------
 *       리턴형      매개변수 => 사용자가 요청한 값 (여러개의 데이터를 전송)
 *       -----            *** 3개이상이면 => 배열/클래스
 *        기본데이터형 포함 
 *        배열
 *        클래스 
 *        => 한개만 설정이 가능
 *   ------------------------------
 *        O          O
 *           String substring(int s ,int e)
 *           int indexOf(String s)
 *   ------------------------------
 *        O          X
 *           double random()
 *           String trim()
 *           String toUpperCase()
 *   ------------------------------
 *        X          O  =============> 리턴형(결과값이 없는 경우)
 *                      자체에서 처리 => void
 *                      데이터베이스에서 주로 사용 
 *                      INSERT , UPDATE , DELETE
 *           void main(String[] arg)
 *   ------------------------------
 *        X          X (사용빈도가 거의 없다)
 *   ------------------------------
 *   메소드 : 객체지향프로그램 (클래스 연관 관계) => 필요시 메소드 가능하게 만든다 
 *          클래스  <======> 클래스 
 *                  메세지(메소드 호출)
 *          자판기  <======>  사람 
 *          -------------------
 *        브라우저  <======>  게시판 <=====> 오라클
 *        행위 => 메소드 
 *        ------------
 *         1. 재사용 
 *         2. 반복 제거 
 *         3. 수정,추가 쉽게 => 구조적 프로그램 
 *         -----------------------------
 *         
 *         형식)
 *              [접근지정어] [옵션] 리턴형 메소드명(매개변수)=> 원형(선언)
 *              public    static 
 *              protected abstract
 *              private   final 
 *              default 
 *              {
 *                 구현
 *              }
 *   사용자로부터 아이디를 받아서 중복체크하는 메소드 원형을 작성하시오
 *                                 --------- 선언 
 *       static boolean idCheck(String id)
     우편번호를 검색하는 메소드 원형을 작성하시오
         static String[] postfind(String dong)
     2단에서 9단까지 구구단을 출력하는 메소드 원형을 작성하시오
                        ---
         static void gugudan()
 */
import java.util.Scanner;
public class 문제1 {
    static boolean idCheck(String id)
    {
    	boolean bCheck=false;
    	String[] ids={"hong","kim","lee","shim","park"};
    	for(String s:ids)
    	{
    		if(s.equals(id))
    		{
    			bCheck=true;
    			break;
    		}
    	}
    	return bCheck;
    }
    static void process()
    {
    	Scanner scan=new Scanner(System.in);
    	System.out.print("아이디 입력:");
    	String id=scan.next();
    	
    	boolean bCheck=idCheck(id);
    	if(bCheck==true)
    	{
    		System.out.println("이미 사용중인 아이디입니다");
    	}
    	else
    	{
    		System.out.println("사용 가능한 아이디입니다");
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        process();
	}

}








