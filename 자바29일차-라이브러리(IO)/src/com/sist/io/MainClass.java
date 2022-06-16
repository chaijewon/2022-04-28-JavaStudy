package com.sist.io;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MainClass extends JFrame implements Runnable,ActionListener{
    JButton b=new JButton("시작");
    JProgressBar bar1=new JProgressBar();
    JProgressBar bar2=new JProgressBar();
    JProgressBar bar3=new JProgressBar();
    JProgressBar bar4=new JProgressBar();
    JLabel la1,la2,la3,la4;
    JTextField tf1,tf2,tf3,tf4;
    JLabel la=new JLabel("자리배치",JLabel.CENTER);
    public MainClass()
    {
    	tf1=new JTextField();
    	tf1.setHorizontalAlignment(JLabel.CENTER);
    	tf2=new JTextField();
    	tf2.setHorizontalAlignment(JLabel.CENTER);
    	tf3=new JTextField();
    	tf3.setHorizontalAlignment(JLabel.CENTER);
    	tf4=new JTextField();
    	tf4.setHorizontalAlignment(JLabel.CENTER);
    	
    	la1=new JLabel("2조");
    	la2=new JLabel("1조");
    	la3=new JLabel("3조");
    	la4=new JLabel("4조");
    	
    	bar1.setMaximum(100);
    	bar1.setMinimum(0);
    	bar1.setBackground(Color.white);
    	bar1.setForeground(Color.cyan);
    	bar1.setStringPainted(true);
    	
    	bar2.setMaximum(100);
    	bar2.setMinimum(0);
    	bar2.setBackground(Color.white);
    	bar2.setForeground(Color.yellow);
    	bar2.setStringPainted(true);
    	
    	bar3.setMaximum(100);
    	bar3.setMinimum(0);
    	bar3.setBackground(Color.white);
    	bar3.setForeground(Color.pink);
    	bar3.setStringPainted(true);
    	
    	bar4.setMaximum(100);
    	bar4.setMinimum(0);
    	bar4.setBackground(Color.white);
    	bar4.setForeground(Color.magenta);
    	bar4.setStringPainted(true);
    	
    	setLayout(null);
    	la.setBounds(10, 20, 630, 60);
    	la.setFont(new Font("굴림체", Font.BOLD, 40));
    	add(la);
    	la1.setBounds(10,100,60, 30);
    	bar1.setBounds(75,100, 450, 30);
    	tf1.setBounds(530, 100, 70, 30);
    	add(la1);add(bar1);add(tf1);
    	
    	la2.setBounds(10,140,60, 30);
    	bar2.setBounds(75,140, 450, 30);
    	tf2.setBounds(530, 140, 70, 30);
    	add(la2);add(bar2);add(tf2);
    	
    	la3.setBounds(10,180,60, 30);
    	bar3.setBounds(75,180, 450, 30);
    	tf3.setBounds(530, 180, 70, 30);
    	add(la3);add(bar3);add(tf3);
    	
    	la4.setBounds(10,220,60, 30);
    	bar4.setBounds(75,220, 450, 30);
    	tf4.setBounds(530, 220, 70, 30);
    	add(la4);add(bar4);add(tf4);
    	
    	JPanel p=new JPanel();
    	p.add(b);
    	
    	p.setBounds(10,260 , 630, 35);
    	add(p);
    	setSize(650, 340);
    	setVisible(true);
    	b.addActionListener(this);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         new MainClass();
	}
    public void go()
    {
    	try
    	{
    		int a=(int)(Math.random()*71)+30;
    		int b=(int)(Math.random()*71)+30;
    		int c=(int)(Math.random()*71)+30;
    		int d=(int)(Math.random()*71)+30;
    		
    		for(int i=0;i<=a;i++)
    		{
    			bar1.setValue(i);
    			Thread.sleep(100);
    		}
    		
    		for(int i=0;i<=b;i++)
    		{
    			bar2.setValue(i);
    			Thread.sleep(100);
    		}
    		
    		for(int i=0;i<=c;i++)
    		{
    			bar3.setValue(i);
    			Thread.sleep(100);
    		}
    		
    		for(int i=0;i<=d;i++)
    		{
    			bar4.setValue(i);
    			Thread.sleep(100);
    		}
    		
    		tf1.setText(a+"%");
    		tf2.setText(b+"%");
    		tf3.setText(c+"%");
    		tf4.setText(d+"%");
    	}catch(Exception ex) {}
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b)
		{
			new Thread(this).start();
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		go();
	}

}
