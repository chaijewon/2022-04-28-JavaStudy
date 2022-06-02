package com.sist.inter4;

import javax.swing.*;
import java.awt.*;
public class GameView extends JPanel{
   private Image back;
   private Image move;
   int x=30;
   int y=150;
   public GameView()
   {
	   back=Toolkit.getDefaultToolkit().getImage("c:\\javaDev\\back.jpg");
       move=Toolkit.getDefaultToolkit().getImage("c:\\javaDev\\move.jpg");
       
   }
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(back, 0, 0, getWidth(), getHeight(), this);
		g.drawImage(move, x, y, 150, 100,this);
	}
}
