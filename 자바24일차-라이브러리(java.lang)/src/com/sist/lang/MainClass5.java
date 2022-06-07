package com.sist.lang;
// clone : 메모리 복제 
class Box implements Cloneable
{
	int width;
	int height;
	public Box()
	{
		width=640;
		height=480;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
}
public class MainClass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Box box1=new Box();
        Box box2=box1;// 같은 주소를 제어 (별칭,참조) 
        
        System.out.println("box1.width="+box1.width);
        System.out.println("box1.height="+box1.height);
        
        System.out.println("box2.width="+box2.width);
        System.out.println("box2.height="+box2.height);
        
        box2.width=1024;
        box2.height=768;
        
        System.out.println("box1.width="+box1.width);
        System.out.println("box1.height="+box1.height);
        
        System.out.println("box2.width="+box2.width);
        System.out.println("box2.height="+box2.height);
        System.out.println("box1="+box1);
        System.out.println("box2="+box2);
        System.out.println("=========복제==============");
        try
        {
           Box box3=(Box)box1.clone();// 형변환 (리턴형,매개변수 => Object)
           // 메모리를 그대로 카피 => 새로운 메모리 생성 
           System.out.println("box1.width="+box1.width);
           System.out.println("box1.height="+box1.height);
           
           System.out.println("box3.width="+box3.width);
           System.out.println("box3.height="+box3.height);
           
           box3.width=1000;
           box3.height=500;
           
           System.out.println("box1.width="+box1.width);
           System.out.println("box1.height="+box1.height);
           
           System.out.println("box3.width="+box3.width);
           System.out.println("box3.height="+box3.height);
           
           System.out.println("box1="+box1);
           System.out.println("box3="+box3);
           
           Box box4=new Box();
           System.out.println("box4="+box4);
           System.out.println("box4.width="+box4.width);
           System.out.println("box4.height="+box4.height);
           
           Box c1=Box.class.getDeclaredConstructor().newInstance();
           System.out.println("c1="+c1);
           Box c2=new Box().getClass().getDeclaredConstructor().newInstance();
           System.out.println("c2="+c2);
           Box c3=(Box)Class.forName("com.sist.lang.Box").getDeclaredConstructor().newInstance();
           System.out.println("c3="+c3);
           
           
        }catch(Exception ex){}
	}

}
