
public class 자바배열_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 문자열 배열 
		String[] names={"홍길동","박문수","이순신","강감찬","을지문덕"};
		/*
		 *    ------------------------------------------
		 *     "홍길동"| "박문수" | "이순신"| "강감찬"|"을지문덕"
		 names------------------------------------------
		 *       0        1       2        3      4
		 *    names[0] =>저장된 메모리에 첫번째 값을 가지고 와라 
		 *    names[1] =>저장된 메모리에 두번째 값을 가지고 와라 
		 *    
		 */
		// 출력 
		for(String name:names)
		{
			System.out.println(name);
		}
		
		char[] alpha={'A','B','C','D','E'};
		for(int i:alpha)
		{
			System.out.println(i);
		}
	}

}
