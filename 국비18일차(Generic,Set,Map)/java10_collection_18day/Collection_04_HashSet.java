package java10_collection_18day;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Collection_04_HashSet {

	public static void main(String[] args) {
		
		//Set set = new HashSet();
		Set set = new LinkedHashSet();
		// 입력된 데이터의 순서가 유지 된다.
		
		set.add(10);
		set.add(20);
		set.add(30);
	
		System.out.println(set);
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("크기는 - > "  + set.size());
		System.out.println("set이 비어 있는가 -> " + set.isEmpty());
		System.out.println("30이 존재 -> " + set.contains(30) );
		System.out.println("30을 제거 - >" + set.remove(30));
		System.out.println("30이 존재 -> " + set.contains(30) );
		System.out.println(set);
		
		System.out.println("모든 요소 제거 .clear");
		set.clear();
	}

}
