package java10_collection_17day;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Collection_01_List {
	public static void main(String[] args) {
		
		ArrayList list  = new ArrayList();
		
		System.out.println("\n---------------------����");
		
		list.add("Apple");
		list.add("Banana");
		list.add("Cherry");
//		
//		System.out.println("\n---------------------���");
//
//		System.out.println(list);
//		
//		for(int i =0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
			
		// ����Ʈ 2�������� �����
		ArrayList list2  = new ArrayList();
		
		list2.add(new ArrayList());
		list2.add(new ArrayList());
		list2.add(new ArrayList());
		// �ſ� ����
		
		
		System.out.println("\n---------------------����");
		
		list.set(0, "hello");
		System.out.println(list);
		
		System.out.println("\n---------------------����");
		
		list.remove(0);
		System.out.println(list);
		
		
		// �ڷᱸ������ ���� ���Ǵ� ����
		// CRUD
		// C = create - �߰� ���� ����
		// R = read - ��ȸ Ž��
		// U = update - ���� ����
		// D = Delete - ���� ����
		
		
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
		
		// ��� Lsit�� �������̽��� ��ӹ޴´�.
		LinkedList list3 = new LinkedList();
		Vector list4 = new Vector();
		// ������ ArrayList�� ����� ��ɰ� �޼ҵ嵵 ���� �� ����Ѵ�.
		
		
		
	}
}
