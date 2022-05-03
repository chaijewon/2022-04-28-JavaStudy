
public class 문제풀이9 {
	public static void main(String[] arg) 
	{
	    int num1 = 2;
	    int num2 = 7;
	    int num3; 
	    int num4; 
	    num1++; 
	    // num1=3
	    num3 = --num1; //num1=2
	    // num3=2
	    --num2;// 6 
	    num4 = num2++;//6
	    //num2=7
	    /*
	     *  num1 = 2
	     *  num2 = 7
	     *  num3 = 2
	     *  num4 = 6
	     */
	    System.out.printf("%d\n", num3);//2
	    System.out.printf("%d\n", num4);//6
	}

}
