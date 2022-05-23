import java.util.Scanner;
class Music{
	int rank;
	String title;
	String singer;
	String album;
	String state;
	int modify;
}
public class 데이터저장_뮤직클래스 {
	// Call By Reference
    static void musicDataInput(Music[] m)
    {
    	for(int i=0;i<m.length;i++)
    	{
    		m[i]=new Music(); // 50개의 공간을 만든다 
    		m[i].rank=i+1;
    		m[i].title=뮤직데이터베이스.title[i];
    		m[i].singer=뮤직데이터베이스.singer[i];
    		m[i].album=뮤직데이터베이스.album[i];
    		m[i].state=뮤직데이터베이스.state[i];
    		m[i].modify=뮤직데이터베이스.modify[i];
    	}
    }
    //찾기 
    static void musicFind(Music[] music,String ss)
    {
    	for(Music m:music)
    	{
    		if(m.title.contains(ss))
    		{
    			System.out.println(m.rank+"."
            			+m.title);
            	System.out.println(m.singer);
            	System.out.println(m.album);
            	System.out.println(m.state);
            	System.out.println(m.modify);
            	System.out.println("=========================");
    		}
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Music[] music=new Music[50]; // ArrayList<Music> 컬렉션
        // 클래스는 null
        // int[] a=new int[10] => 0,.....
        musicDataInput(music);
        //데이터 출력 
        for(Music m:music)// for-each를 이용해서 실제 데이터를 읽어 온다 
        {
        	System.out.println(m.rank+"."
        			+m.title);
        	System.out.println(m.singer);
        	System.out.println(m.album);
        	System.out.println(m.state);
        	System.out.println(m.modify);
        	System.out.println("=========================");
        }
        
        Scanner scan=new Scanner(System.in);
        System.out.print("검색어 입력:");
        String ss=scan.next();
        musicFind(music, ss);
        
	}

}
