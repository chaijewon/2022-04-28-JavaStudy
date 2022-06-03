
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	//int a=10/0;
        	int[] a= {1};
        	a[1]=10;
        	// 멀티 블록
        }catch(ArrayIndexOutOfBoundsException | ArithmeticException e)
        {
        	System.out.println("에러 발생");
        }
        System.out.println("수행 완료");
	}

}
