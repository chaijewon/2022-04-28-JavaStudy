// 알파벳을 받는다 => 대소문자 구분하는 조건 
/*
 *   char c='';
 *   c>='A' && c<='Z'   
 *         ---- 포함 
 *   c<'A' || c>'Z' 
 *         ---- 범위 포함이 안된 경우 ==> 오류처리 
 */
import java.util.Scanner;
public class 자바조건문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        //                       ---------- 키보드 입력 
        System.out.print("알파벳 입력:");
        // Scanner의 단점 => 문자를 받을 수 없다 (문자열)
        String alpha=scan.next();
        // 문자열 => 문자  1개 추출 => charAt()
        char c=alpha.charAt(0);
        
        // 조건에 맞을경우에 출력 => if => 정규식 [A-Z] [a-z] [가-힣]
        if(c>='A' && c<='Z')
        	System.out.println(c+"는(은) 대문자입니다");
        if(!(c>='A' && c<='Z'))//else if(c>='a' && c<='z')
        	System.out.println(c+"는(은) 소문자입니다");
        
        
	}

}
