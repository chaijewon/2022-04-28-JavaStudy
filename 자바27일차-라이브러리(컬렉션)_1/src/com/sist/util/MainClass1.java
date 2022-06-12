package com.sist.util;
// 사용자 정의 클래스 
import java.util.*;
/*
 *    class Object
 *    {
 *       totString()
 *       finalize()
 *       equals()
 *       clone()
 *    }
 *    class Sawon extends Object
 *    {
 *       getSabun()
 *       setSabun()
 *       --
 *       --
 *       --
 *       --
 *    }
 *    
 *    Object obj => Sawon만이 가지고 있는 메소드에 접근이 불가능 
 */
class Sawon 
{
	private int sabun;
	private String name;
	private String dept;
	private String job;
	private int pay;
	public int getSabun() {
		return sabun;
	}
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public Sawon(int sabun, String name, String dept, String job, int pay) {
		this.sabun = sabun;
		this.name = name;
		this.dept = dept;
		this.job = job;
		this.pay = pay;
	}
	public Sawon()
	{
		
	}
	
}
public class MainClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList list=new ArrayList();
        list.add(new Sawon(1,"홍길동","개발부","사원",3200));//0
        list.add(new Sawon(2,"심청이","총무부","부장",5200));//1
        list.add(new Sawon(3,"이순신","기획부","과장",4200));//2
        list.add(new Sawon(4,"강감찬","자재부","대리",3800));//3
        list.add(new Sawon(5,"박문수","영업부","사원",3200));//4
        
        System.out.println("====== 사원 출력 ======");
        System.out.println("사원 총인원:"+list.size()+"명");
        for(Object obj:list)
        {
        	Sawon sa=(Sawon)obj;//상위클래스 => 하위 클래스의 메소드 , 변수는 접근이 불가능 
        	// 형변환후 사용한다 
        	System.out.println("사번:"+sa.getSabun());
        	System.out.println("이름:"+sa.getName());
        	System.out.println("부서:"+sa.getDept());
        	System.out.println("직위:"+sa.getJob());
        	System.out.println("연봉:"+sa.getPay());
        	System.out.println("===================");
        }
        
        System.out.println("===== 신입 사원 추가 =====");
        list.add(new Sawon(6,"춘향이","개발부","사원",3200));//5
        
        System.out.println("사원 총인원:"+list.size()+"명");
        for(Object obj:list)
        {
        	Sawon sa=(Sawon)obj;//상위클래스 => 하위 클래스의 메소드 , 변수는 접근이 불가능 
        	// 형변환후 사용한다 
        	System.out.println("사번:"+sa.getSabun());
        	System.out.println("이름:"+sa.getName());
        	System.out.println("부서:"+sa.getDept());
        	System.out.println("직위:"+sa.getJob());
        	System.out.println("연봉:"+sa.getPay());
        	System.out.println("===================");
        }
        
        System.out.println("===== 사원 수정 ======");
        list.set(3, new Sawon(4,"강감찬","자재부","과장",4200));
        System.out.println("사원 총인원:"+list.size()+"명");
        for(Object obj:list)
        {
        	Sawon sa=(Sawon)obj;//상위클래스 => 하위 클래스의 메소드 , 변수는 접근이 불가능 
        	// 형변환후 사용한다 
        	System.out.println("사번:"+sa.getSabun());
        	System.out.println("이름:"+sa.getName());
        	System.out.println("부서:"+sa.getDept());
        	System.out.println("직위:"+sa.getJob());
        	System.out.println("연봉:"+sa.getPay());
        	System.out.println("===================");
        }
        
        System.out.println("===== 사원 퇴사 =====");
        list.remove(1);
        System.out.println("사원 총인원:"+list.size()+"명");
        for(Object obj:list)
        {
        	Sawon sa=(Sawon)obj;//상위클래스 => 하위 클래스의 메소드 , 변수는 접근이 불가능 
        	// 형변환후 사용한다 
        	System.out.println("사번:"+sa.getSabun());
        	System.out.println("이름:"+sa.getName());
        	System.out.println("부서:"+sa.getDept());
        	System.out.println("직위:"+sa.getJob());
        	System.out.println("연봉:"+sa.getPay());
        	System.out.println("===================");
        }
        System.out.println("===== 회사 종료 =====");
        list.clear();
        System.out.println("사원 총인원:"+list.size()+"명");
        for(Object obj:list)
        {
        	Sawon sa=(Sawon)obj;//상위클래스 => 하위 클래스의 메소드 , 변수는 접근이 불가능 
        	// 형변환후 사용한다 
        	System.out.println("사번:"+sa.getSabun());
        	System.out.println("이름:"+sa.getName());
        	System.out.println("부서:"+sa.getDept());
        	System.out.println("직위:"+sa.getJob());
        	System.out.println("연봉:"+sa.getPay());
        	System.out.println("===================");
        }
        // CURD => 게시판 (면접 => 게시판 제작이 가능) 
        
	}

}





