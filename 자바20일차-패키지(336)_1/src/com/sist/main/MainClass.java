package com.sist.main;
// XML => namespace 
/*
 *    자바 코딩의 순서 
 *    1. package => 한번만 사용이 가능  
 *    2. import => 여러개 사용이 가능 
 *    3. public class className
 *       {
 *           public static void main(String[] args) {
		      // TODO Auto-generated method stub

	         }
 *       }
 *       
 *       웹 (톰캣)/ 모바일 => main() X
 *       -- Spring-Boot
 *    ** 패키지를 사용하는 목적 : 관련된 클래스를 모아서 관리 
 *                          라이브러리화 
 *       폴더를 만든다 => 하위 폴더 => .
 *       => 3개 => 마지막 폴더가 구분자 
 *       => 자바 라이브러리 
 *          java.  ==> JDK1.0~ 
 *          java.util => java.util.Scanner
 *                       java.util.*(util폴더에 있는 모든 자바)
 *          java.lang ====> 생략이 가능 
 *          java.io ==> 입출력 ==> import java.io.*
 *          java.awt ==> import java.awt.*
 *          java.net ==> import java.net.*
 *          java.sql => 오라클  ==> import java.sql.*(X) *****
 *          javax. ==> JDK1.2~
 *          ------
 *          javax.servlet....
 *          javax.xml...
 *          javax.swing...
 */
import static java.lang.Math.random;
import static java.lang.System.out;
import static java.lang.String.valueOf;

// static 메소드만 가능 => 클래스명 제거가 가능 ==> 342page
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //int r=(int)(Math.random()*100)+1;
        // random() => static => new
        //System.out.println(r);
		int r=(int)(random()*100)+1;
		out.println(r);
		
		out.println(valueOf(r));
        
	}

}
