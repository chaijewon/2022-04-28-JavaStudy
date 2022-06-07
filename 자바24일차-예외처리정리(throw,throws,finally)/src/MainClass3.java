/*
 *   throws : 예외 선언 (컴파일러가 인식) 
 *            => 예측가능 , 소스 간결 , (복구) 
 *            => 예외 회피
 *            => try~catch => 직접 , throws => 간접 처리 
 *            => 자바,외부 지원하는 라이브러리에서는 throws 
 *               => 지원하는 메소드 사용시에는 예외를 처리하고 사용해야 된다  
 */
import java.io.*;
// 웹 => 네트워크 (서버/클라이언트) => 모든 클래스 예외처리가 존재 
public class MainClass3 {

	public static void main(String[] args) /*throws FileNotFoundException*/ {
		// TODO Auto-generated method stub
        try
        {
		  FileReader fr=new FileReader("");
        }catch(FileNotFoundException ex) {}
	}

}
