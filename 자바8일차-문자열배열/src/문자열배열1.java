/*
 *   문자열 여러개를 저장한 후 관리 => 문자열배열 
 *        ----- 배열 
 *   형식)
 *        String[] 배열명={"홍길동","이순신","강감찬","...",".."}
 *        String[] 배열명=new String[5];
 *                      ----
 *                      기본 default => null (주소가 없는 경우)
 *                      모든 클래스의 default : null
 *                        => NullPointerException 
 *                     -----------------------
 *                      new => default
 *                      int  ==> 0
 *                      double ==> 0.0
 *                      char  ==> '\0'
 *                      String ==> null
 *                      boolean ==> false 
 *                     ----------------------- 206page
 *        => 웹/모바일 => 중심 (String)
 *    String[] names={"홍길동","이순신","강감찬"}
 *    207page
 *    names => 문자열은 자체가 주소다 (메모리) 
 *         ----------------------------
 *           100    |  200    |  300
 *         ----------------------------
 *            |         |         |
 *          "홍길동"    "이순신"    "강감찬"
 *          
 *    names 
 *         ----------------------------
 *           "홍길동"  |  "이순신" | "강감찬"
 *         ----------------------------
 *         names[0]     names[1]  names[2]
 */
public class 문자열배열1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[] names={"홍길동","이순신","강감찬","을지문덕","박문수"};
        // 파일읽기 / 데이터베이스
        // 출력 
        for(String name:names)
        {
        	System.out.println(name);
        }
        
	}

}
