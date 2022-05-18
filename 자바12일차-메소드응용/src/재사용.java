// 상속 , 내부 클래스 , 리플렉션(스프링) 
public class 재사용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //자바메소드응용_음악사이트.process();// 재사용 
		// 숫자 => 문자
		String h="공일이삼사오육칠팔구";
		String s="일공이사"; //1024
		String res="";
		for(int i=0;i<s.length();i++)
		{
			for(int j=0;j<h.length();j++)
			{
				if(s.charAt(i)==h.charAt(j))
				{
					res+=j+"";
				}
			}
		}
		System.out.println(res);
	}

}
