/*
 *    데이터형 
 *      기본형 : 정수 , 실수 , 논리 , 문자 (자바에서 지원하는 데이터형)
 *      참조형 : 배열 , 클래스 
 *                   ----- 다른 데이터형 모아서 관리 
 *             --- 같은 데이터형을 여러개 모아서 관리
 *      클래스 용도 
 *        ***= 데이터만 모아서 관리 (데이터형 클래스) => ~DTO, ~VO , ~Bean
 *                                                   ----
 *        = 기능만 모아서 관리 (액션 클래스) => ~DAO , ~Manager , ~Service(BI)
 *                                      -----             ------------
 *        = 데이터+기능 = 혼합 클래스 => 조립 => ~Model , ~Controller , ~Action
 *                                                -------------
 *                                                
 */
class FoodCategory{
	int cno;
	String poster;
	String title;
	String subject;
}
public class 사용자정의클래스 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        FoodCategory f1=new FoodCategory();
        f1.cno=1;
        f1.poster="aaa";
        f1.title="aaa";
        f1.subject="aaa";
        
        FoodCategory f2=new FoodCategory();
        f2.cno=2;
        f2.poster="bbb";
        f2.title="bbb";
        f2.subject="bbb";
        
        FoodCategory[] food=new FoodCategory[170000];
	}

}





