// 단항 : 증감 , 부정 , 형변환 
// 이항 : 산술, 논리,비교 , 대입 
// 삼항 : (조건)?값:값 ==> if~else => 소스를 줄인다(웹,게임)
public class 단항연산자_증감연산자_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        char c='A'; //char는 연산이 되면 => 정수변경후에 처리 
        c++;
        System.out.println(c);
        System.out.println(c++);//B => 출력 / 증가 
        // 증가 c='C'
        System.out.println(++c);//D
        // 증가 
        
        int a=10;
        System.out.println(a);//10
        System.out.println(a++);//10
        // a=11 => 증가된값을 기억하고 있다 
        System.out.println(a++);//11
        // a=12
        System.out.println(a++);//12
        // a=13
        System.out.println(a);//13
        // 변수는 } 에서 종료 
        // 지역변수 ==> 블록변수 (자동으로 메모리에서 해제 => 메모리 자체에 처리)
        // 스택공간에 저장 
        // 지역변수는 반드시 초기화를 한다 
	}

}
