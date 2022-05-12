import java.util.Arrays;

// 임의의 정수를 10개 => 최대값/최소값 
// 변수 => 10개를 저장  => 최대값/최소값 ==> 3개 
public class 배열활용2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr=new int[10];
        // 초기화 
        for(int i=0;i<arr.length;i++)
        {
        	arr[i]=(int)(Math.random()*100)+1;
        }
        // 처리 => 결과값 도출 
        int min=100;
        int max=0;
        for(int i:arr)
        {
        	if(max<i)
        		max=i;
        	if(min>i)
        		min=i;
        }
        // 결과값 출력
        System.out.println("arr="+Arrays.toString(arr));
        System.out.println("최대값:"+max);
        System.out.println("최소값:"+min);
        
	}

}
