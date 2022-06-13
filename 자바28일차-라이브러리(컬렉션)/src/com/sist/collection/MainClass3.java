package com.sist.collection;
import java.util.*;
/*
 *     Stack     /    Queue 
 *     ------        -------
 *      LIFO           FIFO 
 *      ----- 주차장     ------ 운영체제 , 네트워크 
 *       저장 : push()    opper()
 *       추출 : pop()     poll()
 *       데이터 유무 isEmpty() isEmpty()
 */
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[] colors=new String[5];
        colors[0]="red";
        colors[1]="blue";
        colors[2]="green";
        colors[3]="yellow";
        colors[4]="pink";
        // ==> index=0  , index=4
        System.out.println("====== Stack ======");
        for(int i=colors.length-1;i>=0;i--)
        {
        	System.out.println(colors[i]);
        }
        // ==> index=0  , index=0
        System.out.println("====== Queue ======");
        for(int i=0;i<colors.length;i++)
        {
        	System.out.println(colors[i]);
        }
        
        System.out.println("======= Stack 이용하기(604) =======");
        
        Stack st=new Stack();// 브라우저 (이전,다음) 
        // 값을 첨부 
        st.push("홍길동");
        st.push("심청이");
        st.push("박문수");
        /*
         *   daum 
         *   naver
         *   google  
             nate  ==> 이전 => google => naver => daum 
             -----------------> 사이트 
                                forward / back
                                ---------------
                                insert,update => 비밀번호가 틀릴때 
             브라우저 제어 : JavaScript  
             데이터 제어 : 자바
             데이터 저장 : 오라클 
             
             쓰레드 : => Ajax 
                       ----- VueJS / ReactJS
             Full Stack (Java,JavaScript)
             ---------- Back , Front                  
         */
        // 값을 출력 
        while(!st.isEmpty())
        {
        	System.out.println(st.pop());
        }
        
        System.out.println("======= Queue 이용하기(604) =======");
        Queue qu=new LinkedList();
        // 값을 추가 
        qu.offer("홍길동");
        qu.offer("심청이");
        qu.offer("박문수");
        // 값을 출력 
        while(!qu.isEmpty())
        {
        	System.out.println(qu.poll());
        }
        
	}

}






