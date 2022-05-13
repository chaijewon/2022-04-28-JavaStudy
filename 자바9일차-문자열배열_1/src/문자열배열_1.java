import java.util.Arrays;

/*
 *   문자  ==> 1개  => ''
 *   문자열 ==> 여러개 => ""
 *   ---- 여러개를 모아서 관리 문자열 배열 
 *   ---- String
 *   1) 선언 방식 
 *      String[] 배열명={"","","","",""}
 *      String[] 배열명=new String[10]; 
 *                    ----
 *                    기본 디폴트가 설정 
 *                    new int[5] => 0,0,0,0,0
 *                    new double[5]=> 0.0.....
 *                    new long[5] => 0L....
 *                    new boolean[5] => false...
 *                    new String[5] => null...(주소값이 없는 경우)
 *                       모든 참조변수의 default => null
 *                          ------- 클래스 , 배열 (주소를 통해서 값을 가지고 온다)
 *                                  -----
 *     int[] arr; => null
 *     ---------- 
 *     int[] arr=new int[5];
 *     int[] arr1=arr; //참조 
 */
public class 문자열배열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 배열선언 
		String[] loc={"서울","부산","경기","인천","강원","제주"};
		// 외부에서도 가지고 올 수 있다 
		// 출력
		for(String s:loc)//향상된 for = 출력용으로 사용 
		{
			System.out.print(s+" ");
		}
		// String 클래스 => char[]에 필요한 메소드 char* -> 
		// int   => Integer
		// double => Double 
		// 각 데이터형마다 사용하기 쉽게 => 클래스 (Wrapper)
		String s="ABCDEFGH";
		// charAt() , split() toCharArray()
		String[] ss=s.split("");
		System.out.println("ss="+Arrays.toString(ss));
		
		for(int i=0;i<s.length();i++)
		{
			System.out.print(s.charAt(i)+" ");
		}
		
		char[] c=s.toCharArray();
		System.out.println("c="+Arrays.toString(c));
		
		char[] cc={'일','월','화','수','목','금','토'};
		String sss=new String(cc);
		System.out.println(sss);
		String sss2=String.valueOf(cc);
		System.out.println(sss2);
		
		// char[] <==> String 
        
	}

}






