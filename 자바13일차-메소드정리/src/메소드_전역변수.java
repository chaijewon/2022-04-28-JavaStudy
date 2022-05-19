import java.util.Scanner;
/*
 *    static void aaa()
 *    {
 *       int a=10;
 *       {
 *           int b=20;
 *           {
 *              int c=30;
 *           }//c는 사라진다
 *       }// b는 사라진다
 *       
 *    }// a는 사라진다
 */
public class 메소드_전역변수 {
    static char[] m=new char[10];
    static char[] u=new char[10];
    //메소드에서 한개 이상을 사용시에 설정되는 변수 => 전역변수 
    // 문제 =>랜덤
    static void munje()
    {
    	
    	for(int i=0;i<m.length;i++)
    	{
    		int k=(int)(Math.random()*2);
    		m[i] = k==0?'O':'X';
    	}
    	
    }
    // 사용자 입력값 
    static void user()
    {
    	Scanner scan=new Scanner(System.in);
    	for(int i=0;i<u.length;i++)
    	{
    		System.out.print((i+1)+"번째 답 입력(O,X):");
    		/*
    		 *  String s=scan.next();
			    char dap=scan.next().charAt(0);
    		 */
    		char c=scan.next().charAt(0);
    		u[i]=c;
    	}
    	
    }
    // 비교 => 결과값 도출
    static int result()
    {
        int count=0;
        for(int i=0;i<m.length;i++)
        {
        	if(m[i]==u[i])
        		count++;
        }
        return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        munje();
        user();
        int count=result();
        // 결과값 출력
        for(char mm:m)
        	System.out.print(mm+" ");
        System.out.println();
        for(char uu:u)
        	System.out.print(uu+" ");
        System.out.println();
        System.out.println("점수:"+(count*10)+"점");
	}

}
