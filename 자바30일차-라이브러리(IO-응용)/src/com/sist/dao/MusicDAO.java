package com.sist.dao;
import java.sql.*;
import java.util.ArrayList;

import com.sist.vo.*;
public class MusicDAO {
   private Connection conn;
   private PreparedStatement ps;
   private final String URL="jdbc:oracle:thin:@localhost:1521:XE";
   private final String USERNAME="hr";
   private final String PASSWORD="happy";
   // 1. 드라이버 등록 => 한번만 수행 ==> 생성자 
   public MusicDAO()
   {
	   try
	   {
		   Class.forName("oracle.jdbc.driver.OracleDriver");
	   }catch(Exception ex){}
   }
   // 2. 데이터베이스 연결 
   public void getConnection()
   {
	   try
	   {
		   conn=DriverManager.getConnection(URL,USERNAME,PASSWORD);
		   // conn hr/happy
	   }catch(Exception ex){}
   }
   // 3. 데이터베이스 해제 
   public void disConnection()
   {
	   try
	   {
		   if(ps!=null) ps.close();
		   if(conn!=null) conn.close();
		   
	   }catch(Exception ex){}
   }
   // 4. 기능 
   // 4-1. Music 데이터 추가 
   public void musicInsert(Music m)
   {
	   // java.io , java.sql => 예외처리 => CheckException
	   try
	   {
		   /*
		    *    MNO                                                NUMBER
				 CNO                                                NUMBER
				 TITLE                                              VARCHAR2(500)
				 SINGER                                             VARCHAR2(500)
				 ALBUM                                              VARCHAR2(500)
				 POSTER                                             VARCHAR2(260)
				 IDCREMENT                                          NUMBER
				 STATE
		    */
		   // 정상문장
		   // 1. 오라클 연결 
		   getConnection();
		   // 2. SQL문장 
		   String sql="INSERT INTO music VALUES(?,?,?,?,?,?,?,?)";
		   
		   // 3. 오라클 전송
		   ps=conn.prepareStatement(sql); // 네트워크 
		   // 4. 실행 
		   // 4-1 ?에 값을 채운다 
		   ps.setInt(1, m.getMno());
		   ps.setInt(2, m.getCno());
		   ps.setString(3, m.getTitle());
		   ps.setString(4, m.getSinger());
		   ps.setString(5, m.getAlbum());
		   ps.setString(6, m.getPoster());
		   ps.setInt(7, m.getIdcrement());
		   ps.setString(8, m.getState());
		   
		   ps.executeUpdate();
		   
	   }catch(Exception ex)
	   {
		   // 에러처리 => 복구 
		   ex.printStackTrace();
	   }
	   finally
	   {
		   // 서버 닫기 
		   disConnection();
	   }
   }
   // 4-2. 데이터베이스에서 Music 읽기 
   public ArrayList<Music> musicListData(int cno)
   {
	   ArrayList<Music> list=
			   new ArrayList<Music>();
	   try
	   {
		   getConnection();
		   String sql="SELECT mno,poster,idcrement,"
				     +"state,title,singr,album "
				     +"FROM music "
				     +"WHERE cno="+cno;
		   ps=conn.prepareStatement(sql);
		   ResultSet rs=ps.executeQuery();
		   while(rs.next())
		   {
			   Music m=new Music();
			   m.setMno(rs.getInt(1));
			   m.setPoster(rs.getString(2));
			   m.setIdcrement(rs.getInt(3));
			   m.setState(rs.getString(4));
			   m.setTitle(rs.getString(5));
			   m.setSinger(rs.getString(6));
			   m.setAlbum(rs.getString(7));
			   list.add(m);
		   }
		   rs.close();
	   }catch(Exception ex)
	   {
		   ex.printStackTrace();
	   }
	   finally
	   {
		   disConnection();
	   }
	   return list;
   }
}







