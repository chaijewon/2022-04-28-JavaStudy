/*
 *    int a=10;
 *    int b= ++a + a++ + ++a + a++ + a++;
 *    
 *    a=? ==> 15
 *    b=?
 */
public class 단항연산자_증감연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int a=10;
		int b= ++a + a++ + ++a + a++ + a++;
		System.out.println(a);
		System.out.println(b);
		
		a=10;
		b= a++ + a++ + a++ + ++a + ++a;
		System.out.println(a);
		System.out.println(b);*/
		int a=10;
		int b=a++; // 대입 후 증가 
		System.out.println("a="+a+",b="+b);
		// a=11 , b=10
		int c=10;
		int d=++c; // 증가 후 대입 
		System.out.println("c="+c+",d="+d);
		// c=11, d=11
		// 전치 , 후치 관련없이 => 1개증가 
		
		// 연산자  =(대입연산자)
		// 반복문에 주로 사용 => 데이터베이스 
		int m=10;
		int n=m--; // n=10 
		           // m감소 => m=9
		System.out.println("m="+m+",n="+n);
		int x=10;
		int y=--x; // x감소  => x=9 , y=9
		System.out.println("x="+x+",y="+y);
		// 1씩감소 (--) , 1씩증가 (++)
	}

}
