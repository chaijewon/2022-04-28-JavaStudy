// 정수를 3개를 받아서 출력 
// 변수 => 3개를 저장할 변수(메모리) => 변수(한개만 저장할 수 있다)
import java.util.Scanner; // 키보드로 입력값을 읽어와서 메모리 저장 
public class MainClass3 {
    // 사용자 입력값을 받아서 처리 
	// 1. 명시적 (선언과 동시에 초기값)
	// 2. 입력값을 받아서 변수초기화
	// 3. 랜덤 => 임의로 수 추출 = (0~100) => 게임 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Scanner는 클래스 => 클래스를 메모리에 저장해야 사용이 가능 
		//                   ---------------- new
		Scanner scan=new Scanner(System.in);
		System.out.print("국어 영어 수학 점수 입력:(89 90 90)");
		int kor=scan.nextInt();
		int eng=scan.nextInt();
		int math=scan.nextInt();
		// 저장된 데이터를 출력 
		System.out.printf("%5d%5d%5d",kor,eng,math);
	}

}
