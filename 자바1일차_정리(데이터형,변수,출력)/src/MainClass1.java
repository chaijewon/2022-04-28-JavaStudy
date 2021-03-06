/*
 *  6page
 *    => 자바 실행 파일 
 *       javac : 컴파일 => 컴퓨터 인식할 수 있는 언어로 변경 (바이트 코드)
 *               .java => .class(배포)
 *       java : 인터프리터 (한줄씩 번역해서 출력)
 *       javap : 역컴파일러 => .class => .java
 *  8page 
 *    => 실행하는 과정 
 *    Hello.java ======== Hello.class ======= 화면에 출력
 *                javac                java 
 *         => 에러) 컴파일 에러(문법)      실행시에러(프로그래머 실수, 사용자 실수)
 *  9page 
 *    자바의 기본 구조 
 *    package 저장폴더지정 (한번만 사용)
 *    import 라이브러리 
 *           -------
 *           1. 사용자 정의 클래스 
 *           2. 자바 지원하는 클래스
 *           3. 외부에서 지원하는 클래스 (mvnrepostory.com)
 *              => Jsoup(크롤링) , 꼬꼬마 (형태소) , Spring ...
 *           => 불러서 사용 (여러개 사용이 가능)
 *    public class className
 *    {
 *        =====================
 *          변수 선언 
 *          -------
 *           공유변수 
 *           객체변수(인스턴스 변수) => 객체지향 (5장)
 *        =====================
 *          메소드 영역 (기능 수행) => 사용자 요청  
 *        =====================
 *          생성자 (변수의 초기화) 
 *        =====================
 *          public static void main(String[] arg)
 *          {
 *             프로그램의 시작과 종료 
 *          }
 *          static public void main(String[] arg)
 *          {
 *             프로그램의 시작과 종료 
 *          }
 *          원형 
 *          public static void main(String[] a)
 *        =====================
 *        main에서만 코딩 => 절차적언어 (자바 문법)
 *        자바 문법 : 변수 , 데이터형 , 연산자 , 제어문 , 배열 
 *        자바의 정석 
 *        --------
 *    }
 *    
 *    프로그램 제작 
 *    1. 프로그램에 필요한 변수 선언 (데이터베이스 컬럼)
 *       -------------------- 저장 공간 (데이터형)
 *       변수 : 기본형
 *             **참조형 => 지원하지 않는 데이터형을 만들어서 사용 (class)
 *               ==> 구조체(C) => 변경 class
 *             **잘 묶는다 (관련된 내용을 묶어서) 
 *             **  데이터가 여러개  ==> 배열,클래스
 *             **  명령문이 여러개  ==> 메소드 
 *             **  클래스가 여러개  ==> 인터페이스 
 *             -----------------------------한개의 이름으로 처리 
 *    2. 알고리즘 (순서)
 *    3. 조립식 
 *    
 *    12page => 실행과정  
 *    13page => 주석 (분석 => 변수설명 , 소스설명)
 *              // => 한줄 주석 , 여러줄 주석 처리 
 *                 Ctrl+Shift+/ => 선택된 부분만 
 *                 Ctrl+Shift+\ => 주석 풀기 
 *                 
 *    20page => 변수
 *              30page~31page 
 *              변수 / 상수(변경할 수 없는 값) / 리터럴(저장될 실제 값) 
 *              변수 => 한개의 데이터를 저장하는 메모리 공간 
 *              --- 변경해서 사용 할 수 있는 값 
 *              변수/상수(final)
 *    21page => 데이터형을 먼저 숙지 
 *              자바에서 지원하는 데이터형 (27~29page)
 *              정수
 *               byte(1byte) => 저장 할 수 있는 숫자 : -128~127
 *                   ------- 8bit (bit는 0,1만 저장이 가능한 공간)
 *                   --------------------
 *                    0 1 1 1 1 1 1 1 
 *                   --------------------
 *                   ---
 *                   부호비트 : 0(양수) , 1(음수)
 *               int(4byte) => 32bit => -21억 4천~ 21억 4천 
 *                 => 컴퓨터가 인식하는 모든 숫자는 int(default)
 *               long(8byte) => 64bit => -2^63 ~ 2^63-1
 *               
 *                 ==> int VS long ==> 접미어(L,l)
 *                     100L(long) , 100(int)
 *              실수 
 *               double(8byte) => 소수점 15자리 출력 
 *              문자 
 *               char(2byte=>멀티바이트 => Unicode) 
 *                    0~65535(각국의 언어를 사용할 수 있다)
 *                    한개만 저장 => 'A'
 *              논리
 *               boolean =>(1byte) => true/false
 *              문자열 
 *               String : 자바에서 지원하는 클래스 동시 데이터형
 *                    여러개 문자 저장이 가능 : "AAA" 
 *       ==> 크기 
 *       byte < char < int < long < double
 *       ==> 바이트 단위로 크기가 결정되는 것이 아니고 
 *           수표현이 많은 것..
 *           ==> 정수 < 실수 
 *        
 *       ==> 변수 선언 / 초기화 
 *       25page 1. 변수 만드는 방법 (식별자 => 클래스 , 메소드 , 인터페이스에도 적용)
 *          1) 알파벳,한글 시작 (단 대소문자를 구분한다)
 *          2) 숫자를 사용할 수 있다(앞에 사용 금지)
 *          3) 키워드는 사용할 수 없다(자바에서 이미 사용중인 단어)
 *          4) 특수문자 사용이 가능 ( _ , $ ) => _권장
 *             클래스명에 _앞에 있다,변수 앞에 있다 => 임시변수,임시클래스 
 *          5) 갯수의 제한은 없다 (3~7:변수) => 약간의 의미 => 가독성 
 *          -----------------------------------------------
 *       26page    
 *           변수/메소드 => 소문자 시작
 *           클래스  => 대문자 시작
 *           상수 => 전체 대문자 
 *       2. 변수 선언 
 *          -------
 *          데이터형 변수명;
 *          정수 1개 선언 
 *          int(long) hakbun;
 *          ** {}안에서 선언 => 반드시 사용전에 초기값을 부여  
 *          class {자동 초기화}
 *          method{지역변수 : 초기화가 안된다} 
 *          
 *          초기화 
 *          1) 선언에 동시에 초기화 
 *             int a=10;
 *          2) 선언후 나중에 초기화 
 *             int a;
 *             a=값
 *             => 입력값 
 *             => 랜덤 
 *             => 파일 읽기 
 *          ----------------------
 *          변수가 여러개 
 *          int a,b,c,d,e;
 *          변수가 여러개 초기값
 *          int a=10,b=20,c=30,d=40,e=50;
 *      34page => 문자열 
 *         + : 산술연산 / 문자열 결합 => 문자열이 있으면 최종 결과는 문자열이다
 *         왼쪽 ===> 오른쪽 
 *         7+""+7 
 *         ----
 *          "7"
 *            --
 *             "77"
 *         7+7+""+7
 *         ---
 *          14
 *            ---
 *              "14"
 *              ---
 *               "147"
 *        35page 
 *           문자열 + any type(모든 데이터형) => 문자열 
 *           any type + 문자열  => 문자열 
 *           web(jsp,spring,boot) => 데이터형이 없다 (송신/수신) 
 *               => 문자열만 존재한다
 *               
 *        36page : 화면 출력 
 *          = System.out.print() : 가로 출력 
 *          = System.out.println() : 세로 출력 
 *          = System.out.printf() : 서식응 만들고 출력 
 *            System.out.printf("출력 형식", 출력할 데이터)
 *            정수 : %d
 *            실수 : %f
 *            문자 : %c
 *            문자열 : %s
 *            ---------- %x(16진법) , %b(2진법) , %o(8진법)
 *              자바에서 숫자 표현 
 *               = 2진법(0,1) 
 *               = 8진법(0~7) => 0~ => 012 => 10 , 08,09(오류)
 *               = 10진법(0~9) => 일반 표현 
 *               = 16진법(0~15) => 0x
 *                    10~15 : A~F
 *            ==> 사용법 
 *                실수 : 10.5
 *                문자 : 'A'
 *                논리 : true/false
 *            ==> 입력 : Scanner => scanf
 *                정수 : nextInt() 
 *                문자열 : next()
 *                실수 : nextDouble()
 *                논리 : nextBoolean()
 *            ------------------------- main에서 자바문법 
 *            => Application(게임 , 윈도우 , 편집기)
 *                          
 *            => Web Application(브라우저 출력) 
 *                   HTML (브라우저에서 실행되는 언어) 
 *                     |
 *                   Java (C#(ASP),파이썬(장고),C/C++)
 *                     |
 *                   오라클 (MySQL) 
 *                    ===========================
 *                    => Spring-Boot <==> MySQL
 *                                    JPA
 *                       React / Vue 
 *                    ===========================
 *                    프로젝트 : 3번 
 *                      자바(인정(X)) / JSP / Spring / 최신기술 (개인)
 *                      -----------(X) 
 *            => Mobile Application
 *                   액정 (Kotlin)
 *                      |
 *                     자바
 *                      |
 *                     서버 
 *       -------------------------------------------------
 *       41page : 진법 
 *       10진법 => 2진법 , 8진법 , 16진법  
 *       ----------------------------
 *       음수 표현 (1의 보수 , 2의보수(*)) 
 *       각데이터형별 => 메모리에 저장 
 *           
 *    
 */
public class MainClass1 {
    // 자동 초기화 => int 0
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=380;
        System.out.println(a);//10진법
        System.out.println(Integer.toBinaryString(a));//2진법
        System.out.println(Integer.toOctalString(a));//8진법
        System.out.println(Integer.toHexString(a));//16진법 
        System.out.println("=====검증=====");
        System.out.println(79);
        System.out.println(0b1001111); // 
        System.out.println(0117);
        System.out.println(0x4f); //4f(float)
        
        byte b=(byte)380; // int
        System.out.println(b);
        
        int aa=123456;
        float d=123456.78f;// 77.999999999
        int res=(int)((d-aa)*100);
        System.out.println(res);
        
	}

}







