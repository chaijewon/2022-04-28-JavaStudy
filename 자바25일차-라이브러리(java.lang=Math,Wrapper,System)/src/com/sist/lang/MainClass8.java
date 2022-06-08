package com.sist.lang;
// valueOf , format => static  ==> String.valueOf() , String.format()
// 모든 데이터형을 문자열 변환 , 변환 
// 471 page
public class MainClass8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i=100;
        double d=10.5;
        boolean b=true;
        long l=100L;
        
        String s1=String.valueOf(i); // 100(X) => "100"
        System.out.println(s1+100);
        String s2=String.valueOf(d); //"10.5"
        
        double d2=9897998.5555555555;
        String s3=String.format("%.2f", d2);// printf()
        System.out.println(s3);
        
        String color="red,black,green,blue,yellow";
        System.out.println(color.replace(",", "-"));
        String[] colors=color.split(",");
        for(String c:colors)
        	System.out.println(c);
        
        String str=String.join("-", colors);
        System.out.println(str);
	}

}
