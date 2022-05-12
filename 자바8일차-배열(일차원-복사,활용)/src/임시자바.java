import java.util.Arrays;

public class 임시자바 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr= {10,20,30,40,50};
        System.out.println("arr="+Arrays.toString(arr));
        int[] temp=new int[10];
        자바배열_정리.arrCopy(arr, 0, temp, 0, arr.length);
        System.out.println("temp="+Arrays.toString(temp));
	}

}
