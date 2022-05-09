/*
 *           | 값을 전송 ==> 2  ==> 147page
 *   switch(정수)
 *   {
 *      case 정수값1(1): => if(정수==1)
 *        처리문장 
 *        break;
 *      case 정수값2(2): => else if(정수==2)
 *        처리문장 ==> 수행 break에 의해 종료 
 *        break;
 *      case 정수값3(3): => else if(정수==3)
 *        처리문장
 *        break;
 *      default:       => else
 *        처리문장 
 *   }
 */
// 학점  => 3개의 과목 => 평균 , 총점 , 학점  => 등수 
import java.util.Scanner;
/*
 *       =============
 *         Stack : 변수 , 매개변수 => 메모리 자체 관리 {}
 *       =============
 *         Heap : 클래스 , 배열 => 프로그래머가 관리  => GC
 *       =============
 */
public class 선택문_2 {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("국어점수 입력:");
        int kor=scan.nextInt();
        
        System.out.print("영어점수 입력:");
        int eng=scan.nextInt();
        
        System.out.print("수학점수 입력:");
        int math=scan.nextInt();
        
        // 국어 , 영어 , 수학 
        System.out.println("국어점수:"+kor);
        System.out.println("영어점수:"+eng);
        System.out.println("수학점수:"+math);
        // 총점 => 90 80 70
        System.out.println("총점:"+(kor+eng+math));
        //                 ----------
        //                 "총점:90"
        //                 -------------- "총점:9080" 
        // 평균 
        int avg=(kor+eng+math)/3;//switch~case
        System.out.printf("평균:%.2f\n",(kor+eng+math)/3.0);
        // 학점 
        // 100~90 A  , 89~80 B  , 79~70 C  , 69~60 D .. F
        // case 100:99:98:97.....
        // case문장을 최대한 줄인다 
        // 한개씩 선택 => 선택문 , 범위 => 다중 if 
        /*
         *    final int LOGIN=1
         *    case LOGIN=> 상수
         *    case 2
         *    case 3
         *    case 4.... 10
         *    case "LOGIN":
         *    case "ROOMIN":
         *    case "ROOMOUT":
         */
        switch(avg/10) // 정수(상수) , 문자('') , 문자열("") 
        {
           case 10://100
           case 9:// 90대 
        	   System.out.println("학점:A");
        	   break;
           case 8://80대
        	   System.out.println("학점:B");
        	   break;
           case 7:
        	   System.out.println("학점:C");
        	   break;
           case 6:
        	   System.out.println("학점:D");
        	   break;
           default:
        	   System.out.println("학점:F");
        	   
        }
	}

}








