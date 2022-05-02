/*
 *    증감 연산자 : 증가(++) / 감소(--) => 1 증가 / 1 감소
 *    ---------
 *     1) 전치 연산자
 *        ++a , --a (먼저 증가,감소를 한후에 다른 연산 수행) 
 *     2) 후치 연산자
 *        a++ , a-- (다른 연산을 수행하고 나중에 증가,감소가 된다)
 *        
 *        예)
 *            int a=10;
 *            int b = ++a;
 *                 -- --
 *                     1(먼저 증가)
 *                  2(대입) 
 *                  a=11,b=11
 *            ================>  int b = ++a(11)
 *                                   b=11 
 *                                   
 *            int a=10;
 *            int b =  a++;
 *                 ---  ---
 *                  1    2
 *             => 증가전에 대입 b=10 
 *             => a값 증가 a=11
 *             
 */
public class 단항연산자_증감연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=10;
        int b=++a;
        System.out.println("a="+a+",b="+b);//a=11,b=11
        
        int c=10;
        int d=c++;
        // 1. c의 값을 d에 대입 ==> d=10
        // 2. c값을 1개 증가 c=11
        // 3. ++,-- => 무조건 a++ a++ a++ => a는 3증가 
        System.out.println("c="+c+",d="+d);
        
        int m=10;
        int n=m--;
        System.out.println("m="+m+",n="+n); // 먼저 대입 n=10,m=9
        
        int x=10;
        int y=--x;
        
        System.out.println("x="+x+",y="+y);// 먼저 감소 => 대입 
        // x,y=9
        
        int k=10;
        k++; //k=11  // k+1
        k++; //k=12  // k+1
        k++; //k=13  // k+1
        k++; //k=14  // k+1
        k++; //k=15  // k+1
        System.out.println("k="+k);
        
        int p=10;
        --p;//p-1
        --p;//p-1
        --p;//p-1
        --p;//p-1
        --p;//p-1
        
        System.out.println("p="+p);
        
        
	}

}
