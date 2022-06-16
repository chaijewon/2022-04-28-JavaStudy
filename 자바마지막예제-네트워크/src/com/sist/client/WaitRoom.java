package com.sist.client;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
public class WaitRoom extends JPanel{
     JTable table1,table2;
     DefaultTableModel model1,model2;//table에서 데이터 제어
     JTextArea ta;
     JTextField tf;
     JButton b1,b2,b3,b4,b5,b6;
     public WaitRoom()
     {
    	 ta=new JTextArea();
    	 JScrollPane js1=new JScrollPane(ta);
    	 ta.setEditable(false);
    	 
    	 tf=new JTextField();
    	 b1=new JButton("방만들기");
    	 b2=new JButton("방들어가기");
    	 b3=new JButton("쪽지보내기");
    	 b4=new JButton("정보보기");
    	 b5=new JButton("뮤직");
    	 b6=new JButton("나가기");
    	 
    	 String[] col1={"방이름","상태","인원"};
    	 String[][] row1=new String[0][3];
    	 model1=new DefaultTableModel(row1,col1);
    	 table1=new JTable(model1);
    	 JScrollPane js2=new JScrollPane(table1);
    	 
    	 String[] col2={"ID","이름","성별","위치"};
    	 String[][] row2=new String[0][3];
    	 /*
    	  *   내부클래스 
    	  *   --------
    	  *   쓰레드 => 멤버클래스 (빅데이터,AI)
    	  *   // 웹 => 상속(X) => 오라클 연동 ==> MusicDAO
    	  *   class Server
    	  *   {
    	  *      Vector waitVc=new Vector() 
    	  *       => Server,Client 공동으로 사용되는 변수,메소드
    	  *      class Client extends Thread
    	  *      {
    	  *         
    	  *      }
    	  *   }
    	  *   윈도우 => 익명의 클래스 
    	  */
    	 model2=new DefaultTableModel(row2,col2)
         {

    		// 편집 => 편집방지 (오버라이딩)
			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}
    		 // 익명의 클래스 => 상속없이 오버라이딩 
    		 
    	 };
    	 table2=new JTable(model2);
    	 JScrollPane js3=new JScrollPane(table2);
    	 
    	 setLayout(null);
    	 // 직접 배치 
    	 js2.setBounds(10,15,450, 250);
    	 add(js2);
    	 js3.setBounds(10,275, 450, 340);
    	 add(js3);
    	 
    	 js1.setBounds(470, 15, 300, 350);
    	 add(js1);
    	 tf.setBounds(470, 375 , 300, 30);
    	 add(tf);
    	 
    	 JPanel p=new JPanel();
    	 p.add(b1);p.add(b2);p.add(b3);
    	 p.add(b4);p.add(b5);p.add(b6);
    	 p.setLayout(new GridLayout(3, 2,5,5));
    	 p.setBounds(470, 415, 300, 190);
    	 add(p);
     }
}





