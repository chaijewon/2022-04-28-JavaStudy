package com.sist.main;
/*
 *    java.lang 
 *       = Object : 최상위 클래스 (모든 클래스의 상위 클래스)
 *         => clone() : 복제 (새로운 메모리를 만든다 => 초기값은 복제한 객체의 값을 그대로)
 *         => toString() : 객체 문자열 변경 (주소)
 *         => equals() : 객체 비교 
 *         => finalize() : 소멸자 (호출시에 메모리 해제)
 *       = String : 문자열 제어 
 *         => length() : 문자갯수 읽기
 *         => equals() : 문자열 비교(대소문 구분) 
 *         => substring() : 문자열을 자른다 
 *            substring(0,3) => 012
 *            substr(1,6) => 1번 6개자르기  
 *         => split() : 구분자별로 문자열 분리 (regex) 
 *         => replace() : 문자/문자열 변경 
 *         => replaceAll() : 문자/문자열 변경 => regex
 *         => trim() : 좌우의 공백을 제거 
 *         => valueOf() : 모든 데이터형을 문자열 변환 
 *         => format() : 형식을 변경(서식)
 *         => startsWith() : 앞문자열이 같은 경우
 *         => endsWith() : 끝 문자열이 같은 경우 
 *         => contains() : 포함문자열 
 *       = StringBuffer
 *         => append() : 문자열 결합 (대용량의 문자열이 있는 경우)
 *            + : 문자열 결합 
 *       = Math
 *         => random() : 임의의 실수 추출 
 *         => ceil() : 올림함수 
 *       = System
 *         => print()
 *         => gc()
 *       = Wrapper
 *         => Integer/Double/Boolean/Long 
 *         => parseXxx()   
 *       => java.lang.reflect
 *          = Method => 어노테이션  
 *    java.text
 *       = SimpleDateFormat : 날짜 변환  
 *         = format 
 *         = 년도 : yyyy  => 2022-06-13  => yyyy-MM-dd
 *           월  : M
 *           일  : d
 *           시간 : h
 *           분 : m
 *           초 : s
 *       = MessageFormat
 *       = ChoiceFormat
 *    java.util
 *       = StringTokenizer 
 *         = counterTokens() : 구분된 갯수 
 *         = hasMoreTokens() : 데이터가 있는 경우 true, 없는 경우 false
 *         = nextToken() : 실제 데이터 읽기 
 *       = Random 
 *         = nextInt(int bound) => 마지막 제외 
 *           nextInt(10) => 0~9
 *       = Date : 시스템의 시간 읽기 
 *       = Calendar : Date를 쉽게 사용 
 *       ---------------------------
 *       컬렉션 : 데이터를 메모리에서 관리 (가변=>표준화) 
 *         List (interface) 
 *       = ArrayList : 순서가 있다 , 중복데이터 허용 : 데이터베이스 (오라클 연동)
 *         ---------- Vector / LinkedList
 *         = ***add()
 *         = remove()
 *         = set()
 *         = ***clear()
 *         = ***get()
 *         = ***isEmpty()
 *         = ***size()
 *       = HashSet : 순서사 없다, 중복데이터를 허용하지 않는다
 *         = ***add()
 *         = remove()
 *         = ***size()
 *         = isEmpty() 
 *       = HashMap : 키와 값 동시에 저장 
 *         = ***put()
 *         = ***get()
 *       ---------------------------
 *       = Vector : ArrayList와 동일 => 동기화/비동기화 
 *       = Properties : Hashtable을 변형 
 *         ----------
 *          load()
 *          setProperty()
 *          getProperty()
 *       => java.util.regex 
 *          = Pattern => 문자형식 만든다 
 *          = Matcher => 문자형식을 찾기 
 *       => 12장 
 *          제네릭스 
 *            데이터형을 변경해서 사용하기 쉽게 만든다 
 *            한번에 데이터형을 통일이 가능하다
 *            형변환이 없어서 소스 간결 , 가독성 
 *            List<String> : String만 저장이 가능 
 *            List  => Object
 *            <클래스형만 설정> => 기본형 (Wrapper)
 *            배열 
 *            ---
 *             String[] 
 *             int[] 
 *             Object[]
 *          어노테이션 : 메소드,클래스 구분자 
 *                    인덱스 
 *          제네릭스 / 어노테이션 => 사용자 정의가 거의 없다 
 *                              이미 만들어져 있다 
 *                              -------------- 동작 
 *          ---------------------------------------- 기본 라이브러리 
 *    java.io => 15장 
 *    java.net => 13장 , 17장 
 *    ------------------- 1차 자바
 *    *****java.sql
 *    ------------------- 2차 자바 (오라클 연동) => 기본 BASE 
 *    javax.http.servlet : JSP
 *    ------------------- 3차 자바 (브라우저 연동) 
 *    org.springfrawork.* : Spring
 *    ------------------- 4차 자바 (스프링 연동) 
 *     
 *    
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
