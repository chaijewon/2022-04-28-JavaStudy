
public class 문제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data="홍길동?이순신?심청이?강감찬?춘향이";
        String[] names=data.split("\\?");
        //data.replace(0, 0)
        //data.replaceAll(data, data)
        // String[] java.lang.String.split(String regex)
        // 매개변수 => String regex
        /*
         *   정규식 
         *   -----
         *    [] => 범위  [A-Z] , [A-C] , [A|B]
         *    {} => 갯수  [A-Z]{2} AB AC AD
         *               [A-Z]{1,3} => A , AB , ABC
         *               [0-9]{1,3} => 1 , 10, 100 
         *    ^  => 시작  ^[가-힣]
         *               [^가-힣] 제외 
         *    SQL => 가을 , 봄 , 겨울 , 여름 
         *    WHERE data LIKE '%가을%' 
         *       OR data LIKE '%봄%'
         *       OR data LIKE '%겨울%'
         *       OR data LIKE '%여름%'
         *    WHERE REGEXP_LIKE(data,'가을|봄|겨울|여름')
         *    . : 임의의 문자(한글자)
         *    $ : 끝나는 문자  [0-9]$ => 숫자로 끝나는 문자 
         *    + : 1글자 이상 
         *    * : 0글자 이상 
         *    ? : 
         *    | : 선택 
         *    ---------------------------- XML (DTD)
         *    <!ELEMENT tr (th|td)*>
         */
        for(String name:names)
        {
        	System.out.println(name);
        }

	}

}
