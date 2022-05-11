import java.util.Arrays;
import java.util.Scanner;

/*
 *  문제 1) 5개 정수를 입력받은 후 차례로 출력하는 프로그램 
입력예) 5 10 9 3 2
출력예) 5 10 9 3 2  

=> 배열선언 int[] arr=new int[5];
=> 배열 초기값 
         ---------------------------------
              |     |     |     |  
         ---------------------------------
         arr[0] arr[1] arr[2] arr[3] arr[4]
         for(int i=0;i<arr.length;i++)
         {
            arr[i]=(int)(Math.random()*100)+1;
         }
=> 처리 (X)
=> 결과값  for(int i:arr)
         {
             System.out.println(i+" ");
         }

문제 2) 문자 10개를 저장할 수 있는 배열을 선언하고 10개의 문자를 입력받아 입력받은 문자를 이어서 출력하는 프로그램 
입력예) A B C D E F G H I J
출력예) ABCDEFGHIJ
      선언 
          char[] arr=new char[10];
          for(int i=0;i<arr.lenght;i++)
          {
             arr[i]=(char)((int)(Math.random()*26)+65);
          }


문제 3) 정수 10개를 입력받은 후 세번째, 다섯번쨰와 마지막으로 입력받은 정수를 차례로 출력하는 프로그램 
입력예) 5 3 9 6 8 4 2 8 10 1
출력예) 9 8 1
 

문제 4) 10개의 정수를 입력받아 그 중 가장 큰 수를 출력하는 프로그램
입력예) 5 10 8 55 6 31 12 24 61 2
출력예) 61


문제 5) 10명의 컴퓨터 정수를 입력받아 배열에 저장하고 총점과 평균을 구하여 출력하는 프로그램을 작성 

문제 6) 5개의 정수를 {95, 75, 85, 100, 50}로 초기화하고 오름차순으로 정렬하는 프로그램 
출력예) 50 75 85 95 100

 */
public class 배열문제풀이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*char[] arr=new char[10];
		Scanner scan=new Scanner(System.in);
		System.out.print("문자열 입력:");
		String ss=scan.next();
        for(int i=0;i<arr.length;i++)
        {
           //arr[i]=(char)((int)(Math.random()*26)+65);
           //              0~25 + 65   'A'
           arr[i]=ss.charAt(i);
        }
        System.out.println(Arrays.toString(arr));
        for(char c:arr)
        {
        	System.out.print(c+" ");
        }*/
		/*int[] arr=new int[10];
		// arr=> 10개의 데이터를 주입 (초기화)
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		// 난수 => 출력
		System.out.println(Arrays.toString(arr));
		// [34, 47, 19, 62, 29, 87, 95, 48, 87, 85]
		for(int i:arr)//인덱스번호(X) 실제 데이터값 => 출력용으로 사용 
		{
			System.out.print(i+" ");
		}
		System.out.println("\n세번째 값:"+arr[2]);
		System.out.println("다섯번째 값:"+arr[4]);
		System.out.println("마지막 값:"+arr[arr.length-1]);*/
        int[] arr=new int[10];
        // 초기값  부여
        for(int i=0;i<arr.length;i++)
        {
        	arr[i]=(int)(Math.random()*100)+1;
        }
        System.out.println(Arrays.toString(arr));
        // 처리 => 최대값
        int max=0;//최대값 저장 변수 
        // [9, 24, 75, 64, 82, 90, 94, 37, 70, 16]
        int sum=0;
        double avg=0.0;
        for(int i:arr)
        {
        	sum+=i;
        	System.out.println("max="+max+",i="+i);
        	if(max<i)
        	{
        		
        		max=i;  // max=0 , i=9 => max=9
        	// max=9 i=24  max=24
        	// max=24 i=75 max=75
        	// -------------
        	// max=90 i=94 max=94
        	// 
        	}
        }
        // 결과값 출력 
        System.out.println("최대값:"+max);
        System.out.println("총합:"+sum);
        System.out.printf("%.2f\n",sum/10.0);
        
	}

}
