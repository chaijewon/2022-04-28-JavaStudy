package com.sist.lang;
/*
 *   java.lang
 *     = 라이브러리 (암기) 
 *       원형 => 어디서 사용하는지 
 *       ------------------- 
 *         => public void display(int ,int) 
 *                   ---- ------- --------- 예외처리 
 *     = Object (숙어)
 *        = clone  => ***protected Object clone() throws ()
 *        = equals => public boolean equals(Object obj)
 *        = finalize => protected void finalize()
 *        = toString => public String toString()
 *        
 *     = ***String , StringBuffer
 *       ------------------------
 *       464page 
 *       -------
 *       String => 문자열 데이터를 저장하는 데이터형 
 *       형식) 
 *            String 변수명="값";
 *            String 변수명=new String("값"); 
 *            *** 문자열은 char[] => 자체가 주소다 
 *                                ----------
 *            char[] a={'a','b','c','d'}
 *       주요메소드 
 *       -------
 *        스프링 5 (자바) => 스프링부트 => webpack 
 *        ---------------------------------- Redux,Vue3,스웨거 (test)
 *        
 *        1) charAt : 문자열에서 문자를 추출 
 *           ***public char charAt(int index)
 *           *** 자바는 모든 번호가 0번 시작 
 *           "Hello Java"
 *            0123456789   => charAt(6) => 'J'
 *           *** 오라클은 1번부터 
 *        2) concat : 문자열 결합 ( + )
 *           ------- 데이터베이스 => 오라클(LIKE => ||) , MySQL(LIKE => concat)
 *           ***public String concat(String s,String s2)
 *             concat("Hello"," Java") => "Hello Java"
 *        3) contains : 포함 문자를 찾기 
 *           ------- 검색시에 만이 사용 ==> 오라클 LIKE 
 *           *** public boolean contains(String s)
 *           *** 존재 true / false 
 *           LIKE ==> A% => A로 시작하는 모든 데이터 startsWith
 *                    %A => A로 끝나는 모든 데이터  endsWith
 *                    %A% => A를 포함하고 있는 모든 데이터  contains
 *           startsWith : 시작문자열이 같은 경우 
 *           *** public boolean startsWith(String s) 
 *           endsWith : 끝나는 문자열이 같은 경우 
 *           *** public boolean endsWith(String s)
 *           ----------------- 검색시 사용 ----> 서제스트 (자동완성기)
 *           equals : 같은 문자열 (대소문 구분)
 *           *** public boolean equals(String s) => 비밀번호 확인
 *               "hello".equals("Hello") => false
 *               "hello".equals("hello") => true
 *           equalsIgnoreCase() : 같은 문자열 (대소문자 구분이 없다) => 이름,메소드를 찾는 경우
 *               "hello".equalsIgnoreCase("Hello") => true
 *               "hello".equalsIgnoreCase("hello") => true
 *        4) String을 많이 사용하는 이유 : 웹,윈도우은 다른 데이터형이 없다 Only 문자열
 *           예) 브라우저 ==> 서버  => String s=request.getParameter("page");
 *              데이터전송(page=1)
 *              <input type=text> , JTextField
 *        5) 단어나 문자의 위치 찾기 
 *           indexOf() => 앞에서 찾기 
 *           *** public int indexOf(char c)
 *               public int indexOf(String s)
 *               
 *               "Hello Java".indexOf('a') ==> 7
 *                0123456789
 *           lastIndexOf() => 뒤에서 찾기 
 *               public int lastIndexOf(char c)
 *               public int lastIndexOf(String s)
 *               "Hello Java".lastIndexOf('a') ==> 9
 *                0123456789
 *           *** 경로명 사용시에 많이 사용 
 *        6) 문자의 갯수 확인 
 *           length() 
 *           public int length() => 갯수(알파벳,한글 상관없다)
 *           "Hello"   ==> 5
 *           "홍길동이다" ==> 5
 *           
 *        7) 문자/문자열 변경 
 *           replace: 문자열이나 문자를 변경 
 *           public String replace(String s,String s1),
 *                                 old        new 
 *                                (char c,char c1)
 *                                 old     new 
 *              "Hello Java".replace('a','b') => Hello Jbvb
 *           => 알파벳을 제거 
 *              replace를 52번을 사용한다  
 *              replace("a","")
 *              --
 *              replace("z","")
 *              replace("A","")
 *              --
 *              replace("Z","")
 *           resplceAll : 문자열이나 문자를 변경 (패턴) => 정규식
 *                        [가-힣],"" , [A-Za-z],""
 *           public String replaceAll(String s,String s1)
 *           toUpperCase : 대문자 변환 
 *             public String toUpperCase()
 *           toLowerCase : 소문자 변환 
 *             public String toLowerCase()
 *             
 *           valueOf: 모든 데이터형을 문자열로 변경 
 *             => String클래스에서 유일하게 static 
 *             => public static String valueOf(boolean b)
 *                public static String valueOf(int i)
 *                ================= 오버로딩 ================
 *           *** String => final => 상속을 내릴 수 없다
 *                      => 있는 그대로 사용 
 *       8) 문자제어 
 *          substring(int s)
 *          public String substring(int s)
 *          "Hello Java".substring(3) => lo Java
 *           0123456789
 *          substring(int s, int e)
 *          public String substring(int s,int e)
 *          "Hello Java".substring(3,7) => lo J
 *           0123456789   => e-1 (앞번호까지)
 *           
 *           "asasas".substring(0,20).concat("","...")
 *          split() 
 *          public String[] split(String s)
 *           =>StringTokenizer(문자열 분리) => java.util
 *     = ***Math 
 *     = System
 *     = ***Wrapper (AutoBoxing , UnBoxing)
 *       기본형 (int , long ...)을 클래스형으로 변경 
 *       int => Integer
 *       long => Long 
 *       byte => Byte
 *       double => Double 
 *       boolean => Boolean 
 *    ---------------------------------------- 
 */
class A
{
	private void disp() {System.out.println("A");}
}
class B extends A
{
	public void disp() {System.out.println("B");}
}
/*class Person {
    void name() { }
    protected void number() { }
    private void secret() { }
}
class Student extends Person {
    public void name() { }
    void number() { }
    private void secret() { }
}*/

public class MainClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello".length());
		System.out.println("홍길동이다".length());
		System.out.println("Hello Java".substring(3));
		System.out.println("Hello Java".substring(3,7));
		
		
		
	}

}
