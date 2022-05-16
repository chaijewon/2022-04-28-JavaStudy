/*
 *   1. 정수 i가 90이상 ~ 100이하일때 
 *      => 포함 
 *      i>=90 && i<=100 (등록)
 *            --
 *   2. 정수 i가 90보다 작고 , 100보다 크다 
 *      i<90 || i>100 (잘못된 입력)
 *           -- 
 *   3. 2배수이고 3의배수가 아니다 
 *      i%2==0 && i%3!=0
 *      
 *   4. y이거나 Y이면 
 *      c=='y' || c=='Y'
 *   5. A-Z
 *      c>='A' && c<='Z'
 *   6. a-z
 *      c>='a' && c<='z'
 *   8  가-힣
 *      c>='가' && c<='힣'
 *      =======> if(포함)
 *      
 *   => 136page => 형식 
 *      137page => 조건식
 *      138page => {}
 *      140page => if~else
 *      141page => 다중 조건문 형식 
 *      144page => 중첩 조건문 
 *                 if()
 *                 {
 *                    if()
 *                    {
 *                    }
 *                 }
 *                 ===> &&
 *                 
 *      id , password
 *      
 *      if(id.equals("admin"))
 *      {
 *         if(password.equals("1234"))
 *         {
 *             LOGIN완료 
 *         }
 *      }
 *      
 *      if(id.equals("admin") && password.equals("1234"))
 *      {
 *          LOGIN완료 
 *      }
 *      
 *      반복문 
 *      -----
 *        = for : 반복 횟수가 지정 (배열) => 웹에서 출력 (목록 출력)
 *           = 일반 for
 *             형식)             | false면 종료
 *                        ①  →  ②   ←  ④
 *                   for(초기값;조건식;증가식)
 *                   {              ↗
 *                              ↓  
 *                       반복 수행문장 ③
 *                   }
 *                   예) int i=1  i<=100 i+=2  i+=3 i+=5
 *                      int i=1  i<=10 i++
 *                      증가식은 항상 1개씩 증가하는 것이 아니다 
 *           = for-each 
 *                   실제 저장된 데이터를 읽어 온다 (배열,컬렉션)
 *                   -----------------------
 *                   11장 , 12장
 *                   컬렉션 (배열의 단점을 보완해서 => 클래스형)
 *                         -------- 고정 => 가변 (데이터베이스) 
 *                         -------- 메모리에 저장된 데이터를 쉽게 다룬다
 *                                  (자료구조: 스택,큐)
 *             프로그램 : 네트워크(윈도우,모바일),데이터베이스(웹)
 *                                         |
 *                    for(데이터형 변수:배열,컬렉션)
 *                        ----------
 *                       출력 (배열에 있는 실제 데이터 읽기)                   -------------
 *                           
 *        = while : 반복 횟수가 모르는 경우 (무한루프)
 *                  데이터베이스 , 네트워크 ...
 *                  
 *                  [초기값] => 생략   ========= 1
 *                  while(조건식)  ==> while(true) == 2
 *                  {
 *                     반복수행문장  ==== 3
 *                     [증가식] => 생략 ==4
 *                  }
 *       => 156page -> 157page
 *       => 167page 
 *       => 175page break;
 *       
 *       ==증가식이 있는 것은 아니다 (감소식)
 */

public class 조건문_조건방식 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String data="Hello Java";
        for(int i=0;i<data.length();i++) //i+=5
        {
        	System.out.print(data.charAt(i));
        }
        System.out.println();
        for(int i=data.length()-1;i>=0;i--)// i-=5
        {
        	System.out.print(data.charAt(i));
        }
	}

}







