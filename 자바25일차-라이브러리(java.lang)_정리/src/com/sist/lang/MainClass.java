package com.sist.lang;
/*
 *   java.lang , java.util , java.io , java.net , java.text , java.sql
 *   => 외부 라이브러리 (Jsoup) JSON(RestFul) ,MyBatis ,JPA , Spring
 *   String 클래스 => 컬렉션  (웹 => String , collection) 
 *   ------------
 *      1.  문자열이 지정한 문자로 시작하는지 판단 같으면 true반환 아니면 false를 반환한다.(대소문자구별)
            public boolean startsWith(String s)
        
		2. 문자열 마지막에 지정한 문자가 있는지를 판단후 있으면 true, 없으면 false를 반환한다.(대소문자구별)
		    public boolean endsWith(String e)
		
		3. 두개의 String에 값만을 비교해서 같으면 true, 다르면 false를 반환한다.(대소비교)
		    public boolean equals(String s)
		
		4. 지정한 문자가 문자열에 몇번째에 있는지를 반환한다.
		    public int indexOf(char c)
		    public int indexOf(String s)
		
		5. 문자열에 지정한 문자가 마지막몇번째에 있는 int를 반환한다.
		    public int lastIndexOf(char c)
		    public int lastIndexOf(String s)
		
		6. 문자열의 길이를 반환한다.
		    public int length()
		7. 문자열에 지정한 문자" "가 있으면 새로 지정한 문자" "로 바꿔서 출력한다.
            public String replace(char c,char c1)
            public String replace(String c,String c1)


        8. 정규표현식을 지정한 문자로 바꿔서 출력한다.
           public String replaceAll(String regex) => 데이터 수집 


        9. 지정한 문자로 문자열을 나눌수 있다.(배열로 반환)

           public String[] split(String regex)
 
		10. 문자열에 지정한 범위에 속하는 문자열을 반환한다.(시작범위에 값은 포함하고, 끝나는 범위에 값은 포함하지않는다.)
		   public String substring(int s,int e) => e-1
		   public String substring(int s) => 주소 ...
		
		11.  문자열에 대문자를 소문자로 변환한다.
		   public String toLowerCase()
		
		
		12. 문자열에 소문자를 대문자로 변환한다.
           public String toUpperCase()

        13. 문자열을 그대로 반환해준다.

            public String toString()
		14. 문자열에 공백을 제거해 준다.
		    public String trim()
		
		15. 지정한 개체의 원시 값을 반환 (데이터형을 문자열로 변경)
		    public static String valueOf(int i)
		                                ------- 모든 데이터형 
		    ==> Cookie => 문자열만 저장이 가능 
		 
		16. 두개의 String을 비교해서 비교대상 String을 포함하고 있으면true, 다르면 false를 반환한다.
		   public boolean contains(String s)
		
		17. 지정한 index번째에 문자를 반환한다.
		   public char charAt(int index)
		
		18. 문자와 문자를 결합해준다.(+,append)
		   public String concat(String s)
		   "Hello".concat(" Java") => Hello Java
		
		19. 서식문자열을 이용해서 서식화된 문자열을 반환한다.
		    public static String format(String s,Object... arg)
		    
		    String ss=String.format("%d * %d = %d",10,10,10*10)
		
		
  Object 클래스
		1. 객체의 복사본을 만들어 리턴한다.
           public Object clone() 
		2. 현재 객체와 매개 변수로 넘겨 받은 객체가 같은지 확인하다. 같으면 true를 다르면 false를 리턴한다.
		   public boolean equals(Object o)
		3. 현재 객체가 더 이상 쓸모가 없어졌을 때 가비지 컬렉터에 의해서 이 메소드가 호출된다.
		   protected void finalize() => 소멸자 
		4. 객체를 문자열로 표현하는 값을 리턴한다.
		   public String toString();
		
  기타 
    StringBuffer  /  Math  /  Wrapper 
    ------------
     append() => 문자열이 많은 경우 
    Math 
    -----
     double random()
     double ceil()  ==> 형변환 
     
    Wrapper
    -------
      = Integer
      = Double
      = Boolean => PL/SQL (모든 댓글)
      ----------------------------- parseInt , parseDouble , parseBoolean
      
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="Hello";
        String s1=s.toString();
        System.out.println(s1);
	}

}
