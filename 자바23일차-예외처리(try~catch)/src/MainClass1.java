/* 
 *   순서 
 *   ----
 *     실행문장 1
 *     실행문장 2 ==> 에러발생 
 *     try
 *     {
 *        실행문장 3
 *        실행문장 4 ==> 에러발생
 *        실행문장 5
 *     }catch(예외처리)
 *     {
 *        실행문장 6
 *     }
 *     finally
 *     {
 *        실행문장 7
 *     }
 *     실행문장 8
 *     실행문장 9
 *     
 *     ================> 1,2,3,4,5,7,8,9
 *     ================> 1,2,3,6,7,8,9
 *     ================> 1
 *     
 *     try에서 에러가 없는 경우에는 catch는 수행하지 않고 finally를 수행하고
 *     마지막 문장까지 수행 
 *     
 *     try에서 중간에 에러가 발생하면 => catch롤 넘어간다 => finally ==
 *     
 *     => 예상 
 *        사용자 입력부분 *** 필수 
 *        ----------- 필수 
 *        파일 읽기 
 *        코롤링 
 *        네트워크 통신 
 *        -----------
 *     
 */
public class MainClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1,2,3,4,5,7,8,9
		// 1,2,3,6,7,8,9
        System.out.println("1");
        System.out.println("2");
        try
        {
        	System.out.println("3");
            System.out.println(10/0); // 에러 발생 => catch이동
            System.out.println("5");
        }catch(Exception ex)
        {
        	System.out.println("6");
        }
        finally
        {
        	System.out.println("7");// 무조건 수행하는 문장 
        	// try / catch 
        }
        System.out.println("8");
        System.out.println("9");
        
	}

}







