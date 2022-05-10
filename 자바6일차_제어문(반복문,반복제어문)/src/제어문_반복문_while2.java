import java.io.*;
public class 제어문_반복문_while2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	FileReader fr=new FileReader("C:\\javaDev\\javaStudy\\자바6일차_제어문(반복문,반복제어문)\\src\\제어문_반복문_while1.java");
            int i=0;
            // while => 파일읽기 / 데이터베이스 읽기 / 크롤링
            while((i=fr.read())!=-1) //-1 EOF
            {
            	// 읽기 => 정수 (A=>65)
            	System.out.print((char)i);
            }
        }catch(Exception ex){}
	}

}
