package com.sist.main;
import javax.swing.*;
import javax.swing.table.*;
// 단일 상속 => 오버라이딩 (상속) => 익명의 클래스 
public class StudentMain extends JFrame{
    JTable table;
    DefaultTableModel model;
    public StudentMain()
    {
    	String[] col={"학번","이름","국어","영어","수학"};
    	String[][] row=new String[0][5];
    	// 익명의 클래스 
    	model=new DefaultTableModel(row,col)
    	{

			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}
    	     	
    	};
    	table=new JTable(model);
    	JScrollPane js=new JScrollPane(table);
    	add("Center",js);
    	setSize(640, 480);
    	String[] data={"1","홍길동","90","80","90"};
    	model.addRow(data);
    	setVisible(true);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new StudentMain();
	}

}
