/*
 *   난수를 5개 발생한후에 최대값을 초기화 사용한다
 *   명시적 초기화 (X)
 *   --------------
 *   1. 생성자 
 *   2. 초기화 블록 
 *   -------------- 둘중에 한개 선택 (인스턴스)
 *   
 *   static 변수 => static{}
 *   
 */
class Instance1
{
	// 초기화 블록 
	int max;
	
	{
		int m=0;
		for(int i=0;i<5;i++)
		{
			int rand=(int)(Math.random()*100)+1;
			if(rand>m)
				m=rand;
		}
		max=m;
	}
	
	int a=10;
	
	static 
	{
		Instance1 aaa=new Instance1();
		aaa.a=100;
	}
	static int b=10;
	
	{
		b=100;
	}
	
    {
	    a=100;
	    b=200;
	}
}
class Instance2
{
	int max;
	Instance2() {
		int m=0;
		for(int i=0;i<5;i++)
		{
			int rand=(int)(Math.random()*100)+1;
			if(rand>m)
				m=rand;
		}
		max=m;
	}
}
class Static1{
	static int max;
	Static1() {
		int m=0;
		for(int i=0;i<5;i++)
		{
			int rand=(int)(Math.random()*100)+1;
			if(rand>m)
				m=rand;
		}
		max=m;
	}
}
/*
 *  static => 생성자를 호출 하지 않아도 사용
 *  instance => 무조건 생성자가 호출되야 저장된다 
 */
class Static2{
    static int max;
	
    static
	{
		int m=0;
		for(int i=0;i<5;i++)
		{
			int rand=(int)(Math.random()*100)+1;
			if(rand>m)
				m=rand;
		}
		
		max=m;
	}
}
public class 초기화블록2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Instance1 in1=new Instance1();
        System.out.println("Instance1:max="+in1.max);
        
        Instance2 in2=new Instance2();
        System.out.println("Instance2:max="+in2.max);
        
        //Static1 s1=new Static1();
        System.out.println("Static1:max="+Static1.max);
        
        System.out.println("Static2:max="+Static2.max);
        
	}

}
/*
 *   305page
 *   
 *   클래스(static) 초기화  인스턴스 초기화
 *   -----------------  -------------
 *   기본 => 명시 => 블록    기본 => 명시 => 초기화 => 생성자 
 *   
 *   class A
 *   {
 *      int a=10;
 *      static
 *      {
 *         a=100;
 *      }
 *   }
 *   
 *   A aa=new A();
 *   aa.a
 *   
 */   
