// 계산기 
import java.util.*;
class Calc{
	int plus(int a,int b)
	{
		return a+b;
	}
	int minus(int a,int b)
	{
		return a-b;
	}
	int gop(int a,int b)
	{
		return a*b;
	}
	String div(int a,int b)
	{
		String result="";
		if(b==0)
		{
			result="0으로 나눌 수 없습니다";
		}
		else
		{
			result=a+"/"+b+"="+(a/b);
		}
		return result;
	}
	void equals()
	{
		System.out.println("this="+this);
		Scanner scan=new Scanner(System.in);
		System.out.print("첫번째 정수 입력:");
		int a=scan.nextInt();
		
		System.out.print("두번째 정수 입력:");
		int b=scan.nextInt();
		
		System.out.print("연산자 입력(+,-,*,/):");
		String strOp=scan.next();
		// String => char
		char op=strOp.charAt(0);
		
		if(op=='+')
		{
			// 메소드 안에서 메소드 호출이 가능 
			// 같은 클래스에서는 객체.메소드명()=>X , 메소드명만 호출이 가능 
			System.out.printf("%d+%d=%d\n",a,b,plus(a,b));
		}
		else if(op=='-')
		{
			System.out.printf("%d-%d=%d\n",a,b,minus(a,b));
		}
		else if(op=='*')
		{
			System.out.printf("%d*%d=%d\n",a,b,gop(a,b));
		}
		else if(op=='/')
		{
			//String result=div(a,b);
			//System.out.println(result);
			System.out.printf("%s\n",div(a,b));
			// %d(정수) , %s(String) , %f(실수) , %c(문자)
			
			//System.out.println(div(a,b)); 
		}
		else 
		{
			System.out.println("잘못된 연산자 입니다!!");
			
		}
		// 멤버 => 인스턴스변수 , 인스턴스메소드 
		// static => 멤버가 아니다 (공유)
	}
}
public class 자바메소드_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        // Calc의 모든 메소드는 저장이 아직 안됨 
		Calc c1=new Calc();//c1=> plus,minus,gop,div,equals
		System.out.println("c1="+c1);
		c1.equals();
		
		Calc c2=new Calc();//c2=> plus,minus,gop,div,equals
		c2.equals();
		System.out.println("c2="+c2);
		// this=>static 
		// 인스턴스 메소드 => 메소드 작성은 static과 동일 
		// new를 사용해서 생성시에는 메소드 따로 저장이 된다 
		// 인스턴스 메소드 호출시에 => 객체명.메소드명()
		// 인스턴스 메소드는 같은 클래스안에서는 메소드명()만 호출
		// ----------- 클래스영역안에는 자신의 객체를 가지고 있다 (this)
		// this는 생략할 수 있다 
		
		
	}

}
