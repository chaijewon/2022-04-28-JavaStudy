import java.util.*;
public class SawonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        SawonController sc=new SawonController();
        while(true)
        {
        	System.out.println("===== 메뉴 =====");
        	System.out.println("1. 사원 등록");
        	System.out.println("2. 사원 목록");
        	System.out.println("3. 사원 수정");
        	System.out.println("4. 사원 삭제");
        	System.out.println("9. 프로그램 종료");
        	System.out.println("===============");
        	System.out.print("메뉴 선택:");
        	int m=scan.nextInt();
        	if(m==9)
        	{
        		break;
        	}
        	else if(m==1)
        	{
        	   System.out.print("사번 입력:");
        	   Sawon ss=new Sawon();
        	   ss.sabun=scan.nextInt();
        	   System.out.print("이름 입력:");
        	   ss.name=scan.next();
        	   System.out.print("부서명 입력:");
        	   ss.dept=scan.next();
        	   System.out.print("근무지 입력:");
        	   ss.loc=scan.next();
        	   System.out.print("직위 입력:");
        	   ss.job=scan.next();
        	   System.out.print("급여 입력:");
        	   ss.pay=scan.nextInt();
        	   sc.insert(ss);
        	   sc.index++;
        	}
        	else if(m==2)
        	{
        		sc.list();
        	}
        }
        
        
	}

}
