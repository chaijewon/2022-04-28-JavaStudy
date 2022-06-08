package com.sist.lang;
//Math => random() , ceil() 
// 임의의 수 추출 : random() => 0.0~0.99 
// 올림메소드 => 총페이지 구하기 
// Random 
// ==> Math (final클래스) => 메소드는 static 
// 인라인뷰 =>  limit 
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int no=(int)(Math.random()*100)+1; // 1~100
        System.out.println(no);
        //no=10;
        int totalpage=(int)(Math.ceil(no/10.0));
        System.out.println(totalpage);
	}

}
