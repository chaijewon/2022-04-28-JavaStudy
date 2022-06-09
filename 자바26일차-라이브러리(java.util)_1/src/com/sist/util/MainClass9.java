package com.sist.util;
// => 웹 , 네트워크 
import java.util.*;
public class MainClass9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String data="코쿠미 목살 (180g) 16,000원"
        		+ "삼겹살 (200g) 16,000원"
        		+ "가브리살 (180g) 16,000원"
        		+ "갈매기살 (180g) 16,000원"
        		+ "팔도비빔면 4,000원";
        //System.out.println(data);
        // split()
        StringTokenizer st=new StringTokenizer(data,"원");
        while(st.hasMoreTokens())
        {
        	System.out.println(st.nextToken()+"원");
        }
	}

}
