import java.util.Arrays;

public class 자바배열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*int[] arr={
        	(int)(Math.random()*100)+1, //0
        	(int)(Math.random()*100)+1, //1
        	(int)(Math.random()*100)+1, //2
        	(int)(Math.random()*100)+1, //3
        	(int)(Math.random()*100)+1  //4
        };*/
		int[] arr=new int[10]; //int => 5개를 묶어서 사용 
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
        
        int max=0;
        int min=100;
        System.out.println(Arrays.toString(arr));
        // 배열에 저장된 값을 출력할때 사용
        // 배열의 저장된 갯수 => length 
        // 인덱스번호는 0번부터 시작 => 갯수보다 인덱스번호가 작다 
        // 인덱스번호를 벗어나면 오류 발생 
        /*for(int i=0;i<arr.length;i++)=> 인덱스번호 
        {
        	if(max<arr[i])
        		max=arr[i];
        	if(min>arr[i])
        		min=arr[i];
        
        }*/
        // 배열,컬레션에서만 사용이 가능 166page
        // arr에 저장된 값 => int i
        /*
         *     int[] arr ==> int => double , long
         *     
         *     long a=10;
         *     int 
         *     double
         *     
         *     int a=10L
         *     int a=10.5
         *     
         *     for(배열에 저장된 값을 받을 변수:배열)
         *     {
         *         출력 ==> 출력을 목적으로 한다 
         *     }
         *     
         */
        for(int i:arr) // 향상된 for (for-each) => 출력용으로만 사용 
        {
        	// 웹에서 주로 사용 ==> i는 실제 배열에 저장된 값 
        	System.out.println("i="+i);
        	if(max<i)
        		max=i;
        	if(min>i)
        		min=i;
        }
        
        System.out.println("최대값:"+max);
        System.out.println("최소값:"+min);
	}

}
