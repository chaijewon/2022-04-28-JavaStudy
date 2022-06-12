package com.sist.user;
import java.util.*;
import com.sist.movie.*;
public class MainClass {
   
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("페이지 입력:");
		int page=scan.nextInt();
		MovieManager mm=new MovieManager();
		ArrayList list=mm.movieListData(page);
		for(Object obj:list)
		{
			Movie m=(Movie)obj;
			System.out.println(m.getMno()+"."+m.getTitle());
		}
	}

}
