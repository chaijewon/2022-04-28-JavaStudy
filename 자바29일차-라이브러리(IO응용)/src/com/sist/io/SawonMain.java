package com.sist.io;

public class SawonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        SawonManager sm=new SawonManager();
        while(true)
        {
        	int m=sm.menu();
        	if(m==9)
        	{
        		System.out.println("프로그램 종료");
        		break;
        	}
        	else if(m==1)
        	{
        		sm.sawonList();
        	}
        	else if(m==3)
        	{
        		sm.sawonInsert();
        	}
        }
	}

}
