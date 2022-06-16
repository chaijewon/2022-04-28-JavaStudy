package com.sist.client;
import java.awt.*;
import javax.swing.*;
public class Login extends JPanel{
    Image back;
    JLabel la1,la2,la3;
    JTextField tf1,tf2;
    JRadioButton rb1,rb2;
    JButton b1,b2;
    public Login()
    {
    	back=Toolkit.getDefaultToolkit().getImage("c:\\javaDev\\back1.jpg");
        setLayout(null);
        la1=new JLabel("ID");
        la2=new JLabel("Name");
        la3=new JLabel("성별");
        
        tf1=new JTextField();
        tf2=new JTextField();
        
        rb1=new JRadioButton("남자");
        rb2=new JRadioButton("여자");
        
        rb1.setSelected(true);
        
        ButtonGroup bg=new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        
        b1=new JButton("로그인");
        b2=new JButton("취소");
        
        // 배치 
        la1.setBounds(10, 15, 50, 30);
        tf1.setBounds(65, 15, 150, 30);
        
        la2.setBounds(10, 50, 50, 30);
        tf2.setBounds(65, 50, 150, 30);
        
        la3.setBounds(10, 85, 50, 30);
        rb1.setBounds(65, 85, 70, 30);
        rb2.setBounds(140, 85, 70, 30);
        
        JPanel p=new JPanel();
        p.add(b1);p.add(b2);
        
        p.setBounds(10, 125, 210, 35);
        
        add(la1);add(tf1);
        add(la2);add(tf2);
        add(la3);add(rb1);add(rb2);
        add(p);
    }
    
	@Override
	public void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(back, 0,0,getWidth(),getHeight(),this);
	}
    
    
}
