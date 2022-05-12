import java.util.Arrays;

/*
 *    자바배열 
 *      => 같은 데이터형 여러개 모아서 관리 
 *         ----------
 *          연속적인 메모리 구조 (메모리 크기가 일정해야 사용이 가능)
 *          => 한번 배열의 크기를 지정하면 변경 할 수 없다 (고정적인다)
 *             ***=> 동적구조 => 메소드 
 *          => 프로그램안에서 변경은 가능
 *      => 1. 선언 
 *         2. 초기값 
 *         3. 데이터 변경 
 *         4. 가공(연산처리)
 *         5. 처리후 결과값 
 *         --------------
 *      => 선언
 *      데이터형[] 배열명;(권장 사항)
 *      데이터형 배열명[];
 *      
 *      1) 정수 
 *         int[] arr;
 *         실수 
 *         double[] arr;
 *         논리
 *         boolean[] arr;
 *         byte
 *         byte[] arr; => 네트워크 전송 / 파일읽기
 *         --------------------------------- 
 *         String[] arr;
 *      2) 크기 설정 (몇개를 모아서 관리 할지)
 *         = int[] arr=new int[5]; => int를 5개 저장해서 사용 
 *                    ----- 자동 초기화 (0)
 *           int a=0;
 *           a=20;
 *         = int[] arr={1,2,3,4,5};
 *                     ----------- 갯수 => int를 5개를 저장해서 사용
 *           int a=20;
 *      3) 값을 가지고 오는 방법 
 *         int[] arr={10,20,30,40,50};
 *            arr[0]  arr[1] arr[2] arr[3] arr[4]
 *            => 항상 순차적으로 유지 => 반복문을 주로 사용 (for)
 *            ----------------------------------
 *               10  |  20  |  30  | 40  |  50
 *         arr----------------------------------
 *            arr.length-1 => 시작 인덱스번호 0번부터 시작 
 *                            => arr.length-1
 *                            i<arr.length
 *                            i<=arr.length-1
 *                            ------------ ArrayIndexOutOfBoundsException
 *                               => 배열범위 초과 => 프로그래머 실수 (디버깅)
 *                               => 소프트웨어 품질검사 
 *      4) 임의로 값을 채운다 (초기화)
 *         = 주로 for (일반 for)
 *           for(int i=0;i<arr.length;i++)
 *           {
 *              arr[i]=(난수,사용자 입력값)
 *           }      
 *      5) 출력 
 *         = ***for(int i:arr) => 출력 전용 (웹 => JSP => 주로 for-each)
 *           {
 *               i=> 인덱스가 아니고 arr안에 있는 실제 데이터 읽기
 *               for-each (향상된 for)
 *           }  
 *      6) 데이터 저장 갯수를 설정 
 *         -----------------
 *         int[] arr=new int[5]; => 저장 갯수가 늘어날 경우 
 *         int[] tel=new int[7]; => 1자리 늘었다 [8]
 *         => 새로운 배열을 만든다 => 기존의 배열보다 크게 설정
 *         => 값을 복사 
 *         => 직접 복사 
 *         => 라이브러리 System.arraycopy() ==> 방지(가변형)
 *                                           12장.ArrayList=>제네릭스
 *           
 *                   
 *         
 */
public class 자바배열_정리 {
    public static void arrCopy(int[] arr,int arrIndex,int[] temp,
    		int tempIndex,int size)
    {
    	// 연산자 + 제어문 = 메소드(재사용) => 오버라이딩
    	for(int i=arrIndex;i<size;i++)
    	{
    		temp[i]=arr[i];
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 192page 배열 복사 
		// 선언 => 자체는 변경 할 수 없다 
		int[] arr=new int[5]; // 크기를 변경 할 수 없다 
		// arr[0]  ~  arr[4] = 0
		// 초기화 
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1; //1~100
		}
		// 출력 
		System.out.println("arr="+Arrays.toString(arr));
		// 5개를 더 사용해야 된다 
		int[] temp=new int[10];
		// 복사 
		for(int i=0;i<arr.length;i++)
		{
			temp[i]=arr[i];
		}
		System.out.println("temp="+Arrays.toString(temp));
		
		int[] temp2=new int[10];
		// 195page 
		System.arraycopy(arr, 0, temp2, 0, arr.length);
		// 라이브러리 => arraycopy(메소드)
		//                   arr[1]    temp2[0]
		System.out.println("temp2="+Arrays.toString(temp2));
		
		int[] temp3=new int[10];
		arrCopy(arr, 0, temp3, 0, arr.length);
		System.out.println("temp3="+Arrays.toString(temp3));
		
	}

}




