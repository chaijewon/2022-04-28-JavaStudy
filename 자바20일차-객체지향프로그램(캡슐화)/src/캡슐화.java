/*
 *    1. 클래스 구성요소 
 *       1) 변수 => 초기화 => 시작과 동시에 동작 
 *       2) 구성 요소 
 *          *** 클래스 => 한개를 만들어서 여러개 메모리에 저장 (설계)
 *          변수 
 *            = 멤버변수 (클래스 영역에 선언되는 변수) => 프로그램 종료시까지 사용이 가능
 *               = ***인스턴스 변수 : 객체 생성시마다 따로 저장되는 변수 
 *               = 정적 변수 : 공통으로 사용되는 변수가 있는 경우에 설정 
 *            = 지역변수 : 메소드 호출시마다 생성되는 변수 
 *          메소드 : 동작 , 행위 (사용자 요청 => 메뉴 , 버튼 ...)
 *          생성자 : 변수의 초기화 (멤버변수) 
 *                 ----------
 *                  생성자 이용 
 *                  초기화 블록 ( 인스턴스 블록 / 정적 블록 )
 *                  --------------------------------
 *                    ** 인스턴스 변수 => 초기화시에 보통 이용 (생성자)
 *                       --------------- 생성자를 호출해야 저장이 된다 
 *                    ** 정적(static) 변수 => 초기화시에 static블록 
 *                       --------------- 생성자를 호출할 필요가 없다
 *                       *** 파일 읽기 초기화 : 자동 로그인 (Cookie)
 *                       *** 데이터베이스 읽기 초기화 : 드라이버 설치 (클래스)
 *                       *** 시작동시에 작업할 일 : 윈도우 
 *                       *** 생성자 , 초기화 블록은 필요시에 사용 
 *                           --------------- 상속 예외 조건
 *                           *** 생성자 / 초기화 블록 / static 
 *                           *** private => 상속은 된다(단 사용을 못한다)
 *          
 *       
 *    2. 객체지향 프로그램 
 *       *** 관련된 변수/메소드/명령문을 묶어서 관리 
 *       프로그램 
 *       ------
 *        변수 (데이터 저장)
 *        명령문 
 *          = 메모리 저장 : int a=10; , A a=new A(); => 데이터 저장
 *                       int[] arr=new int[5] 
 *          = 연산자  : int c=a+b;
 *          = 제어문 : 문장 수행이 없는 경우 , 반복 , 선택 ....
 *        --------------
 *        객체지향 => 유지보수 목적 (쉽게 , 재사용 , 변경 용이 , 추가 용이)
 *                            --------------------------------
 *        1) 묶는 방법 
 *           = 데이터를 묶어서 사용 
 *              = 같은 데이터끼리 묶어서 사용 (배열)
 *              = 다른 데이터를 묶어서 사용 (클래스)
 *           = 명령문을 묶어서 사용 
 *              = 메소드 
 *           = 데이터+명령문 
 *              = 클래스 
 *           = 통 묶어서 사용 (*******)
 *              = 패키지 
 *           *** 변수/메소드(연산자,제어문)
 *           
 *           1. 데이터가 손상 , 변질 , 해킹 => 데이터 보호(캡슐화)
 *           2. 재사용 => 공통적인 데이터와 기능을 모아서 관리 
 *              -----------------------------------
 *               = 상속 (is-a) => 윈도우 모양 변경 
 *                 = 윈도우 
 *                   class MyWindow extends JFrame
 *                                 ---------
 *                                 기존의 클래스를 확장해서 새로운 클래스를 만든다 
 *               = 포함 (has-a) => 있는 그대로 사용 
 *                   class MyWindow{
 *                      JFrame f=new JFrame();
 *                   }
 *              --------------------------------
 *           3. 수정 (기존의 기능 수정) => 오버라이딩
 *              추가 (기존의 기능 추가) => 오버로딩 
 *              -------------------------------- 다형성 
 *        2) 재사용 
 *           -----
 *           기존의 만들어진 클래스 사용 : 라이브러리 => 프로그램에 맞지 않는 경우 오버라이딩후 사용  
 *           사용자가 만든 클래스 사용 
 *        3) 에러 발생 / 비정상 종료 => 정상 수행이 가능 하게 만든다 
 *           에러 => 에러처리후 복구 (에러복구)
 *           에러 => 에러회피 
 *           ** 사용자가 입력값 
 *           ** 프로그래머 실수 
 *           예외처리 => 8장 
 *           ==> 문법 사항 
 *           
 *           ********* 자바입문과정 , 오라클 (DML) => CURD
 *                                              ------ 검색,추가,수정,삭제
 *                                              Join , SubQuery 
 *                                              View , Sequence
 *           ----------------------------
 *           2차 자바 (패턴(스프링) / 알고리즘)
 *           ***3차 자바 (데이터분석) 
 *       1. 캡슐화 
 *          -----
 *          1) 접근지정어 => 344page  
 *          ----------
 *             private / protected / default / public 
 *             static / final / abstract / synchronized 
 *             ------
 *             static => 공통적인 
 *             final  => 마지막 (상수)
 *                       변수 => 상수 
 *                       클래스 => 상속이 없는 클래스 
 *                               String , System, Math
 *             abstract => 추상적인 , 구현이 안된 (추상클래스 , 인터페이스)
 *             synchronized => 동기적인 (쓰레드) 
 *          2) private / protected / default / public
 *          
 *             변수   ===> [접근지정어][옵션] 데이터형 변수명
 *                        ---------
 *             메소드  ===> [접근지정어][옵션] 리턴형 메소드명(매개변수)
 *                        ---------
 *             생성자  ===> [접근지정어] 생성자()
 *             클래스  ===> [접근지정어][옵션] class 클래스명 
 *          ----------------------------------------------------
 *               자신의 클래스  같은 폴더(패키지)  같은 폴더       모든클래스
 *                                        다른 폴더(상속)
 *          ----------------------------------------------------
 *     private      O
 *          ----------------------------------------------------
 *     default      O            O
 *          ----------------------------------------------------
 *     protected    O            O            O (거의 사용빈도가 없다)
 *          ----------------------------------------------------
 *     public       O            O            O            O
 *          ----------------------------------------------------
 *          private < default < protected < public 
 *          
 *          변수  ==> private(은닉화) : 데이터 보호
 *          메소드 ==> 다른 클래스 통신 담당 => public 
 *          생성자 ==> 다른 클래스에서 사용을 하기 위해서는 메모리 할당 => public
 *          클래스 ==> 모든 곳에서 사용이 가능 => public 
 *             
 *          
 */
// 캡슐화 코딩 
/*
 *   캡슐화 (349page)
 *    => 외부(다른 클래스)로부터 데이터를 보호하기 위해 
 *       내부에서만 사용되는 , 부분을 감추기 위해서 
 *       ---------------------------------
 *       
 *   => 예)
 *      자판기 
 *      class 자판기
 *      {
 *         int 음류수;
 *         int 동전  
 *         ------------------  자판기 문을 열어둠 
 *      }
 *      
 *      class 자판기 
 *      {
 *         private int 음류수;
 *         private int 동전;
 *         
 *          메소드를 통해서 접근이 가능 
 *          동전투입()
 *          선택()
 *      }
 */
class Sawon
{
	// 접근 범위를 => 같은 폴더상에서는 접근이 가능 (default)
	// 은닉화 
	private int sabun;
	private String name;
	private String dept;
	private String job;
	private int pay;
	// 필요시에 사용이 가능 => getter/setter => 메소드를 통해서 접근이 가능
	// 캡슐화  getter => s1.sabun 
	//       setter => s1.sabun=1
	public int getSabun() {
		return sabun;
	}
	public void setSabun(int sabun) {
		this.sabun = sabun;
		// 지역변수와 멤버변수와 동일할때 구분 => this(클래스자신의 객체)
		// 지역변수 우선 순위 (지역변수: 메소드에서 선언,매개변수)
		/*
		 *   this : 자신의 객체 => 모든 메소드, 모든 변수 사용이 가능 
		 *   ------
		 *   모든 객체는 this를 가지고 있다 
		 *   Sawon s1=new Sawon();
		 *     this=s1;
		 *     s1.
		 *   Sawon s2=new Sawon();
		 *     this=s2;
		 *     s2.
		 *   this => static => 주소를 변경해서 사용 
		 *   
		 *   1. this를 사용하는 위치 
		 *   => 인스턴스 메소드 , 생성자에서만 사용이 가능 
		 *      = 인스턴스변수 
		 *      => static 메소드에서 사용이 불가능 
		 *   
		 */
	}
	
	public String getName() {
		System.out.println("this="+this);
		
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	
}
public class 캡슐화 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sawon s1=new Sawon(); 
		// s1=> sabun,name,dept,job,pay
		// this=s1
		System.out.println("s1="+s1);
		s1.setSabun(1);
		s1.setName("홍길동");
		s1.setDept("개발부");
		s1.setJob("대리");
		s1.setPay(3500);
		
		//////////////////  변수 쓰기 
		System.out.println(s1.getSabun()+" "
				+s1.getName()+" "
				+s1.getDept()+" "
				+s1.getJob()+" "
				+s1.getPay());
		Sawon s2=new Sawon();
		System.out.println("s2="+s2);
		s2.setSabun(2);
		s2.setName("심청이");
		s2.setDept("개발부");
		s2.setJob("대리");
		s2.setPay(3500);
		//////////////////  변수 쓰기 
		System.out.println(s2.getSabun()+" "
				+s2.getName()+" "
				+s2.getDept()+" "
				+s2.getJob()+" "
				+s2.getPay());
		//Sawon s2=new Sawon();
        // 메모리 저장 
		/*Sawon s1=new Sawon();
		// s1=> sabun,name,dept,job,pay
		s1.sabun=1; // 쓰기 
		s1.name="홍길동";
		s1.dept="개발부";
		s1.job="대리";
		s1.pay=3500;
		Sawon s2=new Sawon();
		// s2=> sabun,name,dept,job,pay
		s2.sabun=2;
		s2.name="심청이";
		s2.dept="개발부";
		s2.job="대리";
		s2.pay=3500;
		
		System.out.println(s1.sabun+" "
				+s1.name+" "
				+s1.dept+" "
				+s1.job+" "
				+s1.pay);
		System.out.println(s2.sabun+" "
				+s2.name+" "
				+s2.dept+" "
				+s2.job+" "
				+s2.pay);*/
		
		
	}

}
