// = 57page
/*
 *   0x , 0 , 0b
 *   ***** 특수문자 
 *     = \t  => tab (일정 간격)
 *     = \n  => new line (다음줄에 출력)
 *     = \\  => 경로 ( \\ => \ )
 *     = \"  => "  출력 
 *     -------------------------- File입출력(다운로드/업로드)
 *     
 *   59page : 인코딩(byte형 변환) => getBytes() / 디코딩 (UTF-8)
 *            'A' =====> 65
 *                 인코딩 
 *            'A' <===== 65
 *                  디코딩 
 *         https://www.google.com/search?q=%EC%9E%90%EB%B0%94&oq=%EC%9E%90%EB%B0%94&aqs=chrome..69i57j0i433i512j0i131i433i512j0i512j0i131i433i512j0i512l5.1166j0j15&sourceid=chrome&ie=UTF-8
 *              인코딩 
 *         자바 ======> %EC%9E%90%EB%B0%94
 *                             디코딩 
 *         %EC%9E%90%EB%B0%94 ======> 자바
 *         => 브라우저 (1byte) => Java(2byte)
 *         
 *  66page 오버플로우 (저장범위 벗어난다)
 *         byte b=(byte)380 ==> 
 *         
 *  74page 형변환 ==> 데이터형을 변경해서 사용 
 *         자동 형변환  : upcasting (데이터형이 커진다)
 *         강제 형변환  : downcasting (데이터형을 낮게)
 *         
 *             <---------------
 *         byte < char < int < long < double
 *             --------------> 
 *             
 *         예) int a='A';
 *                  ----
 *                   65     => 'A'=>65
 *                             char int  => a=65
 *             long a=10;   => 10 => 10L 
 *                    ---      int  long   a=10L
 *                     10L
 *             double d=10; 
 *                      ---
 *                      int => double  => 10.0
 *                      
 *         10+10.5 ==> 20.5 (연산은 같은 데이터형만 연산이 가능)
 *         int double
 *         ---
 *         10.0
 *         10.0+10.5 
 *         
 *         'A'+1
 *         char int 
 *         ----
 *          65 + 1 ==> 66
 *          
 *         int 이하 ==> byte,short,char는 연산처리시 결과은 int
 *         byte+byte=int
 *         char+char=int
 *         btye+char=int 
 *         
 *         10.5 => int
 *         (int)10.5  => 10 (실수를 정수로 변환 => 소수점은 사라진다)
 *         (int)'A' ==> 65
 *         
 *         
 *     75page ==> char ==> int
 *             double  ==> int 
 *       ========================
 *        int => char  (char)66  ===> 'B'
 *       ========================
 *        char => int  (int)'A'  ===> 65
 *       ========================
 *        double => int  (int)10.5 ==> 10
 *       ========================
 *        int  => double  (double)10 ==> 10.0
 *       ========================
 *       
 *        특별한 경우 ==> 파일입출력 / 네트워크 ==> byte
 *        그외 :  int / long을 사용 
 *        실수형 => double 
 *        문자보다는 문자열을 더 많이 사용 
 *        ============================
 *        int , long , double , String
 *      
 *             
 */
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.print("Hello\tJava\t문법\n");
        System.out.print("Hello\n");
        System.out.print("Java\n");
        System.out.print("\"Hello Java\"\n");//인용부호 
        System.out.print("c:\\javaDev\\javaStudy");
        byte b1=10;
        byte b2=100;
        int b3=b1+b2;
	}

}
