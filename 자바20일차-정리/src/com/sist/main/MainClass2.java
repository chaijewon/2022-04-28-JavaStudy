package com.sist.main;
// 생성자 => 객체 생성을 제한할 수 있다 : 메모리 누수 방지 (싱글턴 패턴)
/*
 *   변수 => private => getter/setter => 메소드를 이용해서 읽기/쓰기
 *   메소드 , 클래스 ,생성자 => public 
 *   => 348page
 *   
 *   1. 데이터형 => 데이터 저장 목적 (캡슐화) 
 *   2. 기능형 
 */
class DataBase
{
	private static DataBase db;
	public static DataBase newInstance()
	{
		if(db==null)
			db=new DataBase();
		return db;
	}
}
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * DataBase db=new DataBase(); System.out.println("db="+db); DataBase db1=new
		 * DataBase(); System.out.println("db1="+db1); DataBase db2=new DataBase();
		 * System.out.println("db2="+db2);
		 */
		/*DataBase db1=DataBase.newInstance();
		System.out.println("db1="+db1);
		DataBase db2=DataBase.newInstance();
		System.out.println("db2="+db2);
		DataBase db3=DataBase.newInstance();
		System.out.println("db3="+db3);*/
		for(int i=0;i<50;i++)
		{
			DataBase db=DataBase.newInstance();
			System.out.println("db="+db);
		}
		
	}

}
