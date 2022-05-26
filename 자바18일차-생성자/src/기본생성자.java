import java.io.FileReader;

/*
 *    기본 생성자 
 *    1. 매개변수가 없는 생성자 
 *    2. 생성자가 없는 경우 => 컴파일러가 자동 생성 (기본 생성자)
 *    3. 역할 => 멤버변수의 초기화 
 *              시작동시에 동작이 가능하게 만든다 
 *    4. 형식
 *       클래스명(){}
 */
class Student{
	/*String name="홍길동";
	int kor=80,eng=90,math=90; //명시적 초기화 
	// 시작과 동시에 출력할 수 없다 (동작이 불가능)
	Student() {
		System.out.println("name:"+name);
		System.out.println("kor:"+kor);
		System.out.println("eng:"+eng);
		System.out.println("math:"+math);
	}*/
	String name="홍길동";
	int kor=90,eng=80,math=70; // final => 데이터베이스 URL 
	Student() {
		try
		{
			FileReader fr=new FileReader("c:\\javaDev\\student.txt");
			int i=0;
			String data="";
			while((i=fr.read())!=-1)
			{
				data+=(char)i;
			}
			fr.close();
			
			String[] ss=data.split("\\|");
			name=ss[0];
			kor=Integer.parseInt(ss[1]);
			eng=Integer.parseInt(ss[2]);
			math=Integer.parseInt(ss[3]);
			// 데이터베이스 
		}catch(Exception ex) {}
	}
}
public class 기본생성자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		System.out.println("name:"+s.name);
		System.out.println("kor:"+s.kor);
		System.out.println("eng:"+s.eng);
		System.out.println("math:"+s.math);
        /*Student s1=new Student();
        s1.name="홍길동";
        System.out.println("이름:"+s1.name);
        
        Student s2=new Student();
        s2.name="심청이";
        System.out.println("이름:"+s2.name);
        Student s3=new Student();
        s3.name="박문수";
        System.out.println("이름:"+s3.name);*/
        
	}

}
