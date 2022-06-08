package com.sist.lang;
/*
 *    라이브러리 : 자바에서 만든 기능 (API)
 *    => 사용자 정의 클래스 + 라이브러리 => 조립
 *    => 자바에서 지원 
 *       java.lang => import가 생략 
 *         자바프로그램의 기본 클래스 (가장 사용이 많은 클래스)
 *         Object 
 *         String 
 *         StringBuffer 
 *         Math 
 *         Wrapper
 *         System 
 *       java.util => 필요시마다 사용 (유용한 클래스의 집합)
 *         Date , Calendar 
 *         List , Set , Map => 자료 구조 (데이터 관리 => CURD)
 *         ----------------- Collection 
 *         Scanner (X)
 *         StringTokenizer
 *       java.io : File , Buffer 
 *       java.net : URL 
 *       java.text : SimpleDateFormat
 *       -----------
 *       java.sql  => 오라클 연결 ==> 웹(80%) 
 *       -----------
 *    => 외부 (open source) 지원  => mvnrepository.com
 *       => servlet-api.jar , jstl.jar , cos.jar 
 *          simple-json , jsoup ... 
 *          spring , mybatis , jpa  ==> 웹개발(Back-End)
 *          
 *          =>데이터 수집 (API) => XML,JSON(Vue,React)
 *     
 */
/*
 *   Object => 최상위 클래스 => 모든 클래스는 Object로부터 상속을 받는다 
 *                          --------- 라이브러리 , 사용자 정의
 *   => 객체의 생명주기 (생성 = 활용 = 소멸) => 변경해서 프로그램 제작 (스프링)
 *      관리 => 가비지 컬렉션 => 프로그램안에서 관리 
 *   => 생성자 : 소멸자 (finalize())
 *   => 객체복제 : clone() => 새로운 메모리를 만든다 
 *   => 객체비교 : equals
 *   
 *   => java.lang => Object를 제외하고 나머지 클래스는 대부분이 final클래스 
 *      => 상속을 받을 수 없다 , 있는 그대로 사용(변경없이 사용) 
 *      
 *   String : 문자열 제어 , char[]을 조작 
 *            문자열 ==> ""는 자체가 주소값이다 
 *            사용법)
 *                   String s=""; ******* 대부분 사용 
 *                   String s=new String();
 *                            -------------- 한글변환 (encoding,decoding)
 *     https://www.google.com/search?q=%EC%9E%90%EB%B0%94&oq=%EC%9E%90%EB%B0%94&aqs=chrome..69i57j69i59l2j0i131i433i512l2j0i20i263i433i512j0i131i433i512l4.860j0j15&sourceid=chrome&ie=UTF-8
 *                   => encoding
 *                       자바 ===> %EC%9E%90%EB%B0%94
 *                   => decoding 
 *                       %EC%9E%90%EB%B0%94 ===> 자바 
 *     1) 비교 
 *        equals(equalsIgnoreCase) , contains , startsWith , endsWith => boolean
 *     2) 크기 읽기
 *        length
 *     2-1) 위치 , 찾기
 *        indexOf , lastIndexOf 
 *     3) 제어 (자르기 , 제거, 변경)
 *        substring , replace , replaceAll , trim ,split
 *     4) 다른 데이터형 => 문자열 변환 
 *        valueOf , format ==> static메소드 
 *        String.valueOf , String.format
 *     --------------------------------------------------
 *      
 *     equals : id찾기 , 로그인 , password찾기 , id중복체크 
 *     ----------------------------------------------
 *     Scanner => 입력창 
 *     윈도우 => X => 개인 프로젝트 
 *     ------------------------  개인 프로젝트 (3차) => Spring-Boot + React => AWS
 *     
 */
import java.util.*;
public class MainClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // equals : => public boolean equals(String s)
		// 1. 기능 , 2. 결과값 , 3. 매개변수 , 4. 인스턴스,static 구분
		// equals: 객체가 가지고 있는 값을 비교 , == 객체의 주소값 비교 
		String s1="Hello";
		String s2="Hello";  
		/*
		 *      s1
		 *     ----
		 *     0x100   ↘
		 *     ----         -----------
		 *                   0x100
		 *      s2      →   "Hello"
		 *     ----         -----------
		 *     0x100
		 *     ----
		 *      s3          -----------
		 *     ----          0x200
		 *     0x200         "Hello"
		 *     ----         -----------
		 *     
		 *     s1==s2 주소값이 동일  ==> equals , ==
		 */
		if(s1==s2)
			System.out.println("같은 주소를 가지고 있다");
		else 
			System.out.println("다른 주소를 가지고 있다");
		
		if(s1.equals(s2))
			System.out.println("같은 값을 가지고 있다");
		else
			System.out.println("다른 값을 가지고 있다");
		
		String s3=new String("Hello"); // 다른 메모리에 Hello저장 
		
		if(s1==s3)
			System.out.println("같은 주소를 가지고 있다");
		else
			System.out.println("다른 주소를 가지고 있다");
		
		if(s1.equals(s3))
			System.out.println("같은 값을 가지고 있다");
		else
			System.out.println("다른 값을 가지고 있다");
		
		String s4="hello";
		//s1="Hello"
		// *** equals => 대소문자를 구분해서 비교 
		if(s1.equals(s4))
			System.out.println("같은 값을 가지고 있다");
		else
			System.out.println("다른 값을 가지고 있다");
		// *** equalsIgnoreCase => 대소문자 구분없이 비교
		// 개인 정보 => equals
		// 검색 => equalsIgnoreCase
		if(s1.equalsIgnoreCase(s4))
			System.out.println("같은 값을 가지고 있다");
		else
			System.out.println("다른 값을 가지고 있다");
	}

}

















