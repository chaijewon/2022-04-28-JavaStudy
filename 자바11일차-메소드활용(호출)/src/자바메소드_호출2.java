// 알파벳 1개를 => 임의의 추출 메소드 

public class 자바메소드_호출2 {
    static char randChar()
    {
    	char c=(char)((int)(Math.random()*26)+65);
    	return c;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 그냥 출력 
		/*System.out.println(randChar());
		// 소문자로 변경해서 출력
		char c=randChar();
		char res=(char)(c+32);
		System.out.println(c);
		System.out.println(res);*/
		System.out.println(randChar());
		System.out.println(randChar());
		System.out.println(randChar());
		System.out.println(randChar());
		System.out.println(randChar());
		
		
	}

}
