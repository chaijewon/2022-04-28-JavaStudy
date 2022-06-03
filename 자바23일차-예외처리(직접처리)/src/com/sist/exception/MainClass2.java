package com.sist.exception;
/*
 *    416page 
 *    --------
 *    예외처리 
 *      = 예외 복구 : try~catch (가장 많이 사용되는 예외처리)
 *                  try
 *                  {
 *                      정상으로 수행하는 문장 (지금 코딩한 소스)
 *                  }
 *                  catch() => 여러버 사용이 가능 
 *                  {
 *                      에러 처리후 복구 
 *                  }
 *      = 예외 회피 : 시스템에 전담 => throws (라이브러리)
 *                 => 라이브러리 사용시에 예외처리후 사용 
 *                 
 *        sleep(long millis) throws InterruptedException
 *      = 예외 임의 발생 (테스팅) => throw 
 *      = 사용자 정의 예외 처리 (자바에서 전체 에러처리를 할 수 없다)
 *        class MyException extends Exception
 *        
 *   1. 예외처리 복구하는 과정 
 *      => 예외처리는 사용한 위치에 따라 다르다 
 *     try 
 *     { 
 *      ------;
 *      
 *      ------;
 *      
 *      ------; => 예상(에러)
 *      
 *      ------;
 *      
 *      ------;
 *     }
 *     
 *      ------;
 *      
 *      ------;
 *     try
 *     { 
 *      ------; => 예상(에러)
 *     }
 *      ------;
 *      
 *      ------;
 *      
 *      1. 예상되는 에러 체크 
 *         문자열을 받아서 정수로 변환후에 배열에 저장 => 나누기한 후에 출력 
 *                    ---------   ---------   ---------
 *                       1            2           3
 *      2. 크롤링 
 *          1. URL주소 => Jsoup.connect("URL")
 *          2. HTML마다 구조가 틀릴 수 있다 
 *          3. 값이 없는 경우 
 *          ----------------------------------
 *          
 *      => try
 *         {
 *             정상으로 수행할 수 있는 명령문 => 정상 
 *             --  정상 
 *             --  정상
 *             --  에러 ===> catch (3) => 건너뛴다 
 *             --  정상
 *             --  정상
 *         }catch(발생할 예외처리 클래스 1){에러처리문장}
 *          catch(발생할 예외처리 클래스 2){에러처리문}
 *          catch(발생할 예외처리 클래스 3){에러처리문}
 *          catch(발생할 예외처리 클래스 4){에러처리문}
 *          catch(발생할 예외처리 클래스 5){에러처리문}
 *          finally => 생략(필요시에만 사용)
 *          {
 *              무조건 수행하는 문장 : 오라클/서버/파일 => 반드시 닫는다 
 *          }
 *          ==> 417
 */
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 //try{
	        for(int i=1;i<=10;i++)
	        {
	        	try
	        	{
	        	  int a=(int)(Math.random()*3);
	        	  System.out.println("i="+i+","+i/a);
	        	}catch(Exception ex) {}
	        }
	   //}catch(Exception ex) {System.out.println("에러 발생");}
	}

}






