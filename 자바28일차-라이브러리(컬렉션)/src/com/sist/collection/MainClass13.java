package com.sist.collection;
import java.util.*;
public class MainClass13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashMap map=new HashMap();
        map.put("foodListData", "SELECT * FROM food");
        map.put("foodDetailData", "SELECT * FROM food WHERE no=1");
        
        System.out.println("===== 실행(MyBatis:데이터베이스 연결) ======");
        System.out.println("맛집 목록보기 :"+map.get("foodListData"));
        System.out.println("맛집 목록보기 :"+map.get("foodListData"));
        System.out.println("맛집 상세보기:"+map.get("foodDetailData"));	
	}

}
