/*
 *    if ~ else  :  true=>처리 / false=>처리
 *    형식) => 140page
 *         프로그램에서 가장 많이 사용하는 문장 
 *         if(조건문)
 *         {
 *            조건이 true일때 처리하는 문장 
 *         }
 *         else
 *         {
 *            조건이 false일때 처리하는 문장 
 *         }
 *         
 *         => 예)
 *                int a=10;
 *                if(a%2==0)
 *                {
 *                }
 *                if(a%2!=0)
 *                {
 *                }
 *                
 *                ================>
 *                
 *                if(a%2==0)
 *                {
 *                }
 *                else
 *                {
 *                }
 */
public class 선택조건문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        char c='A';
        if(c>='A' && c<='Z')
        	System.out.println("대문자"); // 조건 => true
        //if(c>='a' && c<='z')
        	//System.out.println("소문자");
        else
        	System.out.println("소문자"); // 조건 => false
	}

}









