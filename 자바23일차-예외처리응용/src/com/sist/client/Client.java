package com.sist.client;
import java.util.*;
import java.net.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
public class Client extends JFrame implements Runnable,ActionListener{
    JTextArea ta;
    JTextField tf;
    JButton startBtn;
    String name;
    Socket s;
    OutputStream out;
    BufferedReader in;
    public Client()
    {
    	ta=new JTextArea();
    	JScrollPane js=new JScrollPane(ta);
    	tf=new JTextField(30);
    	startBtn=new JButton("연결");
    	
    	JPanel p=new JPanel();
    	p.add(tf);
    	p.add(startBtn);
    	
    	add("Center",js);
    	add("South",p);
    	setSize(420, 500);
    	setVisible(true);
    	startBtn.addActionListener(this);
    	tf.addActionListener(this);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         new Client();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==startBtn)
		{
			name=JOptionPane.showInputDialog("이름 입력");
			try
			{
				s=new Socket("localhost",3355);
				out=s.getOutputStream();
				in=new BufferedReader(
						new InputStreamReader(s.getInputStream()));
			    new Thread(this).start();
			}catch(Exception ex) {}
		}
		else if(e.getSource()==tf)
		{
			try
			{
				String msg=tf.getText();
				if(msg.length()<1)
					return;
				out.write(("["+name+"]"+msg+"\n").getBytes());
				tf.setText("");
			}catch(Exception ex) {}
		}
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
			try
			{
				String msg=in.readLine();
				ta.append(msg+"\n");
			}catch(Exception ex){}
		}
	}

}
