/*
 *   기술면접 
 *     => 메소드 VS 함수 차이점 
 *        메소드 : 클래스 종속 (클래스안에서만 사용) => 자바 , C#
 *               => 완전 객체지향 
 *        함수 : 독립적으로 사용이 가능 => C언어 , 코틀린 , 파이썬
 *     메소드 
 *      1. 정의 
 *         특정 작업을 수행 (한가지일만 수행) => 명령문의 집합 
 *           = 변수 (데이터 저장) => 모아서 관리 (배열 , 클래스)
 *           = 명령문 (;) => 모아서 관리(단락) => 메소드 (가독성)
 *             메소드 : 수정이 쉽게 , 추가가 쉽게 (객체지향 => 변수/메소드) 
 *                    ---------  ---------
 *                    오버라이딩     오버로딩 ==> 다형성 
 *      2. 용어 
 *          1) 선언부 / 구현부 
 *             리턴형 메소드명(매개변수...) : 매개변수는 없는 경우도 있다
 *             ---- 반드시 포함 
 *             {
 *                구현부 => 구현이 있어야 사용이 가능 
 *             }
 *             메소드는 메모리에 저장후에 사용 
 *             ----------------------- 저장 {}
 *             메소드명 : 식별자 
 *                = 알파벳,한글사용이 가능 (권장 : 알파벳) 
 *                  ----- 대소문자를 구분 
 *                  ----- 약속사항(문법사항= 소문자시작)
 *                        단어가 두개이상 ( 두번째 시작 => 대문자, _)
 *                        boardWrite() => 헝가리언식 표기법 
 *                        ------------
 *                        board_write()
 *                        => 리펙토링 (명칭변경) 
 *                = 숫자 사용이 가능 (앞에 사용 금지)
 *                        boardInsert1() , boardInsert2()
 *                = 키워드는 사용할 수 없다 
 *                  int , double , byte ... 
 *                  main(X) 
 *                = 특수문자 사용이 가능 ( _ , $ )
 *                = 메소드명의 길이는 제한이 없다 
 *                  메소드 , 변수 => 계속사용을 하기 때문에 
 *                  5~15정도 
 *                  
 *                  식별자 => 변수명,메소드명/,클래스명,인터페이스명,열거형
 *                          ---------------------------------
 *          2) 매개변수 : 갯수는 상관없다 (가급적이면 3개이상 배열,클래스)
 *                     (int a,int b,int c,int d, int e)
 *                     (int[] arr)
 *                     (String name,String sex,int age,double ki)
 *                     (Human h)
 *                     class Human => 사용자 정의 데이터형 
 *                     {
 *                       String name;
 *                       String sex;
 *                       int age;
 *                       double ki;
 *                     }
 *                ===============================
 *                 = 변수 => 묶어서 사용(배열)
 *                 = 명령문 => 묶어서 사용 (메소드)
 *                =============================== 클래스(객체지향)
 *                = 매개변수 사용 => 사용자 요청값
 *                  => 페이지클릭 , 로그인(id,pwd) , 검색(영화명)..
 *                  => 변수명이 같으면 에러발생 
 *                  (int a,int b)
 *                  => 영화중에 현재 상영영화 요청 
 *          3) 리턴형 => 요청에 대한 처리값을 보내준다 
 *                     = 데이터를 전송 (데이터형 : 배열 , 클래스)
 *                     = 그냥 출력 (데이터값을 보내지 않는다 : void)
 *      3. 원형
 *            정수를 결과값으로 하는 메소드 
 *            int add(int a,int b)
 *            ----
 *            {
 *                return int값
 *                       ----- 동일 
 *            }
 *            
 *            자체에서 출력 
 *            void display()
 *            {
 *               return; => 생략이 가능 (생략시에는 컴파일러가 자동으로 return 추가)
 *            }
 *            
 *            return => 메소드 종료 
 *      4. 구현 
 *         선언부 {
 *            구현부 => 평상시 코딩하는 부분 => 클래스로 움직이지 못한다 
 *                    여러개를 연결해서 사용 
 *         }
 *         
 *         예)
 *            자판기 (클래스) => 사람 (행위자)
 *            => 메세지 (메소드 호출)
 *      5. 호출
 *         void print()
 *         => print()
 *            int add(int a,int b)
 *            ---
 *             |        ↖   ↗
 *         => int c=add(10,20) 
 *                  a=10, b=20
 *         => 리턴형 / 매개변수
 *         => main은 프로그램의 시작점 => 가급적 소스코딩이 있으면 
 *            안된다 => 메소드만 호출 
 *      6. 메소드 만드는 목적 
 *         1) 필요시마다 호출해서 사용이 가능 
 *         2) 다른 클래스에서도 사용이 가능하게 만든다 
 *         -------------------------------- 재사용 
 *         3) 반복이 있는 소스 => 반복제거 
 *         4) 가독성이 좋게 만든다 (수정, 삭제, 추가) => 유지보수
 *            기능한개 수행 
 *            예)  게시판 목록,상세,찾기,수정,답변,삭제
 *                => 댓글 
 *            => 소스를 분리(사용이 쉽게)
 *               ------------------ 구조적인 프로그램 (문장=>단락)
 *        
 */
// 사칙연산 => 5개 
// + , - , * , / , 계산기조립 => main
// 사용자(정수2 , 연산자1)
import java.util.Scanner;
public class 메소드제작_1 {
    static int plus(int a,int b)
    {
    	// 사용자가 정수 => 2개 입력후에 더한값을 달라
    	return a+b;
    }
    static int minus(int a,int b)
    {
    	return a-b;
    }
    static int gop(int a,int b)
    {
    	return a*b;
    }
    /*
     *   지역변수 / 매개변수는 {}이 끝나면 자동 사라지는 변수(메모리에서 삭제)
     *   -------------- 저장되는 메모리 공간 (Stack=>관리는 메모리 자체에서 한다)
     */
    static String div(int a,int b)//사용자 요청한 => 매개변수 
    {
    	// 경우의 수 여러개 있는 경우 
    	String result="";//지역변수 => div()안에서만 사용하는 변수 
    	if(b==0)
    		result="0으로 나눌수 없습니다";
    	else
    		result=String.valueOf(a/(double)b);
    	return result;//결과값은 1개만 사용이 가능 
    }
    // 사칙연산 => 계산기 (조립)
    static void process() // 다른 클래스에서 계산기가 필요하면 불러올 수 있다
    {
    	Scanner scan=new Scanner(System.in);
    	System.out.print("첫번째 정수 입력:");
    	int a=scan.nextInt();
    	
    	System.out.print("두번째 정수 입력:");
    	int b=scan.nextInt();
    	
    	System.out.print("연산자 입력(+,-,*,/):");
    	String strOp=scan.next();
    	
    	// String => char로 변경 
        char op=strOp.charAt(0); 
        
        if(op=='+') // if(strOp.equals("+"))
        {
        	int c=plus(a,b);
        	System.out.printf("%d+%d=%d\n",a,b,c);
        }
        else if(op=='-') // if(strOp.equals("+"))
        {
        	int c=minus(a,b);
        	System.out.printf("%d-%d=%d\n",a,b,c);
        }
        else if(op=='*') // if(strOp.equals("+"))
        {
        	int c=gop(a,b);
        	System.out.printf("%d*%d=%d\n",a,b,c);
        }
        else if(op=='/')
        {
        	String res=div(a,b);
        	System.out.printf("%d/%d=%s\n",a,b,res);
        	/*
        	 *   %d => 정수
        	 *   %f => 실수
        	 *   %s => 문자열
        	 *   %c => 문자 
        	 */
        }
    }
	public static void main(String[] args) {
		process(); 
	}

}






