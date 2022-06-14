package com.sist.io;
/*
 *    파일에 저장된 데이터를 읽어서 => ArrayList에 저장 
 *    조작 => ArrayList에서 조작 
 *    종료 => 파일데이터를 ArrayList에 있는 데이터로 변경 
 *           ----------------------------------- 파일에 ArrayList저장 
 */
// 가상 메모리를 이용한다 (게임 , 웹=> VueJS) 
public class Sawon {
    private int sabun;// 사번
    private String name;
    private String job;//직위
    private String dept;//부서명
    private String loc;// 근무지 
    private String hiredate;//입사일 
    private int pay;//연봉
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
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public String getHiredate() {
		return hiredate;
	}
	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
  
}
