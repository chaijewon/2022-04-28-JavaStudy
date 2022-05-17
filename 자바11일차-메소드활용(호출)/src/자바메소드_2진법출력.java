// 정수를 입력받아서 => 2진법 변경 
import java.util.Scanner;
/*
 *   1. 프로그램에 필요한 변수 설정 
 *   2. 구현 
 *   
 *   입력된 정수 저장 변수
 *   2진법 => 0,1 ==> 16 배열
 *   배열의 인덱스조절 
 */
public class 자바메소드_2진법출력 {
    // 입력받는 메소드
	static int inputData()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("0~21억 4천사이의 정수 입력:");
		int input=scan.nextInt();
		return input;
	}
	static int[] change2(int input)
	{
		int[] binary=new int[32];
		int index=31;
		while(true)
		{
			binary[index]=input%2;
			input/=2;
			if(input==0)
				break;
			index--;
		}
		
		return binary;
	}
	static void print(int[] binary)
	{
		for(int i=0;i<binary.length;i++)
		{
			if(i%4==0 && i!=0)
				System.out.print(" ");
			System.out.print(binary[i]);
		}
	}
	// 1. 리턴형 , 2. 매개변수 => 최대한으로 분리 (세부적)
	// 2진법 변경 
	// 출력 
	static void process()
	{
		int input=inputData();
		int[] binary=change2(input);
		print(binary);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
        // 변수 
		//System.out.println(Long.MAX_VALUE);
		/*int[] binary=new int[32];
		int index=31;
		Scanner scan=new Scanner(System.in);
		System.out.print("0~21억 4천사이의 정수 입력:");
		int input=scan.nextInt();
		while(true)
		{
			binary[index]=input%2;
			input/=2;
			if(input==0)
				break;
			index--;
		}
		
		// 출력 
		for(int i=0;i<binary.length;i++)
		{
			if(i%4==0 && i!=0)
				System.out.print(" ");
			System.out.print(binary[i]);
		}*/
	}

}







