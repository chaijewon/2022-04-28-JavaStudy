// => 조건문 (if,for)
/*
 *    1. 비교연산자 종류 (정수,실수,문자,논리=>기본형) 
 *                    참조형 (배열,클래스)= 비교할 수 없다  
 *       == 같다 (문자열은 비교할 수 없다: equals)
 *               정수 비교
 *                10==9  ==> false
 *               문자 비교 
 *                'A'=='A' ==> true
 *                'A'==65  ==> true 
 *                =======> 연산처리 자동으로 정수로 변경
 *                'A'==65
 *                ---
 *                 int로 변경 => 65==65
 *                 *** 연산 같은 데이터형만 연산 처리가 된다 
 *                 *** 작은 데이터형은 큰 데이터형으로 변경후에 연산처리
 *                     double int => int(double)
 *                 10.5 == 10 
 *                         --- 10.0 => 자동 형변환   
 *               논리 비교 
 *                true==false ==> false
 *                => == , != 가능 (크기비교는 안된다)
 *               실수 비교 
 *                10.5 == 10.5 ==> true
 *       != 같지 않다 
 *          정수 비교
 *            10!=9 ==> true
 *          실수 비교 
 *            10.5!=10.5 ==> false
 *          문자 비교
 *            'A'!=66  ==> true
 *            ---
 *            65로 변경
 *          논리 비교
 *            true!=false ==> true
 *       <  작다 (왼쪽)
 *       >  크다
 *       <= 작거나 같다 ( < || == )
 *       >= 크거나 같다 ( > || == )
 *       -----------------------------------------
 *    2. 연산결과값 (boolean => true/false) , 연산자 
 */
public class 비교연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //1. 정수 비교 
		System.out.println(100==99); //같다 (= 대입연산자)
		//2. 문자 비교 
		System.out.println('A'=='B');
		System.out.println('A'==65);//65==65
		// 'A'=> int변경(65)
		System.out.println(10.5==10);
		// 10 => double (10.0) 
		System.out.println(true==false);
		int a=10;
		int b=9;
		System.out.println(a==++b);
		// a==b++ => b증가전에 비교 
		// a==++b => b먼저증가 비교 
		int c=66;
		char ch='A';
		System.out.println(--c==ch);
		//c=65
		System.out.println(c==ch);
		System.out.println(c++ == ch++);
		// c=66 , ch='B'
		System.out.println("c="+c);
		System.out.println("ch="+ch);
		
		c=67;
		ch='B';//66
		System.out.println(c!=ch); 
		System.out.println(c!=ch++);
		//ch='C'
		System.out.println(c!=ch); //'C'=67
		
		c=68;
		ch='D'; // 68
		System.out.println(c<ch);//68<68
		System.out.println(c>ch);//68>68
		System.out.println(c<=ch);// 68<68 || 68==68
		System.out.println(c>=ch);// 68>68 || 68==68
		// 조건문 => 가장 많이 등장하는 연산자 
		
		// 오라클 (=) , 자바스크립트 (===)  ES6 
		/*
		 *   Back => 자바/오라클 
		 *   Front => HTML,CSS,JavaScript
		 *   ----------------------------
		 *    Back+Front : JSP == JDBC
		 *    => Front (Jquery,Ajax)
		 *    ----------------------
		 *    Spring  == Mybatis 
		 *     SELECT * FROM movie
		 *     WHERE title LIKE '%강%'
		 *    => Front (VueJS) => vuex
		 *    
		 *    Spring-Boot == JPA
		 *      findByTitleLike()
		 *    => Front (React) => WebPack(Redux) 
		 *    ============ 배포 (AWS)
		 *    옵션 : AI(ChatBot) 
		 *    
		 */
		
	}

}
