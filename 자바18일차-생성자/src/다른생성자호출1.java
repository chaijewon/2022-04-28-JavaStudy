class Sawon1{
	String name;//null
	int age;//0
	Sawon1(){
		name="홍길동";
		age=25;
	}
	Sawon1(int age)
	{
		//System.out.println("");
		this("이순신");// 자신의 클래스에서 클래스 호출  => super()
		// 첫번째 코당만 가능 
		this.age=age;//this가 클래스 자신 
	}
	Sawon1(String name)
	{
		this.name=name;
	}
	Sawon1(int age,String name)
	{
		
		this.age=age;
		this.name=name;
	}
	void print()
	{
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
	}
}
/*
 *   생성자명으로 호출하지 않고 this()
 *   생성자안에서는 this()사용시에 첫번째줄에 사용  
 */
public class 다른생성자호출1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Sawon1 s=new Sawon1();
        s.print();
        // JVM => this=s
        Sawon1 s1=new Sawon1(20);
        s1.print();
        
        Sawon1 s2=new Sawon1("심청이");
        s2.print();
        
        Sawon1 s3=new Sawon1(23,"박문수");
        s3.print();
	}

}
