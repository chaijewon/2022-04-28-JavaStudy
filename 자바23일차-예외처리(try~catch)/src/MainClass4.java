/*
 *   에러메세지 처리 (422)
 *    = getMessage() => 실제 에러내용만 출력 
 *    = printStackTrace() => 에러 위치 확인 (***)
 *    
 *    = null 
 */
import java.util.*;
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	Scanner scan=new Scanner(System.in);
        	System.out.print("첫번째 정수 입력:");
        	int num1=scan.nextInt();
        	
        	System.out.print("두번째 정수 입력:");
        	int num2=scan.nextInt();
        	
        	int[] arr=new int[2];
        	arr[0]=num1;
        	arr[1]=num2;
        	
        	int result=num1/num2;
        	System.out.println(result);
        }catch(Exception ex)
        {
        	//System.out.println(ex.getMessage());
        	ex.printStackTrace();// 실행하는 순서 
        }
	}

}
