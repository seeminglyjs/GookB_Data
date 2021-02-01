package java11_Generic_18day;

import java.util.ArrayList;

public class Generic_01_Basic {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		// 제네릭을 특정 데이터 타입으로 결정하면서 코드를 사용
		// - > 이를 타입 파라미터라고 한다.
		// (제네릭 타입을 결정하는 것)
		// String 데이터만 받을 수 있음
		// 이를 타입 안전성, Type Safety라고 한다.
		// 객체 또는 메소드가 의도하지 않은 데이터타입으로
		// 사용되는 상황을 방지하는 특성
		list.add("aaaa");
		list.add("bbbb");
		list.add("cccc");
		
		///////////////////////////////////////////////////////////
		
		ArrayList list2 = new ArrayList();
		
		list2.add("aaaa");
		list2.add("bbbb");
		list2.add("cccc");
		
		// String str1 = list2.get(0);
		// Object라 받을 수 없음
		String str1 = (String) list2.get(0);
		// 강제 타입변환을 해주어야한다.
		System.out.println(str1.getClass());
		
	}

}
