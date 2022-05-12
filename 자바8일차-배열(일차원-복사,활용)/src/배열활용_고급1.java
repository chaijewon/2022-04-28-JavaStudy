// 정수를 입력을 받아서 => 2진법으로 출력 = 16bit(0,1)
import java.util.Scanner; // 0~32767 (양수)
public class 배열활용_고급1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 입력값 받기
		Scanner scan=new Scanner(System.in);
		// 0,1 => 저장공간 => 16
		int[] binary=new int[16];
		// 받은 정수값 저장 
		System.out.print("0~32767사이의 정수 입력:");
		int input=scan.nextInt();
		System.out.println(Integer.toBinaryString(input));
		int index=15;//뒤에서부터 값입력 15 14....  index--
		// 11
		while(true)
		{
			//나머지값 저장 
			binary[index]=input%2;//11/2==1 5%2=1
			input/=2;// input=input/2 => 11/2 => 5 2
			//1/2=0
			if(input==0)
				break;
			index--;
		}
		
		for(int i=0;i<binary.length;i++)
		{
			if(i%4==0 && i!=0)
				System.out.print(" ");
			System.out.print(binary[i]);
		}
		
	}

}
