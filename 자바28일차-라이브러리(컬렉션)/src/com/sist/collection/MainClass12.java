package com.sist.collection;
// 644 HashMap ==> key , value 
// key , SQL문장  (MyBatis)
// key , 클래스 객체 (Spring)
// => XML 
// 웹 => 클래스 (Map:key,value)
// HttpServletRequest , HttpServletResonse, HttpSession, Cookie
// 저장시에 두개 (key,value) => key를 이용해서 데이터 찾기 
// key => String , value => Object
import java.util.*;
public class MainClass12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashMap map=new HashMap();
        map.put("id", "admin");
        map.put("pwd", "1234");
        map.put("name","홍길동");
        // KEY는 중복을 허용하지 않는다 , 값은 중복이 가능 
        System.out.println("===== 데이터 출력 =====");
        System.out.println("ID:"+map.get("id"));
        System.out.println("PW:"+map.get("pwd"));
        System.out.println("Name:"+map.get("name"));
        
	}

}









