package com.sist.ab;
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("입력:");
        String cmd=scan.next();
        // list , insert ,update , delete , detail
        if(cmd.equals("list"))
        {
        	// 사용자가 목록 요청 
        	BoardList bl=new BoardList();
        	bl.boardList();
        }
        else if(cmd.equals("insert"))
        {
        	// 사용자가 글쓰기 요청
        	BoardInsert bi=new BoardInsert();
        	bi.boardInsert();
        }
        else if(cmd.equals("detail"))
        {
        	// 사용자가 상세보기 요청
        	BoardDetail bi=new BoardDetail();
        	bi.boardDetail();
        }
        else if(cmd.equals("update"))
        {
        	// 사용자가 수정 요청
        	BoardUpdate bi=new BoardUpdate();
        	bi.boardUpdate();
        }
        else if(cmd.equals("delete"))
        {
        	// 사용자가 삭제 요청
        	BoardDelete bi=new BoardDelete();
        	bi.boardDelete();
        }
	}

}
