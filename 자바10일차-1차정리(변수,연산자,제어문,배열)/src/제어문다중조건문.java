import java.util.Scanner;
public class 제어문다중조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        final int LOGIN=1;
        final int LOGOUT=2;
        final int MAKEROOM=3;
        final int ROOMIN=4;
        final int ROOMOUT=5;
        final int CHAT=6;
        final int END=7; // 메뉴 
        
        Scanner scan=new Scanner(System.in);
        System.out.print("메뉴 선택:");
        int menu=scan.nextInt();
        
        if(menu==LOGIN)
        {
        	System.out.println("로그인 화면 전송!!");
        }
        else if(menu==LOGOUT)
        {
        	System.out.println("윈도우 화면 종료!!");
        }
        else if(menu==MAKEROOM)
        {
        	System.out.println("방을 만들어 준다");
        }
        else if(menu==END)
        {
        	System.out.println("프로그램 종료!!");
        }
        
	}

}
