package com.sist.util;
import java.util.regex.*; // Pattern / Matcher
// => 검색어 
/*
 *   단어패턴 ===> 맛있는 , 맛있게 , 맛있고 .....
 *   정규식 이용 => 맛있+
 *   -------------------- 추천 , 레시피 , 빅데이터 , 선거 => 트위터,페이스북 
 */
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String data="Hello 안녕 welcome 12345 to the this Place";
        if(data.matches(".*welcome.*")) // contains
        {
        	System.out.println("welcome을 포함하고 있다");
        }
        else
        {
        	System.out.println("welcome을 포함하지 않는다");
        }
        System.out.println("=========================");
        if(data.matches(".*[가-힣].*")) //[가-힣] => 한글전체 
        {
        	System.out.println("한글을 포함...");
        }
        else
        {
        	System.out.println("한글이 없다");
        }
        System.out.println("=========================");
        /*
         *   한글 / 영문(소문자,대문자) / 숫자 
         *   [가-힣] [A-Z] [a-z]     [0-9]
         *          -----------
         *          [A-Za-z]
         */
        if(data.matches(".*[A-Za-z].*"))
        {
        	System.out.println("영문이 포함...");
        }
        else
        {
        	System.out.println("영문이 포함 안됨");
        }
        System.out.println("========================");
        if(data.matches(".*[0-9].*")) // => [0-9]{3} , [0-9]{1,5}
        {
        	System.out.println("숫자가 포함");
        }
        else
        {
        	System.out.println("숫자가 포함 안됨");
        }
        /*
         *     맛있+
         *     c[a-z]  => ca cb cc cd cf 
         *     ------  2글자
         *     c[a-z]  => c로 시작 => 2글자 (소문자)
         *     ca cb cf ch ck 
         *     c[a-z]* => c로 시작 => 2글자이상 (0이상)
         *     ca caa cssss cfff cggggggg chh ch
         *     c[a-z]+ => c로 시작 => 3글자이상 (1이상)
         *     ca(X) caaa cdddd ccdcdfdfdfd csddddcd 
         *     c[A-Za-z] => c로시작 => 2글자 (c 뒤에 있는 글자 => 대문자/소문자)
         *     
         *     .* => 모든 문자열 
         *     c. => c로 시작하는 두글자 문자 (. 임의의 문자)
         *      => . (모든 문자 : 숫자,한글 ,영문,특수문자,공백)
         *     c.* => c로 시작하는 문자열 => 기호포함 (두글자 ,여러글자일 수 있다)
         *     c\. => c.와 일치하는 문자열  
         *     --- .(임의의 문장) ==> c.(점 자체) => 기호로 사용한것이 아니고 실제 .
         *     ==> "c* c+ c. ccc cdf css cfff cg"
         *     * , + , . ==> c\\*  c\\+  c\\. => 패턴사용 기호 , 실제 문자(\\)
         *     
         *     c[0-9] ==> 
         *     
         */
	}

}
