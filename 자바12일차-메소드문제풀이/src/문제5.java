/*
 *  문자열의 소문자를 대문자로 바꿔주는 메소드 구현
 */
import java.util.Scanner;
public class 문제5 {
    static void change()
    {
    	Scanner scan=new Scanner(System.in);
    	System.out.print("알파벳 입력:");
    	String s=scan.nextLine();
    	//System.out.println(s);
    	String ss="";
    	for(int i=0;i<s.length();i++)
    	{
    		char c=s.charAt(i);
    		if(c>='a' && c<='z')
    		{
    			c=(char)(c-32);// 소문자 => 대문자 , 대문자 => 소문자
    			//                    -32            +32
    			// 'A':65  'a':97  => 
    		}
    		ss+=c;
    	}
    	System.out.println(ss);
    }
    static String change(String s)
    {
    	String ss="";
    	for(int i=0;i<s.length();i++)
    	{
    		char c=s.charAt(i);
    		if(c>='a' && c<='z')
    		{
    			c=(char)(c-32);// 소문자 => 대문자 , 대문자 => 소문자
    			//                    -32            +32
    			// 'A':65  'a':97  => 
    		}
    		ss+=c;
    	}
    	return ss;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        change();
        Scanner scan=new Scanner(System.in);
    	System.out.print("알파벳 입력:");
    	String s=scan.nextLine();
    	String ss=change(s);
    	System.out.println(ss);
	}

}
