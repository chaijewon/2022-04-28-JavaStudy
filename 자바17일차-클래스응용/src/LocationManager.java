
import java.io.FileReader;
import java.util.StringTokenizer;
// LocationManager.loc
// LocationManager l=new LocationManager()
public class LocationManager {
	
	static Location[] loc=new Location[273];
	
    static
    {
    	try
        {
        	FileReader fr=new FileReader("c:\\javaDev\\seoul_location.txt");
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
        		loc[k]=new Location();
        		loc[k].no=Integer.parseInt(st.nextToken());
        		loc[k].title=st.nextToken();
        		loc[k].msg=st.nextToken();
        		loc[k].address=st.nextToken();
        		
        		//System.out.println("=======================");
        		k++;
        	}
        }catch(Exception ex){}
    }
}
