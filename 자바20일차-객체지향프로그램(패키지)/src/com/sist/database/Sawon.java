package com.sist.database;
// 데이터 보호 ( 은닉화 VS 캡슐화 ) 
// 348page => 캡슐화 
/*
 *    private / default / protected / public 
 *    => 웹에서는 특별한 경우가 아닌 경우 (static은 사용빈도가 거의 없다)
 *    ----------------------------
 *    접근 지정어를 사용할 수 있는 곳
 *    클래스 : public 
 *    멤버변수 : private 
 *    메소드 : public 
 *    생성자 : public 
 *    ----------------------------
 *    => static => 데이터를 모아서 저장 => 모든 User가 공통으로 사용 
 *       -------------------------------------------------(X)
 *             오라클 (static [])
 *    지역변수는 사용할 수 없다 (메소드) => final 
 *    
 *    => 조합 
 *       static / abstract (X) 
 *       abstract / final (X)
 *       abstract / private (X)
 *       private / final (X)
 *       
 *       => static final 
 *          public abstract 
 */
public class Sawon {
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
  
}
