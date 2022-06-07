// throw : 던지다 (예외 발생한다)
class MyException extends Exception
{
	private String msg;
	public MyException(String msg)
	{
		this.msg=msg;
	}
}
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	/*int a=10;
        	if(a%2==0)
        	{
        		System.out.println("예외 발생...");
        		throw new Exception(a+"는(은) 짝수입니다!!");
        		// catch절의 해당 예외처리를 찾아간다
        		//System.out.println("");
        	}*/
        	throw new MyException("사용자 정의 에러");
        	// catch호출 => MyException 호출 
        	// ㅏ용자 정의 예외처리는 프로그래머가 직접 발생해야 사용이 가능 
        }catch(MyException ex)// 사용자 정의는 컴파일러가 인식을 하지 않는다
        {
        	System.out.println("MyException:에러발생");
        	System.out.println(ex.getMessage());
        }
        catch(Exception ex)
        {
        	System.out.println("Exception:에러발생");
        	System.out.println(ex.getMessage());
        }
	}

}
