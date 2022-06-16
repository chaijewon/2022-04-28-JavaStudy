package com.sist.client;

import javax.swing.*;

import com.sist.common.Function;

import java.awt.*;
import java.awt.event.*;
//// 윈도우 
import java.util.*;
import java.net.*;
import java.io.*;
//// 네트워크 관련 
public class ClientMain extends JFrame implements ActionListener,Runnable{
    CardLayout card=new CardLayout();
    Login login=new Login();
    WaitRoom wr=new WaitRoom();
    /// NetWork관련 
    Socket s;// 서버와 연결된 연결기기 
    BufferedReader in;// 서버로부터 값을 읽어 온다 
    OutputStream out;// 서버로 값을 보낸다 
    public ClientMain()
    {
    	setLayout(card);//배치
    	
    	add("LOGIN",login);
    	add("WR",wr);
    	setSize(800, 700);// 윈도우 크기
    	setVisible(true);// 윈도우를 보여달라 
    	setDefaultCloseOperation(EXIT_ON_CLOSE);// 종료
    	// 이벤트 등록 
    	login.b1.addActionListener(this);//로그인 
    	// this => 처리하는 메소드가 있는 클래스 
    	login.b2.addActionListener(this);// 로그인 취소
    	wr.tf.addActionListener(this);// 채팅 (엔터)
    	wr.b6.addActionListener(this);// 나가기 
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  try {
			   UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");

			  } catch (Exception e) {
			   e.printStackTrace();
			  }
        new ClientMain();
	}
	// 서버 연결 
	public void connection(String id,String name,String sex)
	{
		try
		{
			s=new Socket("211.63.89.121",3355);
			// 서버를 연결해서 서버 정보를 읽어 온다 (ip,port)
			in=new BufferedReader(new InputStreamReader(s.getInputStream()));
			out=s.getOutputStream();
			// 로그인 요청 
			out.write((Function.LOGIN+"|"+id+"|"+name+"|"+sex+"\n").getBytes());
		}catch(Exception ex){}
		//쓰레드를 이용해서 서버로부터 값을 읽어라 
		new Thread(this).start(); // run()을 호출한다 
	}
	// 서버에서 값을 읽어 온다
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try
		{
			while(true)
			{
				String msg=in.readLine();// 서버 응답값 받기
				StringTokenizer st=
						new StringTokenizer(msg,"|");
				int protocol=Integer.parseInt(st.nextToken());
				switch(protocol)
				{
				  case Function.LOGIN:
				  {
					  String[] data= {
						st.nextToken(),	 //ID
						st.nextToken(),	 //Name
						st.nextToken(),	 //Sex
						st.nextToken()   // 방위치 
					  };
					  wr.model2.addRow(data);
				  }
				  
				  break;
				  case Function.MYLOG:
				  {
					  card.show(getContentPane(), "WR");
				  }
				  break;
				  case Function.WAITCHAT:
				  {
					  wr.ta.append(st.nextToken()+"\n");
				  }
				  break;
				}
			}
		}catch(Exception ex){}
	}
	// 버튼 처리 (요청)
	/*
	 *    로그인 
	 *      = 이미 로그인된 사람
	 *      = 로그인하는 사람 
	 *    나가기 
	 *      = 나가는 사람
	 *      = 남아있는 사람 
	 *    방들어가기 
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==login.b1) //로그인버튼 클릭 
		{
			String id=login.tf1.getText();
			if(id.length()<1) // 입력이 안된 경우 
			{
				JOptionPane.showMessageDialog(this, "ID를 입력하세요");
				login.tf1.requestFocus();
				return; // 메소드 종료 
			}
			
			String name=login.tf2.getText();
			if(name.length()<1) // 입력이 안된 경우 
			{
				JOptionPane.showMessageDialog(this, "이름을 입력하세요");
				login.tf2.requestFocus();
				return; // 메소드 종료 
			}
			
			String sex="";
			if(login.rb1.isSelected())
				sex="남자";
			else
				sex="여자";
			
			connection(id, name, sex);
		}
		// music.jsp?cno=1
		// 
		else if(e.getSource()==login.b2) //취소
		{
			dispose(); // 메모리 삭제 
			System.exit(0);//프로그램 종료
		}
		else if(e.getSource()==wr.tf)// 채팅
		{
			String msg=wr.tf.getText(); // 입력된 채팅 문자열 읽기
			if(msg.length()<1) 
				return;
			try
			{
				// 서버로 전송 
				out.write((Function.WAITCHAT+"|"+msg+"\n").getBytes());
			}catch(Exception ex) {}
			wr.tf.setText("");
		}
		else if(e.getSource()==wr.b6)// 나가기 버튼 클릭 
		{
			try
			{
				out.write((Function.CHATEND+"|\n").getBytes());
				// 서버로 채팅을 종료한다 요청 
			}catch(Exception ex){}
		}
	}

}
