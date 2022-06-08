package com.sist.lang;

public class MainClass7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String data="2하강";
        String rank=data.replaceAll("[가-힣]", "");
        String state=data.replaceAll("[0-9]", "");
        System.out.println(rank);
        System.out.println(state);
        
        // replace , trim , toUpperCase (X), toLowerCase (X)
        // trim() => 좌우에 공백 제거 (가운데 있는 공백은 X)
        // replace => 변경 (문자 , 문자열)
        data=" Hello Java ";
        System.out.println(data.length());
        System.out.println(data);
        String s=data.trim();
        // 사용자 입력 (로그인 , 회원가입 , 검색)
        System.out.println(s.length());
        System.out.println(s);
        
        String s1=data.replace(" ", "");
        System.out.println(s1);
        
        String s2=data.replace('a', 'k');// 문자 변경
        System.out.println(s2);
        
        String s3=data.replace("Java", "Spring");//문자열 변경
        System.out.println(s3);
        
	}

}
