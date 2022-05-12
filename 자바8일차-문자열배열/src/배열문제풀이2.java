import java.util.Arrays;

/*
 *   다음과 같이 임의의 정수(5)를 배열로 선언하고 정렬해서 출력하는 프로그램을 작성하시오
 *   
 *   선택정렬 : 앞에서부터 고정 
 *      94, 85, 95, 88, 90
 *      --  --
 *      85  94
 *      --      --
 *      85      95
 *      --          --
 *      85          88
 *      --              --
 *      85              90
 *      -------------------
 *      85  94  95  88  90 --> for-1
 *          --  --
 *          94  95
 *          --      --
 *          88      94  
 *          --          --
 *          88          90
 *      -------------------
 *      85  88  95  94  90 --> for-2
 *              --  --
 *              94  95
 *              --      --
 *              90      94
 *      ------------------- 
 *      85  88  90  95  94
 *                  --  --
 *                  94  95
 *      ------------------- 
 *      85  88  90  94  95 ---for-3
 *                        
 *   버블정렬 : 뒤에서부터 고정 
 */
public class 배열문제풀이2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 선택정렬 
		int[] arr=new int[10];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println("정렬 전:");
		System.out.println(Arrays.toString(arr));
		// 초기값 
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				// 교환 
				if(arr[i]<arr[j])//올림차순
				{
					// 임시변수 => arr[i]
					int tmp=arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
		}
		System.out.println("정렬 후:");
		System.out.println(Arrays.toString(arr));
		
		int[] arr2=new int[10];
		// 초기화
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i]=(int)(Math.random()*100)+1;
		}
		/*
		 *    인접한 데이터를 비교해서 처리 
		 *    50 20 30 10 40 => arr[j]<arr[j+1]
		 *    -- --
		 *    20 50
		 *       -- --
		 *       30 50
		 *          -- --
		 *          10 50
		 *             -- --
		 *             40 50
		 *     --------------
		 *     20 30 10 40 50(고정)
		 *     -----------
		 *     -- --
		 *     20 30
		 *        -- --
		 *        10 30
		 *           -- --
		 *           30 40
		 *     --------------
		 *     20 10 30 (40 50)
		 *     --------
		 *     -- --
		 *     10 20
		 *        -- --
		 *        20 30
		 *     --------------
		 *     10 20 (30 40 50)
		 *     -----
		 *     -- --
		 *     10 20 30 40 50
		 *     ----------------
		 */
		System.out.println("정렬 전:");
		System.out.println(Arrays.toString(arr2));
		for(int i=0;i<arr2.length-1;i++)
		{
			for(int j=0;j<arr2.length-1-i;j++)
			{
				if(arr2[j]>arr2[j+1])
				{
					int tmp=arr2[j];
					arr2[j]=arr2[j+1];
					arr2[j+1]=tmp;
				}
			}
		}
		System.out.println("정렬 후:");
		System.out.println(Arrays.toString(arr2));
	}

}







