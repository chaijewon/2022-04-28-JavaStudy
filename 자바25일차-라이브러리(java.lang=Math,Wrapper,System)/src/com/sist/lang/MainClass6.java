package com.sist.lang;

public class MainClass6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String poster="https://mp-seoul-image-production-s3.mangoplate.com/260397/676229_1615030605215_"
        		+ "60712?fit=around|512:512#crop=512:512;*,*#output-format=jpg#output-quality=80^ht"
        		+ "tps://mp-seoul-image-production-s3.mangoplate.com/260397/632226_1645455730505_13"
        		+ "146?fit=around|512:512#crop=512:512;*,*#output-format=jpg#output-quality=80^http"
        		+ "s://mp-seoul-image-production-s3.mangoplate.com/260397/632226_1645455730505_1314"
        		+ "2?fit=around|512:512#crop=512:512;*,*#output-format=jpg#output-quality=80^https:"
        		+ "//mp-seoul-image-production-s3.mangoplate.com/260397/632226_1645455730505_13143?"
        		+ "fit=around|512:512#crop=512:512;*,*#output-format=jpg#output-quality=80^https://"
        		+ "mp-seoul-image-production-s3.mangoplate.com/260397/632226_1645455730505_13144?fi"
        		+ "t=around|512:512#crop=512:512;*,*#output-format=jpg#output-quality=80";
	   String image=poster.substring(0,poster.indexOf("^"));
	   System.out.println(image);
	   // 여러개를 동시에 자르기 => spilt()
	   String[] images=poster.split("\\^");
	   // 
	   /*
	    *   /watch\\?v=
	    */
	   //String[] String.split(String regex) => regex => 정규식
	   /*
	    *    사용기호 => 정규식 
	    *    ^ : 시작문자열   ^[0-9] => 숫자로 시작 
	    *                  [^0-9] => 숫자를 제거 
	    *    $ : 끝나는 문자열 
	    *    . : 임의의 문자
	    *    + : 한글자 이상 
	    *    * : 0글자 이상
	    *    | : 선택 
	    *    ? : ==> \\?
	    *    예) [] => 범위 
	    *       {} => 갯수
	    *       
	    *       전세계의 ip를 가지고 와라 
	    *       [0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}
	    *       
	    *       맛있는 맛있고 맛있게 ....  => 챗봇 (데이터마이닝) 
	    *       맛있+
	    *       맛없는 맛없고 맛없게 ....
	    *       맛없+
	    */
	   for(String p:images)
	   {
		   System.out.println(p);
	   }
	}

}
