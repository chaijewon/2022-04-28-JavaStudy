
public class 문제6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data="0123456789";
        String s=data.substring(5);//56789출력
        System.out.println(s);
        s=data.substring(3,7);// 3456  
        System.out.println(s);
        String[] title={
        		"좋은 사람 있으면 소개시켜줘",
        		"다시 만날까 봐"
        };
        for(String ss:title)
        {
        	System.out.println(ss);
        	if(ss.length()>8)
        	{
        		String temp=ss.substring(0,8)+"...";
        		System.out.println(temp);
        	}
        	else
        	{
        	  System.out.println(ss);
        	}
        	
        }
	


	}

}
