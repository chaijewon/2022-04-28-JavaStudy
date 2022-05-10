/*
 *     *
 *    **
 *   ***
 *  ****
 *  -------------
 *      줄수(i)  공백(j)  별표(k)
 *       1        3       1
 *       2        2       2
 *       3        1       3
 *       4        0       4
 *       -------------
 *       i+j=4
 *       j=4-i
 *       ----          ------ i=k => k=i
 *  ****
 *   ***
 *    **
 *     *
 *     ------------------
 *     줄수(i)  공백(j) 별표(k)
 *      1        0     4
 *      2        1     3
 *      3        2     2
 *      4        3     1
 *      -----------
 *      j=i-1        i+k=5  => k=5-i
 *     *
 *    ***
 *   *****
 *  *******
 *    줄수(i)  공백(j)  별표(k)
 *     1        3      1
 *     2        2      3
 *     3        1      5
 *     4        0      7      => 2*i-1 (홀수 계산)
 *     -----------
 *     i+j=4 => j=4-i
 *     
 *     정렬 / 등수 / 확률 / 통계 => 2차 for 
 *     ----------- 배열 
 */
public class 제어문_반복문_for7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int i=1;i<=4;i++)
        {
        	// 공백 
        	for(int j=1;j<=4-i;j++)
        	{
        		System.out.print(" ");
        	}
        	// 별표 
        	for(int k=1;k<=2*i-1;k++)
        	{
        		System.out.print("*");
        	}
        	System.out.println();
        }
	}

}
