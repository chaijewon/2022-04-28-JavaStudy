package 자바실습문제;

import java.util.Random;

/*
 * 5.	알파벳 1개를 입력 받아 대소문자를 구분해보자.
 */

public class 실습문제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Random rnd=new Random();
        int num=rnd.nextInt(26)+65;// 알파벳 추출 
        int r=rnd.nextInt(2);//0,1
        if(r==0) 
        	num+=32;//소문자  // 0(소문자),1(대문자)
        // 대문자 => 소문자 ('A' 65 , 'a' 97)  , 소문자 => 대문자 변경
        // 문자+32                             문자-32
        char c=(char)num;
        
        System.out.println("c="+c);
        if(c>='A' && c<='Z') // 비교연산자 => 65 ~
        	//char는 연산자사용 => 정수형으로 자동 변환 
        	System.out.println(c+"는(은) 대문자입니다");
        else
        	System.out.println(c+"는(은) 소문자입니다");
	}

}
