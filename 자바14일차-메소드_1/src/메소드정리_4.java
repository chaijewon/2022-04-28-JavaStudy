// 데이터가 여러개일때 : 배열/클래스
import java.util.Scanner;
public class 메소드정리_4 {
    static int[] input()
    {
    	int[] arr=new int[5];
    	for(int i=0;i<arr.length;i++)
    	{
    		arr[i]=(int)(Math.random()*10)+1;
    	}
    	return arr;
    }
    static void output(int[] arr)
    {
    	for(int i:arr)
    	{
    		System.out.print(i+" ");
    	}
    }
    static void process()
    {
    	int[] arr=input();
    	output(arr);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        process();
	}

}
