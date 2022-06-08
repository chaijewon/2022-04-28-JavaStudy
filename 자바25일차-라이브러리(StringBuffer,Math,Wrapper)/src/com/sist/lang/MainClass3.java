package com.sist.lang;
/*
 *   Wrapper 클래스 
 *   ------------ 기본형(데이터형)을 클래스화 시켜서 사용이 편리하게 만든 클래스
 *   byte     =====> Byte
 *   short    =====> Short
 *   int      =====> Integer(O)
 *   long     =====> Long
 *   float    =====> Float
 *   double   =====> Double
 *   char     =====> Character(O) 
 *   boolean  =====> Boolean 
 *   ==> 기본형에 기능을 첨부 
 *       =============== 문자열을 각데이터형으로 변경 
 *       웹 / 윈도우 ==> 문자열 
 *       문자열을 해당 데이터형으로 변경해서 사용이 가능 
 *       
 *       String page="1";
 *              =========> 정수형으로 변경후에 처리 
 *       int i=Integer.parseInt(page);
 *       
 *   AutoBoxing  /  UnBoxing => Integer,Double,Boolean,Long 
 *   Integer i=10;
 *   int a=i;
 *   // 호환성 
 *   
 */
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class MainClass3 extends JFrame implements ActionListener{
    JTextField tf1,tf2,tf3;
    JButton b1,b2,b3,b4;
    public MainClass3()
    {
    	tf1=new JTextField(7);
    	tf2=new JTextField(7);
    	tf3=new JTextField(7);
    	
    	b1=new JButton("+");
    	b2=new JButton("-");
    	b3=new JButton("*");
    	b4=new JButton("/");
    	
    	JPanel p1=new JPanel();
    	p1.add(tf1);p1.add(tf2);p1.add(tf3);
    	JPanel p2=new JPanel();
    	p2.add(b1);p2.add(b2);p2.add(b3);p2.add(b4);
    	
    	add("Center",p1);
    	add("South",p2);
    	
    	setSize(350, 200);
    	setVisible(true);
    	
    	b1.addActionListener(this);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new MainClass3();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1)
		{
			String num1=tf1.getText();
			String num2=tf2.getText();
			tf3.setText(String.valueOf(Integer.parseInt(num1)
					    +Integer.parseInt(num2)));
		}
	}

}









