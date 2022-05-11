import java.util.Arrays;

// 1. 10명의 점수를 받아서 평균/총합/최대값/최소값 

public class 자바배열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr=new int[10];
        //초기값
        for(int i=0;i<arr.length;i++)
        {
        	arr[i]=(int)(Math.random()*100)+1;
        }
        // 출력 
        System.out.println(Arrays.toString(arr));
        
        // 총합 / 평균 
        int total=0;
        double avg=0.0;
        
        for(int i:arr)
        {
        	total+=i;
        }
        
        avg=total/10.0;
        
        // 최대값 / 최소값
        int max=arr[0];
        int min=arr[0];
        for(int i:arr)
        {
        	if(max<i)
        		max=i;
        	if(min>i)
        		min=i;
        }
        
        System.out.println("총합:"+total);
        System.out.printf("평균:%.2f\n",avg);
        System.out.println("최대값:"+max);
        System.out.println("최소값:"+min);
        
	}

}
