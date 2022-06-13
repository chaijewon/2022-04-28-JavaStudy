package com.sist.collection;
import java.util.*; 
public class MainClass9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // ArrayList => 복사 => 웹 (데이터 => 오라클) 
		ArrayList list=new ArrayList();
		for(int i=1;i<=10;i++)
		{
			int k=(int)(Math.random()*9)+1;
			list.add(String.valueOf(k));
		}
		Iterator it=list.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		// ArrayList에서 복사  => ArrayList에 있는 데이터의 중복 제거 
		HashSet set=new HashSet();
		set.addAll(list);//list 안에 있는 모든 데이터를 저장(중복을 제거)
		/*for(Object obj:list)
		{
			set.add(obj);
		}*/
		it=set.iterator();
		System.out.println("====== 중복 제거후 데이터 =====");
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		
		// ArrayList로 변경 ==> 브라우저로 전송 
		ArrayList list2=new ArrayList();
		list2.add(set);
		System.out.println("=============");
		it=list2.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
	}

}
