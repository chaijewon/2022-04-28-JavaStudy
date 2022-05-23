/*
 *     데이터저장 
 *      = 메모리 (RAM) = 프로그램 종료시 메모리 해제 
 *        => 한개 (변수)
 *           같은 데이터형 여러개 (배열)
 *           다른 데이터형 여러개 (클래스)
 *      = 파일 => 프로그램에서 필요시에서 읽어서 메모리레 저장 
 *      = RDBMS (관계형 데이터베이스) : 오라클 , MySQL , MariaDB
 *        => 읽어와서 제어 
 *      = 자바/오라클/HTML
 *                 =CSS
 *                 =JavaScript
 *        -------------------- JSP
 *        
 *      클래스
 *        1. 데이터형 (데이터를 모아서 저장 목적) 
 *        2. 관련된 데이터를 모아서 관리 
 *        3. ---------- 한명 / 한개(뮤직 1, 영화 1, 맛집 1)
 *        4. 메모리에 저장시에는 반드시 new를 사용한다 
 *                              ----- 새로운 메모리를 만든다 
 *      ================= 데이터형일 때 사용 
 *      ================= 기능만 사용 (메소드 집합)
 *                        ------------------- 혼합 
 *      =============== 객체지향으로 변경 ==================
 *      
 *      
 *      
 */
class A
{
	int aa=10;
}
public class 데이터저장_클래스2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        /*A b=new A();*/
        /*System.out.println("a="+a);
        System.out.println("b="+b);*/
		A a=new A();
		for(int i=0;i<10;i++)
		{
			a=new A();
			a.aa=i+100;
			System.out.println("a="+a);
		}
		System.out.println(a.aa);
	    int bb=10;
	    for(int i=0;i<10;i++)
	    {
	    	bb=i+100;
	    }
	    System.out.println(bb);
	}

}




