package com.sist.io;
import java.util.*;
import java.io.*;
public class SawonManager {
   private static ArrayList<Sawon> list=new ArrayList<Sawon>();
   // 초기화 
   static
   {
	   try
	   {
		   FileReader fr=new FileReader("c:\\사원\\sawonData.txt");
		   String data="";
		   int i=0;
		   while((i=fr.read())!=-1)
		   {
			   data+=(char)i;
		   }
		   fr.close();
		   /*
		    *   private int sabun;// 사번
			    private String name;
			    private String job;//직위
			    private String dept;//부서명
			    private String loc;// 근무지 
			    private String hiredate;//입사일 
			    private int pay;//연봉
			    
			    1|홍길동|대리|개발부|서울|2000-10-10|3500
		    */
		   if(!data.equals(""))// 에러방지 
		   {
		     String[] sawonData=data.split("\n");// 한줄씩 데이터 저장 
		     for(String sawon:sawonData)
		     {
		    	 StringTokenizer st=new StringTokenizer(sawon,"|");
		    	 Sawon sa=new Sawon();
		    	 sa.setSabun(Integer.parseInt(st.nextToken()));
		    	 sa.setName(st.nextToken());
		    	 sa.setJob(st.nextToken());
		    	 sa.setDept(st.nextToken());
		    	 sa.setLoc(st.nextToken());
		    	 sa.setHiredate(st.nextToken());
		    	 sa.setPay(Integer.parseInt(st.nextToken()));
		    	 
		    	 list.add(sa);
		     }
		   }
		   
	   }catch(Exception ex){}
   }
   // 기능 
   // 1. 목록 
   public void sawonList()
   {
	   for(Sawon sa:list)
	   {
		   System.out.println(sa.getSabun()+" "
				   +sa.getName()+" "
				   +sa.getJob()+" "
				   +sa.getDept()+" "
				   +sa.getLoc());
	   }
   }
   // 2. 사원추가 
   public void sawonInsert()
   {
	   Scanner scan=new Scanner(System.in);
	   System.out.print("이름 입력:");
	   String name=scan.next();
	   
	   System.out.print("직위 입력:");
	   String job=scan.next();
	   
	   System.out.print("부서 입력:");
	   String dept=scan.next();
	   
	   System.out.print("근무지 입력:");
	   String loc=scan.next();
	   
	   System.out.print("입사일 입력:");
	   String day=scan.next();
	   
	   System.out.print("연봉 입력:");
	   int pay=scan.nextInt();
	   
	   Sawon sa=new Sawon();
	   sa.setSabun(sabunMake());
	   sa.setName(name);
	   sa.setJob(job);
	   sa.setDept(dept);
	   sa.setLoc(loc);
	   sa.setHiredate(day);
	   sa.setPay(pay);
	   
	   list.add(sa);
	   
	   fileSave();
   }
   // 3. 사원수정 
   // 4. 사원 상세보기 
   // 5. 사원삭제 
   // 6. 메뉴 
   public int menu()
   {
	   System.out.println("===== 메뉴 =====");
	   System.out.println("1. 사원 목록 보기");
	   System.out.println("2. 사원 상세 보기");
	   System.out.println("3. 사원 추가");
	   System.out.println("4. 사원 수정");
	   System.out.println("5. 사원 삭제");
	   System.out.println("9. 종료");
	   System.out.println("===============");
	   Scanner scan=new Scanner(System.in);
	   System.out.print("메뉴 선택:");
	   return scan.nextInt();
   }
   // 7. 종료시 파일에 저장  
   public void fileSave()
   {
	   try
	   {
		   FileWriter fw=new FileWriter("c:\\사원\\sawonData.txt");
		   for(Sawon sa:list)
		   {
			   String s=sa.getSabun()+"|"
					   +sa.getName()+"|"
					   +sa.getJob()+"|"
					   +sa.getDept()+"|"
					   +sa.getLoc()+"|"
					   +sa.getHiredate()+"|"
					   +sa.getPay()+"\n";
			   fw.write(s);
		   }
		   fw.close();
	   }catch(Exception ex){}
   }
   // 8. 시퀀스 (사번을 자동 증가) 
   public int sabunMake()
   {
	   int sabun=0;
	   for(Sawon sa:list)
	   {
		   if(sa.getSabun()>sabun)
			   sabun=sa.getSabun();//sabun의 최대값
	   }
	   return sabun+1;
   }
}










