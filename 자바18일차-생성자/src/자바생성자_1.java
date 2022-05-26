/*
 *   리턴형 / 매개변수 => 메소드 
 *   ------------- *** 제어문 (반복문 / 조건문)
 *   
 *   라이브러리 => 프로그램 순서 
 *   
 *   클래스 구성요소 
 *   -----------
 *   1. 변수 : 프로그램에 필요한 데이터 설계 
 *   2. 메소드 : 기능 설정 
 *       = 오버로딩 
 *       = 오버라이딩 
 *       = 접근 범위 지정 
 *       = 선언 , 선언과 구현 
 *       = 상속이 안되게 만드는 방법 
 *   3. 생성자 (변수에 초기화,시작과 동시에 처리하는 명령문)
 *            ---------- ----------------------- 데이터베이스 연결,서버연결,자동 로그인
 *            1. 명시적인 초기화 
 *            ***2. 파일을 읽어서 변수 초기화 
 *            ***3. 사용자입력후 초기화 
 *   ==> 291page 
 *       생성자 : 객체생성시에 호출되는 메소드 
 *              멤버변수의 초기화 
 *              A a=new A();
 *                      ---
 *              new => 메모리를 만들어서 주소값을 a에 저장해주는 역할 
 *              A() => 메모리에 있는 변수의 초기값 
 *              생성자는 단독으로 호출이 불가능하고 new 동시에 호출
 *       class A
 *       {
 *          A(){}
 *       }
 *       
 *       A() => 오류  ==> new A();
 *       
 *       1) 특징 
 *          = 클래스명과 동일 
 *          = 리턴형이 없다 
 *          class A
 *           A()
 *           A(int a)
 *           A(int a,int b)
 *           ----------------- 여러개를 만들어서 사용이 가능 
 *             => 오버로딩 
 *           void A() => 일반 메소드 (생성자가 아니다) 
 *          = 오버로딩을 지원한다 (여러개 생성자를 만들 수 있다)
 *          = 생성자는 생략이 가능 (컴파일러에 의해 자동으로 추가:디폴트 생성자)
 *            => () => 매개변수가 없는 생성자 
 *            => 필요시마다 만들어서 활용
 *            => 웹에서는 반드시 필요 (데이터베이스:드라이버연결)
 *      # 변수가 설정 => 초기값 
 *      
 *      class A
 *      {
 *          int a;
 *          a=10; => 오류 
 *          A()
 *          {
 *             a=10;
 *          }
 *          A(int aa)
 *          {
 *             a=aa;
 *          }
 *          A()
 *          {
 *             Scanner scan=new Scanner(System.in);
 *             a=scan.nextInt();
 *          }
 *      }
 *      초기화 => {} , static{}
 *      
 *    1. new 생성자()
 *       ---------- 
 *       생성자는 객체(인스턴스가 생성될때 호출되는 메소드)
 *       // 생략 
 *       
 *       1) class A extends Object
 *                  --------------
 *       2) import java.lang.*;
 *          => String , Math , System 
 *       3) 모든 클래스의 생성자 
 *       4) try~catch => 자바의 모든 라이브러리는 예외처리 
 *          => 컴파일(javac) / 인터프리터(java) => 실행시
 *       5) void가 있는 메소드는 return
 *       6) 클래스의 인스턴스메소드 =>  this를 생략
 *       class B
 *       {
 *          int a=30;
 *       }
 *       class A extends B
 *       {
 *          int a=20;
 *          void display()
 *          {
 *             int a=10;
 *             System.out.println(a) => 20
 *             System.out.println(this.a) => 20
 *             System.out.println(super.a)
 *          }
 *       }
 *       우선순위 => 지역변수,매개변수 ==> 멤버변수
 *     ==========================================
 *     292page  int[] a=new int[5]
 *     => 
 *        class Card
 *        {
 *           int number;
 *        }
 *        class Card
 *        {
 *           int number;
 *           String image;
 *        }
 *        class Student
 *        {
 *           int hakbun;
 *           String name;
 *           -------------
 *           String subject;
 *           String sex;
 *           
 *        }
 *        Card c=new Card() : 인스턴스생성(객체)
 *       ----- - --- ------
 *                     | 메모리에 저장된 변수의 초기값
 *                       동작을 바로 할 수 있게 하는 역할 
 *                    class Card
			 *        {
			 *           int number;
			 *           String image;
			 *        }
 *                | 1) 자바에서는 메모리 크기를 알 수 없다 
 *                  2) 메모리크기를 확인  => malloc(sizeof(Card))
 *                     8byte 
 *                  3) 메모리 확보
 *                     메모리 주소  =======> c에 대입 
 *                     ---------------
 *                       ----------
 *                       number
 *                       ----------
 *                       image
 *                       ----------
 *                     
 *                     ---------------
 *                      
 *         |   |변수명
 *       데이터형(사용자)
 *       int,double 동일 
 *       int a
 *       =========== 기본형(자바에서 지원) 
 *       
 *       컴퓨터 c=new 컴퓨터() => 전원 설치 
 *       ------ --- ------
 *               | 자리배치 
 *       생성자를 호출 ========> new 생성자()
 *       
 *       클래스 설계 => 공장 출시 
 *                   -------
 *                      | 객체 
 *                        Computer hong=자리배치 => 전원 연결 =>  시작
 *                                       new     Computer()  메소드
 *                        Computer shim=자리배치 => 전원 연결 =>  시작 
 *                                       new     Computer()  메소드
 *                                       
 *                        컴퓨터 사용 ==> 마우스 , 키보드 , 터치
 *                           셋팅 => Computer(마우스) 
 *      292page 
 *        = 기본 생성자 
 *           ** 293page 마지막줄 
 *              기본생성자가 컴파일러에 의해 추가되는 경우는 
 *              클래스에 정의된 생성자가 없는 경우 
 *              ** 모든 클래스는 생성자 한개이상 반드시 가지고 있어야 한다
 *              
 *          형식)
 *                class 클래스명{
 *                   String[] names=new String[10];
 *                   // 초기값을 사용하는 코드를 사용 할 수 없다 
 *                   클래스명(){
 *                     => 시작과 동시 처리할 명령문 
 *                     => 파일읽어서 names값을 설정 
 *                   }
 *                   ==> 한번만 호출할 수 있다 
 *                   void init()
 *                   {
 *                      => 파일읽어서 names값을 설정
 *                   }
 *                }
 *                
 *          class A
 *          {
 *             => 컴파일러가 생성자를 첨부 
 *             A(){} =>기능이 없다 
 *          }
 *          
 *          => A a=new A();
 *          class A
 *          {
 *             A(){} => 생성자 존재 => 기능 설정 
 *          }  
 *          => A a=new A();
 *          class A
 *          {
 *             A(int a){} => 생성자 존재 
 *          }
 *          => A a=new A();==>오류 
 *             A a=new A(10);
 *        = 매개변수가 있는 생성자 
 *        
 *        class A
 *        
 *        new A();
 *        new A();
 *        new A();
 *                                  
 */
class Student1
{
   void Student1()
   {
	   System.out.println("생성자");
   }
   Student1()
   {
	   
   }
}
public class 자바생성자_1 {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student1 s=new Student1();
        s.Student1();
	}

}
