import java.util.Scanner;
public class 문제풀이 {
    static int menu()
    {
    	System.out.println("============== 문제=====================");
    	System.out.println("1. 1~10까지 출력하는 메소드 구현");
    	System.out.println("2. 1~10까지 합을 구하는 메소드 구현");
    	System.out.println("3. 1~n까지 합을 구하는 메소드 구현");
    	System.out.println("4. 두 정수를 나눗셈 결과를 구해주는 메소드 구현");
    	System.out.println("5. 문자열의 소문자를 대문자로 바꿔주는 메소드 구현");
    	System.out.println("6. 문자열을 거꾸로 출력하는 메소드 구현");
    	System.out.println("7. 정수를 한글로 바꿔주는 메소드 구현");
    	System.out.println("9. 종료");
    	System.out.println("========================================");
    	Scanner scan=new Scanner(System.in);
    	System.out.print("문제 선택:");
    	int m=scan.nextInt();
    	return m;
    }
    static void munje1()
    {
    	System.out.println("1~10까지 출력하는 메소드 구현");
    	for(int i=1;i<=10;i++)
    	{
    		System.out.print(i+" ");
    	}
    	System.out.println();
    }
    static int munje2()
    {
    	System.out.println("1~10까지 합을 구하는 메소드 구현");
    	int sum=0;
    	for(int i=1;i<=10;i++)
    	{
    		sum+=i;
    	}
    	return sum;
    }
    static int munje3(int n)
    {
    	System.out.println("1~n까지 합을 구하는 메소드 구현");
    	int sum=0;
    	for(int i=1;i<=n;i++)
    	{
    		sum+=i;
    	}
    	return sum;
    }
    static double munje4(int a,int b)
    {
    	System.out.println("두 정수를 나눗셈 결과를 구해주는 메소드 구현");
    	return a/(double)b;
    }
    static String munje5(String alpha)
    {
    	System.out.println("문자열의 소문자를 대문자로 바꿔주는 메소드 구현");
    	String result="";
    	for(int i=0;i<alpha.length();i++)
    	{
    		char c=alpha.charAt(i);
    		if(c>='a' && c<='z')
    		{
    			c=(char)(c-32);
    		}
    		result+=c;
    	}
    	return result;
    }
    static String munje6(String data)
    {
    	System.out.println("문자열을 거꾸로 출력하는 메소드 구현");
    	String res="";
    	for(int i=data.length()-1;i>=0;i--)
    	{
    		res+=data.charAt(i);
    	}
    	return res;
    }
    static String munje7(String data)
    {
    	String h="공일이삼사오육칠팔구";
    	String s="";
    	for(int i=0;i<data.length();i++)
    	{
    		for(int j=0;j<h.length();j++)
    		{
    			if(data.charAt(i)==h.charAt(j))
    			{
    				s+=j+"";
    			}
    		}
    	}
    	return s;
    }
    static void process()
    {
    	while(true)
    	{
    		int m=menu();
    		if(m==9)
    		{
    			System.out.println("프로그램 종료");
    			break;
    		}
    		else if(m==1)
    		{
    			munje1();
    		}
    		else if(m==2)
    		{
    			int sum=munje2();
    			System.out.println("sum="+sum);
    		}
    		else if(m==3)
    		{
    			int i=(int)(Math.random()*100)+1;
    			System.out.println("n="+i);
    			int sum=munje3(i);
    			System.out.println("sum="+sum);
    		}
    		else if(m==4)
    		{
    			int i=(int)(Math.random()*100)+1;
    			int j=(int)(Math.random()*100)+1;
    			double d=munje4(i, j);
    			System.out.printf("%d/%d=%.2f\n",i,j,d);
    		}
    		else if(m==5)
    		{
    			Scanner scan=new Scanner(System.in);
    			System.out.print("알파벳 입력:");
    			String data=scan.next();
    			String s=munje5(data);
    			System.out.println(s);
    		}
    		else if(m==6)
    		{
    			Scanner scan=new Scanner(System.in);
    			System.out.print("문자열 입력:");
    			String data=scan.nextLine();
    			String s=munje6(data);
    			System.out.println(s);
    		}
    		else if(m==7)
    		{
    			Scanner scan=new Scanner(System.in);
    			System.out.print("문자열 입력:");
    			String data=scan.nextLine();
    			String s=munje7(data);
    			System.out.println(s);
    		}
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        process();
	}

}
