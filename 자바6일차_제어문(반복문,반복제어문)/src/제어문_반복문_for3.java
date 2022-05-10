/*
 *    ABCDE
 *    FGHIJ
 *    KLMNO
 *    PQRST
 *    UVWXY
 *    
 *    ------
 *    
 *    ABCDE
 *    ABCDE
 *    ABCDE
 *    ABCDE
 *    ABCDE
 */
public class 제어문_반복문_for3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        for(int i=1;i<=5;i++)
        {
        	char c='A';//블록변수 => {} 을 벗어나면 사라진다 (지역변수) 
        	for(int j=1;j<=5;j++)
        	{
        		
        		System.out.print(c++);
        	}
        	System.out.println();
        }
	}

}
