package com.sist.review;
import java.awt.Font;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class ReviewList extends JFrame{
   JTable table;
   DefaultTableModel model;
   JMenuItem newBtn,endBtn,updateBtn,deleteBtn;
   JLabel titleLa;
   
   public ReviewList()
   {
	   titleLa=new JLabel("리뷰",JLabel.CENTER);
	   titleLa.setFont(new Font("맑은 고딕",Font.BOLD, 45));
	   String[] col={"번호","리뷰","작성자","작성일","별점"};
	   String[][] row=new String[0][5];
	   model=new DefaultTableModel(row,col);
	   table=new JTable(model);
	   JScrollPane js=new JScrollPane(table);
	   
	   newBtn=new JMenuItem("새글");
	   updateBtn=new JMenuItem("수정");
	   deleteBtn=new JMenuItem("삭제");
	   endBtn=new JMenuItem("종료");
	   
	   JMenuBar bar=new JMenuBar();
	   JMenu menu=new JMenu("리뷰");
	   bar.add(menu);
	   menu.add(newBtn);
	   menu.add(updateBtn);
	   menu.add(deleteBtn);
	   menu.addSeparator();
	   menu.add(endBtn);
	   
	   setJMenuBar(bar);
	   
	   setLayout(null);
	   titleLa.setBounds(10,15,620,50);
	   js.setBounds(10, 70, 620, 380);
	   
	   add(titleLa);
	   add(js);
	   setSize(660, 520);
	   setVisible(true);
   }
   public static void main(String[] args) {
	   new ReviewList();
   }
}
