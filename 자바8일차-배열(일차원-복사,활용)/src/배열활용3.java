import java.util.Arrays;

public class 배열활용3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //1~45 => 6개 추출 (중복없는 난수)
		int[] lotto=new int[6];
		// 임의수 저장 
		/*for(int i=0;i<lotto.length;i++)
		{
			lotto[i]=(int)(Math.random()*45)+1; //1~45
		}
		System.out.println("lotto="+Arrays.toString(lotto));*/
		int su=0; // 난수를 저장하는 변수 
		boolean bCheck=false;// 중복여부 확인 변수 
		for(int i=0;i<lotto.length;i++)
		{
			bCheck=true;
			while(bCheck) // 중복이 없을때까지 난수 발생 
			{
				// 난수 발생 => 저장된 수와 중복이 없으면 while종료
				// 중복이 있는 경우 => 난수 다시 발생 
				su=(int)(Math.random()*45)+1;
				bCheck=false;
				// 중복이 있는지 검색
				for(int j=0;j<i;j++)
				{
					if(lotto[j]==su)
					{
						bCheck=true;
						break;
					}
				}
			}
			lotto[i]=su;
		}
		System.out.println("lotto="+Arrays.toString(lotto));
		// 해결책 
		/*for(int i=0;i<lotto.length-1;i++)
		{
			for(int j=i+1;j<lotto.length;j++)
			{
				if(lotto[i]>lotto[j])
				{
					int temp=lotto[i];
					lotto[i]=lotto[j];
					lotto[j]=temp;
				}
			}
		}*/
		Arrays.sort(lotto);
		System.out.println("lotto="+Arrays.toString(lotto));
	}

}
