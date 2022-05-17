// 반복소스를 제거할 수 있다 => 스프링 (자동 => Callback => AOP)
/*
 *   1. 재사용 => 필요시마다 호출해서 사용이 가능 
 *   2. 반복 소스 => 제거 
 *   3. 가독성 (분석쉽게) => 수정 , 다른 추가 
 *      구조적인 프로그램 
 *   ---------------------------------- 메소드 제작 
 */
public class 메소드제작_4 {
    static void star()
    {
    	for(int i=1;i<=17;i++)
        {
        	System.out.print("★");
        }
        System.out.println();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*for(int i=1;i<=17;i++)
        {
        	System.out.print("★");
        }
        System.out.println();*/
		star();
        System.out.println("이름:홍길동");
        /*for(int i=1;i<=17;i++)
        {
        	System.out.print("★");
        }
        System.out.println();*/
        star();
        System.out.println("주소:서울시 강남구");
        /*for(int i=1;i<=17;i++)
        {
        	System.out.print("★");
        }
        System.out.println();*/
        star();
        System.out.println("전화:010-1111-1111");
        /*for(int i=1;i<=17;i++)
        {
        	System.out.print("★");
        }*/
        star();
	}

}
