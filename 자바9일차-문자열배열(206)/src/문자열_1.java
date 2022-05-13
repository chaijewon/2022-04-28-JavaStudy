// 206page 
/*
 *   String : 문자열을 저장하는 데이터형 
 *   ------- 
 *     = Call By Value => 일반변수 (일반 값) 
 *     = Call By Reference => 클래스/배열 (참조변수) => 주소를 이용하는 프로그램
 *                           -----String :일반 데이터 취급한다 
 *     = 클래스 => 상속을 받아서 변경할 수 없다 (있는 그대로 사용) 
 *       public final class String 
 *              -----       System/Scanner/Math
 *   => char[]을 이용한 기능을 제공 
 *      ------ 
 *      
 *   => class => 기본형 데이터를 여러개 모아서 관리 (다른 데이터형)
 *      class / method => 변수/연산자/제어문/배열 
 *      
 *   => String 
 *      1) 저장 방법 
 *         => String 변수명=""; => 대부분사용  int a=10;
 *         => String 변수명=new String("","UTF-8"); => 변환 (한글 변환)
 *               
 *      2) 문자열 제어 (자바에 제공하는 기능(메소드))
 *         1. 문자갯수 
 *            length():int
 *            String s="Hello";
 *            s.length() => 5
 *            String s="홍길동";
 *            s.length() => 3
 *         2. 문자 자르기 
 *            substring(int s):String
 *            substring(int s,int e):String
 *            "0123456789" => 문자열 0번부터 char[]
 *            substring(5) ==> 56789
 *            substring(2,7) ==> 23456 
 *                        -- -1 (7은 제외)
 *            1) 메소드명 => 기능
 *            2) 결과값 
 *            3) 어떤 데이터를 첨부 
 *            --------------
 *                    매개변수 => 사용자 요청값 
 *            indexOf(String s):int(리턴형)
 *            lastIndexOf(String s):int
 *            String s="Hello Java";
 *                      0123456789
 *            s.indexOf("e") ==> 1
 *            s.indexOf("a") ==> 7
 *            
 *            ***s.lastIndexOf("a") => 9 => 폴더(탐색기,웹주소(URL))
 *            
 *            --------------
 *         3. 공백 제거 
 *            trim():String => 좌우의 공백 제거 
 *            String s=" Hello Java "
 *                      01234567891011
 *            s.trim() => "Hello Java"
 *            s.replace(" ",""):String ==> 가운데 공백 제거 
 *            String s="1234Hello한글Java123"
 *            ***s.replaceAll("[^가-힣]","") ==> 문자패턴(정규식)
 *                숫자 : [0-9] , 알파벳 : [A-Za-z]
 *         4. 단어별 구분해서 저장 
 *            split(String s):String[]
 *            String s="red,blue,green,black,pink"
 *            String[] color=s.split(",")
 *            color[0]="red" color[1]="blue"....
 *            
 *            String s="ABCDE";
 *            String[] ss=s.split("");
 *            {"A","B","C","D","E"}
 *         5. 문자 변경
 *            replace(String s1,String s2):String
 *            String s="Hello Java";
 *            s.replace("a","b");
 *                 => Hello Jbvb
 *                 => URL주소를 오라클에 저장 
 *                    a.jsp?name=aaa&pwd=bbb
 *            https://mp-seoul-image-production-s3.mangoplate.com/619788_1607761914172812.jpg?fit=around|512:512(&)crop=512:512;*,*(&)output-format=jpg(&)output-quality=80
 *            & => scanner   => ^                                                                                                               
 *            replaceAll(String s1,String s2):String => 정규식
 *                       [가-힣] , [0-9] , [A-Z]
 *            toUpperCase():String : 대문자
 *             String s="hello"
 *             s.toUpperCase() => HELLO
 *            toLowerCase():String : 소문자
 *             String s="HELLO"
 *             s.toLowerCase() => hello
 *         6. 모든 데이터형을 문자열 변경 
 *            valueOf(기본형):String 
 *            valueOf(1) => "1"
 *            valueOf(true) => "true" 
 *         7. 비교 ==> if에서 주로 사용 
 *            equals():boolean : 문자열 비교 
 *            contains():boolean : 포함한 문자
 *            startsWith():boolean : 시작 문자열 
 *            endsWith():boolean : 끝 문자열
 *        -------------------------------------- (+) , ||
 *            
 */
public class 문자열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="0123456789";
        
        System.out.println(s.substring(0, 7));
        /*
         *  "hamburger".substring(6) returns "urge"
         *   012345678
            "smiles".substring(1, 5) returns "mile"
             012345

         */
        String s1="1234Hello한글Java123";
        //String res=;
        System.out.println(s1.replaceAll("[^가-힣]",""));
        
        String s2="홍길동,심청이,춘향이,이순신,박문수";
        String[] ss=s2.split(",");
        for(String sss:ss)
        {
        	System.out.println(sss);
        }
	}

}









