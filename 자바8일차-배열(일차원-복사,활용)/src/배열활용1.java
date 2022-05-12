import java.util.Arrays;

// 1. 임의의 정수를 배열에 주입 => 평균/총합 => 196page 
public class 배열활용1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 배열 선언
		int[] arr=new int[10];
		// 초기화 
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1; 
		}
		// 확인 
		System.out.println("arr="+Arrays.toString(arr));
		// 처리 
		// 총합/평균을 구해서 저장 변수가 필요 
		int total=0;
		double avg=0.0;
		
		for(int i:arr)
		{
			total+=i;
		}
		
		avg=total/10.0;
		
		// 출력 
		System.out.println("총합:"+total);
		System.out.printf("평균:%.2f\n",avg);
        
	}

}






