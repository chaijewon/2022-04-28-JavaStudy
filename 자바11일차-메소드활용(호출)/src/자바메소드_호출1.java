
public class 자바메소드_호출1 {
    static void aaa()
    {
    	System.out.println("aaa() 진입...: 변수선언(요청처리)");//2
    	System.out.println("aaa() 기능처리: 연산/제어문처리");//3
    	System.out.println("aaa() 종료...: return 결과값 전송");//4
    	return; // 생략이 가능 (컴파일러가 자동으로 추가)
    	// void가 있는 경우에만 가능 
    	// return은 항상 맨마지막에 오는 것은 아니다 
    	/*
    	 *   static boolean ccc()
    	 *   {
    	 *      if()
    	 *        return false;// 메소드 종료
    	 *      else
    	 *        return true; // 메소드 종료 
    	 *        
    	 *        *** return 밑에는 다른 소스 코딩이 있으면 안된다 
    	 *      
    	 *   }
    	 */
    }
    static void bbb()
    {
    	System.out.println("bbb() 진입...");//5
    	System.out.println("bbb() 기능처리...");//6
    	System.out.println("bbb() 종료...");//7
    }
    static int ccc()
    {
    	return 100;
    }
    // 쉽게 (가독성)***** , 소스 가급적 적게 , 속도는 빠르다 *****
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("main() 진입...");//1
        aaa();
        bbb();// bbb()를 종료하고 원래 호출한 위치로 복귀
        aaa();
        int c=ccc();
        //int a=10
        System.out.println("c="+c);
        //System.out.println(bbb());
        System.out.println(ccc());//void인 경우에는 불가능 
        //                 ------ 리턴형이 존재해야 한다
        System.out.println("main() 종료=>프로그램 완전 종료");//8
	}

}
