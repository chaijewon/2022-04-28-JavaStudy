import java.util.Random;

// 변수 => 초기화 => 변수는 무조건 초기화을 부여 
// 명시적 : 선언과 동시에 초기값 부여 int a=10; 
// 사용자 입력값 => Scanner 
// 임의의 값 (컴퓨터) => 라이브러리 => java.util.Random => 패키지 
// 불러서 사용 => import 
/*
import java.util.Random; // 개발자 제작 만든 클래스 => import사용 
// 다른 폴더에 저장된 경우 => 여러개 동시에 사용 
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.*;*/
public class MainClass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Random rnd=new Random(); // 클래스 저장 (동적 메모리 할당)
        // new => malloc() ==> 승격 (연산자 => new)
        /*int kor=rnd.nextInt(100); //0~100
        //System.out.println(kor);
        int eng=rnd.nextInt(100);
        int math=rnd.nextInt(100);
        
        System.out.println("국어:"+kor);
        System.out.println("영어:"+eng);
        System.out.println("수학:"+math);*/
        //int c=rnd.nextInt(25)+97;
        // 0 => 65(A) 1 => 66(B) 2=> 67(C) 
        //System.out.println((char)c);
        // 데이터형은 언제든 변경이 가능 => 형변환
		// 36page => 문자열 결합 
		// + (1. 산술연산자 , 2.문자열 결합)
		/*
		 *   문자열 + any  ==> 문자열 
		 *         -----모든 데이터형 
		 *         
		 *   예) "Hello"+10   => "Hello10"
		 *       "Hello"+'A'  => "HelloA"
		 *       "Hello"+10.5 => "Hello10.5"
		 *       "Hello"+true => "Hellotrue"
		 *   any + 문자열 ==> 문자열 
		 *   10+"Hello" ==> "10Hello"
		 *   true+"Hello" ==> "trueHello" 
		 *   
		 *   System.out.println("국어:"+kor) => 국어:90
		 *   
		 *   7+""+7+7  
		 *   ====
		 *     1 => "7"+7
		 *     ====
		 *       2 => "77"+7
		 *       ====
		 *         3 => "777"
		 *   7+7+""+7
		 *   ===
		 *    1 => 14+""
		 *    =====
		 *       2 => "14"+7
		 *       ====
		 *         3  => "147"
		 *         
		 */
		//System.out.println(7+""+7*7);//777 => 749
		//System.out.println(7+7+""+7);//147
		String name="홍길동";
		String sex="남자";
		String addr="서울시 강남구 역삼동";
		
		System.out.println("이름:"+name);
		System.out.println("성별:"+sex);
		System.out.println("주소:"+addr);
		System.out.println(90+" "+89+" "+70);
	}

}
