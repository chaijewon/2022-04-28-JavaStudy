/*
 *   page 20 
 *   데이터를 1개 저장하는 메모리 공간 
 *   -------------------------
 *   1. 변수 : 단 하나의 값을 저장할 수 있는 메모리 공간 
 *            => 변경해서 사용 
 *   2. 상수 : 단 하나의 값을 저장할 수 있는 메모리 공간 
 *            => 변경항 수 없는 값 (고정)
 *            => final 
 *   변수 
 *    1) 변수 선언 
 *       = 데이터형 변수명;
 *         ------
 *    2) 변수 초기화
 *       = 데이터형 변수명=값; => 명시적 초기화 
 *       = 입력값을 받아서 저장 (Scanner)
 *       = 임의의 값 저장 (Math.random())
 *       = 파일읽기후 저장 
 *       = 크롤링 
 *       = 데이터베이스 읽기 
 *       
 *    데이터형(자료형,기본형) 
 *    정수 
 *     byte (1byte) => 8bit (-128~127)
 *     int  (4byte) => 32bit (-21억 4천 ~ 21억 4천)
 *     long (8byte) => 64bit 
 *    실수 
 *     double (8byte) => 소수점 15자리 
 *    문자 
 *     char (멀티바이트 => 2byte) => 0~65535
 *           각국의 언어사용이 가능 
 *    논리
 *     boolean (1byte) => 저장은 true/false
 *    문자열(참조변수)
 *     String (문자 여러개 저장이 가능) => 4기가 => StringBuffer
 *     
 *    = 초기화 
 *      byte => 0
 *      int  => 0(10)
 *              0bxxx(2)
 *              0xxx(8)
 *              0x...(16)
 *      long => 0L(l)
 *      -----------------
 *      char => 'A','홍'
 *      double => 0.0
 *      boolean => true/false
 *      String => ""
 *      -----------------------
 *      변수는 최종적으로 저장된 값을 가지고 있다 
 *           ---------------
 *      int a=10;
 *      a=20;
 *      a=30;
 *      a=40;
 *      a=50   ---> a=50
 *      
 *      final int a=10;// 한번만 초기화 할 수 있다
 *      a=20; (X)
 *      
 *      자바 변수 => 교재 
 *      1장 : 6page 
 *           javac , java , javap
 *           8page 
 *           Hello.java ==== Hello.class ==> 실행
 *                     javac             java
 *                     컴파일              인터프리터 
 *           = 기술면접 : 컴파일 VS 인터프리터의 차이점 
 *           9page : 주석 (실행되지 않는 영역) 
 *                   // 한줄 주석 
 *           11page : ;=> 컴퓨터에 명령을 내린다 
 *                    주의점) 제어문에서는 사용하면 안된다 
 *                    if(){
 *                      => 명령문을 설정
 *                    }
 *           13page 
 *           -------------------------------------
 *           https://www.google.com/search?q=%EC%9E%90%EB%B0%94&oq=%EC%9E%90%EB%B0%94&aqs=chrome..69i57j0i433i512j0i131i433i512l3j0i3j0i512j0i433i512j0i512l2.714j0j15&sourceid=chrome&ie=UTF-8
 *       2장 : 20page 변수의 의미
 *            21~22page 초기화 
 *            25page => 식별자 
 *            26page는 참조 (클래스명은 대문자 시작) 
 *            // %EC%9E%90%EB%B0%94 (자바) => 권장(알파벳)
 *               변수/메소드 => 소문자 시작 
 *               상수 => 전체 대문자 
 *               -------------------- 문법은 아니다 (약속)
 *            27page 
 *              => 기본형 / 참조형 (클래스,배열)
 *                        클래스 (사용자정의 ,라이브러리)
 *                        String 
 *                 ---- 자바 제공하는 데이터형
 *              => 암기 (28page/29page) => 기본형의 종류 
 *            32page => 기본형/접미어 
 *                      float => F(f)
 *                      long  => L(l)
 *                      값 부여 
 *                      -----
 *                       char ''
 *                       String ""
 *                       0x(16) , 0(8)  , 0b(2) => 정수표현
 *            35page =>  문자열 결합 (+)
 *              10+"원" => 10원
 *              "가격:"+1000+"원" ==> 가격:1000원 
 *            57page => 특수문자 
 *                      \n (new Line)
 *                      \t (tab)
 *                      \\ => \
 *                      \" => "
 *            66page => 지정된 범위를 벗어나면 => 오버플로우 발생 
 *                      => 연산자처리 
 *            82page => 형변환 
 *                      = 자동형변환(연산자, 값대입)
 *                      값대입 
 *                      int a='A'; 
 *                         -- ---  => 작은 데이터를 큰 데이터형으로 변경 
 *                             65  => a=65
 *                      int + double 
 *                      ---
 *                      double => double+double 
 *                      = 강제형변환(필요시에만 사용)
 *                      int a=10.5(X)
 *                      int a=(int)10.5; => int a=10
 *           83page 크기 
 *             byte < char < int < long < double
 *             ----------------------------------
 *             ** boolean은 제외한다  
 *             
 */
public class 자바변수정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*String title_kor=""; // titleKor
        String title_eng=""; // titleEng
        String regdate=""; // Date regdate 
        double score=8.1;
        String genre="";
        int showUser=84178; // 증가 
        String nation="";
        int boxoffice=1;
        int grade=15;
        int time=106;
        // => 한개의 영화 정보를 출력하는 변수들의 집합 */
		String title="c:\\abc";
		double score=4.6;
		String address="";
		String tel="";
		String type="";//음식종류
		String price="";
		String parking="";
		String[] times=new String[2];
		String[] menu=new String[5];
		// 70~80% String => int(X) ===> 메모리에 저장 => 브라우저로 전송
		// 서버 컴퓨터 
		// 상세 보기 
        
	}

}
