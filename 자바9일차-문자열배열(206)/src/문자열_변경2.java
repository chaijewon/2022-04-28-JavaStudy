// 소문자 변환 , 문자열 => char[]
import java.util.Arrays;
import java.util.Scanner;
public class 문자열_변경2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("알파벳 입력:");
        String data=scan.next();
        System.out.println("원본:"+data);
        // 소문자 변환 
        // 대소문 => 소문자 , 소문자는 그대로 출력 (알파벳에서만 적용)
        String data_change=data.toLowerCase();
        System.out.println("변경:"+data_change);
        // char[]로 변환 
        char[] arr=data_change.toCharArray();
        /*for(char c:arr)
        {
        	System.out.print(c+" ");
        }*/
        System.out.println(Arrays.toString(arr));
	}

}
