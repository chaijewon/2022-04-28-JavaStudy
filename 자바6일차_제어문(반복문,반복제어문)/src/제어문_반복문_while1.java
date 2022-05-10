/*
 *    for=>if
 *    while=>if
 *    ----------
 *    
 *    while : 167page 
 *        => 무한루프 (지정된 횟수가 없는 경우 주로 사용) => 데이터베이스 / 서버
 *                                             => 게임 
 *        => 데이터베이스(오라클) => while
 *    1. 형식)
 *            초기값 ----------- 1
 *            while(조건식) ---- 2
 *            {
 *               반복 수행문장 --- 3
 *               증감식 -------- 4 ==> 증가된 값을 조건식 검사 
 *            } 
 *            1 - 2 - 3 - 4
 *                2 - 3 - 4
 *                --
 *                --
 *                2번 false => 종료 
 *            10번 반복 ... (for)=> while , do~while
 *            
 *       주의점 
 *         while() => 조건식은 반드시 입력 => 오류 
 *         for(;;)
 *         
 *         for(;;) => while(true) => 파일 읽기
 *     
 */
public class 제어문_반복문_while1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 1~10까지 출력 
		// 1. 초기값 
		int i=11;
		while(i<=10)
		{
			System.out.println("i="+i);
			i++;// 증가후 조건식 
		}
		
		System.out.println("====== for =======");
		for(i=11;i<=10;i++)
		{
			System.out.println("i="+i); // 증가식으로 이동 
		}
		
		System.out.println("===== do~while =====");
		i=11;
		do
		{
			System.out.println("i="+i);// 조건없이 무조건 수행 
			i++;// 증가후 => 조건 
		}while(i<=10);
	}

}








