package com.sist.common;
// 내부 프로토콜 : client/server
/*
 *    client : 요청 =====================> request
 *    server : 요청 처리 => 결과값 전송 (응답) ==> response 
 *    웹 => 네트워크 (TCP) => 연결지향적 프로그램 
 *    오라클(서버) ==> 응용프로그램 (DAO) => 클라이언트 
 *    
 *                     요청 (SQL) => DML 
 *                     INSERT ~ 데이터 추가 요청  
 *                     UPDATE ~ 데이터 수정 요청
 *                     SELECT ~ 데이터 검색 결과를 달라
 *                     DELETE ~ 데이터를 삭제 
 *                              회원 탈퇴 , 게시물 삭제 ....
 *    자바응용프로그램  =================  오라클 
 *                     데이터 관리 => CURD
 *                     Create => INSERT
 *                     Update => UPDATE
 *                     Read   => SELECT
 *                     Delete => DELETE
 *                     
 *               a.jsp login.jsp
 *               b.jsp
 *               c.jsp
 *               d.jsp
 *               e.jsp 
 */
public class Function {
  public static final int LOGIN=100;//login.jsp
  public static final int MYLOG=110;//mylog.jsp
  public static final int MAKEROOM=200;
  public static final int ROOMIN=210;
  public static final int MYROOMIN=220;
  public static final int ROOMOUT=230;
  public static final int MYROOMOUT=240;
  public static final int WAITUPDATE=250;
  public static final int WAITCHAT=300;
  public static final int ROOMCHAT=310;
  public static final int CHATEND=900;
  public static final int MYCHATEND=910;
}
