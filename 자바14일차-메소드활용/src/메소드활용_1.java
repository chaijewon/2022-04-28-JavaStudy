import java.util.Arrays;

/*
 *   1. 입력 
 *   2. 처리 => 세분화 
 *   3. 출력 
 *   
 *   => 알파벳 5개 받아서 (임의의 받아서) 정렬 => ASC(올림차순),DESC(내림차순)
 */
public class 메소드활용_1 {
	// => Call By Reference 
	/*
	 *   메소드명이 동일 
	 *   ***매개변수의 갯수, 데이터형이 다르다 
	 *   리턴형을 관계없다 
	 *   ================== 다른 메소드로 인식 (오버로딩)
	 *   
	 *   배열 , 클래스 => 값을 받는 경우 
	 *     => 매개변수 , 리턴형을 통해서 받을 수 있다 
	 */
    static void getRand(char[] alpha)
    {
    	for(int i=0;i<alpha.length;i++)
    	{
    		alpha[i]=(char)((int)(Math.random()*26)+65);
    	}
    }
    static char[] getRand()
    {
    	char[] alpha=new char[5];
    	for(int i=0;i<alpha.length;i++)
    	{
    		alpha[i]=(char)((int)(Math.random()*26)+65);
    	}
    	return  alpha;
    }
    //처리(정렬)
    // 매개변수 , 리턴형 
    /*
     *  264page ~ 267page 
     *   기본형 매개변수 (int .... , String) : readonly 
     *     => 데이터값만 사용이 가능 
     *   참조형 매개변수 (클래스 , 배열) : read / write
     *     => 데이터값을 사용 , 자체변경이 가능 
     */
    // 리턴형 
    /*
     *     B A C E D
     *     - -
     *     A B
     *     -   -
     *     A   C
     *     -     -
     *     A     E
     *     -       -
     *     A       D  ==> for(1)
     *     ----------
     *     A B C E D
     *       - -
     *       B C
     *       -   -
     *       B   E
     *       -     -
     *       B     D
     *    -----------
     *     A B C E D
     *         - -
     *         C E
     *         -   -
     *         C   D
     *    -----------
     *     A B C E D
     *           - -
     *           D E
     *    -----------
     *     A B C D E
     *     
     *     int a=10;
     *     int b=20;
     *     
     *     a=b;
     *       - 20  ==> a=20
     *     b=a;
     *       -     ==> b=20
     *     -----------------
     *     temp=a; temp=10
     *     a=b; => a=20
     *     b=temp => b=10
     *     
     *      [K, F, W, O, A]
     *       -  -
     *       F  K
     *       -     -
     *       F     W
     *       -        -
     *       F        O
     *       -           -
     *       A           F
     *       A  K  W  O  F
			[A, K, W, O, F]
			    -  -
			    K  W
			    -     -
			    K     O
			    -       -
			    F       K
			 A  F   W  O K
			[A, F, W, O, K]
			       -  -
			       O  W
			       -     -
			       K     O
			 A  F  K  W  O
			[A, F, K, W, O]
			          -  -
			          O  W
			 A  F  K  O  W
			[A, F, K, O, W]
     *         
     */
    static char[] sort(char[] alpha)
    {
    	for(int i=0;i<alpha.length-1;i++)
    	{
    		for(int j=i+1;j<alpha.length;j++)
    		{
    			if(alpha[i]>alpha[j])
    			{
    			  char temp=alpha[i];
    			  alpha[i]=alpha[j];
    			  alpha[j]=temp;
    			}
    		}
    		System.out.println(Arrays.toString(alpha));
    	}
    	
    	return alpha;
    }
    static void sort2(char[] alpha)
    {
    	for(int i=0;i<alpha.length-1;i++)
    	{
    		for(int j=i+1;j<alpha.length;j++)
    		{
    			if(alpha[i]>alpha[j])
    			{
    			  char temp=alpha[i];
    			  alpha[i]=alpha[j];
    			  alpha[j]=temp;
    			}
    		}
    		System.out.println(Arrays.toString(alpha));
    	}
    	
    }
    //출력
    static void process()
    {
    	char[] alpha=getRand();
    	//char[] alpha=new char[5];
    	//getRand(alpha);// 배열 , 클래스 => 매개변수에 변수 => 값을 채워온다 
    	System.out.println(Arrays.toString(alpha));
    	//char[] result=sort(alpha);
    	sort2(alpha);
    	System.out.println(Arrays.toString(alpha));
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        process();
	}

}
