package java10_collection_18day;

import java.util.Stack;

public class Collection_07_Stack {

	public static void main(String[] args) {

		Stack stack = new Stack();
		
		stack.push("aaa");
		stack.push("bbb");
		stack.push("ccc");

		System.out.println(stack.pop());
		System.out.println(stack);
	
		
		System.out.println(stack.peek());
		System.out.println(stack);
		
	
	}

}
