import java.util.Arrays;

/*
 *   5개의 정수를 {95, 75, 85, 100, 50}로 초기화하고 
 *   오름차순으로 정렬하는 프로그램 
 *   ------ ASC / DESC
 *    50 75 85 95 100
 *    
 *    95  75  85  100  50
 *    --  --
 *    75  95
 *    --      --
 *    75      85
 *    --          ---
 *    75          100
 *    --              --
 *    50              75
 *    --------------------- 1round 
 *    50  95  85  100  75
 *        --  --
 *        85  95
 *        --      ---
 *        85      100
 *        --          --
 *        75          85
 *    -------------------- 2round
 *    50  75  95  100  85
 *            --  ---
 *            95  100
 *            --       --
 *            85       95
 *    --------------------- 3round
 *    50  75  85  100  95
 *                ---  --
 *                95   100 
 *    --------------------- 4round
 *    50  75 85   95   100
 *                     ----
 */
public class 정렬_선택정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr={95, 75, 85, 100, 50};
        System.out.println("정렬 전:");
        System.out.println(Arrays.toString(arr));
        /*Arrays.sort(arr);
        //System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++)//asc
        {
        	System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=arr.length-1;i>=0;i--)//desc
        {
        	System.out.print(arr[i]+" ");
        }*/
        /*
         *   int a=10;
         *   int b=20;
         *   a=b; a=20
         *   b=a; b=20
         *   
         *   int temp=a; temp=10
         *   a=b; // a=20
         *   b=temp // b=10
         */
        for(int i=0;i<arr.length-1;i++)
        {
        	for(int j=i+1;j<arr.length;j++)
        	{
        		if(arr[i]>arr[j])
        		{
        			int temp=arr[i];
        			arr[i]=arr[j];
        			arr[j]=temp;
        		}
        	}
        }
        System.out.println(Arrays.toString(arr));
        
	}

}
