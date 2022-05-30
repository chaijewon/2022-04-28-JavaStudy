package com.sist.user;

import com.sist.database.SawonDataBase;
import com.sist.database.Sawon;
// 사용자 정의 클래스 , 라이브러리 
public class User2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        SawonDataBase data=new SawonDataBase();
        Sawon[] sawon=data.getSawon();
        sawon[0]=new Sawon();
        sawon[0].setSabun(1);
        sawon[0].setName("홍길동");
        sawon[0].setDept("개발부");
        sawon[0].setJob("대리");
        sawon[0].setPay(4000);
        
        // 목록
        for(Sawon s:sawon)
        {
        	if(s!=null)
        	{
        		System.out.println("사번:"+s.getSabun());
        		System.out.println("이름:"+s.getName());
        		System.out.println("부서:"+s.getDept());
        		System.out.println("직위:"+s.getJob());
        		System.out.println("연봉:"+s.getPay());
        	}
        }
	}

}
