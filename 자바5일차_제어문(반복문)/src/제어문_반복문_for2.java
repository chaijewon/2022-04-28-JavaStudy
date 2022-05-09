// 1~100까지의 합을 구한다 
// 1~100까지의 짝수의 합 , 홀수의 합 
// 1~100까지의 3의 배수합,5의배수합 , 7의배수의 합 
/*
 *   초기값 (i=1) ; (i<=100) ; i++
 *   
 *   => 누적변수 => int sum=0; 합, 곱 =1
 *      sum=0
 *      sum=sum+i   => sum=1 sum=3 sum=6 sum=10
 *                     sum=0,i=1
 *                     =========
 *                     sum=1,i=2
 *                     =========
 *                     sum=3,i=3
 *                     =========
 *                     sum=6,i=4
 *                     =========
 *                     sum=10,i=5
 *                     ==========
 *                     sum=15.....
 *                                 
 *      -----
 *      루프변수 => 1에서 100까지 변경하는 변수 
 */
public class 제어문_반복문_for2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int sum=0;
        for(int i=1;i<=100;i++)
        {
        	//sum=sum+i;
        	sum+=i;// 권장
        	System.out.println("sum="+sum+",i="+i);
        }
        System.out.println("1~100까지 합:"+sum);
        System.out.println();
        sum=0;
        int even=0;// 짝수합 누적
        int odd=0;//홀수합 누적 
        for(int i=1;i<=100;i++)
        {
        	if(i%2==0)
        		even+=i;
        	else
        		odd+=i;
        }
        System.out.println("1~100까지 짝수의 합:"+even);
        System.out.println("1~100까지 홀수의 합:"+odd);
        
        System.out.println();
        int a3=0,a5=0,a7=0;
        // 15 => 중복수행여부 (중복이 있다면 :단일, 중복이 없는경우 : 다중)
        for(int i=1;i<=100;i++)
        {
        	if(i%3==0)
        		a3+=i;
        	if(i%5==0)
        		a5+=i;
        	if(i%7==0)
        		a7+=i;
        }
        
        System.out.println("1~100까지의 3의배수합:"+a3);
        System.out.println("1~100까지의 5의배수합:"+a5);
        System.out.println("1~100까지의 7의배수합:"+a7);
        
	}

}
