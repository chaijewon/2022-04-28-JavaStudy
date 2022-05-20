// 이름을 입력받아서 출력하는 메소드 제작 
// 메소드 => 기능별 분리 (재사용)
import java.util.Scanner;
public class 메소드정리_3 {
    static String input()
    {
    	Scanner scan=new Scanner(System.in);
    	System.out.print("이름 입력:");
    	return scan.next();
    }
    static void output(String name)
    {
    	System.out.println("입력된 이름:"+name);
    }
    static void process()
    {
    	String name=input();
    	output(name);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        process();
	}

}
