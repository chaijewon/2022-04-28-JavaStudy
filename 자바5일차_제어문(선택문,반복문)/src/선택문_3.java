// 3,4,5 => 봄 , 6,7,8 => 여름 , 9,10,11 => 가을 , 12 ,1, 2 겨울 
import java.util.Scanner;
public class 선택문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("달 입력(1~12):");
        int month=scan.nextInt();//149page에 나오는 예제 
        
        switch(month)
        {
            // if(month==3 || month==4 || month==5)
            case 3:
        	case 4:
            case 5:
            	System.out.println("봄");
            	break;
            case 6: case 7: case 8:
            	// if(month==6 || month==7 || month==8)
            	System.out.println("여름");
            	break;
            case 9: case 10: case 11:
            	System.out.println("가을");
            	break;
            case 1:case 2: case 12:
            	System.out.println("겨울");
            	break;
        }
	}

}
