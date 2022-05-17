import java.util.Arrays;

// 중복이 없는 난수 발생 => 사용자 요청에 따라 10,3 6
public class 메소드제작_3 {
	// 배열을 동적으로 변경 
    static int[] rand(int count)
    {
    	int[] com=new int[count];
    	for(int i=0;i<com.length;i++)
    	{
    		com[i]=(int)(Math.random()*100)+1;
    	}
    	return com;
    }
    static void process()
    {
    	System.out.println("===== 5개 요청 ======");
    	int[] user=rand(5);
    	System.out.println(Arrays.toString(user));
    	System.out.println("===== 10개 요청 ======");
    	user=rand(10);
    	System.out.println(Arrays.toString(user));
    	System.out.println("===== 15개 요청 ======");
    	user=rand(15);
    	System.out.println(Arrays.toString(user));
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        process();
	}

}
