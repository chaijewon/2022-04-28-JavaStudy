/*
 *    1. 데이터형
 *       정수 : byte(파일 업로드 / 다운로드 , 네트워크 송수신)
 *             => 1byte(전송) => 2byte(수신) 
 *                 인코딩           디코딩 
 *             ***int , long 
 *       실수 : ***double 
 *       문자 : char 
 *       논리 : ***boolan
 *       참조 : 클래스 / 배열 
 *             ----- String (문자열)
 *       => 표현법 
 *          정수 => int/long => (L,l)
 *                 => 2진법  => 0bxxxx 
 *                            ---
 *                 => 8진법  => 0xxx
 *                            --
 *                 => 16진법 => 0x...
 *                             --
 *                 
 *          문자 => '' => 2byte(0~65535) => Unicode
 *                 UTF-8 
 *          문자열 => ""
 *          논리 => true/false 
 *    2. 연산자
 *       ----
 *        단항연산자 => ++,-- , ! , (type)
 *        이항연산자 => 산술(+,-,*,/,%) , 
 *                   비교(==,!=,<,>,<=,>=) , 
 *                   논리(&& , ||) , 
 *                   대입(= , += , -=) 
 *        삼항연산자 => ?: => 웹에서 많이 사용 
 *    3. 제어문  
 *       조건문 ======> 대체 (어노테이션=스프링) => XML/Annotation
 *                                         ----- Spring-boot
 *            STS => 3.xx , 4.xx(boot)
 *                   ----Framework,boot
 *         단일조건문 
 *           if(조건식:부정연산자,논리연산자,비교연산자,boolean)
 *           {
 *               조건: true => {}에 있는 문장 수행
 *               조건: false => 점프 
 *           }
 *         선택조건문 : true/false => 나눠서 처리
 *           => 경우의 수 (가장 많이 사용된다)
 *              아이디 중복 
 *              관리자/유저 
 *              비밀번호 
 *              입력값이 있냐/없냐 
 *           if(조건문)
 *           {
 *              조건 true일때 처리
 *           }
 *           else
 *           {
 *              조건 false일때 처리 
 *           }
 *           
 *         다중조건문 => 메뉴 => 화면 변경 
 *           => 경우의 수가 많은 경우 
 *              => 게임 (keyboard)
 *                 switch~case
 *                 UP/DOWN/LEFT/RIGHT/ENTER/SPACE/ESC
 *           => 맞는 조건에 해당되는 if만 수행 
 *           if(조건)
 *           {
 *               조건 true일때 => 수행문장 처리 => 종료
 *               조건 false일때 
 *           }       |
 *           else if(조건)
 *           {
 *               조건 true일때 => 수행문장 처리 => 종료
 *               조건 false일때 
 *           }       |
 *           else if(조건)
 *           {
 *               조건 true일때 => 수행문장 처리 => 종료
 *               조건 false일때 
 *           }       |
 *           else if(조건)
 *           {
 *               조건 true일때 => 수행문장 처리 => 종료
 *               조건 false일때 
 *           }       |
 *           else
 *           {
 *              조건이 없는 경우 처리 => 생략 
 *           }
 *           
 *       반복문
 *          =>  반복횟수가 지정된 경우 => for
 *              일반 프로그램 => for
 *                   1    2(false종료)
 *                            <=4
 *              for(초기값;조건식;증가식)
 *              {
 *                       |true
 *                 반복 처리 문장 3 ==> 증가식
 *              }
 *          =>  반복횟수가 지정이 않된 경우 => while
 *              네트워크서버,데이터베이스 , 파일읽기 
 *              초기값  ====== 1
 *              while(조건식) =2
 *              {
 *                 반복문장 =3
 *                 증가식 4
 *              }
 *          
 *       반복제어문 
 *          break: 반복문 종료 , switch~case종료(*****)
 *          continue: 특정부분을 제외 
 *          ---------
 *           for : 증가식으로 이동 
 *           while : 조건식으로 이동 => 무한루프
 *           
 *       문자열 
 *       ----
 *       문자열 저장 => String 
 *                   ------
 *                   1) 문자열을 저장하는 일반 테이터 형식 
 *                      String 변수값="";
 *                   2) 클래스 => 기능(메소드)
 *                              ----------
 *       => 기능 (웹,윈도우 => 데이터형이 없다 (무조건 : 문자열)
 *          1. 비교 
 *             ***equals => 문자열이 같은지 확인 => 결과값 (boolean)
 *             ------ id,pwd => 로그인 , 아이디중복체크 
 *             equalsIgnoreCase => 문자열이 같은지 확인 => 결과값 (boolean)
 *             
 *             *** equals VS equalsIgnoreCase => 대소문자 구분 
 *                 java Java(false) java Java(true)
 *                 
 *             ***contains : 포함 문자열 (챗봇) => 검색기  => boolean
 *             --------------------------
 *             startsWith : 시작 문자열    boolean
 *             endsWith : 끝 문자열       boolean
 *                 => 서제스트 (자동 완성기)
 *             compare : 문자열의 크기 비교  int   Hello < Java => 양수
 *                                            Java > Hello => 음수
 *                                            같은 경우 0
 *                                            ===> 문자열 정렬 
 *                
 *             --------------------------
 *          2. 추가 
 *             insert: 추가 (사용빈도가 거의 없다)
 *             concat: ===> 대체(+)
 *          3. 찾기 ==> int
 *             ***indexOf() ==> 앞에서 찾기 
 *             ***lastIndexOf() ==> 뒤에서 찾기 
 *             "Hello Java"
 *              0123456789
 *          4. 문자 제어 
 *             ***split: 문자를 잘라서 배열에 저장 
 *             ***substring() : 문자열을 자른 경우 
 *             ------------
 *               => 디자인의 문제 ==> ...
 *          5. 변환 
 *             toUpperCase : 대문자 
 *             toLowerCase : 소문자
 *             ***valueOf() => 모든 데이터형을 문자열 변환
 *             <input type=text> , JTextField
 *             varchar2 char clob 
 *          6. 제거  
 *             trim() : 좌우의 공백 제거 => 사용자 입력 
 *             "Hello" "Hello" 
 *             
 *          시티은행 : => "10,00" 
 *          
 *    ===> 182page 
 *         배열 : 같은 타입의 여러 변수를 하나로 묶어서 관리 
 *               -------
 *               => 장점 : 연속적인 메모리 구조 
 *                        => 인덱스번호를 이용한다 (for)
 *               => 단점 : 고정적 => 보완 (컬렉션(11~12)=가변형)
 *               => 같은 유형의 데이터가 3개이상 => 배열 
 *         1. 배열 선언 
 *            데이터형 배열명[];=> C언어파생 
 *            데이터형[] 배열명; (권장사항)
 *         2. 배열 초기화 
 *            1) 선언과 동시에 초기화
 *               int[] arr={1,2,3,4,5};
 *            2) 선언과 동시에 default선언  
 *               int[] arr=new int[5]; => 0으로 초기화 
 *                         ----
 *                         int => 0
 *                         boolean => false
 *                         String => null
 *                         double => 0.0
 *               int[] arr;
 *               ----             -----------------------
 *                100    ==========>   1     2   3    4    5
 *               ----arr          |----|----|-----|----|------
 *                               arr+0 arr+1 arr+2 arr+3 arr+4
 *                               arr(100) 100+1*4 100+2*4 100+3*4 100+4*4
 *                                arr[0] arr[1] arr[2] arr[3] arr[4]
 *                                100     104    108    112    116
 *               arr={1,2,3,4,5};
 *         3. 배열안에 있는 데이터 출력 
 *         4. 배열값 변경 
 *         5. 메모리 구조 
 */
public class 자바배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=(int)(Math.random()*100)+1; //1~100
        int b=(int)(Math.random()*100)+1;
        int c=(int)(Math.random()*100)+1;
        int d=(int)(Math.random()*100)+1;
        int e=(int)(Math.random()*100)+1;
        System.out.println(a+" "+b+" "+c+" "+d+" "+e);
        // 최대값 , 최소값 
        int max=0;
        int min=100;
        
        if(max<a)
        	max=a;
        if(max<b)
        	max=b;
        if(max<c)
        	max=c;
        if(max<d)
        	max=d;
        if(max<e)
        	max=e;
        
        System.out.println("최대값:"+max);
        
        if(min>a)
        	min=a;
        if(min>b)
        	min=b;
        if(min>c)
        	min=c;
        if(min>d)
        	min=d;
        if(min>e)
        	min=e;
        
        System.out.println("최소값:"+min);
	}

}






