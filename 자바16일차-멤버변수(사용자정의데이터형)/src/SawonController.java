import java.util.*;
/*
 *   인스턴스변수는 new를 사용시마다 다로 메모리 생긴다
 *   static변수 new상관없이 한개의 메모리만 생긴다 (공유)
 *   242~243page
 *   246~249page
 *   -----------------------------------------
 *   객체지향 용어 
 *   ----------
 */
public class SawonController {
   Sawon[] sawon=new Sawon[20];// 데이터 수집 => 모아서 메모리 
   int index=0;
   //1. 사원 등록 
   static void insert(Sawon sa)
   {
	   SawonController sc=new SawonController();
	   sc.sawon[sc.index]=sa;
	   System.out.println("insert:sawon="+sc.sawon);
   }
   //2. 사원 목록
   static void list()
   {
	   SawonController sc=new SawonController();
	   System.out.println("list:sawon="+sc.sawon);
	   for(Sawon s:sc.sawon)
	   {
		   if(s!=null)
		   {
			   System.out.println("사번:"+s.sabun);
			   System.out.println("이름:"+s.name);
			   System.out.println("=============");
		   }
	   }
   }
   //3. 사원 수정 
   //4. 사원 삭제
}
