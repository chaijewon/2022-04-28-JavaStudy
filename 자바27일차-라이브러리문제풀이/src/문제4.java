
public class 문제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rowSize=10; // 한페이지에 출력할 갯수 
        int count=37; 
        /*int total=count/rowSize;//3
        if(count%rowSize>0)
        	total++;
        System.out.println("총페이지:"+total);*/
        int total=(int)(Math.ceil(count/10.0));
        System.out.println("총페이지:"+total);
        for(int i=1;i<=total;i++)
        {
        	System.out.print(i+" ");
        }
        	

	}

}
