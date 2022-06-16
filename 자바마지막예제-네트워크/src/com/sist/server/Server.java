package com.sist.server;
import java.util.*;

import com.sist.common.Function;

import java.net.*;
import java.io.*;
/*
 *    서버 
 *    ---
 *    1) 접속을 담당하는 클래스 => 1개 수행  
 *    2) 통신을 담당하는 클래스 => 클래스 접속자만킄 프로그램 실행 
 *       -------------------------------------------
 *                쓰레드 : 프로그램 위에서 여러개 프로그램을 동시 수행 
 *                -----
 *                게임 : 비행기 , 총알
 *                => 모든 프로그램은 1개 이상의 쓰레드를 가지고 있다 
 *    ---------------------------------------------------
 *    1. 서버 가동  => ServerSocket
 *       1) TCP (전화)
 *          Socket => 전화기 (연결기기)
 *          -----------------------
 *           = 개통 (bind) => 전화번호(IP),전화선(PORT)
 *           = PORT : 0~65535
 *                    ------- 0~1023(이미 사용중인 port)
 *                            80 : HTTP
 *                            23 : TELNET
 *                            21 : FTP 
 *                            25 : SMTP
 *                           1521 : 오라클 
 *                           1433 : MS-SQL
 *                           3306 : MY-SQL
 *                           8080 : 프록시 서버
 *                           4000 : 머드 서버 
 *                          --------------------------
 *                           3355 
 *            = listen() => 대기상태 (접속을 기다린다)
 *     2. 클라이언트가 접속시 : accept() => 클라이언트의 발신자 정보
 *        => 메모리에 저장 (1.IP , 2.PORT) => Vector (동기화) 
 *        ***=> 동기화에서 충돌이 발생시에 처리할 수 있는 프로그램
 *           => 데들락상태 , 스타베이션 => 뮤텍스 , 세마포아
 *           => ArrayList VS Vector
 *           => VO VS DTO , DAO VS Service
 *     3. 클라이언트 정보 => 쓰레드로 넘겨준다 
 *                      클라이언트와 쓰레드와 각자 통신이 가능 
 *     ----------------------------------------------
 *       
 */
/*
 *     쓰레드 사용 
 *     --------
 *     1. Runable : 인터페이스 구현 
 *     2. Thread 상속 
 *     
 *     ===============================
 *     쓰레드 동작          start()      run()
 *     new Thread() ===> 대기상태 ====> Running <====> Wait(sleep)
 *                                      |
 *                                      |
 *                                     Dead
 *        가상머신 => 1) 쓰레드의 이름 부여 , 2) 우선순위 
 *                     Thread-0 (이름변경)  0~10 
 *                     Thread-1           MIN(0) NORM(5) MAX(10)
 *                     사용자 정의 쓰레드 => NORM(5)
 *                                      
 */
public class Server implements Runnable{
    private Vector<Client> waitVc=new Vector<Client>();
	private ServerSocket ss;
	private final int PORT=3355;
	
	public Server()
	{
		try
		{
			ss=new ServerSocket(PORT); //단점 (50명)
			// bind() , listen() => 호출 
			System.out.println("Server Start...");
		}catch(Exception ex) {}
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try
		{
		  while(true)
		  {
			Socket s=ss.accept(); // 특별한 메소드 (클라이언트가 접속시에만 호출)
			// Socket => ip ,port => 클라이언트의 발신자 정보 
			// 통신을 시작한다 
			Client client=new Client(s);
			client.start(); // run() => 통신을 시작한다 
		  }
		}catch(Exception ex){}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Server server=new Server();
        new Thread(server).start();// 접속을 받는다 
	}
    // 통신을 담당하는 클래스 
	class Client extends Thread
	{
		private String id,name,sex,pos;
		private Socket s;// 클라이언트의 정보(ip,port)
		private BufferedReader in; // 클라이언트 요청값을 받는다 
		private OutputStream out;// 클라이언트로 결과값 응답 
		public Client(Socket s)
		{
			try
			{
				this.s=s;
				in=new BufferedReader(
						new InputStreamReader(s.getInputStream()));
				// InputStreamReader => 필터 스트림 (1byte=>2byte로 변환)
				// 한글 깨짐 방지 
				// 네트워크 전송 => byte단위로 전송 => 받는 경우=>문자 스트림으로 읽어 온다 
				out=s.getOutputStream();
				// s는 클라이언트의 전화기 (소켓)
				/*
				 *   서버 == 클라이언트의 정보 (IP , POTR , 읽어올 메모리 , 읽어갈 메모리)
				 *                       -----------  ----------  ----------
				 *                        Socket          in         out 
				 *   클라이언트  == 서버의 정보 (IP , POTR , 읽어올 메모리 , 읽어갈 메모리)
				 *                        ----------   ----------  ----------
				 *                          Socket         in          out
				 *                          => in => BufferedReader
				 *                             out => OutputStream 
				 *                             
				 *   => 클라이언트마다 따로 작동 => 쓰레드 
				 */
			}catch(Exception ex) {}
		}
		/// ======================> 웹서버 
		// 기능 설정 => 
		public void run()
		{
			// 비워져 있다 => 웹 
			// => 구분없다(번호) / 구분이 되어 있다(파일명)
			try
			{
				// 100|id|name|sex
				// id|홍길동|color
				/*
				 *   case 100:
				 *   case 200
				 *   case 110
				 *   case 300
				 *   case 900
				 *   case LOGIN:
				 */
				while(true)
				{
					// 클라이언트의 요청값을 받는다 
					String msg=in.readLine();
					StringTokenizer st=
							new StringTokenizer(msg,"|");
					int protocol=Integer.parseInt(st.nextToken());
					switch(protocol)
					{
					   case  Function.LOGIN:
					   {
						   // 데이터를 받는다 
						   id=st.nextToken();
						   name=st.nextToken();
						   sex=st.nextToken();
						   pos="대기실";
						   // 이미 로그인된 사람에게 정보전송 
						   messageAll(Function.LOGIN+"|"
								   +id+"|"+name+""+"|"
								   +sex+"|"+pos);//오라클
						   messageAll(Function.WAITCHAT+"|[알림 ☞]"+name+"입장하셨습니다!");
						   // waiVc에 저장 
						   waitVc.add(this);
						   messageTo(Function.MYLOG+"|"+id);
						   // 로그인창 => 대기실창으로 변경 
						   // 로그인사람에게 접속한 사람들의 정보를 전송
						   for(Client client:waitVc)
						   {
							   messageTo(Function.LOGIN+"|"
									   +client.id+"|"
									   +client.name+"|"
									   +client.sex+"|"
									   +client.pos);
						   }
						   // 개설된 방정보를 보내준다 
					   }
					   break;
					   case Function.WAITCHAT:
					   {
						   String data=st.nextToken();
						   messageAll(Function.WAITCHAT+"|["+name+"]"+data);
					   }
					   break;
					}
					
				}
			}catch(Exception ex) {}
		}
		// 서버에서 응답 => 2개 방법 
		// 한명에게 전송 
		// synchronized => 동기화 
		/*
		 *   https://www.google.com/search?q=%EC%9E%90%EB%B0%94&oq=%EC%9E%90%EB%B0%94&aqs=chrome..69i57j69i59j0i20i263i512j0i131i433i512l2j0i433i512l2j0i131i433i512l3.790j0j15&sourceid=chrome&ie=UTF-8
		 */
		public synchronized void messageTo(String msg)
		{
			try
			{
				out.write((msg+"\n").getBytes()); // 1byte
				// 웹 => 인코딩 
				// %EC%9E%90%EB%B0%94 =>자바 (byte[]) => 디코딩 (자바)
				// URLEncoder.encoding(한글)
			}catch(Exception ex){}
			
		}
		// 접속한 모든 사람에게 전송  
		public synchronized void messageAll(String msg)
		{
			try
			{
				for(Client client:waitVc)
				{
					client.messageTo(msg);
				}
			}catch(Exception ex){}
		}
		
	}
}










