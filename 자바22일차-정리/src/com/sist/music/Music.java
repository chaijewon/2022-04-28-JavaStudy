package com.sist.music;
// 객체지향프로그램 => 캡슐화 (웹)
/*
 *    클래스의 종류 
 *      => 변수 묶어서 관리 (~VO,~DTO)
 *      => 메소드 묶어서 관리 (~DAO , ~Manager)
 */
public class Music {
    private int no;
    private String title;
    private String singer;
    private String album;
    private String poster;
    private String key;
    
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
   
   // 읽기 (getter) / 쓰기 (setter)   ==> 은닉화  => 캡슐화 (데이터 보호)
   // 만드는 방식 => getXxx() , setXxx() 
   // MyBatis (데이터베이스) , JSTL (화면출력)
   
}
