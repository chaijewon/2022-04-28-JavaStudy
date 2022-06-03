
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	int[] arr= {1};
        	arr[1]=20;
        	System.out.println(arr[0]);
        	/*
        	 *   if ===
        	 *   if ===
        	 *   if ===
        	 */
        	//Class.forName("com.sist.main.MainClass3");
        	// ClassNotFoundException 
        }
        catch(ArrayIndexOutOfBoundsException ex)
        {
        	System.out.println("배열의 범위 초과");
        }
        catch(Exception ex) // 기타 => 예외처리중에 가장 큰 클래스 
        {
        	System.out.println("예외의 모든 에러를 잡을 수 있다");
        }
        
        /*catch(ArithmeticException ex)
        {
        	System.out.println("0으로 나눌 수 없다");
        }
        catch(NumberFormatException ex)
        {
        	System.out.println("정수형 변환이 안된 경우");
        	// 웹 => 데이터 전송 => 문자열 (윈도우)
        	
        }
        catch(ClassCastException ex)
        {
        	System.out.println("클래스 형변환 문제 발생");
        }
        catch(NullPointerException ex)
        {
        	System.out.println("클래스 객체의 값이 없는 상태");
        }
        catch(Exception ex) // 기타 => 예외처리중에 가장 큰 클래스 
        {
        	System.out.println("예외의 모든 에러를 잡을 수 있다");
        }
        catch(Throwable ex)
        {
        	System.out.println("예외+에러 예외처리기");
        }
        */
        System.out.println("프로그램 종료!!");
        
	}

}
