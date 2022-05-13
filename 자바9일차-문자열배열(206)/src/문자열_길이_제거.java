// length => for에서 주로 사용 
// trim() => 좌우의 공백만 제거 => 사용자 space
// 유효성 검사 
import java.util.Scanner;
public class 문자열_길이_제거 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // MMS => 오라클 / MySQL => 데이터베이스 (글자지정) 
		Scanner scan=new Scanner(System.in);
		System.out.print("문자열 입력:");
		String data=scan.next();
		System.out.println("data="+data);
		System.out.println("문자의 갯수:"+data.length());
		// if(data.length()<1) => 입력이 안된 경우 
		String s="Hello";
		String s1=" He llo ";
		System.out.println(s.length()+","+s1.trim().length());
		
	}

}
