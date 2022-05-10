/*
 *  1)	100점 만점으로 성적을 입력 받아 90~100이면 A,80~89이면 B,
 *      70~79이면 C, 60~69이면 D, 
 *      60점 이하면 F를 출력하라 (switch~case 사용)
 *      
 *      1. switch에서 사용하는 데이터 
 *         정수(상수) , 문자 , 문자열 
 *      2. 필요시에는 break를 사용하지 않을 수 있다 
 *         => 처리 내용이 같은 경우에는 break를 사용하지 않는다 
 *         
 *      3. 형식)
 *         switch(정수/문자/문자열)
 *         {
 *           case 값1:
 *              처리문장1;
 *              break
 *           case 값2:
 *             
 *           case 값3:
 *              처리문장2;
 *              break;
 *           default: case에 지정되지 않은 값을 처리 
 *         }
 */
import java.util.Scanner;
public class 제어문_문제풀이_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("점수 입력:");
        int score=scan.nextInt();
        char opt='0';
        char h='A';
        //score=score/10;
        /*
         *   int a=100;
         *   a/10; 
         */
        switch(score/10)//case문장을 줄인다 
        {
           case 100:
           case 9:
        	   h='A';
        	   if(score>=98)
        		   opt='+';
        	   else if(score<94)
        		   opt='-';
        	   break;
           case 8:
        	   h='B';
        	   if(score>=88)
        		   opt='+';
        	   else if(score<84)
        		   opt='-';
        	   break;
           case 7:
        	   h='C';
        	   if(score>=78)
        		   opt='+';
        	   else if(score<74)
        		   opt='-';
        	   break;
           case 6:
        	   h='D';
        	   if(score>=68)
        		   opt='+';
        	   else if(score<64)
        		   opt='-';
        	   break;
          default: h='F';
        }
        System.out.println(h+""+opt);
	}

}






