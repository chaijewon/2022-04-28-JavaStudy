
public class 문자열배열2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[] arr= {
        		"사과:apple",
        		"배:pear",
        		"밤:chestnut",
        		"잣:pine nut",
        		"호두:walnut",
        		"도토리:acorn",
        		"귤:tangerine",
        		"딸기:strawberry",
        		"파인애플:pineapple",
        		"포도:grape",
        		"복숭아:peach",
        		"살구:apricot",
        		"매실:Japanese apricot",
        		"자두:plum",
        		"키위:kiwi",
        		"토마토:tomato",
        		"블루베리:blueberry",
        		"앵두:cherry",
        		"바나나:banana",
        		"오렌지:orange",
        		"수박:watermelon",
        		"멜론:melon",
        		"참외:oriental melon",
        		"망고:mango",
        		"레몬:lemon",
        		"석류:pomegranate",
        		"자몽:grapefruit",
        		"대추:jujub",
        		"감:persimmon",
        		"곶감:dried persimmon",
        		"리치:litchi",
        		"모과:quince",
        		"오디:mulberry",
        		"유자:citron",
        		"무화과:fig",
        		"호박:pumpkin",
        		"오이:cucumber",
        		"양파:onion",
        		"마늘:garlic",
        		"생강:ginger",
        		"무:radish",
        		"쑥:mugwort",
        		"당근:carrot",
        		"인삼:ginseng",
        		"산삼:wild ginseng",
        		"더덕:deodeok",
        		"죽순:bamboo shoot",
        		"파프리카:paprika",
        		"피망:pimiento",
        		"부추:chives",
        		"파:green onion",
        		"감자:potato",
        		"고구마:sweet-potato",
        		"가지:eggplant",
        		"옥수수:corn",
        		"후추:pepper",
        		"고추:chili, hot pepper",
        		"배추:Chinese cabbage",
        		"양배추:cabbage",
        		"상추:lettuce",
        		"양상추:lettuce",
        		"시금치:spinach",
        		"콩:bean",
        		"땅콩:peanut",
        		"깨:sesame",
        		"깻잎:sesame leaf",
        		"콩나물:bean sprouts",
        		"버섯:mushroom",
        		"미역:seaweed"
        };
        // 한글 과일명 출력 
        // ==> substring 
        for(String f:arr)
        {
        	/*
        	 *  문자열 => char[] 
        	 *  "Hello Java"
        	 *   0123456789
        	 *   
        	 *   
        	 *   substring(6) => Java
        	 *   
        	 *   substring(0,5) => Hello
        	 *               --
        	 *               end-1  => 한개 제외
        	 *   
        	 *  substring(int start)
        	 *  substring(int start,int end)
        	 */
        	String kor=f.substring(0,f.indexOf(":"));
        	String eng=f.substring(f.indexOf(":")+1);
        	System.out.println(kor+"==>"+eng);
        }
        
	}

}
