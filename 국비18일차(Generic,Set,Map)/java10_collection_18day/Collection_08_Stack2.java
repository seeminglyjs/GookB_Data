package java10_collection_18day;

import java.util.LinkedList;
import java.util.Queue;

public class Collection_08_Stack2 {

	public static void main(String[] args) {
		
		Queue q = new LinkedList();
		
		q.offer("aaa");
		q.offer("bbb");
		q.offer("ccc");
		
		System.out.println(q.poll());
		System.out.println(q.poll());
		
	}

}
