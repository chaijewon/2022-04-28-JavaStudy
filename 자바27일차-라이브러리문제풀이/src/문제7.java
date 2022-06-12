import java.util.StringTokenizer;

public class 문제7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String colors="red,blue,black,yellow,pink";
        StringTokenizer st=new StringTokenizer(colors,","); 
        
        System.out.println(   st.countTokens());// 단어 갯수
        while(   st.hasMoreTokens()         ) // 
        {
        	System.out.println( st.nextToken()      ); // 단어를 읽어 온다 
        }
        

	}

}
