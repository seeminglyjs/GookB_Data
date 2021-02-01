package java10_collection_18day;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Collection_04_HashSet {

	public static void main(String[] args) {
		
		//Set set = new HashSet();
		Set set = new LinkedHashSet();
		// �Էµ� �������� ������ ���� �ȴ�.
		
		set.add(10);
		set.add(20);
		set.add(30);
	
		System.out.println(set);
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("ũ��� - > "  + set.size());
		System.out.println("set�� ��� �ִ°� -> " + set.isEmpty());
		System.out.println("30�� ���� -> " + set.contains(30) );
		System.out.println("30�� ���� - >" + set.remove(30));
		System.out.println("30�� ���� -> " + set.contains(30) );
		System.out.println(set);
		
		System.out.println("��� ��� ���� .clear");
		set.clear();
	}

}
