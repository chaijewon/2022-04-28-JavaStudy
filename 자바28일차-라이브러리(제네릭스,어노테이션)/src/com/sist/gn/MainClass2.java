package com.sist.gn;
import java.util.*;
class Sawon
{
	private int sabun;
	private String name;
	public int getSabun() {
		return sabun;
	}
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList list=new ArrayList(); // 메소드 (리턴형과 매개변수 : Object)
        list.add("Java");
        list.add("Oracle");
        list.add("HTML");
        // 추가 
        //list.add(1000);
        for(int i=0;i<list.size();i++)
        {
        	String subject=(String)list.get(i);
        	System.out.println(subject);
        }
        
        ArrayList<String> list2=new ArrayList<String>();
        list2.add("Java");
        list2.add("Oracle");
        list2.add("HTML");
        //list2.add(1000);
        for(int i=0;i<list.size();i++)
        {
        	String name=list2.get(i);
        	System.out.println(name);
        }
        
        ArrayList<Integer> list3=new ArrayList<Integer>();
        list3.add(100);
        list3.add(200);
        list3.add(300);
        //list2.add(1000);
        for(int i=0;i<list3.size();i++)
        {
        	int a=list3.get(i); // => 언박싱 
        	System.out.println(a);
        }
        
        ArrayList<Sawon> list4=new ArrayList<Sawon>();
        //                                 ----
        Sawon s1=new Sawon();
        s1.setSabun(1);
        s1.setName("hong");
        list4.add(s1);
        s1=new Sawon();
        s1.setSabun(2);
        s1.setName("shim");
        list4.add(s1);
        for(Sawon s:list4)
        {
        	System.out.println(s.getName());
        }
        /*for(Object sa:list4)
        {
        	System.out.println(((Sawon)sa).getName());
        }*/
        
	}

}
