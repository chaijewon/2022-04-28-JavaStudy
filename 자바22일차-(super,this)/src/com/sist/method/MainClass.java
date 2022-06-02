package com.sist.method;

import java.util.Scanner;

import com.sist.ab.BoardDelete;
import com.sist.ab.BoardDetail;
import com.sist.ab.BoardInsert;
import com.sist.ab.BoardList;
import com.sist.ab.BoardUpdate;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
        System.out.print("입력:");
        String cmd=scan.next();
        // list , insert ,update , delete , detail
        Board bi=new Board();
        if(cmd.equals("list"))
        {
        	// 사용자가 목록 요청 
        	
        	bi.boardList();
        }
        else if(cmd.equals("insert"))
        {
        	// 사용자가 글쓰기 요청
        	
        	bi.boardInsert();
        }
        else if(cmd.equals("detail"))
        {
        	// 사용자가 상세보기 요청
        	
        	bi.boardDetail();
        }
        else if(cmd.equals("update"))
        {
        	// 사용자가 수정 요청
        	
        	bi.boardUpdate();
        }
        else if(cmd.equals("delete"))
        {
        	// 사용자가 삭제 요청
        	
        	bi.boardDelete();
        }
	}

}
