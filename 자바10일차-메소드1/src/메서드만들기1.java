// 사용자로부터 단을 입력받아서 구구단 출력 
import java.util.Scanner;
public class 메서드만들기1 {
	// 입력 기능 
	static int input()
	{
		    Scanner scan=new Scanner(System.in); // 재사용이 불가능 
	        System.out.print("단 입력:");
	        int dan=scan.nextInt();
	        return dan;
	}
    static void gugudan(int dan)
    {
    	for(int i=1;i<=9;i++)
        {
        	System.out.printf("%d * %d = %d\n",dan,i,dan*i);
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*Scanner scan=new Scanner(System.in); // 재사용이 불가능 
        System.out.print("단 입력:");
        int dan=scan.nextInt();
        /////////////////////// 입력 기능 
        for(int i=1;i<=9;i++)
        {
        	System.out.printf("%d * %d = %d\n",dan,i,dan*i);
        }*/
		int dan=input();
		gugudan(dan);
	}

}
