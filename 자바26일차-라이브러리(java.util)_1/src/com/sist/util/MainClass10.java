package com.sist.util;
import java.util.*;
public class MainClass10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("요청 데이터:");
        String cmd=scan.next();
        // 100|admin|1234 
        // 서버 처리 
        final int LOGIN=100;
        final int LOGOUT=110;
        final int MAKEROOM=200;
        
        StringTokenizer st=new StringTokenizer(cmd,"|");
        int protocol=Integer.parseInt(st.nextToken());
        switch(protocol)
        {
        case LOGIN:
        	System.out.println("로그인 요청 처리");
        	System.out.println("ID:"+st.nextToken());
        	System.out.println("Password:"+st.nextToken());
        	break;
        case LOGOUT:
        	System.out.println("로그아웃 요청처리");
        	System.out.println("ID:"+st.nextToken());
        	break;
        case MAKEROOM:
        	System.out.println("만들기 요청 처리");
        	System.out.println("방이름:"+st.nextToken());
        	System.out.println("인원:"+st.nextToken());
        	System.out.println("상태:"+st.nextToken());
        	break;
        }
        
        
	}

}
