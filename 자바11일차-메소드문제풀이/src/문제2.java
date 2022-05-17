// 정수를 입력 받아서 이진법을 출력하는 메소드 작성(3개의 메소드)
/*
 *정수 입력 
  이진법 처리
  출력 
*/
import java.util.Scanner;
public class 문제2 {
	
    static int inputData()
    {
    	Scanner scan=new Scanner(System.in);
    	System.out.print("1~32767 사이 정수입력:");
    	return scan.nextInt();
    }
    static int[] binrayData(int input)
    {
    	int[] bb=new int[16];
    	int index=15;
    	while(true)
    	{
    		bb[index]=input%2;
    		input=input/2;
    		if(input==0)
    			break;
    		index--;
    	}
    	return bb;
    }
    static void print(int[] b)
    {
    	for(int i=0;i<b.length;i++)
    	{
    		if(i%4==0 && i!=0)
    		   System.out.print(" ");
    		System.out.print(b[i]);
    	}
    }
    static void process()
    {
    	int input=inputData();
    	int[] b=binrayData(input);
    	print(b);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        process();
	}

}
