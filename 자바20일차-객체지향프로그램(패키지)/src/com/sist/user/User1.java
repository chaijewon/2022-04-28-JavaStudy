package com.sist.user;
import com.sist.database.*; // 모든 클래스 
public class User1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        SawonDataBase data=new SawonDataBase();
        Sawon[] sawon=data.getSawon();
        
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
