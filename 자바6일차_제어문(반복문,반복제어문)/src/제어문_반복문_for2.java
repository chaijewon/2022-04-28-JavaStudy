/*
 *   1. 
 *      ★☆☆☆☆
 *      ☆★☆☆☆
 *      ☆☆★☆☆
 *      ☆☆☆★☆
 *      ☆☆☆☆★
 *      i   j   => i=j
 *      1   1
 *      2   2
 *      3   3
 *      4   4
 *      5   5
 *      ☆☆☆☆★
 *      ☆☆☆★☆
 *      ☆☆★☆☆
 *      ☆★☆☆☆
 *      ★☆☆☆☆
 *      
 *      i  j
 *      1  5 => i+j => 6  => j=6-i => 수열 (방정식)
 *      2  4
 *      3  3
 *      4  2
 *      5  1
 *      
 *      ★
 *      i=1~5 줄수
 *      j=1~5 별표 
 */
public class 제어문_반복문_for2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int i=1;i<=5;i++)
        {
        	// 별표 
        	for(int j=1;j<=5;j++)
        	{
        		if(6-i==j)
        		 System.out.print("★");
        		else
        		 System.out.print("☆");
        	}
        	System.out.println();
        }
	}

}
