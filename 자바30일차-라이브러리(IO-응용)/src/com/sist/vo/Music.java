package com.sist.vo;

import java.io.Serializable;
// 사용자 정의 데이터 (변수 : 읽기(getter)/쓰기(setter))
// 데이터보호 => 캡슐화 
// 직렬화 => 객체단위 저장 
public class Music implements Serializable{
    private int mno; // 고유번호 (시퀀스)
    private int cno; // 카테고리 번호 
    private String title; // 곡명
    private String poster; // poster
    private String singer; // 가수명
    private String album; // 앨범 
    private int idcrement; // 등폭
    private String state; // 유지 , 상승 , 하강 
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
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
	public int getIdcrement() {
		return idcrement;
	}
	public void setIdcrement(int idcrement) {
		this.idcrement = idcrement;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
   
}
