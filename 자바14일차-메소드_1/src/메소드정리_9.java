/*
 *   매개변수 전송 
 *     값만 전송 : 메소드 자체에서만 변경 (기본형 , String)
 *               실제는 변경하지 않는다 
 *               Call By Value(다른 메모리 생성)
 *               보내는 메모리 != 받는 메모리
 *     주소를 전송 : 주소안에서 변경 (배열,클래스) => 속도가 빠르다 
 *                실제도 변경이 된다 
 *               Call By Reference(같은 메모리)
 *               보내는 메모리 == 받는 메모리 
 */
class Human
{
	String name;
}
public class 메소드정리_9 {
	static void input2(Human m)
	{
		System.out.println("m="+m);
		m.name="박문수";
	}
	static void process2()
	{
		Human h=new Human();
		System.out.println("h="+h);
		h.name="홍길동";
		
		System.out.println("===== 변경전 =====");
		System.out.println("name="+h.name);
		System.out.println("===== 변경후 =====");
		input2(h);
		System.out.println("name="+h.name);
	}
    static void input(String name)
    {
    	name="박문수";
    }
    static void process()
    {
    	String name="홍길동";
    	System.out.println("===== 변경전 ======");
    	System.out.println("process:name="+name);
    	System.out.println("===== 변경후 ======");
    	input(name);
    	System.out.println("process:name="+name);
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        process2();
	}

}
