package java10_collection_17day;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Collection_02_List {
	public static void main(String[] args) {
		
		List list = new ArrayList();
		List llist = new LinkedList();
		List vector = new Vector();
		
		list.add(10);
		list.add(30);
		list.add(50);
	
		System.out.println(list);
		
		llist.add(10);
		llist.add(30);
		llist.add(50);
		
		System.out.println(llist);
		vector.add(10);
		vector.add(30);
		vector.add(50);
		
		System.out.println(vector);
	}
}
