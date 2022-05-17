import java.util.Arrays;

/*
 *   1. 사용자로부터 어떤값을 받을 지 확인 (매개변수) => 몇개인지 
 *      예) 검색 (String) , 로그인 (String,String)
 *         회원가입(.......)
 *         => 매개변수 (메소드 인자)
 *   2. 요청한 내용을 처리한 후에 결과값을 1개만 전송 
 *      -------------      -----
 *        구현{}             return 
 *   -----------------------------------------------
 *   프로그램에 따라 매개변수/리턴형이 틀릴 수 있다 
 *   -> 웹  (사용자 유도...: 매개변수) 출력 내용 : 리턴형 
 */
// 리턴형값 여러개일 경우 , 매개변수 여러개 
// => 배열 
// 정렬 => 사용자 5개 정수 => 결과값 (정렬)
public class 메소드제작_2 {
    // 정렬하는 메소드 
	// Call By Value,Call By Reference =>매개변수 전송법 
	// static void sort(int[] arr)
	static int[] sort(int[] arr,int type)
	{
		// select sort(선택 정렬)
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
			  if(type==0)
			  {
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			  }
			  else
			  {
				  if(arr[i]<arr[j])
					{
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
			  }
			}
		}
		return arr;
	}
	static void process()
	{
		// 사용자가 5개 정수를 보내주면 => 메소드에서 정렬데이터를 전송 
		// 출력 
		int[] arr=new int[5];
		// 초기화 
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;//1~100
		}
		System.out.println("정렬 전:");
		System.out.println(Arrays.toString(arr));
		System.out.println("정렬 후:");
		int[] res=sort(arr,0);//0 올림차순
		System.out.println(Arrays.toString(res));
		res=sort(arr,1);//1 내림차순 
		System.out.println(Arrays.toString(res));
		// ASC => DESC
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        process();
	}

}










