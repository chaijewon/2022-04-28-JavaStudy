
public class 문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr={10,20,30,40,50};
        int[] arr3=arr;
        arr3[0]=100;
        // arr2=arr;
        int[] arr2=arr.clone(); // 배열 / 클래스 
        // 같은 값을 복사 arr2={10,20,30,40,50}
        arr2[0]=1000;
        System.out.println("arr[0]="+arr[0]);
        System.out.println("arr2[0]="+arr2[0]);
	}

}
