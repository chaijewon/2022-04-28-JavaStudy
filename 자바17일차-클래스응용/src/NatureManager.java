
import java.io.FileReader;
import java.util.StringTokenizer;

public class NatureManager {
	static Nature[] nature=new Nature[110];
    static 
    {
    	try
        {
        	FileReader fr=new FileReader("c:\\javaDev\\seoul_nature.txt");
        	StringBuffer sb=new StringBuffer();
        	int i=0;
        	while((i=fr.read())!=-1)
        	{
        		
        		sb.append((char)i);
        	}
        	//System.out.println(sb.toString());
        	
        	String[] mo=sb.toString().split("\n");
        	int k=0;
        	
        	for(String s:mo)
        	{
        		//System.out.println(s);
        		StringTokenizer st=new StringTokenizer(s,"|");
        		nature[k]=new Nature();
        		nature[k].no=Integer.parseInt(st.nextToken());
        		nature[k].title=st.nextToken();
        		nature[k].msg=st.nextToken();
        		nature[k].address=st.nextToken();
        		
        		//System.out.println("=======================");
        		k++;
        	}
        }catch(Exception ex){}
    }
}
