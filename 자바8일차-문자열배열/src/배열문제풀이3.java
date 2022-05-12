import java.util.Arrays;

/*
 *  3) int[] num = { 94, 85, 95, 88, 90 };

       다음 배열에서 최대값,최소값을 출력하는 프로그램을 작성하시오
 */
public class 배열문제풀이3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 배열 선언
		int[] num={ 94, 85, 95, 88, 90 };
		int min=num[0];
		int max=num[0];
		for(int i:num)
		{
			if(min>i)
				min=i;
			if(max<i)
				max=i;
		}
		System.out.println(Arrays.toString(num));
		System.out.println("최대값:"+max);
		System.out.println("최소값:"+min);
	}

}
