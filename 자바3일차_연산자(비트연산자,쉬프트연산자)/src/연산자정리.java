/*
 *   1. 연산자 종류 => 결과값 
 *      --------
 *      데이터형 
 *        정수 : byte,int,long
 *        실수 : double 
 *        논리 : boolean 
 *        문자 : char
 *        
 *      1) 단항연산자 
 *          = 증감연산자 (++,--)
 *          = 부정연산자 (!)
 *          = 형변환연산자 ((type=기본형)) (int) , (double)...
 *      2) 이항연산자
 *          = 산술연산자 (+,-,*,/,%)
 *          = 비교연산자 (==,!=,<,>,<=,>=)
 *          = 논리연산자 (&& , ||)
 *          = 대입연산자 (= , += , -=)
 *      3) 삼항연산자 ?:
 */
public class 연산자정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*
         *    연산은 반드시 같은 데이터형끼리만 연산된다 
         *    1. 산술 변환 (자동 형변환)
         *       int + double => double+double=double
         *       ---
         *        double
         *       char + int  => int + int = int 
         *       ----
         *        int
         *       'A'+1 => 66
         *       ---
         *        65
         *      
         *       int이하 데이터형 (byte,short,char)
         *       연산처리시 => 결과값은 int ...
         *       
         *       
         */
		byte b1=100;
		byte b2=127;
		int b3=b1+b2;// 데이터 손실을 방지 
		// int ,long ,float,double 
		System.out.println(b3);
	}

}







