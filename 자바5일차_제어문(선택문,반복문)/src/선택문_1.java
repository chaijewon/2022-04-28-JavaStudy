/*
 *    선택문 : 경우의 수가 많은 경우에 주로 사용 
 *           한개를 선택시에 처리 : 메뉴 , 계산기 , 성적계산 
 *                            게임 (키보드 선택)
 *                            => 웹에서는 사용빈도가 많이 없다
 *           형식) 
 *                switch(1.정수 , 2.문자 , 3. 문자열)
 *                {
 *                   case 정수값(1): Space,Enter => 총알  
 *                      처리문장1 
 *                      종료 명령 ==> break  => break가 있는 문장까지 수행
 *                                 break는 모든 case문장에 설정하지는 않는다
 *                   case 정수값(2):
 *                      처리문장2
 *                      종료 명령 ==>
 *                   case 정수값(3):
 *                      처리문장3
 *                      종료 명령 ==>
 *                   default:
 *                      처리문장4
 *                }
 *                    case SPACE:
 *                    case ENTER:   => if(key==SPACE || key==ENTER)
 *                       처리 
 *                       break;
 *                       
 *                    case 100:
 *                    case 90: => 같은 내용이 있는 경우 
 *                      A
 *                      break;
 *                 
 *                switch(1) => 처리문장1 , 처리문장2,처리문장3, default를 수행
 *                
 *            주의점 : 정수(상수) , 문자 , 문자열 
 *                   case 값:
 *                        -- 중복이 있으면 안된다 
 *                   -- break는 사용할때도 있고 사용하지 않는 경우도 있다 
 *                                         -------------------
 *                                           처리하는 내용이 같은 경우에는 생략한다 
 */
// 사칙연산 => + , - , * , / (default:사칙연산이 아닌 경우)  => 문장/문자열 
import java.util.Scanner; // 사용자 입력 받기 
public class 선택문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 클래스를 사용시에는 반드시 메모리에 저장후에 사용 => 메모리 저장 : new
		Scanner scan=new Scanner(System.in);
		//                      ----------- 키보드 입력값을 받을 경우
		// -> in ==> InputStream
		// -> out ==> OutputStream 
		// Stream => 데이터 이동하는 통로 
		System.out.print("첫번째 정수:");//void => 줄 값이 없다 
		int num1=scan.nextInt(); //기능 => 입력된 정수값을 가지고 온다
		System.out.print("두번째 정수:");
		int num2=scan.nextInt();
		// 연산자 => +,-,*,/ => 문자열  '+'(X):문자 => "+":문자열 
		System.out.print("연산자 입력(+,-,*,/):");
		String op=scan.next(); // 입력된 문자열을 읽어 온다 
		/*
		 *   nextInt() ==> int
		 *   nextDouble()==> double
		 *   next()     ==> String 
		 *   nextBoolean() ==> boolean 
		 */
		switch(op)
		{
		   case "+":
			  System.out.printf("%d+%d=%d\n",num1,num2,num1+num2);
			  break; // switch를 종료한다  
		   case "-":
			  System.out.printf("%d-%d=%d\n",num1,num2,num1-num2);
			  break;
		   case "*":
			  System.out.printf("%d*%d=%d\n",num1,num2,num1*num2);
			  break;
		   case "/":
			   if(num2==0)
				   System.out.println("0으로 나눌 수 없다");
			   else
				   System.out.printf("%d/%d=%d\n",num1,num2,num1/num2);
			   break;
		   default:
			   System.out.println("잘못된 연산자입니다!!");
		}
		
	}

}







