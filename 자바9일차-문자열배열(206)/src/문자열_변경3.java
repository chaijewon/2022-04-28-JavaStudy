// replace / replaceAll 
public class 문자열_변경3 {
    //String => 웹 , AI(데이터마이닝)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String data="Hello String";// => Hekko
        String data_change=data.replace('l', 'k');
        System.out.println("data="+data);
        System.out.println("data_change="+data_change);
        String data_change2=data.replace("String", "Java");
        System.out.println("data_change2="+data_change2);
        // replace => 문자 1, 문자열 자체 변경
        /*
         *    replaceAll => 정규식 (regex) : 문자의 패턴 
         *    
         */
        String[] strData= {
        	"Hello 1234",
        	"Java? Data",
        	"한글 자바 $",
        	"12345 . data",
        	"1234Java한글",
        	"AAA|BBB",
        	"한글^Data"
        };
        /*
         *    ^ (startsWith): 시작  ^[가-힣] => 한글로 시작한 문자열 
         *             ^[A-Z] => 알파벳 대문자 시작 
         *             ^[a-z] => 소문자 시작 
         *             ^[0-9] => 숫자 시작 
         *             --------------------------
         *             [^가-힣] => 한글을 제외
         *    $ (endsWith): 끝
         *              [A-Z]$ => 끝나는 문자열 대문자 
         *    . : 임의의 문자 
         *    + : ABC+  => ABC다음에 1개이상의 문자를 포함 
         *        맛있는 맛있고 맛있게 ....
         *        맛있+
         *    * : ABC* => ABC다음에 0개이상의 문자를 포함 
         *    | : 선택(둘중에 한개 선택)
         *    
         *    ========== 문자 자체를 읽어 올때는 \\기호 
         *    => 추천 용도 , 챗봇 
         *    => 1. replaceAll => 데이터 수집 (크롤링) => 주로
         *       2. split
         */
        for(String ss:strData)
        {
        	String s=ss.replaceAll("\\$", "");
        	System.out.println(s);
        }
	}

}







