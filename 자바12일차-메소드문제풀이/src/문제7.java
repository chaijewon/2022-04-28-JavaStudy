// 정수를 한글로 바꿔주는 메소드 구현 , 한글 => 정수 
import java.util.Scanner;
public class 문제7 {
	// 정수 => 한글로 출력 (예 => 1024 일공이사) => charAt
	/*
	 *    102490990909090 
	 *    => 1024/1000
	 *    => (1024%1000)/100
	 *    => 
	 *    "1024" => '1' '0' '2' '4'
	 *     0123
	 */
    static void change()
    {
    	String h="공일이삼사오육칠팔구";
    	Scanner scan=new Scanner(System.in);
    	System.out.print("정수 입력:");
    	int num=scan.nextInt();
    	//문자열 변환 
    	String strNum=String.valueOf(num);
    	String result="";
    	//System.out.println(1);
    	//System.out.println((int)'1');
    	for(int i=0;i<strNum.length();i++)
    	{
    		char c=strNum.charAt(i);
    		//System.out.print(c+" ");
    		result+=h.charAt(c-48); // '1'=> 49 '2'=>50
    		// '0' =48  => '1'-'0' => 1
    	}
    	System.out.println(result);
    }
    // 한글 => 정수   (예 일이삼오 => 1235)
    /*
     *   문자열 / 배열 => 인덱스 
     *   -----
     *   배열 => char[]
     */
    static void change2() 
    {
    	String h="공일이삼사오육칠팔구";
    	//        0 12 34 5 6789
    	Scanner scan=new Scanner(System.in);
    	System.out.print("문자열 입력:");
    	String s=scan.next();
    	String result="";
    	for(int i=0;i<s.length();i++)
    	{
    		for(int j=0;j<h.length();j++)
    		{
    			if(s.charAt(i)==h.charAt(j))
    			{
    				result+=j;// 인덱스번호 찾기 
    			}
    		}
    	}
    	System.out.println(result);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        change2();
	}

}
