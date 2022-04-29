// 변수 / 상수 (변경할 수 없는 값)
// 변경해서 사용
public class MainClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int kor=90;
        int eng=80;
        int math=80;
        final int SUBJECT=3; // 대문자 전체 (지원하는 상수)
        //상수를 설정시에는 반드시 초기값을 부여한다 (선언과 동시에 값을 부여)
        // 값을 변경 할 수 있다 (변수)
        kor=92;
        eng=90;
        math=78;
        
        // 출력 
        System.out.println(kor); // ln => newLine(다음줄에 출력)
        System.out.println(eng);
        System.out.println(math);
        System.out.println(SUBJECT);
        
        // 출력 (가로 단위 출력)
        System.out.print(kor+" "+eng+" "+math+" "+SUBJECT);
        System.out.print("\n");
        // 서식이 있는 출력 
        System.out.printf("%-5d%-5d%-5d%-5d",kor,eng,math,SUBJECT);
        /*
         *   System.out.printf
         *   
         *   ------------------
         *   "%-5d%-5d%-5d%-5d" => 출력 형식 
         *   %d ==> 정수
         *   %f ==> 실수
         *   %c ==> 문자
         *   %s ==> 문자열 
         *   --------------------------- C언어 printf()
         *   
         *   %-5d  ,  %5d
         *   
         *   System.out.println 웹에서 가장 많이 사용된다 
         *   
         */
         
	}

}
