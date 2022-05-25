import java.util.Arrays;

/*
 *    클래스 구성요소 
 *    ============
 *    
 *      ***1) 변수 (멤버변수) => 속성 
 *      ***2) 메소드        => 기능 / 동작 / 행위 
 *      3) 생성자        => 변수의 초기화 
 *    ============ 변경 (유지보수가 편리하게)
 *      객체지향의 3대 요소 
 *      => 캡슐화 (데이터 보호)
 *      => 재사용 (상속/포함)
 *      => 다형성 (수정 , 추가) 
 *    =======================================
 *     클래스의 종류 (추상 클래스 / 인터페이스 사용처) 
 *    ======================================= 6장/7장 
 *    
 *    비정상 종료가 없는 프로그램 (견고한) => 예외처리 (8장)
 *    ============================================== 
 *    
 *    메소드 
 *     = 멤버메소드 (클래스 객체만 사용하는 메소드)
 *     = 정적메소드 
 *     = 선언만하는 메소드 (추상,인터페이스)
 *       버튼 클릭 => 메소드만 지원 
 *       마우스 클릭 
 *    -----------------------------------
 *    
 *    249페이지 
 *    정의 : 
 *         1. 재사용을 목적으로 (특정 작업을 수행하는 명령문의 집합)
 *         2. 객체지향은 프로그램은 객체와 객체의 상호 연결 
 *            예)  자판기 <===> 사람 
 *                      메세지 => 메소드 
 *                 * 다른 클래스와 연결시에 메소드를 이용해서 연결한다 
 *                 * 오라클   =====  자바
 *                       메소드를 이용해서 통신 (요청 => 결과값 얻기)
 *         3. 기능별 분리 => 유지보수 (수정 , 추가)
 *         4. 중복 코딩을 제거할 수 있다 
 *         5. 구조적인 프로그램 (단락) => 가독성 (분석)
 *     => 모듈 (구조적=>관련된것을 모아서 관리)
 *        === => 함수 VS 메소드 (85%)
 *        1. 클래스 : 자바
 *        2. 메소드 : C
 *        
 *        => 1. 메소드 (명령문 모음)
 *           2. 클래스 
 *     1) 메소드 형식 
 *        252page 
 *        리턴형 메소드명(매개변수....) // 선언문 
 *        {
 *            // 구현 
 *            메소드 종료시에 
 *            return 값(결과값)
 *            --------------- return 생략은 void일때만 생략
 *        }
 *        
 *        리턴형 : 사용자 요청한 결과값 전송 => 한개만 설정 
 *               => 여러개의 데이터를 보낸다 
 *               => 배열 , 클래스 , 컬렉션 , 기본데이터형 
 *               기본데이터형 1개 
 *               => 경우의 고민 
 *                  예)
 *                      정수 2개 => 더한값을 보내달라 (1)
 *                      로그인 여부를 확인 (id,pwd)
 *                       => 경우의 수(로그인(O),로그인(X))
 *                       => boolean 
 *                      3개 이상 => 
 *                      사용자 데이터를 1개 전송 => 대문자,소문자,숫자 
 *                       => 정수/문자열 (문자열) 
 *              => 구구단을 출력 , 화면에 그림을 그려라 => 
 *                 리턴형의 값이 존재하지 않는 경우 (void)
 *                 메소드 자체에서 처리 (도스)
 *        메소드명 : 식별자이용 
 *                => 소문자로 시작한다 
 *                => 클래스(소문자) , 메소드(대문자) , 변수(대문자)
 *                   문법상에 문제없다 
 *                   ------------------------------------
 *                   
 *        매개변수 : 클래스와 클래스를 연결 (연결도구)
 *                 사용자가 보낸 요청값
 *                 여러개 사용이 가능 (단 3개이상이면 =>배열 ,클래스를 사용)
 *                 보내주는 데이터가 확실하지 않는 경우 (가변매개변수)
 *                 데이터형가 틀릴 수도 있다 (Object)
 *                                   ---------- 데이터형중에 가장 큰 데이터형
 *                 가변형 매개변수 => int... arg
 *         
 *       printf(String format, Object... args)
 *       
 *       return : 메소드 종료를 알려준다 
 *                1) 보내주는 값이 있는 경우 : return 값;
 *                2) 보내줄 값이 없는 경우 : 생략 , return;
 *                                    -----
 *                                    컴파일러가 자동을 리턴을 첨부 
 *       --------------------------------------------------
 *       메소드는 호출시에 => { 시작 } 끝까지 무조건 수행 => 호출한 위치도 돌아간다
 *       호출
 *         1)static
 *           클래스명.메소드명(값,값);
 *           Math.random()
 *           String.valueOf(10)
 *           ***
 *         2)instance
 *           객체명.메소드명(값,값);
 *           scan.nextInt()
 *           s.substring(1,10)
 *           
 *    메소드 형식)
 *    
 *        리턴형     매개변수 
 *        ===============
 *          O        O
 *          String substring(int s,int e)
 *          int indexOf(String s)
 *          int max(int a,int b)
 *          데이터베이스 => SELECT
 *        ===============
 *          O        X
 *          double random()
 *          String trim()
 *        ===============
 *          X        O
 *          void println(String s)
 *          void println(char[] c)
 *          void println(int a)
 *          void println(double d)
 *          void println(byte b)
 *               ------------------ 오버로딩 (중복메소드 정의)
 *        ===============
 *          X        X
 *          void println() =>다음줄에 출력 
 *        ===============
 *       
 *      매개변수 전송법 
 *        = 값만 전송(Call By Value) => 기본형 => 메모리가 따로 생성 
 *        = 주소값을 전송 (Call By Reference) => 배열,클래스 => 같은 메모리에서 작업
 *                                           (제외 : String => 일반 기본형)
 * 
 *      class Calc
 *      {
 *          String f,e;
 *          String op;
 *          
 *          int add()
 *          {
 *          }
 *          int minus()
 *          {
 *          }
 *      }
 *      
 *      Calc c=new Calc();
 *      
 *        c ==> Stack
 *      ------
 *       0x100
 *      ------   ↖    
 *                   0x100
 *                  ---------
 *                     f  ===> c.f
 *                  ---------
 *                     e  ===> c.e
 *                  ---------
 *                     op ===> c.op
 *                  ---------
 *                    add() ==> c.add()
 *                  ---------
 *                    minus() ==> c.minus()
 *                  ---------
 *       Calc c1=new Calc();
 *      
 *        c1 ==> Stack
 *      ------
 *       0x200
 *      ------   ↖    
 *                   0x200
 *                  ---------
 *                     f  ===> c1.f
 *                  ---------
 *                     e  ===> c1.e
 *                  ---------
 *                     op ===> c1.op
 *                  ---------
 *                    add() ==> c1.add()
 *                  ---------
 *                    minus() ==> c1.minus()
 *                  ---------
 *       Calc c2=new Calc();
 *              ----- 저장 공간을 만든다 
 *      
 *        c2 ==> Stack
 *      ------
 *       0x300
 *      ------   ↖    
 *                   0x300
 *                  ---------
 *                     f  ===> c2.f
 *                  ---------
 *                     e  ===> c2.e
 *                  ---------
 *                     op ===> c2.op
 *                  ---------
 *                    add() ==> c2.add()
 *                  ---------
 *                    minus() ==> c2.minus()
 *                  ---------
 */
class Util
{
	// 정렬후에 출력 => void
	/*
	 *   저장이 안된 상태 
	 *   => Util u=new Util(); => sort()가 저장된다 
	 *      u.sort()
	 *      Util u1=new Util();
	 *      u1.sort()
	 *      new => 저장 공간이 틀려진다 
	 *      
	 *      Util u2=u; // 참조 (별칭)
	 */
	void sort(char[] c)
	{
		System.out.println("sort:c="+c);
		for(int i=0;i<c.length-1;i++)
		{
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]>c[j])
				{
					char temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
		}
		
		System.out.println("정렬 후:");
		for(char a:c)
		{
			System.out.print(a+" ");
		}
	}
	
	
	// 정렬후에 결과값을 전송 => 리턴형 
	char[] rsort(char[] c)
	{
		System.out.println("sort:c="+c);
		for(int i=0;i<c.length-1;i++)
		{
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]<c[j])
				{
					char temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
		}
		
		return c;
	}
}
/*class A
{
	static int a=10;
}*/
public class 자바메소드_1 {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *   A a=new A();
		 *   A b=a;
		 *   
		 *   int[] a={};
		 *   int[] b=a;
		 */
		Util u=new Util(); //u=>sort(),rsort() => 메소드 저장 
		char[] c={'K','A','C','B','E'};
		System.out.println("정렬 전:");
		for(char a:c)
		{
			System.out.print(a+" ");
		}
		System.out.println();
		u.sort(c);// 메소드 호출 
		System.out.println("main:c="+c);
		System.out.println("main:c="+Arrays.toString(c));
		
		char[] cc=u.rsort(c);
		System.out.println(Arrays.toString(cc));
        /*A aa=new A();  // aa=>a
        System.out.println(aa.a);
        A bb=aa;
        A cc=new A();
        
        bb.a=100;
        cc.a=200;
        System.out.println("cc="+cc);
        System.out.println("bb="+bb);
        System.out.println("aa="+aa);
        System.out.println("aa.a="+aa.a);*/
	}

}
