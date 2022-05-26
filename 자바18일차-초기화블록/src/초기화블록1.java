/*
 *   클래스 구성 
 *   --------
 *     변수 
 *       = 개별적 저장 (인스턴스 변수)
 *       = 공통적 저장 (static 변수)
 *     메소드 
 *       = 변수에 대한 활용 
 *       = 요청값(매개변수) / 결과값(리턴형) 
 *     생성자 
 *       = 인스턴스 생성시 호출 
 *       = 변수에 대한 초기화 
 *       = 오버로딩 
 *       = 자신의 클래스에서 생성자 호출 => this()
 *   *** 호출 
 *       1) 객체 생성 
 *       2) 객체.메소드명() , 객체.변수명
 *       3) static => 클래스명.메소드명() , 클래스명.변수명 
 *       
 *   *** 변수 (멤버변수 / 지역변수 / 매개변수) => 초기값
 *        멤버변수(클래스 영역에 선언된 변수) : 자동 초기화 
 *        int => 0, double => 0.0 , 클래스 => null , boolean=false
 *        class A
 *        {
 *           int a; ==> 0
 *           boolean b;=> false
 *           String s; => null
 *           static int aa; => 0
 *           
 *        }
 *        지역변수/매개변수 => 초기값이 없다 (지역변수는 반드시 초기화)
 *        void display()
 *        {
 *           int a;
 *           System.out.println(a) => 오류 
 *        }
 *        
 *        // 변수는 무조건 초기화 
 *        ------------------
 *        클래스 영역에 선언된 변수 (인스턴스,정적)
 *        -------------------------------
 *        1. 디폴트 : 자동 지정
 *           class A
 *           {
 *              int a;
 *           }
 *        2. 임의의 초기화 : 명시적 초기화 
 *           class A
 *           {
 *              int a=100;
 *              
 *              
 *           }
 *           
 *           => 초기값 : 외부에서 읽어 올때 ,데이터베이스 읽기, 파일읽기 
 *                     -----------------------------------
 *                      구현 => 클래스 영역에서 사용할 수 없다 
 *              => 생성자 
 *              => 초기화블록 => 자동 수행 (호출하는 것이 아니다)
 *                  300page
 *                 1) 인스턴스 
 *                 class A
 *                 {
 *                     int a;
 *                     
 *                     {
 *                        a=100;
 *                     }
 *                 }
 *                 2) static 
 *                 class A
 *                 {
 *                    static int a=100;
 *                    a=200;
 *                    static
 *                    {
 *                       // 크롤링 , 파일일기 , 데이터베이스 
 *                    }
 *                    생성자()
 *                    {
 *                      연산처리 ,제어문 , 메소드호출 => 구현 
 *                    }
 *                    메소드()
 *                    {
 *                       
 *                    }
 *                 }
 *                 
 *                 => 값을 변경 => 메소드 
 *                      
 *           
 *        
 *        1. 명시적 초기화 
 *        2. 초기화 블록
 *        3. 생성자 
 *        
 *        class A
 *        {
 *           int a=300;
 *           
 *           {
 *              //a=200;
 *              파일읽기 
 *           }
 *           
 *           A(int aa)
 *           {
 *              a=aa
 *              사용자 보내준 데이터로 초기화 
 *           }
 *        }
 *        
 *        Sawon s=new Sawon();
 *        s.id
 *        
 *        Sawon.id
 *        
 *        => 인스턴스 변수 초기화 
 *           ------
 *             생성자 호출 
 *           class A
 *           {
 *              int a;
 *           }
 *           
 *           A aa=new A(); => 생성자
 *           
 *           static 
 *           
 *           class A
 *           {
 *              static int a;
 *              static
 *              {
 *                 a=100;
 *              }
 *           }
 *           
 *           A.a => 메모리 할당없이 사용이 가능 
 *          
 */
class Sawon
{
	String name="홍길동";
	static String id="admin";
	/*
	 * static { id="hong"; }
	 */
	
	{
		name="심청이";
		System.out.println("초기화 블록 수행");
	}
	// 인스턴스변수의 초기화 => 생성자 
	Sawon() {
		name="이순신";
		id="hong";
		System.out.println("생성자 수행");
	}
	
	// static 초기화블록을 주로 이용한다 
	// static은 자동 저장 => 생성자를 호출 할 필요가 없다 
}
public class 초기화블록1 {
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("ID:"+Sawon.id);
		Sawon s=new Sawon();
        System.out.println("이름:"+s.name);
       
        
	}

}
