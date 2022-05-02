/*
 *   음수 표현 
 *   -------
 *   1의 보수
 *   2의 보수 (음수)
 *   연산자 => ~(반번 연산자) => 음수는 +1
 *   10 ~ -11
 *   
 *   ====> 
 *   10 => 2진법 ==> 1010
 *   1010  0000 0000 0000 0000 0000 0000 0000 1010
 *  -====  11111111111111111111111111110110
 *   0101 (0->1 , 1->0)
 *  +   1
 *  -----
 *   0110
 *   
 *   ==> 1010
 *     => 첫번째 나오는 1까지는 그대로 나머지는 0->1 , 1->0
 *       1010
 *         --
 *       0110
 */
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(~10);
        System.out.println(~100);
        System.out.println(0b11111111111111111111111111110110);
	}

}
