package com.sist.ann2;
import java.io.File;
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	ArrayList<String> clsList=
        			FileConfig.componentScan("com.sist.ann2");
        	for(String clsName:clsList)
        	{
        		
        		Class cls=Class.forName(clsName);
        		if(cls.isAnnotationPresent(Component.class)==false)
        			continue;
        		Object obj=cls.getDeclaredConstructor().newInstance();
        		System.out.println(obj);
        	}
        }catch(Exception ex){}
	}

}
