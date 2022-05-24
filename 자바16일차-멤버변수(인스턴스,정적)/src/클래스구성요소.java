/*
 *    1. 클래스의 구성 요소 
 *       --------------
 *        
 *       ==============
 *          멤버변수 
 *            = 인스턴스 : new를 이용해서 메모리에 저장하는 객체변수(따로 저장)
 *              => 가장 많이 사용되는 변수 
 *            = 정적변수 : static => 메모리 공간을 한개만 사용 (공유변수)
 *       ==============
 *          메소드 : 멤버변수를 활용  
 *       ==============
 *          멤버변수 초기화 
 *            = 생성자 
 *            = 초기화 블록 
 *              = 인스턴스 블록 
 *              = static 블록 
 *       ==============
 *       
 *       class className{
 *          선언만 가능 => 구현(제어문 , 메소드 호출 , 변수에 다른 값)
 *          int a;
 *          {
 *            a=10; // 구현 => 에러 코드  => 초기화 블록    
 *          } 
 *          => 자동 로그인 , 파일 읽기 , 데이터베이스 연결 , 서버연결 
 *          int a=10; // 선언 => 명시적 초기화 
 *          => 메소드 선언(메소드 선언/구현)
 *          => 변수 선언 
 *       }
 *       
 *       멤버변수 (전역변수) => 클래스 전체에서 사용되는 변수 
 *         => 선언되는 위치 클래스{}
 *         => 자동 초기화 
 *            int => 0
 *            long => 0L
 *            double => 0.0
 *            String(클래스) => null
 *            boolean => false
 *            ------------------------- heap
 *       지역변수 => 메소드안에서 선언되는 변수 
 *         => 자동 초기화가 안됨 (반드시 초기화후에 사용) ==> stack
 *         
 *         => 변수가 같은 이름이 있을 수 있다 
 *         
 *         class A
 *         {
 *            int a;
 *            
 *            void display()
 *            {
 *               int b=10; // 지역변수 우선순위 
 *               System.out.println(b) => 10
 *               System.out.println(a);
 *            }
 *         }
 *         
 *         변수가 메모리에 저장되는 시점 
 *         ----
 *          멤버변수 포함 (243page)
 *            기본형 (int , long , double , boolean)
 *            배열 
 *            클래스 (String) , 라이브러리 , 사용자 정의 클래스 
 *         ----------------------------------
 *          인스턴스 변수 : 메모리에 저장되는 시점 : new (메모리 저장공간을 만들어 준다)
 *         ----------------------------------
 *          정적변수(클래스 변수, 공유변수) : 컴파일러에 의해 자동 저장
 *         ----------------------------------
 *          지역변수 : 메소드가 호출될때 메모리에 저장 
 *         ----------------------------------
 *         
 */
// class A => int a,int b,int c,static double d,String s; 
// 24byte => 16byte
class Card
{
	int number;
	String image; // 모든 클래스는 4byte메모리를 가지고 있다 
	static int width;
	static int height;
}
/*
 *     ==> 생명주기 
 *     설계  ==============> 메모리에 저장 =======> 활용 ====== 메모리 해제
 *     class(변수/메소드)       new                .           null (GC)
 *     요구사항분석 
 *                        Crad c=new Card()   c.image=""    c=null
 *                                                         ---------
 *       => 멤버변수는 static이 아닌 변수만 (메모리 크기)                                                   사용하지 않는 경우에 메모리가 자동 해제
 *                                                         
 */
public class 클래스구성요소 {
    
    // 하둡 (아들의 장남감) => 노란 코끼리
	// 안드로이드 => 달빅 (고향)
	// 클라우드 (구글) => 사장 ppt
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Card c1=new Card();// 변수/메소드가 저장되는 시점 
        // 사용자정의 클래스의 변수 => 객체 
        // String s , int i , double d , Card c
        System.out.println("c1="+c1);
        // static => 오라클은 전체 공유변수 
        c1.number=3;
        c1.image="♠";
        c1.width=150;
        c1.height=180;
        Card c2=new Card();
        System.out.println("c2="+c2);
        c2.number=5;
        c2.image="♣";
        c2.width=200;// 클래스 변수 
        c2.height=250;
        
        System.out.println("c1.number="+c1.number);
        System.out.println("c1.image="+c1.image);
        
        System.out.println("c2.number="+c2.number);
        System.out.println("c2.image="+c2.image);
        
        System.out.println("c1.width="+c1.width);
        System.out.println("c1.height="+c1.height);
        System.out.println("c2.width="+Card.width);
        System.out.println("c2.height="+c2.height);
        /*
         *  클래스변수 => 공통으로 사용되는 메모리 
         *     호출 방식)
         *       1) 객체.변수명 
         *       2) 클래스명.변수명 
         *     생성 시점)
         *       컴파일러에 의해 자동 생성 
         *  인스턴스(객체)변수 => 객체마다 따로 사용되는 메모리 (new갯수)
         *     호출 방식)
         *       1) 객체명.변수명  
         *     생성 시점)
         *       new를 사용했을때 사용이 가능 
         *       
         *  
         */
	}

}






