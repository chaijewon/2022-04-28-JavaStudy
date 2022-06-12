/*
 * 
 *    Object : 객체 생명주기 관리 
 *    ------ 
 *      생성   ====>  활용   ====> 소멸 (메모리 해제)
 *     new 생성자()   .메소드명      GC=> 해제하는 속도가 늦다 
 *                  .활용         finalize() *** 소멸자 
 *                               => System.gc()
 *     => toString () => 객체의 주소값을 출력 
 *        => 자동 호출 
 *        A a=new A();
 *        System.out.println(a)
 *        System.out.println(a.toString())
 *     => clone() => 메모리 복제(새로운 메모리) => prototype 
 *     -----------------------------------------------
 *     스프링은 싱글턴 (한개 객체만으로 연결)
 *     
 */
class Sawon
{
	public Sawon()
	{
		System.out.println("Sawon 객체 생성...");
	}
	public void display()
	{
		System.out.println("Sawon:display() Call...");
	}
	@Override
	protected void finalize(){
		System.out.println("Sawon클래스 메모리 해제!!");
	}
	
}

public class 문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sawon s=new Sawon();
		s.display();
		s=null; 
		System.gc(); 
	}


}
