package com.sist.util;
import java.util.regex.*;
public class MainClass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[] data={
          "bat","baby","bonus","c","cB","ca","co",
          "c.","c*","c+","car","count","date","data" 
        };
        // ==> ca co
        //1. 패턴 
        Pattern p=Pattern.compile("[^b-c].*");//|선택 => ^ b/c로 시작하는 단어는 제외하고
        // => c(0이상)  => c , ca , car count
        for(int i=0;i<data.length;i++)
        {
        	Matcher m=p.matcher(data[i]);
        	if(m.matches())
        	{
        		System.out.println(data[i]);
        	}
        }
	}

}
