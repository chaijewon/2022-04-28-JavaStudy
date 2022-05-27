// = 기능
/*
 *   1. 글쓰기 
 *   2. 목록 보기 
 *   3. 수정 
 *   4. 삭제 
 *   -----------
 */
// static => 데이터 모음 (공유) 
import java.util.*;
/*
 *   초기화 : 변수 초기화 
 *   
 *   생성자 => 호출 (모든 초기화 => 생성자) 
 *   
 *   생성자를 호출하지 않는 경우 => {} , static{}
 *                           ------------- 호출없이 자동 실행 
 *   
 *   1. 생성자 
 *   
 *   순서 
 *    = 명시적 초기화   
 *    = 초기화 블록 
 *    = 생성자 
 *    
 *    class A
 *    {
 *       static int a=10; A.a
 *       
 *       static 
 *       {
 *           a=100;
 *       }
 *       
 *       {
 *          a=100;
 *       }
 *       
 *       A()
 *       {
 *         a=300; =============> 최종 
 *       } 
 *    }
 */
public class ReviewManager {
  // 리뷰 전체 데이터를 가지고 있다 
  static Review[] review=new Review[100];// 객체배열 
  static int index;
  ReviewManager() 
  {
	  index=0;
  }
  // 리뷰를 사용하는 모든 유저 공유 
  // 글쓰기,수정,삭제 => void => 
  void write(Review rv)
  {
	  review[index]=rv; // review[0]=rv
	  index++;// 다음에 사용하기 위해 => review[1]=rv
  }
  void list() // 직접 출력 => Review[]
  {
	  System.out.println("========= 리뷰 ========");
	  boolean bCheck=false;
	  for(Review rv:review)
	  {
		  // 클래스를 읽어 올 경우에는 반드시 null값 체크 
		 if(rv!=null && rv.isShow==true)
		 {
			  System.out.println(rv.no+"."+rv.msg);
			  System.out.println(rv.name);
			  System.out.println(rv.regdate);
			  for(int i=0;i<rv.star;i++)
			  {
				  System.out.print("★");//정수 저장 
			  }
			  System.out.println("\n==================");
			  bCheck=true;
		 }
	  }
	  if(bCheck==false)
	  {
		  System.out.println("리뷰가 없습니다!!");
	  }
  }
  // 시퀀스 => 자동 증가번호
  // 클래스는 null값일 경우 (객체가 생성이 안된 상태 => .을 이용하면 오류발생)
  int max()
  {
	  int m=0;
	  for(Review rv:review)// review는 100
	  {   
		  if(rv==null)
			  break;// 입력이 없는 곳은 종료 ,0,1 => 2번에서 종료
		  if(m<rv.no)
			  m=rv.no;
	  }
	  return m+1;//다음번호  1,2 => 3...
  }
  int menu()
  {
	  System.out.println("===== Menu =====");
	  System.out.println("1. 리뷰 입력");
	  System.out.println("2. 목록 보기");
	  System.out.println("3. 리뷰 수정");
	  System.out.println("4. 리뷰 삭제");
	  System.out.println("9. 종료");
	  System.out.println("================");
	  Scanner scan=new Scanner(System.in);
	  System.out.print("메뉴 선택:");
	  return scan.nextInt();
  }
  void process()
  {
	  while(true)
	  {
		  int m=menu();
		  if(m==9)
		  {
			  System.out.println("프로그램 종료!!");
			  break;//System.exit(0); 0=>정상 종료 , -1:비종료 종료
		  }
		  else if(m==1)
		  {
			  // 리뷰 입력합니다
			  System.out.println("===== 리뷰 입력 =====");
			  Scanner scan=new Scanner(System.in);
			  System.out.print("이름 입력:");
			  String name=scan.next();
			  System.out.print("리뷰 입력:");
			  String msg=scan.next();
			  //scan.next();
			  System.out.print("별점 입력:");
			  int star=scan.nextInt();
			  
			  
			  
			  // BufferedReader => try
			  
			  Review r=new Review();//메모리 할당 (주소가 할당)
			  r.no=max();
			  r.name=name;
			  r.msg=msg;
			  r.star=star;
			  r.regdate="2022-05-27";
			  
			  // 등록 
			  write(r);
			  
			  // 목록으로 이동 
			  list();
			  
		  }
		  else if(m==2)
		  {
			  list();
		  }
		  else if(m==3)
		  {
			  Scanner scan=new Scanner(System.in);
			  System.out.print("수정할 번호를 선택:");
			  int no=scan.nextInt();
			  
			  System.out.print("이름 입력:");
			  String name=scan.next();
			  System.out.print("별점 입력:");
			  int star=scan.nextInt();
			  System.out.print("리뷰 입력:");
			  String msg=scan.next();
			  
			  // BufferedReader => try
			  
			  
			  review[no-1].name=name;
			  review[no-1].msg=msg;
			  review[no-1].star=star;
			  review[no-1].regdate="2022-05-27";
			  
			  list();// 반복 제거 
		  }
		  else if(m==4)
		  {
			  Scanner scan=new Scanner(System.in);
			  System.out.print("삭제할 번호 선택:");
			  int no=scan.nextInt();
			  
			  review[no-1].isShow=false;
			  
			  list();// 목록으로 이동 
			  
		  }
	  }
  }
}
