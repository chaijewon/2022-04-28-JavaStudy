/*
 *   5) 100~999 사이의 4의배수가 아닌 수의 갯수,합을 출력하는 프로그램 작성
for
6) 100~999사이에 7의 배수의 갯수와 합을 출력하는 프로그램 작성
for
7) 1~1000까지에서 7의 배수의 합 ,9의 배수의 합
 */
public class 배열문제풀이5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int count=0;
        int sum=0;
        for(int i=100;i<=999;i++)
        {
        	/*if(i%4!=0)
        	{
        		sum+=i;
        		count++;
        	}*/
        	if(i%4==0)
        		continue;//제외할때 =>4의배수를 제외한다 
        	
        	sum+=i;
        	count++;
        }
        System.out.println("합:"+sum);
        System.out.println("갯수:"+count);
        
        System.out.println("===================");
        count=0;
        sum=0;
        
        for(int i=100;i<=999;i++)
        {
        	/*if(i%7==0)
        	{
        		sum+=i;
        		count++;
        	}*/
        	if(i%7!=0)
        		continue;
        	sum+=i;
        	count++;
        }
        System.out.println("합:"+sum);
        System.out.println("갯수:"+count);
        
        System.out.println("===================");
        int sum7=0;
        int sum9=0;
        for(int i=1;i<=1000;i++)
        {
        	//중복
        	if(i%7==0)
        		sum7+=i;
        	if(i%9==0)
        		sum9+=i;
        }
        // 처리 완료 
        // 결과값 출력 
        System.out.println("1~1000까지 7의 배수 합:"+sum7);
        System.out.println("1~1000까지 9의 배수 합:"+sum9);
        
	}

}
