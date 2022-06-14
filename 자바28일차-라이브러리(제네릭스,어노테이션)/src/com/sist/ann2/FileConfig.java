package com.sist.ann2;

import java.util.ArrayList;
import java.io.*;
public class FileConfig {
  /*public static void main(String[] args) {
	  ArrayList<String> list=componentScan("com.sist.ann2");
	  for(String s:list)
	  {
		  System.out.println(s);
	  }
  }*/
  public static ArrayList<String> componentScan(String pack)
  {
	  ArrayList<String> data=new ArrayList<String>();
	  try
	  {
		  String path="C:\\javaDev\\javaStudy\\자바28일차-라이브러리(제네릭스,어노테이션)\\src\\";
		  path=path+pack.replace(".", "\\");
		  File dir=new File(path);
		  File[] files=dir.listFiles();
		  for(File f:files)
		  {
			  //System.out.println(f.getName());
			  String fname=f.getName();
			  fname=fname.substring(0,fname.lastIndexOf("."));
			  String ff=pack+"."+fname;
			  data.add(ff);
		  }
	  }catch(Exception ex){}
	  return data;
  }
}
