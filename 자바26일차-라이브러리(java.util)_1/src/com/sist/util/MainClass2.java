package com.sist.util;
import java.text.SimpleDateFormat;
import java.util.*; // Scanner / Random 
public class MainClass2 {
    public static String getRand()
    {
    	String result="";
    	Random r=new Random();
    	int len=r.nextInt(10)+5; // 0~9 ==> 5~14
    	//        0~9 +5  => 5~14
    	int[] reserve=new int[len];//5~14
    	int su=0;
    	boolean bCheck=false;
    	for(int i=0;i<len;i++)
    	{
    		bCheck=true;
    		while(bCheck)
    		{
    			su=r.nextInt(31)+1;
    			bCheck=false;
    			for(int j=0;j<i;j++)
    			{
    				if(reserve[j]==su)
    				{
    					bCheck=true;
    					break;
    				}
    			}
    		}
    		reserve[i]=su;
    	}
    	
    	Arrays.sort(reserve);
    	for(int i=0;i<len;i++)
    	{
    		result+=reserve[i]+",";
    	}
    	
    	result=result.substring(0,result.lastIndexOf(","));
    	
    	return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[] theater={
        		"CGV",
        		"메가박스",
        		"롯데시네마"
        };
        Scanner scan=new Scanner(System.in);
        Date date=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("d");
        // 09 => 오류 => 07 08,09
        String today=sdf.format(date);
        //System.out.println(07);
        int t=Integer.parseInt(today);
        System.out.println(today);
        while(true)
        {
        	System.out.println("===== 극장 선택 =====");
        	for(int i=0;i<theater.length;i++)
        	{
        		System.out.println((i+1)+"."+theater[i]);
        	}
        	System.out.println("9.종료");
        	System.out.println("===================");
        	System.out.print("극장 선택:");
        	int no=scan.nextInt();
        	if(no==9)
        	{
        		System.out.println("프로그램 종료");
        		break;
        	}
        	else if(no==1)
        	{
        		System.out.println("===CGV의 예약일===");
        		String res=getRand();
        		String[] days=res.split(",");
        		for(int i=0;i<days.length;i++)
        		{
        			if(Integer.parseInt(days[i])>=t)
        			  System.out.println(days[i]);
        		}
        	}
        	else if(no==2)
        	{
        		System.out.println("===메가박스의 예약일===");
        		String res=getRand();
        		String[] days=res.split(",");
        		for(int i=0;i<days.length;i++)
        		{
        			if(Integer.parseInt(days[i])>=t)
        			   System.out.println(days[i]);
        		}
        	}
        	else if(no==3)
        	{
        		System.out.println("===롯데시네마의 예약일===");
        		String res=getRand();
        		String[] days=res.split(",");
        		for(int i=0;i<days.length;i++)
        		{
        			if(Integer.parseInt(days[i])>=t)
        			   System.out.println(days[i]);
        		}
        	}
        	
        }
	}

}
