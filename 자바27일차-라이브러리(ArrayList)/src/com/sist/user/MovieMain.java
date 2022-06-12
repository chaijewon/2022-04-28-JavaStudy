package com.sist.user;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import com.sist.movie.MovieManager;

import java.awt.*;
import java.awt.event.*;
public class MovieMain extends JFrame implements ActionListener{
    MovieList mList=new MovieList();
    MovieDetail mDetail=new MovieDetail();
    CardLayout card=new CardLayout();
    int curpage=1;
    int totalpage=0;
    public MovieMain()
    {
    	setLayout(card);
    	add("LIST",mList);
    	add("DETAIL",mDetail);
    	setSize(1024, 810);
    	setVisible(true);
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    	
    	mList.moviePrint(1);
    	totalpage=MovieManager.movieTotalPage();
    	mList.b1.addActionListener(this);
    	mList.b2.addActionListener(this);
    }
    
    public static Image getImage(ImageIcon ii,int w,int h)
    {
    	Image dimg = ii.getImage().getScaledInstance(w, h,
    	        Image.SCALE_SMOOTH);
    	return dimg;
    } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new MovieMain();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==mList.b1)
		{
			if(curpage>1)
			{
				curpage--;
				mList.moviePrint(curpage);
			}
		}
		else if(e.getSource()==mList.b2)
		{
			if(curpage<totalpage)
			{
				curpage++;
				mList.moviePrint(curpage);
			}
		}
	}
	

}
