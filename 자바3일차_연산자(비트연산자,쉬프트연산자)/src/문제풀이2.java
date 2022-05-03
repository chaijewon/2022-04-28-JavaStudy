/*
 *  산술연산자 : + ,- , * , / , % => 가장 많이 사용되는 연산자 
 *            주의점) 형변환 (다른 데이터형이 연산이 되는 큰 데이터형으로 변경후 연산)
 *                  => 자동 형변환 
 *                  int + char
 *                        ----
 *                         int  => int+int
 *            => / => 0으로 나눌 수 없다 , 정수/정수=정수 
 */
public class 문제풀이2 {
	public static void main(String[] arg) 
	{  
	    int a, b;  
	    a = 6;  
	    b = 2;   
	    System.out.printf("덧셈 연산 결과: %d \n", a+b); //8  
	    System.out.printf("뺄셈 연산 결과: %d \n", a-b);  // 4
	    System.out.printf("곱셈 연산 결과: %d \n", a*b);  //12
	    System.out.printf("나누기 연산 결과: %d \n", a/b);//3
	    System.out.printf("나머지 연산 결과: %d \n", a%b);//0
	}

}
