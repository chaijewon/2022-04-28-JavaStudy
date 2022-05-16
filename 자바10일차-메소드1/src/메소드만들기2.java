import java.util.Arrays;

// 정수 5개 입력 => 1.최대값 , 2. 최소값 
/*
 *    매개변수 : 정수 5개 
 *    리턴형 : 최대값 
 *           최소값 
 *    int max(int a,int b,int c,int d,int e) => int[] arr,클래스
 *    int min(int a,int b,int c,int d,int e) => int[] arr,클래스
 *    
 *    리턴형 메소드(매개변수...)
 *              ---------- 매개변수가 없는 경우 ()
 *    ----- 결과값이 없는 경우 (void=자체에서 처리)
 */
public class 메소드만들기2 {
    static int max(int[] arr)
    {
    	int m=0;
    	for(int i:arr)
    	{
    		if(m<i)
    			m=i;
    	}
    	return m;
    }
    static int min(int[] arr)
    {
    	int m=100;
    	for(int i:arr)
    	{
    		if(m>i)
    			m=i;
    	}
    	
    	return m;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr=new int[5];
        for(int i=0;i<arr.length;i++)
        {
        	arr[i]=(int)(Math.random()*100)+1;
        }
        
        // 메소드 호출 
        int max=max(arr);
        int min=min(arr);
        
        System.out.println(Arrays.toString(arr));
        System.out.println("최대값:"+max);
        System.out.println("최소값:"+min);
	}

}
