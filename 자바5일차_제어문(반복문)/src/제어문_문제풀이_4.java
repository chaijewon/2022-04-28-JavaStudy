/*
 *  4)	 5,10,15,20,25,30,35,40,45,50을 출력하는 프로그램을 만들어라 (for 사용)
 *       1. 초기값 int i=5
 *       2. 범위   i<=50
 *       3. 증가식 i+=5; => 한개식만 증가하는 것이 아니고 여러개 증가가 가능 
 *          => i++(1)
 *             i+=2(2)
 *             i+=3(3)
 *             i+=4(4)
 *             i+=5....
 *       for(int i=5;i<=50;i+=5)
 *          
 *          
 *       5,10,16,22,25,33,38,47,48,50 : 수열 
 *       ----
 *       for으로 제어 할 수 없다 
 *       
 *       1 2 3 4 5 6 7 8 9 i++
 *       2 4 6 8 10 12     i+=2
 *       3 6 9 12 ...       i+=3
 */
public class 제어문_문제풀이_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int i=5;i<=50;i++)
        {
        	if(i%5==0)
        		System.out.print(i+" ");
        }
        System.out.println();
        for(int i=5;i<=50;i+=5)
        	System.out.print(i+" ");
	}

}
