package com.sist.client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//// 윈도우 
import java.util.*;
import java.net.*;
import java.io.*;
//// 네트워크 관련 
public class ClientMain extends JFrame{
    CardLayout card=new CardLayout();
    Login login=new Login();
    WaitRoom wr=new WaitRoom();
    public ClientMain()
    {
    	setLayout(card);//배치
    	add("WR",wr);
    	add("LOGIN",login);
    	setSize(800, 700);// 윈도우 크기
    	setVisible(true);// 윈도우를 보여달라 
    	setDefaultCloseOperation(EXIT_ON_CLOSE);// 종료 
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

}
