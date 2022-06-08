package com.sist.lang;
/*
 *  SMITH
ALLEN
WARD
JONES
MARTIN
BLAKE
CLARK
SCOTT
KING
TURNER
ADAMS
JAMES
FORD
MILLER
 */
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*String[] names= {
        		"SMITH",
        		"ALLEN",
        		"WARD",
        		"JONES",
        		"MARTIN",
        		"BLAKE",
        		"CLARK",
        		"SCOTT",
        		"KING",
        		"TURNER",
        		"ADAMS",
        		"JAMES",
        		"FORD",
        		"MILLER"	
        };
        for(String name:names)
        {
        	System.out.println(name);
        }
        System.out.println("================");
        for(String name:names)
        {
        	//int i=name.indexOf("A"); => 경로명 
        	int i=name.lastIndexOf("KI");// 문자 / 문자열 찾기 
        	if(i!=-1)
        	System.out.println(name+":"+i);
        }*/
		String address="서울특별시 영등포구 양평로 132";
		String addr=address.substring(address.indexOf(" "));
		System.out.println(addr.trim());
		String addr2=addr.trim().substring(0,addr.trim().indexOf(" "));
		System.out.println(addr2);
		
		
	}

}
