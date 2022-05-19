import java.util.Scanner;

/*
 *   객체지향 프로그램 
 *   -------------
 *     구성요소 => 클래스가 2개 이상 (상호 연결) 
 *     사람 = 자판기 
 *     사람 = 컴퓨터 
 *     --- 액터 
 *     웹 = Actor
 *     ------
 *     class 자판기 ==> 겨울 (변경) 냉음료 / 온음료
 *     {
 *       --------------------------
 *         변수 설정 (은닉화) => private 
 *           동전 
 *           음료수 
 *       --------------------------
 *         메소드 : 동작,행위  => 사용이 가능 => public 
 *           동전 투입시 처리 
 *           잔돈 
 *           시작 
 *       --------------------------
 *         생성자 (변수에 대한 초기화) : 필요시에 사용 
 *       --------------------------
 *     }
 *     
 *     1. 메소드는 재사용 , 수정가능 , 추가 (유지보수) 
 *     2. 견고한 프로그램 (구조화) => 기능별 분리 
 *     3. 반복적 소스 => 제거할 수 있다 
 *     -------------------------------------
 *     웹 : 메소드 (70~80%) => 라이브러리 => 변경(오버라이딩) 
 *     ---------------------------------------------
 *     
 *     메소드 제작 방식 
 *     ------------
 *       리턴형 메소드명(매개변수....)
 *       {
 *          = 매개변수 (사용자 요청 데이터)를 받아서 
 *          = 요청 처리 
 *          = 결과값을 보내준다 
 *            ---- 리턴값 
 *       }
 *       
 *       ----------------------------------
 *             리턴형            매개변수
 *       ----------------------------------
 *               O               O
 *       ----------------------------------
 *               O               X
 *                               매개변수가 없는 경우 ()
 *       ----------------------------------
 *               리턴형이 없는 경우 (void:값이 없는 상태)
 *               X               O
 *       ----------------------------------
 *               X               X
 *       ----------------------------------
 *         리턴형으로 사용되는 데이터형 
 *           기본형 (byte,int,long,double , boolean)
 *           참조형 (배열 , 클래스) => String
 *                       ----- 사용자 정의 클래스도 가능(*****)
 *           *** 한개만 지정이 가능 
 *               데이터가 여러개 리턴 (배열,클래스)
 *         매개변수로 사용되는 데이터형 
 *           기본형 (byte,int,long,double , boolean)
 *           참조형 (배열 , 클래스) => String
 *                       ----- 사용자 정의 클래스도 가능(*****)
 *           *** 여러개 사용이 가능 ( ,를 이용해서 구분)
 *               ----- 1,2=> 일반데이터형 (기본형)
 *               ----- 3개이상 (배열,클래스) 
 *               
 *         원형 
 *         ---
 *         1. 정수를 결과값으로 하는 메소드 
 *            int 메소드명()
 *            ---- 리턴값보다 크게 설정 할 수 있다(long , double)
 *            {
 *               ---
 *               ---
 *               return 정수값; // 메소드 종료 
 *                      ----- 일치
 *            }
 *         2. 문자열 결과값으로 하는 메소드 
 *            String 메소드명()
 *            {
 *               ---
 *               ---
 *               return "";
 *            }
 *         3. boolean 메소드명()
 *            {
 *                ---
 *                ---
 *                return true/false;
 *            }
 *         4. 리턴형이 없는 경우 
 *            void 메소드명()
 *            {
 *               ---
 *               ---
 *               return; // 생략이 가능 (컴파일러가 자동 추가)
 *            }
 *            
 *         5. 매개변수가 있는 경우 
 *            로그인 => id,pwd(사용자)
 *            리턴형 메소드명(String id,String pwd)
 *            {
 *            }
 *         6. 정수가 두개일 경우
 *            리턴형 메소드명(int a,int b)
 *            {
 *            }
 *         7. 정수가 5개일 경우 
 *            리턴형 메소드명(int a,int b,int c,int d,int e)
 *            {
 *            }
 *            
 *            => 리턴형 메소드명(int[] arr)
 *            
 *         8. 데이터가 여러개 
 *            id , age , birthday , post , tel 
 *            리턴형 메소드(String id,int age,Date birthday,
 *                      String post,String tel)
 *            {
 *            }
 *            
 *            class Member
 *            {
 *               String id;
 *               int age;
 *               Date birthday;
 *               String post;
 *               String tel;
 *            }
 *            리턴형 메소드(Member m)
 *            {
 *            }
 *           ----------------------------------
 *          
 */
// 문제풀이 => 시험 => OX
public class 메소드정리 {
    // 지역변수 => 메소드안에서 변수 설정 
	// class {}안에서 설정 (전역변수) => 전체 메소드에서 사용이 가능 
	static char[] munje()
	{
		char[] m=new char[10];
		for(int i=0;i<m.length;i++)
		{
			int k=(int)(Math.random()*2); // 0,1
			if(k==0)
				m[i]='O';
			else
				m[i]='X';
		}
		/*for(char c:m)
		{
			System.out.print(c+" ");
		}*/
		return m;
	}
	static char[] user()
	{
		char[] u=new char[10];//지역변수
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<u.length;i++)
		{
			System.out.print((i+1)+"번째 답 입력(O,X):");
			String s=scan.next();
			char dap=s.charAt(0);
			u[i]=dap;
		}
		/*for(char c:u)
		{
			System.out.print(c+" ");
		}*/
		return u;
	}
	// 결과 
	static int result(char[] d,char[] u)
	{
		int count=0;
		for(int i=0;i<d.length;i++)
		{
			if(d[i]==u[i])
				count++;
		}
		System.out.println("=== 정답 ===");
		for(char c:d)
		{
			System.out.print(c+" ");
		}
		System.out.println();
		for(char c:u)
		{
			System.out.print(c+" ");
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        char[] m=munje();
        char[] u=user();
        int res=result(m, u);
        System.out.println("점수:"+(res*10)+"점");
	}

}








