package com.sist.ab2;
// 추상 클래스 
public abstract class Command {
   public abstract void execute(); // 메소드 선언 
   public void display()
   {
	   System.out.println("메소드 구현");
   }
}
