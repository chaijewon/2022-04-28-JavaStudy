// ! => boolean에서 사용이 가능 => 턴 
// ! => 예약 가능한날 , 예약이 없는 날 (예약프로그램 , 장바구니) 
/*
 *    사용방법 
 *    boolean bCheck=false; //false
 *    bCheck=!bCheck; // true
 *    부정연산자 
 */
public class 단항연산자_부정연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        boolean bCheck=false;
        System.out.println("bCheck="+bCheck);
        bCheck=!bCheck;// NOT 
        System.out.println("bCheck="+bCheck);
        // true => false  => !true
        // false => true  => !false
	}

}
