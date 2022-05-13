// 문자열 변경 => toUpperCase , toLowerCase , replace , replaceAll
import java.util.Scanner;
public class 문자열_변경 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // toUpperCase : 대문자 변환
		Scanner scan=new Scanner(System.in);
		System.out.print("알파벳 문자열 입력:");
		String data=scan.next();
		// 문자열 => 원본은 변경되지 않는다
		String data_change=data.toUpperCase();
		// 기능 수행후 결과값 새로운 문자열로 만든다 
		System.out.println(data_change);
		System.out.println(data);
		
		int count=0; // 'A'가 몇개 포함 
		/*
		 *   charAt(int):char
		 *   "Hello"
		 *    01234
		 *    
		 *    charAt(1) => 'e'
		 */
		for(int i=0;i<data_change.length();i++)
		{
			// 문자열을 한개씩 가지고 온다 : charAt(index)
			char c=data_change.charAt(i);
			if(c=='A')
				count++;
		}
		System.out.println("A의 갯수는 "+count);
	}

}
