package com.sist.collection;
/*
 *   Collection => 데이터 그룹 (데이터를 모아서 관리)
 *   CollectionFramework : 표준화 => 인터페이스 
 *          Collection(interface) 
 *              |
 *      --------------------------
 *      |           |            |
 *    List         Set          Map
 *    ----         ----         ---
 *     |             |           |
 *   *ArrayList    HashSet      HashMap
 *    Vector 
 *    LinkedList
 *       |
 *     Queue 
 *     
 *    1) List (자료구조 = 메모리에서 데이터 관리) ***** 코테 
 *       1. 순서를 가지고 있다 (인덱스번호 구분) => 항상 순차적으로 유지 
 *       2. 중복 데이터를 허용 
 *       3. 사용처 : 데이터베이스 (웹) 
 *       4. CURD(읽기,쓰기,수정,삭제)
 *       5. 주요 메소드 
 *          = add() => 추가 
 *          = set() => 수정 
 *          = remove() => 삭제
 *          = get() => 읽기
 *          = size() => 저장 갯수
 *          = clear() => 전체 삭제 
 *       ArrayList : 읽기  /  추가 삭제 / 비교
 *       ---------   빠르다     느리다    순차적으로 추가/삭제시에는 가장 빠르다 
 *       Vector : 동기화 => (속도가 늦다) => 보완 (비동기) => 속도 높인다 : ArrayList
 *       ---------
 *       LinkedList : 느리다   빠르다    데이터가 많은 경우에 접근성이 떨어진다 
 *                    C언어 호환 
 *       => ArrayList(데이터베이스) , Vector(네트워크)
 *         ---------------------
 *         
 *         
 */
import java.util.*;
public class MainClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList list1=new ArrayList();
        list1.add("홍길동");
        list1.add("심청이");
        list1.add("박문수");
        System.out.println("====== ArrayList ======");
        for(Object obj:list1)
        {
        	System.out.println(obj);
        }
        Vector list2=new Vector();
        list2.add("홍길동1");
        list2.add("심청이1");
        list2.add("박문수1");
        System.out.println("====== Vector ======");
        for(Object obj:list2)
        {
        	System.out.println(obj);
        }
        LinkedList list3=new LinkedList();
        list3.add("홍길동2");
        list3.add("심청이2");
        list3.add("박문수2");
        System.out.println("====== LinkedList ======");
        for(Object obj:list3)
        {
        	System.out.println(obj);
        }
        // set / remove => 사용하지 않는다 (데이터베이스) 
	}

}









