/*
     석류 pomegranate

        		귤 tangerine /sitrus 귤(스트러스)

        		mango 망고

        		watermelon 수박

        		apple 사과

        		pear 배 embryo 배

        		peach 복숭아

        		백도 (white peach)

        		Grapefruit: 자몽

        		graph 포도

        		청포도-green grape

        		strawberry 딸기

        		산딸기 wileberry

        		blackberry 블랙베리

        		blueberry 블루베리

        		kiwi 키위

        		melon 멜론, 참외

        		orange 오렌지

        		lemon 레몬

        		banana 바나나

        		plum 자두

        		apricot 살구(애프리컷)

        		pineapple 파인애플

        		persimmon 감

        		coconut 코코넛

        		coconut palm 야자

        		cherry 체리

        		durian 두리안

        		구아바 guava

        		리치-litchi

        		감-persimmon

        		papaya: 파파야

        		매실 : Japanese apricot

        		모과 : Chinese quince

        		머루 : wild grapevines

        		아보카도 : avocado

 */
import java.util.Scanner;
public class 자바배열_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[] kor= {
        		"귤",
                "망고",
                "수박",
        		"사과",
        		"배",
        		"복숭아",
                "백도",
                "자몽",
                "포도",
                "청포도",
                "딸기",
        		"산딸기",
                "블랙베리",
                "키위",
                "멜론",  
                "오렌지",
                "레몬",
                "바나나",
                "자두",
                "살구",
                "파인애플",
                "감",
                "코코넛",
                "야자",
                "체리",
                "두리안",
        		"구아바"
        };
        Scanner scan=new Scanner(System.in);
        System.out.print("검색어 입력:");
        String ss=scan.next();
        
        for(String f:kor) 
        {
        	if(f.contains(ss))//검색 
        	{
        		System.out.println(f);
        		try
        		{
        			Thread.sleep(200);
        		}catch(Exception x) {}
        	}
        }
        
	}

}
