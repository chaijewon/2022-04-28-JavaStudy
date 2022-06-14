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
        		sm.fileSave();
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
        	else if(m==5)
        	{
        		sm.sawonDelete();
        	}
        	else if(m==4)
        	{
        		sm.sawonUpdate();
        	}
        	else if(m==2)
        	{
        		sm.sawonDetail();
        	}
        }
	}

}
