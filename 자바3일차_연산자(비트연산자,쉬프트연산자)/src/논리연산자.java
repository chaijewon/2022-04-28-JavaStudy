/*
 *   &&(AND) , ||(OR)  ==> true/false 
 *   && => 기간이나 범위 포함 
 *   || => 기간이나 범위를 벗어난 경우 
 *   --------------------------
 *      형식 : (조건) && (조건)
 *            -----   ------
 *              |       |
 *              ---------
 *                 |
 *                결과값 
 *            (조건) || (조건)
 *            -----   ------
 *              |       |
 *              ---------
 *                 |
 *                결과값 
 *       ----------------------
 *    경우의 수 : 로그인처리 , 아이디중복 , 우편번호 검색 , 아이디 찾기, 비밀번호 찾기
 *                       비밀번호 검색 , 영화 검색 .....
 *    ---------------------------------------
 *                       &&(직렬)      ||(병렬)
 *    ---------------------------------------
 *     true true         true           true
 *    ---------------------------------------
 *     true false        false          true
 *    ---------------------------------------
 *     false true        false          true
 *    ---------------------------------------
 *     false false       false         false 
 *    ---------------------------------------
 *    => 효율적인 연산처리 (최적화)
 *       ------------
 *       (조건) && (조건)
 *               ------- 실행이 안되게 만든다 
 *       false 
 *       
 *       (조건) || (조건)
 *               ------- 실행이 안되게 만든다 
 *       true
 *       
 *       int a=10;
 *       int b=9;
 *       
 *       (a<b) && (a==++b) ==> false
 *                 b=9
 *       (a<b) || (a==++b) ==> true
 *                 b=10
 *       
 */
public class 논리연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=10;
        int b=9;
        boolean result=(a<b) && (a==++b);
        //             false => 연산종료 
        System.out.println("결과값:"+result);//false
        System.out.println("a="+a);//10
        System.out.println("b="+b);//9
        
        a=10;
        b=9;
        result=(a<b) || (a==++b);
        //     false   -------- true여부 확인 
        System.out.println("결과값:"+result);//true
        System.out.println("a="+a);//10
        System.out.println("b="+b);//10
        
        char c='a';
        // 대문자 여부 확인  => A~Z
        result=(c>='A') && (c<='Z'); //c가 A-Z사이에 있다 
        System.out.println(result);
        
        // 소문자 여부 확인
        result=(c>='a') && (c<='z');
        System.out.println(result);
        
        int k=(int)(Math.random()*20)+1;//1~20
        System.out.println("k="+k);
        // k가 1~10 사이에 있다 => &&
        result=(k>=1) && (k<=10);
        System.out.println(result+" &&수행");
        // k가 1~10 사이에 없다 => ||
        result=(k<1) || (k>10);
        System.out.println(result+" ||수행");
        
	}

}






