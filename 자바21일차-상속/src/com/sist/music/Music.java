package com.sist.music;
// 데이터형 (Music=> 필요한 데이터를 모아서 관리)
/*
 *   상속 : 상속되는 것,상속은 없지만 사용가능 
 *         상속=>필요시에 변경 (오버라이딩) 
 *         상속 
 *          => 상위 = 하위 
 */
public class Music {
    private int rank;
    private String poster;
    private String title;
    private String singer;
    private String album;
    private int like;// 지니(X) , 멜론(O) ==> 데이터베이스 (컬럼)
    private String key;//동영상
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
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
	public int getLike() {
		return like;
	}
	public void setLike(int like) {
		this.like = like;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
   
}
