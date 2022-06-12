import java.lang.reflect.Method;

class Board
{
	public void display()
	{
		System.out.println("Board:display() Call...");
	}
	public void display1()
	{
		System.out.println("Board:display() Call...");
	}
	public void display2()
	{
		System.out.println("Board:display() Call...");
	}
}

public class 문제3 {
	
	// 리플렉션 => 스프링 => 어노테이션 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Board b=new Board();//463page
        b.display();
        Class bb=b.getClass();// 클래스의 정보
        // Board.class
        // Class.forName("com.sist.board.Board")
        Method[] methods=bb.getDeclaredMethods();//메소드를 가지고 온다 
        for(Method m:methods)
        {
        	System.out.println(m.getName());
        }

	}

}
