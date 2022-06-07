// 문자열을 입력받아서 => 정수 변환 => 배열에 저장 => 나누기 
// NumberFormatException , ArrayIndexOutOfBoundsException => 예측 
import java.util.*;
public class MainClass4 {
	// 인스턴스 => 객체 생성후에 사용이 가능 
    public void calc() throws NumberFormatException,ArrayIndexOutOfBoundsException, ArithmeticException,Exception
    {
    	Scanner scan=new Scanner(System.in);
    	System.out.print("첫번째 정수입력:");
    	String num1=scan.next();
    	System.out.print("두번째 정수입력:");
    	String num2=scan.next();
    	
    	int[] arr=new int[2];
    	arr[0]=Integer.parseInt(num1); // 문자열을 정수로 변경 
    	arr[2]=Integer.parseInt(num2);
    	
    	int c=arr[0]/arr[1];
    	System.out.println(c);
    }
    // 예외처리가 반드시 필요한 부분은 아니다 
    /*
     *   NumberFormatException,ArrayIndexOutOfBoundsException, ArithmeticException
     *   RuntimeException => UnCheckException이기 때문에 필요시에만 예외처리
     *   
     *        Exception 
     *           |
     *     ----------------
     *     |              |
     *   CheckException  UnCheckException 
     *   --------------  ---------------- 인도 
     *   컴파일러가 예외를 감시   => 생략이 가능 
     */
    // 1. 선언(간접 => 시스텀에 의해 처리가 가능하게)
    // 2. 에외처리를 직접 처리하는 방법 
    // 3. 가장 큰 예외처리로 대체
    // 4. try~catch
	public static void main(String[] args) /*throws NumberFormatException, ArrayIndexOutOfBoundsException, ArithmeticException, Exception*/ /*throws NumberFormatException,ArrayIndexOutOfBoundsException, ArithmeticException,Exception*/
		                                   /*throws Exception*/{
		// TODO Auto-generated method stub
        MainClass4 mc=new MainClass4();
        //try
        //{
          try {
			mc.calc();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        //}
          /*catch(NumberFormatException ex)
        {
        	
        }catch(ArithmeticException ex)
        {
        	
        }catch(ArrayIndexOutOfBoundsException ex)
        {
        	
        }//catch(Exception ex){}*/
        System.out.println("프로그램 종료!!");
	}

}
/*
 *   throws : 예외만 통과 
 *   try~catch : 처리후에 => 이동 , 사용자 제시
 */



