// 3명의 학생 성적 관리 
// 1명 => 국어,영어,수학,총점 , 평균 , 학점 
public class 데이터저장_변수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 변수 18 => 6 (배열) => 1(클래스) => 수정 , 초기화 
		//1.  국어 점수 
		int kor1,kor2,kor3,kor4,kor5;
		//2.  영어 점수 
		int eng1,eng2,eng3,eng4,eng5;
		//3.  수학 점수 
		int math1,math2,math3,math4,math5;
		//4.  총점 
		int total1,total2,total3,total4,total5;
		//5.  평균 
		double avg1,avg2,avg3,avg4,avg5;
		String name1,name2,name3,name4,name5;
		int rank1,rank2,rank3,rank4,rank;
		char score1,score2,score3,score4,score5;
		//  데이터 모아서 관리 방법 
		
		// 1명에 대한 정보 
		name1="홍길동";
		kor1=(int)(Math.random()*101); //0~100
		eng1=(int)(Math.random()*101);
		math1=(int)(Math.random()*101);
		total1=kor1+eng1+math1;
		avg1=total1/3.0;
		
		name2="심청이";
		kor2=(int)(Math.random()*101); //0~100
		eng2=(int)(Math.random()*101);
		math2=(int)(Math.random()*101);
		total2=kor2+eng2+math2;
		avg2=total2/3.0;
		
		
		name3="박문수";
		kor3=(int)(Math.random()*101); //0~100
		eng3=(int)(Math.random()*101);
		math3=(int)(Math.random()*101);
		total3=kor3+eng3+math3;
		avg3=total3/3.0;
		
		name4="박문수";
		kor4=(int)(Math.random()*101); //0~100
		eng4=(int)(Math.random()*101);
		math4=(int)(Math.random()*101);
		total4=kor4+eng4+math4;
		avg4=total4/3.0;
		
		name5="박문수";
		kor5=(int)(Math.random()*101); //0~100
		eng5=(int)(Math.random()*101);
		math5=(int)(Math.random()*101);
		total5=kor5+eng5+math5;
		avg5=total5/3.0;
		
		
		
		// 출력 
		System.out.println("이름:"+name1);
		System.out.println("국어:"+kor1);
		System.out.println("영어:"+eng1);
		System.out.println("수학:"+math1);
		System.out.println("총점:"+total1);
		System.out.printf("평균:%.2f\n",avg1);
		System.out.println("===========");
		
		System.out.println("이름:"+name2);
		System.out.println("국어:"+kor2);
		System.out.println("영어:"+eng2);
		System.out.println("수학:"+math2);
		System.out.println("총점:"+total2);
		System.out.printf("평균:%.2f\n",avg2);
		System.out.println("===========");
		
		System.out.println("이름:"+name3);
		System.out.println("국어:"+kor3);
		System.out.println("영어:"+eng3);
		System.out.println("수학:"+math3);
		System.out.println("총점:"+total3);
		System.out.printf("평균:%.2f\n",avg3);
		System.out.println("===========");
		
		System.out.println("이름:"+name4);
		System.out.println("국어:"+kor4);
		System.out.println("영어:"+eng4);
		System.out.println("수학:"+math4);
		System.out.println("총점:"+total4);
		System.out.printf("평균:%.2f\n",avg4);
		System.out.println("===========");
		
		System.out.println("이름:"+name5);
		System.out.println("국어:"+kor5);
		System.out.println("영어:"+eng5);
		System.out.println("수학:"+math5);
		System.out.println("총점:"+total5);
		System.out.printf("평균:%.2f\n",avg5);
		System.out.println("===========");
		
	}

}






