package com.sist.util2;
// 액션 클래스 => 데이터 관리 (주로 메소드)
import java.util.*;
/*
 *    변수 (멤버 => 인스턴스 , static) 
 *    ---
 *     => 초기화 
 *        1) 생성자 => 인스턴스 
 *        2) 초기화블록 => static
 *        
 *     List 
 *     =====> 데이터 중복 , 순서 (인덱스)  
 *      => ArrayList , Vector , LinkedList  => 구현된 클래스
 *                       |         |
 *                     Stack     Queue
 *      List => 인터페이스 (메소드가 동일) => 표준화 
 *       |
 *       데이터 관리(메모리) => CURD 
 *         검색(읽기) ==> public Object get(int)
 *         수정     ==> public Object set(int index , Object obj)
 *         추가     ==> public void add(Object obj)
 *         삭제     ==> public Object remove(int index)
 *         ------
 *         저장 갯수 확인 ==> public int size()
 *         전체 삭제     ==> public void clear()
 *      데이터베이스 : MyBatis / JPA => 라이브러리 (리턴형 => ArrayList)
 *                 -------------- 
           
 */
public class SawonManager {
    private static ArrayList list=new ArrayList();
    // 초기화 
    static // 자동 인식 
    {
    	list.add(new Sawon(1,"홍길동","개발부","사원",3200));//0
        list.add(new Sawon(2,"심청이","총무부","부장",5200));//1
        list.add(new Sawon(3,"이순신","기획부","과장",4200));//2
        list.add(new Sawon(4,"강감찬","자재부","대리",3800));//3
        list.add(new Sawon(5,"박문수","영업부","사원",3200));//4
    }
    
    // 목록 출력 
    public void sawonList()
    {
    	System.out.println("===== 사원목록 =====");
    	for(Object obj:list)
    	{
    		Sawon sa=(Sawon)obj;
    		System.out.println(sa.getSabun()+" "
    				+sa.getName()+" "
    				+sa.getDept()+" "
    				+sa.getJob()+" "
    				+sa.getPay());
    	}
    	
    }
    // 수정 
    public void sawonUpdate()
    {
    	Scanner scan=new Scanner(System.in);
    	System.out.print("사번 입력:");
    	int sabun=scan.nextInt();
    	
    	System.out.print("이름 입력:");
    	String name=scan.next();
    	
    	System.out.print("부서 입력:");
    	String dept=scan.next();
    	
    	System.out.print("직위 입력:");
    	String job=scan.next();
    	
    	System.out.print("연봉 입력:");
    	int pay=scan.nextInt();
    	
    	Sawon sa=new Sawon(sabun,name,dept,job,pay);
    	int k=0;
    	for(Object obj:list)
    	{
    		Sawon s=(Sawon)obj;
    		if(s.getSabun()==sabun)
    		{
    			break;
    		}
    		k++;
    	}
    	
    	list.set(k, sa);
    	
    	sawonList();
    }
    // 추가 
    public void sawonInsert()
    {
    	Scanner scan=new Scanner(System.in);
    	System.out.print("이름 입력:");
    	String name=scan.next();
    	
    	System.out.print("부서 입력:");
    	String dept=scan.next();
    	
    	System.out.print("직위 입력:");
    	String job=scan.next();
    	
    	System.out.print("연봉 입력:");
    	int pay=scan.nextInt();
    	
    	int sabun=0;
    	for(Object obj:list)
    	{
    		Sawon sa=(Sawon)obj;
    		// 1 2 3 4 5 
    		if(sa.getSabun()>sabun)
    			sabun=sa.getSabun();
    	}
    	// 시퀀스 => Max+1 => 게시판 new Date()
    	Sawon sa=new Sawon(sabun+1,name,dept,job,pay);
    	list.add(sa);
    	sawonList();
    }
    // 상세보기 
    public void sawonDetail()
    {
    	Scanner scan=new Scanner(System.in);
    	System.out.print("이름 입력:");
    	String name=scan.next();
    	
    	for(Object obj:list)
    	{
    		Sawon sa=(Sawon)obj;
    		if(sa.getName().equals(name))
    		{
    			System.out.println("===== 사원 정보 =====");
    			System.out.println("사번:"+sa.getSabun());
    			System.out.println("이름:"+sa.getName());
    			System.out.println("부서:"+sa.getDept());
    			System.out.println("직위:"+sa.getJob());
    			System.out.println("연봉:"+sa.getPay());
    		}
    	}
    }
    // 삭제 
    public void sawonDelete()
    {
    	Scanner scan=new Scanner(System.in);
    	System.out.print("이름 입력:");
    	String name=scan.next();
    	int k=0;
    	for(Object obj:list)
    	{
    		Sawon sa=(Sawon)obj;
    		if(sa.getName().equals(name))
    		{
    			list.remove(k);
    			break;
    		}
    		k++;
    	}
    	
    	sawonList();
    }
}

















