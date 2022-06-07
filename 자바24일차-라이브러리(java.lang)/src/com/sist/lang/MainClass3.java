package com.sist.lang;
class Student
{
    int id;
	@Override
	public boolean equals(Object obj) {
		boolean bCheck=false;
		if(obj instanceof Student)
		{
			bCheck = id==((Student)obj).id; // 형변환 
		}
		else
		{
			bCheck=false;
		}
		return bCheck;
	}
	// 초기값 
	public Student(int id)
	{
		this.id=id;
	}
	
}
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student s1=new Student(100);
        Student s2=new Student(100);
        System.out.println("s1="+s1);
        System.out.println("s2="+s2);
        // == (주소값을 비교) 
        /*
         *   s1=com.sist.lang.Student@5e91993f
             s2=com.sist.lang.Student@1c4af82c
         */
        if(s1==s2)
        	System.out.println("s1과 s2가 같다");
        else
        	System.out.println("s1과 s2는 다르다 ");
        // => id값을 비교 (값을 비교)
        if(s1.equals(s2))
        	System.out.println("s1과 s2가 같다");
        else
        	System.out.println("s1과 s2는 다르다 ");
        // String => 문자열 (equals)
	}

}
