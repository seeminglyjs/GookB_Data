package java10_collection_18day;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Collection_05_HashMap {

	public static void main(String[] args) {
		
		//Map map = new Hashtable();
		Map map = new HashMap();
		map.put(1,"Apple");
		map.put(2,"King");
		map.put(3,"Kang");
		
		System.out.println(map);
		
		System.out.println(map.get(1));
		map.put(true, "Kong");
		System.out.println(map);
		map.put(2, "Kkong");
		System.out.println(map);
		
		System.out.println("\n==================contains");
		System.out.println(map.containsKey(2));
		System.out.println(map.get(2));
		
		if(!map.containsKey(4)) {
			map.put(4, "Joong");
		}
		
		System.out.println(map.containsValue("Apple"));
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		System.out.println(map.remove(3));
		System.out.println(map);
		
		map.remove(2, "kkk");
		
		System.out.println("\n ===================== null 값 처리");
		// - > hashtable은 key 값으로 null을 허용하지 않는다.
		map.put(null, "lll");
		map.put(10, null);
		System.out.println(map);
		map.put(null, null);
		
		
		System.out.println("\n ===================== map과 set");
		
		Set keySet = map.keySet(); // key를 Set으로 추출
		Set entrySet = map.entrySet(); // key - value쌍을 Set으로 추출
		
		System.out.println(keySet);
		System.out.println(entrySet);
	
		
		System.out.println("\n ===================== keySet을 활용한 반복출력");
		
		Set keys = map.keySet();
		Iterator it = keys.iterator();
		
		while(it.hasNext()) {
			Object key = it.next();			
			System.out.println(map.get(key));
		}
		
	
	
	}

}
