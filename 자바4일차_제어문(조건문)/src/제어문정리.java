/*
 *   프로그램의 형식 
 *   1) 평문 : 순차적으로 처리 
 *   2) 조건문 : 필요하면 건너뛴다
 *   ----------------------- 원하는 문장만 수행이 가능하게 프로그램 제어한다
 *   자바에서 지원하는 제어문의 종류 
 *   -----------------------
 *   1. 조건문 ==> 136page => 변수/연산자  (변수+연산자+제어문) = 메소드 
 *      = 단일조건문  => if(조건문) 
 *      = 선택조건문  => if ~ else (*******)
 *      = 다중조건문  => if ~ else if ~ else if ~ else
 *   2. 선택문 
 *      = switch~case~default
 *   3. 반복문 
 *      = for : 반복 횟수가 지정 
 *      = while : 반복 횟수가 지정이 안된 경우 (데이터베이스)
 *                => 선조건 
 *      = do~while : 한번이상을 수행 
 *                => 후조건 
 *   4. 반복제어문 
 *      = break : 반복문을 중단 (종료)
 *      = continue : 특정부분을 제외할때 
 *   --------------------------------------------------
 *   데이터저장   ========     연산처리,제어 ======== 출력 
 *   -------
 *    한개 (변수/상수)
 *    여러개 (배열/클래스)
 *    ---------------- 메모리저장 
 *    파일 
 *    RDBMS (오라클):DB2
 *    
 *   변수 , 데이터형 
 *   = 데이터형 
 *     정수 (byte(1) , int(4) , long(8)) 
 *     실수 (double(8)) => 소수점 15자리
 *     문자 (char(2)) => ''
 *     논리 (boolean(1) => true/false)
 *     변수 설정 
 *     데이터형 변수명
 *           ------ (식별자 : 변수 , 상수 , 메소드 , 클래스 , 인터페이스)
 *           1. 알파벳 (대소문자 구분) => 길이 제한이 없다 (한글가능)
 *           2. 숫자사용 가능 (앞에 사용금지)
 *           3. 키워드(예약어) 사용금지
 *           4. 특수문자 사용이 가능 ( _ , $ )
 *           == 변수 , 메소드 => 소문자 (문법 사항은 아니다) 
 *           == 클래스,인터페이스 => 대문자 
 *           == 상수 : 전체 대문자 (단어가 2개이상 _)
 *              MAX_VALUE 
 *     ***** 변수 , 상수 => 반드시 초기화 
 *           int,byte => 0
 *           long => 0L
 *           double => 0.0
 *           char => 'A' (null) 
 *           boolean => false
 *           -----------------------
 *           => 데이터형을 변경해서 사용이 가능 (형변환) 
 *           => 데이터형의 크기 
 *                <----------------(downcasting): 강제형변환
 *           byte < char < int < long < double
 *                ----------------->(upcasting): 자동형변환 
 *                
 *   연산자 : 같은 데이터형만 연산 
 *          (다른 데이터형 연산 요청 ==> 같은 데이터형으로 변환)
 *          int + long 
 *          ---
 *          long   ===========> long+long
 *          
 *          char + int 
 *          ----
 *          int    ===========> int+int 
 *          
 *          단항연산자 : ++,--, ! , (type)
 *          이항연산자 : 
 *               산술 => + , - , * , / , %
 *               -------------------------조건문에서 주로 사용 
 *               비교 => == , != , < , > , <= , >=
 *               논리 => && , ||
 *               -------------------------
 *               대입 => 결과값 받기 
 *                      = , += , -=
 *         삼항연산자 : (조건) ? 값1 : 값2 
 *                   -----
 *                    true => 값1
 *                    false => 값2  ====> 이전 / 다음 
 *                                        메뉴 활성화 
 *      -------------- 2022-05-04 조건문 (136page) 
 *      1. 형식,활용(응용) ==> 결합 
 *      조건문
 *        ****** 자바의 모든 제어문은 바로 밑에 있는 문장만 수행한다 
 *        1) 단일 조건문 
 *           형식) 
 *                if(조건문) 
 *                  실행문장1 => 조건이 true일때만 실행하는 문장 
 *                  실행문장2 => if소속문장이 아니다 
 *                  
 *                => 제어하는 문장이 2개이상일 경우 
 *                if(조건문)
 *                {
 *                   실행문장 1
 *                   실행문장 2
 *                   ..
 *                   ..
 *                }
 *                
 *                ==> {}
 *                ==> 자바형식 
 *                if(조건문){
 *                  
 *                }
 *                ----------------
 *                if(조건문)
 *                {
 *                   
 *                }
 *                
 *                => 이클립스 
 *                if(조건문){
 *                
 *                }//자동 
 *                
 *                ==> 들여쓰기 (파이썬) 
 *        단일 조건문 (단독실행문장) => 오류처리  (/) => 예외처리
 *          
 *        if(조건문)=> 조건문에 사용되는 연산자 (부정연산자(!),
 *                        비교연산자,논리연산자) => true/false
 *        {
 *           조건이 true일때만 실행이 가능하게 만든다 
 *        }
 *     
 */
// 정수를 입력 받아서 짝수/홀수를 확인하는 프로그램 
import java.util.Scanner;
public class 제어문정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        // 클래스를 저장할 때 사용 (new => 새로운 메모리에 저장 요청)
        // heap => 프로그래머가 관리하는 메모리 영역 
        System.out.print("정수 입력:");
        // 데이터를 받아서 저장 
        int num=scan.nextInt(); 
        // 사용자가 키보드로 입력한 정수를 읽어 온다 nextInt()
        /*
         *   if(조건문)
         *     문장 
         *     문장 => if와 관련이 없다 => 무조건 수행하는 문장 
         *   if(조건문)
         *   {
         *      문장
         *      문장 
         *   }
         */
        if(num%2==0)
        	System.out.println(num+"은(는) 짝수입니다");
        // 
        if(num%2!=0)
            System.out.println(num+"은(는) 홀수입니다");
	}

}








