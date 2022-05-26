class Member
{
	String name;//인스턴스안에서만 사용이 가능 
	static String address;//전역변수 
	// 대부분 => 인스턴스변수,인스턴스메소드가 중심으로 사용
	// 인스턴스의 초기화 => 생성자 
	
	{
		// instacne 블록 => 인스턴스변수가 초기화하는 영역 
		// name , address
		name="aaa";
		address="aaa";
	}
	
	static 
	{
		address="bbb";
		//name="";//(X) => 인스턴스변수는 사용이 불가능 (메모리 할당)
	}
	// 생성자는 static이 없다 
	Member()
	{
		// static , instance사용이 가능 
		name="bbb";
		address="ccc";
	}
	
	void print()
	{
		name="ddd";
		address="ddd";
		display();
	}
	
	static void display()
	{
		address="eee";
		//name="kjkk";
		//print()
	}
}
public class 초기화블록3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
