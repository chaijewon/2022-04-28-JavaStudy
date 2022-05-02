/*
 *     결과값 : ++,--(정수만 사용이 가능) => 정수 
 *            ! (boolean) => 논리형 
 *     형변환 연산자 => boolean을 제외한 모든 기본형 사용이 가능 => 결과값?
 *     1. 형식 (기호) 
 *     2. 결과값 => 형변환 타입으로 나온다 
 *        (int) => int  , (double) => double , (char) => char
 *        
 *         = 자동 형변환 
 *           작은 데이터형 => 큰데이터형으로 변환 
 *           int => char , double => int ...
 *         = 강제 형변환 (형변환 연산자) 
 *           큰 데이터형 => 작은 데이터형으로 변경 
 *           (int)double , (char)int...
 *         = 데이터형 크기 순서 
 *           byte < char,short < int < long < float < double  
 */
public class 단항연산자_형변환연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double d=10.5; 
        // double=>int (10)
        int a=(int)d;
        System.out.println("a="+a);
        int b=68;
        char c=(char)b;
        System.out.println(c);
        // ASC => 'A'(65) , '0'(48) , 'a'(97)
        // 자동 형변환 
        double d1=100;
        //   (double)100 ==> d1=100.0
        System.out.println(d1);
        
        int a1='A'; //'A'(X) => 65
        System.out.println(a1);
	}

}
