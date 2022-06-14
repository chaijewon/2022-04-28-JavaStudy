package com.sist.ann;
import java.lang.reflect.Method;
import java.util.*;
// 2800~3200  

class Board
{
	@RequestMapping("w") //if(data.equals("w")) => if문 추가 
	public void write()
	{
		System.out.println("글쓰기 기능 구현");
	}
	@RequestMapping("l")
	public void list()
	{
		System.out.println("목록 출력 기능 구현");
	}
	@RequestMapping("d")
	public void detail()
	{
		System.out.println("상세보기 기능 구현");
	}
	@RequestMapping("u")
	public void update()
	{
		System.out.println("수정하기 기능 구현");
	}
	@RequestMapping("del")
	public void delete()
	{
		System.out.println("삭제하기 기능 구현");
	}
	@RequestMapping("f")
	public void find()
	{
		System.out.println("검색하기 기능 구현");
	}
	@RequestMapping("r")
	public void reply()
	{
		System.out.println("답변하기 기능 구현");
	}
}
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("기능 입력:(write,list,detail,update,delete):");
        String cmd=scan.next();
        //Board board=new Board();
        /*if(cmd.equals("write"))
        {
        	board.write();
        }
        else if(cmd.equals("list"))
        {
        	board.list();
        }
        else if(cmd.equals("detail"))
        {
        	board.detail();
        }
        else if(cmd.equals("update"))
        {
        	board.update();
        }
        else if(cmd.equals("delete"))
        {
        	board.delete();
        }*/
        
        try
        {
        	Class clsName=Class.forName("com.sist.ann.Board");
        	Object obj=clsName.getDeclaredConstructor().newInstance();
        	Method[] methods=clsName.getDeclaredMethods();
        	for(Method m:methods)
        	{
        		RequestMapping rm=m.getAnnotation(RequestMapping.class);
        		if(cmd.equals(rm.value()))
        		{
        			m.invoke(obj, null);// 메소드이름이 없어도 호출이 가능 
        		}
        	}
        }catch(Exception ex) {}
	}

}
