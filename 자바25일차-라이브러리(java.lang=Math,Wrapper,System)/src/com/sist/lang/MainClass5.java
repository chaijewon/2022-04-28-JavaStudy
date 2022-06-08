package com.sist.lang;
// substring , split 
public class MainClass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // String => 0번부터 시작 
		
		// substring(int s) => s부터 나머지 전체 
		
		// substring(int s,int e) => e-1(제외)
		String data="Hello Java";
		//           0123456789
		String s1=data.substring(3); //lo Java => 3번 포함 
		System.out.println(s1);
	    String s2=data.substring(2,8); 	// 2~7
	    System.out.println(s2);
	    // 문자열은 원본은 그대로 유지 
	    System.out.println(data);
	}

}
