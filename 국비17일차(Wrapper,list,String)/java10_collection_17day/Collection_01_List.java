package java10_collection_17day;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Collection_01_List {
	public static void main(String[] args) {
		
		ArrayList list  = new ArrayList();
		
		System.out.println("\n---------------------삽입");
		
		list.add("Apple");
		list.add("Banana");
		list.add("Cherry");
//		
//		System.out.println("\n---------------------출력");
//
//		System.out.println(list);
//		
//		for(int i =0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
			
		// 리스트 2차원으로 만들기
		ArrayList list2  = new ArrayList();
		
		list2.add(new ArrayList());
		list2.add(new ArrayList());
		list2.add(new ArrayList());
		// 매우 복잡
		
		
		System.out.println("\n---------------------수정");
		
		list.set(0, "hello");
		System.out.println(list);
		
		System.out.println("\n---------------------삭제");
		
		list.remove(0);
		System.out.println(list);
		
		
		// 자료구조에서 자주 사용되는 동작
		// CRUD
		// C = create - 추가 삽입 생성
		// R = read - 조회 탐색
		// U = update - 수정 변경
		// D = Delete - 삭제 제거
		
		
		System.out.println(list.isEmpty());
		
		ArrayList l1 = null;
		ArrayList l2 = new ArrayList();
		
		System.out.println(l1); // null
		System.out.println(l2); // [ ]
		
		// l1 == null (true)
		// l1.isEmpty(); NullPointException
		
		// l2 = null (false)
		// l2.isEmpty(); (true);
		
		
		System.out.println("\n---------------------clear");
		
		System.out.println("Before clear :" + list);
		
		list.clear();
		
		System.out.println("After clear :" + list);
		
		// 모두 Lsit를 인터페이스를 상속받는다.
		LinkedList list3 = new LinkedList();
		Vector list4 = new Vector();
		// 기존의 ArrayList와 비슷한 기능과 메소드도 같은 걸 사용한다.
		
		
		
	}
}
