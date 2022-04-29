// 변수 선언 
/*
 *    정수(int) 5개를 선언 한다 (a,b,c,d,e)
 *    int a;
 *    int b;
 *    int c;
 *    int d;
 *    int e; 
 *    
 *    ==================
 *    int a,b,c,d,e;
 *    
 *    초기값 
 *    int a=1;
 *    int b=2;
 *    int c=3;
 *    int d=4;
 *    int e=5; 
 *    =========================
 *    int a=1,b=2,c=3,d=4,e=5;
 *    
 *    초기값 
 *    int a=1;
 *    int b=1;
 *    int c=1;
 *    int d=1;
 *    int e=1; 
 *    ========================
 *    int a,b,c,d,e;
 *    a=b=c=d=e;
 *    ======================== 프로그램 (정답이 없다) 
 *     실행 결과값이 요구한 내용이 나오면 => 정답 (최적화) 
 *     
 *    23page 변수값 교환 
 *    int a=10;
 *    int b=20;
 *    ----------------------- b=10,a=20
 *    
 */
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		int temp=a; //temp=10; => 원본 
		a=b;//a=20
		System.out.println("a="+a);
		b=temp; //b=20
		System.out.println("b="+b);// 정렬 (임시변수)
		//메모리에 저장하고 저장된 값을 읽어 올때 (변수를 이용해서 읽어 온다)
		/*
		 *   int a=10;  10,a
		 *   System.out.println(10)
		 *   System.out.println(a);
		 *   a=100; // 데이터 가공 (사용자 요청)
		 *   => 프로그램 
		 *      변수 / 메소드 (기능처리) 
		 *      ------------------- 클래스 (재사용) 
		 *      
		 *   모든 프로그램은 데이터 관리 
		 *              ---------- 저장 (메모리 , 파일 , 오라클) 
		 */
		// Web은 문자만 사용 
	    char c1='A';
	    char c2='홍';
	    char c3='\n';// new line => 다음줄 출력 
	    /*
	     *   특수문자 
	     *   \n , \t(tab) , \"("출력) , \\ (\한개 출력) 
	     *   newLine
	     */
	    System.out.println("c1="+c1);
	    System.out.println("c2="+c2);
	    System.out.println("c3="+c3);
	    System.out.println("Hello~");
	    
	    System.out.println("\"Hello\"");//"Hello"
	    
	    boolean b1=true;
	    boolean b2=false; // 제어문 (반복문 ,조건문)
	    System.out.println("b1="+b1);
	    System.out.println("b2="+b2);
	    
	    // C언어와 다른점 => C언어는 무조건 처음에 변수 선언 
	    // 자바는 필요한 위치에서 언제든 변수 선언이 가능 
	    /*
	     *   int / long ==> L(l)
	     *   float / double ==> F(f) 
	     *   
	     *   System.out.println(1000) => int(정수)
	     *   System.out.println(10.5) => double(실수)
	     */
	    //float f=10.5F;
	    //출력 / 입력 
		
	}

}
