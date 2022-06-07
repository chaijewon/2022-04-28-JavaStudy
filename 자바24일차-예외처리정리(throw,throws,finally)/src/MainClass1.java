/*
 *   throw => 많이 사용하는 문장은 아니다 
 *            => 테스트용으로 사용 (견고한 프로그램 확인) 
 *            => 임의로 발생 
 *            => 사용법 (라이브러리 예외처리 => 사용자 정의 예외처리)
 *               throw new 예외처리 생성자() 
 *               => 다음줄에는 코딩할 수 없다 
 *               => 예) throw new Exception()
 *   -----------------------------------------------------
 *   throws : 예외 선언하기 => 라이브러리에서 사용 
 *            => 예외에 대한 예측이 가능 (어떤 에러가 발생할지를 알고 코딩)
 *            => 메소드내에서 예외처리를 하지 않아도 된다 
 *               => 예외처리 단점 (소스코딩 , 복합한 소스) => 방지 
 *               => 복구를 할 수 없다 (시스템에 의해 처리)
 *            => 사용법 => 메소드 뒤에 붙인다
 *               public void display() throws 예외처리 종류 
 *                                            ----------
 *                                            순서가 없다 
 *                                            => 시스텀(가상머신)에 알려준다 
 *            => 실제 사용 
 *               public void display() throws Exception
 *               {
 *                   // display()를 사용할때는 Exception를 처리한후에 사용
 *               }
 *               
 *               => public void aaa() throws Exception
 *                  {
 *                        display();//예외처리가 없는 경우에 오류 발생 
 *                  }
 *                  
 *                  public void bbb() 
 *                  {
 *                      try
 *                      {
 *                          display();
 *                      }catch(Exception ex)
 *                      {
 *                      }
 *                  }
 *              => 여러개를 선언 할 수 있다 
 *              public void disp() throws Exception,SQLExcetion....
 *                                 --------------------------------
 *                                   순서가 없다 (예상되는 에러를 예측) 
 *              => 사용자 입력 / 조작
 *                 프로그래머 실수 
 *              => disp() 사용시에는 throws / try~catch 
 *                 => 가장 큰 예외처리만 해도 된다 
 *              => IT(프로그래머 => 시간)
 *     finally
 *     ------- 필요시에만 사용 (서버,파일,데이터베이스) 
 *       try ~ catch 상관없이 무조건 수행하는 문장 
 *       ==> 닫기 
 *     
 *     사용자 정의 
 *     ========= 자바에서 지원하지 않는 예외가 있는 경우 
 *               => if 
 *               => if문으로 처리가 어렵다 , 자주 발생 
 *               => 사용 빈도는 거의 없다 
 *               => 사용법 
 *                  public class MyException extends Exception
 *   
 */
// public void sleep() throws InterruptedException
public class MainClass1 {

	public static void main(String[] args) /*throws InterruptedException*/{
		// TODO Auto-generated method stub
		try
		{
           Thread.sleep(1000); 
		}catch(Exception e) {}
	}

}
