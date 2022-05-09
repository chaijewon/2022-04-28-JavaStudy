/*
 *   switch 정리 
 *   1. 146page
 *      -------- switch를 이용하는 사용처
 *               => 경우의 수가 많은 경우 
 *               실행 순서 
 *               1) 사용자 입력값 받기 
 *                  => switch(사용자 입력값)
 *                            ----------- 정수(상수),문자,문자열 
 *                             boolean,double(사용이 안된다)
 *               2) 사용자 입력값에 해당되는 case를 찾는다 
 *               3) case 밑에 있는 문장을 수행 
 *               4) break가 있는 경우 => switch를 종료  
 *                  break가 없는 경우 => 밑에 있는 case문장을 수행 
 *                  -------------- break가 있는 case가 있는 경우까지 수행
 *                  case 1:
 *                    break; ==> 1번일 경우는 종료
 *                  case 2:
 *                  case 3:
 *                    break; ==> 2,3번은 동일한 문장수행 
 *                  *** break 사용이 가능 한곳 
 *                      switch , 반복문에서만 사용이 가능 
 *                      => break가 걸리면 switch,반복문을 종료 (147page)
 *                      
 *            --------------------------------------------
 *            148page switch 제약조건 
 *               1) 정수/문자/문자열
 *               2) case에 있는 값이 중복되면 안된다 
 *            155page switch 중첩이 가능 
 *            --------------------------------------------
 *            switch ==> 다중 if으로 변경이 가능 
 *            
 *            ==> 선택문 => 조건문에 포함 
 *                ------------------ 가독성이 좋게 
 *            ==> 선택문이나 조건문을 대신 사용 (어노테이션) => 스프링 
 *                  
 */
public class 선택문_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
