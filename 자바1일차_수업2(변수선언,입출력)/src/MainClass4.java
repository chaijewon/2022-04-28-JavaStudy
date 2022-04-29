/*
 *    1. 국어,영어,수학 점수 입력 => 총점 , 평균 , 학점
 *    ==> 
 *        int kor,eng,math,total;
 *        double avg;
 *        char hakjum; => 조건 
 *    2. 이름 , 성별 , 나이를 입력 받아서 저장 => 출력 
 *       --------------
 *       "홍길동" => String 
 *       "남자"   => String
 *       나이 => int
 *       
 *    ===> 프로그램 : 변수 (메모리에 저장후에 조작) 
 *    ===> 변수 설정 (O) 
 *         ======= 변수가 많은 경우에 => 묶어서 (한개의 이름으로 제어)
 *    
 *    1) 둘중에 한개 (상영작,개봉예정) => boolean 
 *    2) 문자가 여러개 (노래명  , 가수명, 영화제목) ==> String 
 *    ------------------------------------------------
 *    String : 문자열 저장 (X) 
 *    var : 모든 데이터형  ===> 변수 (35~40%) 
 *       
 */
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// JDK 10 
        /*var kor=90;
        var eng=89;
        var math=95;
        var total=(kor+eng+math);
        var avg=total/3.0;*/
		
		int kor=90;
		int eng=89;
		int math=95;
		int total=(kor+eng+math);
		double avg=total/3.0;
        
        System.out.println("국어 점수:"+kor);
        System.out.println("영어 점수:"+eng);
        System.out.println("수학 점수:"+math);
        System.out.println("총점 점수:"+total);
        System.out.printf("평균:%.2f",avg);
        
	}

}
