/*
 *   반복문 : 같은 일을 반복할때 
 *          => 목록출력 (영화목록, 게시물 목록, 음악 출력)
 *          => 종류 
 *             for : 반복횟수 지정 (권장)
 *                   => 157page 
 *                             ↗ false면 종류  
 *             형식)        1 → 2   ←  4
 *                   for(초기값;조건식;증감식)
 *                             ↓true ↗
 *                       반복 수행문장 3
 *                       
 *                       
 *                   예)        1  ==>  2 <== 4
 *                       for(int i=1;i<=10;i++) => i=2
 *                       {                 ↗
 *                                     | true
 *                            System.out.println("i="+i); ==> 3
 *                       }
 *                       
 *                       1-2-3-4
 *                         2-3-4
 *                         2-3-4
 *                         2-3-4
 *                         2번 false면 종료 
 *                       
 *                       i=1 , ~~ i=10
 *                       
 *                       for(int i:배열,컬렉션) => 출력용 (웹) => jdk1.5이상
 *                           ----- 증가번호가 아니고 실제 저장된 값 
 *                           System.out.println("i="+i);
 *                       
 *                   => 향상된 for (for-each) => 데이터 출력 
 *             while : 반복횟수가 없는 경우 (데이터 읽기)
 *                     데이터베이스 
 *                     --------- 웹에서 핵심기능
 *                     단점 => 선조건 (조건을 먼저 검색) => 수행하지 않을 수도 있다 
 *                     
 *                     형식)
 *                          초기값 -------------- 1
 *                          while(조건식) ------- 2
 *                          {
 *                              반복실행문장  ----- 3
 *                              증가식      ----- 4 ==> 2
 *                          }
 *                          
 *                     예)
 *                          // 1~10까지 출력 
 *                          int i=1;
 *                          while(i<=10)
 *                          {
 *                             System.out.println("i="+i); i=1;2...
 *                             i++; i=2...... i=11
 *                          }
 *             do~while : while을 보완 
 *                        후조건 (조건을 나중에 검색) => 무조건 한번 이상 수행 
 *                      형식)
 *                           초기값   ---------- 1
 *                           do{
 *                               반복수행문장  --- 2
 *                               증가식     ---- 3
 *                           }while(조건식) ---- 4
 *                           
 *                           => 1-2-3-4
 *                                2-3-4
 *                                ...
 *                                4번 false면 종료 
 *                      예)
 *                          int i=1;
 *                          do
 *                          {
 *                            System.out.println("i="+i);
 *                            i++;
 *                          }while(i<=10);
 *                          
 *                          i=1 ... i=10
 *                          
 *                          
 *             => while문 , do~while => 1차
 *             => for문  => 2차 for
 *                         ------- 알고리즘 (정보실기) => 코테(자료구조) 
 *                         백지 
 *          => 반복제어문 
 *             break : 반복을 중단 
 *             continue : 특정부분을 제외할때 사용 
 */
public class 제어문_반복문종류 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 1. 알파벳 출력 (A~Z) => 시작점 => 초기값 ==> 'A' 조건 => 'Z'
		for(char c='A';c<='Z';c++)
		{
			System.out.print(c); // {}이 없는 경우에는 한문장만 수행 
		    //System.out.println("\nEnd");// for소속문장이 아니라 독립적인 문장
		}
		System.out.println();
		// 2. 0~9
		// '0' => 48
		for(char c='0';c<='9';c++)
		{
			System.out.print(c);
		}
		System.out.println();
		for(int i=0;i<=9;i++)
		{
			System.out.print(i);
		}
		System.out.println();
		for(int i=9;i>=0;i--)
		{
			System.out.print(i);
		}
		
	}

}








