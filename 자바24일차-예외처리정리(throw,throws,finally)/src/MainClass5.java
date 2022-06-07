// finally 블록 (데이터베이스 , 네트워크 , 파일 , 크롤링)
// 메모리 누수
/*
 *    -------------------- NCS 
 *    1. 예측 => 요구사항 분석 (예외처리)
 *    2. 메모리 누수 방지 => 반드시 열고 닫기 
 *    3. 소스가 간결 => 패턴 , 알고리즘 
 *    4. 수정 , 추가 (객체지향 프로그램)
 *    5. 최적도 => 라이브러리 설정 , SQL 순서 
 *    --------------------
 *    
 *    영어 사전 => 회화(X)
 *      문법  (시험) => 구현 
 *      
 *    => 생략이 가능 => 많이 사용되지는 않는다 
 *       => 닫기 (가비지 컬렉션의 단점 : 바로 메모리를 회수하지 않는다)
 *    => finally : 정상수행 , 에러발생 => 상관없이 무조건 수행이 가능한 문장 
 *    => 프로젝트 : GIT(원격) => 에러난 코드 (백업) 
 *    try
 *    {
 *       정상 수행 (에러가 발생할 수도 있다)
 *    }catch()
 *    {
 *       에러발생시에 처리 (복구) 
 *    }
 *    finally{ => 생략이 가능 
 *       닫기 
 *    } 
 */
import java.io.*;
public class MainClass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*FileReader fr=null;// 초기값 부여 
        try
        {
        	fr=new FileReader("c:\\javaDev\\melon.txt");
        	int i=0;
        	String data="";
        	while((i=fr.read())!=-1)// melon.txt의 전체문장을 읽기
        	{  // read() => 1글자씩 읽기 => 읽은 문자 => 정수형으로 
        	   data+=String.valueOf((char)i);
        	}
        	System.out.println(data);
        }catch(Exception ex)
        {
        	System.out.println(ex.getMessage());// 에러 확인 
        }
        finally
        {
        	try
        	{
        	  fr.close();
        	}catch(Exception ex) {}
        }*/
		// fr.close()를 자동 처리 (자동 자원 반환) => 436page~437page
		// finally를 사용 할 필요가 없다 
		try(FileReader fr=new FileReader("c:\\javaDev\\melon.txt"))
		{
			int i=0;
			String data="";
			while((i=fr.read())!=-1)
			{
				data+=String.valueOf((char)i);
			}
			System.out.println(data);
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

}







