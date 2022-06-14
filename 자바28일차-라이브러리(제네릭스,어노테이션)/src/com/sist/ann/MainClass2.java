package com.sist.ann;
import java.util.*;
interface II
{
	public void display();
}
class AA implements II
{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("AA:display() Call");
	}
	
}
class BB implements II
{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("BB:display() Call");
	}
	
}
class CC implements II
{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("CC:display() Call");
	}
	
}
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Map<String,II> map=new HashMap<String,II>();
        map.put("a", new AA());
        map.put("b", new BB());
        map.put("c", new CC());
        
        Scanner scan=new Scanner(System.in);
        System.out.print("입력(a,b,c):");
        String cmd=scan.next();
        
        II i=map.get(cmd);
        i.display();
        
	}

}
