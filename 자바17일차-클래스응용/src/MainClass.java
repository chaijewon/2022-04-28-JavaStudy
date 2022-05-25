class A
{
	int a;
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        A[] alist=new A[10];//2개 null
        for(int i=0;i<8;i++)
        {
        	//A aa=new A();
        	//aa.a=i+1;
        	//alist[i]=aa;
        	alist[i]=new A();
        	alist[i].a=i+1;
        }
        
        for(A aa:alist)
        {
        	if(aa!=null)
        	System.out.println(aa.a);
        }
	}

}
