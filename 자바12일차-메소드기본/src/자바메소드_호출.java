
public class 자바메소드_호출 {
    //static => 메모리에 자동 저장 
	static int add(int a,int b, int c)
	{
		return a+b+c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //add(10,20,30); // new 
		//System.out.println(add(10,20,30));
		// 평균을 구하라
		int sum=add(10,20,30);
		double avg=sum/3.0;
		System.out.printf("%.2f",avg);
	}

}
