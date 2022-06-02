package com.sist.inter4;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;// 내부 클래스 => 람다식 

public class GameFrame extends JFrame implements KeyListener,MouseListener{
    private GameView view=new GameView();
    public GameFrame()
    {
    	add("Center",view);
    	setSize(800,640);
    	setVisible(true);
    	//view.setFocusable(true);
    	addKeyListener(this);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new GameFrame();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
	 //if(e.getSource()==this)
	 {
		//System.out.println("aaa");
		// TODO Auto-generated method stub
		switch(e.getKeyCode())
		{
		case KeyEvent.VK_LEFT:
			view.x-=5;
			if(view.x<0)
				view.x=800;
			view.repaint();
			break;
		case KeyEvent.VK_RIGHT:
			view.x+=5;
			if(view.x>800)
				view.x=0;
			view.repaint();
			break;
		case KeyEvent.VK_UP:
			view.y-=5;
			if(view.y<0)
				view.y=640;
			view.repaint();
			break;
		case KeyEvent.VK_DOWN:
			view.y+=5;
			if(view.y>640)
				view.y=0;
			view.repaint();
			break;
		}
	 }
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
