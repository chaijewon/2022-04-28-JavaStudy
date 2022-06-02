package com.sist.ab2;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("메뉴 선택:");
		String cmd=scan.next();
        Container c=new Container();
        Command cc=(Command)c.getBean(cmd);
        cc.execute();
	}

}
