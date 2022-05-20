//  구구단 
//  단 => 입력 , 구구단 => 만들기 , 출력 
import java.util.Scanner;
public class 메소드정리_7 {
	static String[] gugudan2(int dan)
	{
		String[] result=new String[9];
		for(int i=0;i<9;i++)
		{
			result[i]=dan+"*"+(i+1)+"="+(dan*(i+1));
		}
		return result;
	}
	static void output2(String[] arr)
	{
		for(String s:arr)
		{
			System.out.println(s);
		}
	}
	static String gugudan(int dan)
	{
		String result="";
		for(int i=1;i<=9;i++)
		{
			result+=dan+"*"+i+"="+(dan*i)+"\n";
		}
		return result;
	}
    static void output(String s)
    {
    	System.out.println(s);
    	
    }
    // 조립
    static void process()
    {
    	int dan=메소드정리_6.input("단");
    	//String gu=gugudan(dan);
    	//output(gu);
    	String[] gu=gugudan2(dan);
    	output2(gu);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        process();
	}

}
