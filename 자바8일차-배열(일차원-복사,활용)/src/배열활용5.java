import java.util.Arrays;

// 임의의 수 => 10(0~9)
public class 배열활용5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr=new int[10];
        int[] count=new int[10];
        // 빈도수 구하기 => 추천 
        // 초기화 
        for(int i=0;i<arr.length;i++)
        {
        	arr[i]=(int)(Math.random()*10); //0~9
        }
        System.out.println("arr="+Arrays.toString(arr));
        // 빈도수 구하기 
        for(int i:arr)
        {
        	count[i]++;
        }
        
        System.out.println("count="+Arrays.toString(count));
	}

}
