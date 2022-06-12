package com.sist.user;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import com.sist.movie.*;
import java.util.*;
import java.net.*;
public class MovieList extends JPanel{
   JLabel[][] pan=new JLabel[2][4];
   MovieManager mgr=new MovieManager();
   JLabel la=new JLabel("네이버 영화",JLabel.CENTER);
   JButton b1=new JButton("이전");
   JButton b2=new JButton("다음");
   JLabel pageLa=new JLabel("0 page / 0 pages");
   JPanel p=new JPanel();
   public MovieList()
   {
	   setLayout(null);
	   
	   for(int i=0;i<2;i++)
	   {
		   for(int j=0;j<4;j++)
		   {
			   pan[i][j]=new JLabel();
			   p.add(pan[i][j]);
		   }
	   }
	   //la.setFont(new Font("맑은 고딕",Font.BOLD,45));
	   la.setBounds(10, 15, 1004, 50);
	   add(la);
	   p.setBounds(10, 75, 1000, 650);
	   add(p);
	   
	   JPanel p1=new JPanel();
	   p1.add(b1);
	   p1.add(pageLa);
	   p1.add(b2);
	   
	   p1.setBounds(10, 730, 1004, 35);
	   add(p1);
   }
   public void moviePrint(int page)
   {
	  try
	  {
	   ArrayList list=mgr.movieListData(page);
	   int k=0;
	   for(int i=0;i<2;i++)
	   {
		   for(int j=0;j<4;j++)
		   {
			   Movie m=(Movie)list.get(k);
			   URL url=new URL(m.getPoster());
			   ImageIcon icon=new ImageIcon(url);
			   Image img=MovieMain.getImage(icon, 
					   230, 300);
			   pan[i][j].setIcon(new ImageIcon(img));
			   pan[i][j].setToolTipText(m.getTitle());
			   k++;
		   }
	   }
	   pageLa.setText(page+ "page / "+MovieManager.movieTotalPage()+" pages");
	  }catch(Exception ex){ex.printStackTrace();}
   }
}
