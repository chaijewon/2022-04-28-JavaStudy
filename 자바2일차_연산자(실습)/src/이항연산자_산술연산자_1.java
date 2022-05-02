// 사칙연산 (+ , - , * , /)
// 정수 두개를 받아서 사칙연산 출력 
public class 이항연산자_산술연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num1=(int)(Math.random()*100)+1;
        // 임의수를 추출 (컴퓨터) 
        /*
         *    (int)(Math.random()*100)+1
         *         -------------------
         *                1 => 0.0~0.99*100 => 0.0~99.0
         *                     -------- double
         *    -----
         *      2 => 0~99
         *                            ---
         *                             3 => 1~100
         */
        int num2=(int)(Math.random()*100)+1; //1~100
        
        System.out.println("덧셈:"+(num1+num2));//100100
        /*
         *    "덧셈:"+num1+num2
         *    num1=90
         *    num2=80
         *    "덧셈"+num1
         *    =============> "덧셈:"+(90+80)
         *    => "덧셈:9080"        "덧셈:"+170
         */
        // () 연산자
        System.out.println("num1="+num1);
        System.out.println("num2="+num2);
        System.out.println("뺄셈:"+(num1-num2));
        System.out.println("곱셈:"+num1*num2); // + , -
        System.out.printf("나누셈:%.2f",num1/(double)num2);// +,- 
        // 필요시마다 형변환을 한다 , 필요시에 연산순위 결정 ()
        // 소수점이 필요할 경우에는 double형 나눈다 
	}

}
