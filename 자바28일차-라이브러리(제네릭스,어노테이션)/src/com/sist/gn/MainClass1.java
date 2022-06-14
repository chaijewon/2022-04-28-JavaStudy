package com.sist.gn;
/*
 *     제네릭스 타입 ==> 은퇴하는 날 (C => 템플릿) Kotlin , Python 
 *     ---------
 *       -> JDK1.5 이상 
 *       -> 객체의 타입의 안정성
 *       -> 형변환을 하지 않기 때문에 소스가 간결 
 *       
 *     형식)
 *          ArrayList<String>  => 타입 전체가 변경 
 *                    Object => String
 *          <> => 기본형은 사용 할 수 없다 
 *          <int> (X) ===> <Integer>
 *          <double> (X) => <Double>
 *          <boolean>   ==> <Boolean> ==> Wrapper 
 *          <class형만 가능>
 *          
 *          T => Type (클래스)
 *          E => Element (클래스)
 *          V => Value (클래스)
 *          --------------------- default Object
 *          K => Key (클래스)
 *          
 *          Map<K,V>
 *          Vector<E>
 *          ArrayList<E> 
 *          Box<String>
 *          Box<Integer>
 *          => 메소드(리턴형 , 매개변수) => 데이터형을 한번에 변경 
 *          => 임시데이터형을 설정 => 지정된 클래스로 변경 
 *          class Box<T>
 *          {
 *             Integer t;
 *             public void setT(Integer t)
 *             {
 *                 this.t=t;
 *             }
 *             public Integer getT()
 *             {
 *                 return t;
 *             }
 *          }
 *          
 *     어노테이션   ==> 스프링 , 스프링부트 
 *     -------
 */
import java.util.*;
class Box<E>
{
	E t;
	public void setT(E t)
	{
		this.t=t;
	}
	public E getT()
	{
		return t;
	}
}
public class MainClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList list=new ArrayList();
        list.add("hong1");
        list.add("hong2");
        list.add("hong3");
        list.add("hong4");
        list.add("hong5");
        //list.add(100);
        for(int i=0;i<list.size();i++)
        {
        	String name=(String)list.get(i);
        	System.out.println(name);
        }
        
        Box box=new Box();
        Box<String> box1=new Box<String>();
       
        Box<Integer> box2=new Box<Integer>();
        
        
	}

}
