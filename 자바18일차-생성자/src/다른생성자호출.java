/*
 *   생성자가 여러개 ==> 다른 생성자 호출 this(),this(값,값)
 *   ** this() => 첫반째줄에서만 사용이 가능 
 *   break;,continue;
 *   if(조건)
 *   {
 *      break; => 종료
 *      System.out.println();=> 오류 
 *   }
 *   class A
 *   {
 *      A(){
 *         A(10); => 오류 
 *         System.out.println("A() Call...") => 오류 
 *         this(10); 
 *      }
 *      A(int a)
 *      {
 *         
 *      }
 *   }
 */
class A
{
	static final int LOGIN=100;
	
}
class Sawon
{
	// 생성자가 여러개 => 오버로딩 
	/*
	 *   오버로딩 : 중복 메소드 정의 
	 *   ------
	 *    조건 : 한개 클래스 (같은 클래스안에서)
	 *          메소드 동일 
	 *          매개변수의 갯수가 다르다 , 데이터형이 다르다 
	 *          리턴형은 관계없다 
	 *          ----------------
	 *          
	 *          => void disp()
	 *             ------------------
	 *             void disp(int a) disp(int)
	 *             int disp(int a)  disp(int)
	 *             ------------------같은 메소드 
	 *   class A
	 *   {
	 *      A(){}
	 *      A(int a){}
	 *      A(int a,int b){}
	 *      A(double d,double d1){}
	 *   }
	 *   
	 *   A(int a,double d, char c)
	 *   A(double a,double d, double c)
	 *   A(double a,char d, char c)
	 *   A(int a,int d, int c)
	 *   
	 *   A(10.5,'A',100)
	 *   
	 *   A(double a)  int a='A'
	 *   
	 *   A('A') A(100) A(10.5) A(10.5F) A(100L)
	 *     65.0  100.0          10.5      100.0
	 */
	Sawon(double d) {
		System.out.println("d="+d);
		//int a=Integer.MAX_VALUE;
	}
	Sawon(char c)
	{
		System.out.println("c="+c);
	}
	Sawon(int i)
	{
		System.out.println("i="+i);
	}
	Sawon(int a,double d, char c)
	{
		System.out.println("1");
	}
	Sawon(double a,double d, double c)
	{
		System.out.println(2);
	}
	Sawon(int a,int d, int c)
	{
		System.out.println(3);
	}
	// new => 같은 메소드명으로 다른 기능 추가할 수 있다 
	/*
	 *   plus(int ,int)
	 *   plus(double ,double)
	 *   plus(double , int)     byte,short,char,int,long
	 *                          float , double 
	 *                          -------------------------
	 *                          2^7
	 *    printString
	 *    printInt
	 *    printDouble
	 *    printFloat  => println
	 *    
	 */
}
public class 다른생성자호출 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new Sawon('A'); // Sawon(char)
        new Sawon(100); // Sawon(int)
        new Sawon(10.5);
        new Sawon(10.5F);
        new Sawon(100L);
        new Sawon('A','B',100.0);
        
	}

}
