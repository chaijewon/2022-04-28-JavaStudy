package com.sist.util;

public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[] arr={"10","13","20","25","30"};
        /*String res="";
        for(int i=0;i<arr.length;i++)
        {
        	res+=arr[i]+",";
        }
        res=res.substring(0,res.lastIndexOf(","));
        System.out.println(res);*/
        String res=String.join(",", arr);
        System.out.println(res);
	}

}
