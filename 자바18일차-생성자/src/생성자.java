import javax.swing.*;
public class 생성자 extends JFrame{
    JButton b=new JButton("Click");
    생성자()
    {
    	add("North",b);
    	setSize(450, 350);
    	setVisible(true);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new 생성자();
        new 생성자();
        new 생성자();
	}

}
