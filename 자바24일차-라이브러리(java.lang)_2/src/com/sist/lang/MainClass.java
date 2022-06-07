package com.sist.lang;
interface Board
{
	void write();
	void list();
	void detail();
}
// 표준화 => 스프링 => 소스 형식 
class AAA
{
	public AAA() {a=10;}
	int a;
}
class BBB{
	void  aaa() {}
	private void bbb() {}
}
class CCC extends BBB
{
	void aaa() {}
	private void bbb() {}// 오버라이딩이 아니다 
}
class A1 implements Board{

	@Override
	public void write() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void list() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void detail() {
		// TODO Auto-generated method stub
		
	}
	
}
class B1 implements Board{

	@Override
	public void write() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void list() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void detail() {
		// TODO Auto-generated method stub
		
	}
	
}
/*
 *                      Exception
 *       ------------------------------
 *       |                           |
 *   ClassNotFoundException          RuntimeException
 *                                      |
 *                                 NumberFormatException
 */
public class MainClass {
	public void method1() throws NumberFormatException, 
	ClassNotFoundException {  }
    public void display()  
    {
    	try{ method1(); } 
    	catch (ClassNotFoundException e) {}
    	catch (NumberFormatException e) { }

    	//try{ method1(); } catch (Exception e) { }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    	String[] strArray = { "10" , "2a" };
		        int value = 0;
		        for(int i = 0; i <= 2; i++ ){
		        	try{
		            	value = Integer.parseInt(strArray[i]); 
		            } catch(ArrayIndexOutOfBoundsException e){
		            	System.out.println("인덱스를 초과했음"); 
		            } catch(NumberFormatException e) {
		            	System.out.println("숫자로 변환할 수 없음"); 
		            } finally {
		            	System.out.println(value); 
		            }
		        }
		    }
		


}
