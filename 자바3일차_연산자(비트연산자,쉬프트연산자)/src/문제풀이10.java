/*
 *   int a=10;
 *   a=11;
 *   a=12;
 *   a=10;
 *   
 */
public class 문제풀이10 {
	public static void main(String[] arg) 
	{
	    int i = 0; // i=0 => i=3 => i=4 => re=i => re=4
	    int re = 0;
	    i=3;
        re = ++i;
        // re => 4 , i=4
        System.out.println("re:"+re + ", i:"+i);//4,4
        // i=4 => i=3
        i = 3;
        re = i++; // re=3 , i=4
        System.out.println("re:"+re + ", i:"+i);//3,4

	}
}
