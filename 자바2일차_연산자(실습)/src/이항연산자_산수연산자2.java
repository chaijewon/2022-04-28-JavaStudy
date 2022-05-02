// % => 나머지 값을 가지고 온다 (배수 , 화페매수 구하기) => 요일구하기 
// 윤년 => % => 조건문 
// 남는 값이 ==> 왼쪽부호가 남는다 
public class 이항연산자_산수연산자2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=5;
        int b=2;
        System.out.printf("%d %% %d = %d\n",a,b,a%b);
        System.out.printf("%d %% %d = %d\n",-a,b,-a%b);
        System.out.printf("%d %% %d = %d\n",a,-b,a%-b);
        System.out.printf("%d %% %d = %d\n",-a,-b,-a%-b);
        /*
         *   5 % 2 = 1  ==> 4/2+1
			-5 % 2 = -1 ==> -4/2-1
			 5 % -2 = 1 ==> 4/-+1
			-5 % -2 = -1 ==> -4/-2-1
         */
        // 369/100 => 3
        // 369%100 => 69/10 => 6
        // 369%10 ==> 9
        int num=369;  // 백단위:3,십단위:6,일단위:9 => %
        System.out.println("백단위:"+(num/100));
        System.out.println("십단위:"+(num%100)/10);
        System.out.println("단단위:"+(num%10));
        
        //주의점 : 0으로 나눌 경우에는 에러
        //System.out.println(100/0);
        
	}

}
