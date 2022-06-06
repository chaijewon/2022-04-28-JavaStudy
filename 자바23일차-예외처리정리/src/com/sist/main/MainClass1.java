package com.sist.main;

import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;

/*
 *   예외 : 소스상 수정이 가능한 에러 (Exception)
 *         사용자 입력을 다시 유도 
 *         ------------------------------
 *   catch => 여러개 사용이 가능 (예상되는 예외를 처리)
 *            반드시 순서가 존재 
 *            -------------- 상속도 
 *               Exception 
 *                 |
 *           ----------------
 *           |              |
 *         IOException    RuntimeException (필요시에만 예외 처리)
 *         SQLException     |
 *         네트워크 관련      ArrayIndexOutOfBoundsException 
 *         쓰레드           NumberFormatException
 *         클래스 관련       NollPointerException 
 *                        ClassCastException 
 *         -------------
 *         java.io 
 *         java.net
 *         java.sql
 *         CheckException
 *         io오류 
 *         
 *         catch(IOException ex){}
 *        
 *         catch(ArrayIndexOutOfBoundsException ex){}
 *         catch(RuntimeException ex){}
 *         catch(Exception ex){}
 *         
 *      실행 순서  => 123  => 1,6
 *      try
 *      {
 *          System.out.println(1);
 *          System.out.println(2);
 *          Class.forName("");=> ClassNotFoundException
 *          System.out.println(3);
 *          
 *      }catch(IOException ex){
 *          System.out.println(4);
 *      }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println(5);
        }
        //ArithmeticException
        catch(RuntimeException ex){
            System.out.println(6);
        }
        
        catch(Exception ex) {
            System.out.println(7);
        }  
        catch(Throwable ex) {
            System.out.println(7);
        }  
 */
public class MainClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*try
        {
            for(int i=1;i<=10;i++)	
            {
            	int a=(int)(Math.random()*3);
            	System.out.println("i="+i+","+(i/a));
            }
        }catch(Exception ex) {
        	
        	System.out.println("에러");
        }*/
		for(int i=1;i<=10;i++)	
        {
			try
			{
        	 int a=(int)(Math.random()*3);
        	 System.out.println("i="+i+","+(i/a));
			}catch(Exception ex) {
	        	
	        	System.out.println("에러");
	        }
        }
		
        
	}

}
