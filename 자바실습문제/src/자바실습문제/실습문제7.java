package 자바실습문제;
/*
 *  7.	100점 만점으로 성적을 입력 받아 90~100이면 A,80~89이면 
        B,70~79이면 C, 60~69이면 D, 60점 이하면 F를 출력하라

 */
import java.util.*;
public class 실습문제7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("점수 입력:");
        int score=scan.nextInt();
        char opt='-';
        char c='A';
        if(score>=90)
        {
        	c='A';
        	if(score>=98)
        		opt='+';
        	else if(score<94)
        		opt='-';
        }
        else if(score>=80)
        {
        	c='B';
        	if(score>=88)
        		opt='+';
        	else if(score<84)
        		opt='-';
        }
        else if(score>=70)
        {
        	c='C';
        	if(score>=78)
        		opt='+';
        	else if(score<74)
        		opt='-';
        }
        else if(score>=60)
        {
        	c='D';
        	if(score>=68)
        		opt='+';
        	else if(score<64)
        		opt='-';
        }
        else
        	c='F';
        System.out.println("학점:"+c+""+opt);
	}

}
