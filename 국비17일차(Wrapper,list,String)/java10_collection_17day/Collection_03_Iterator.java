package java10_collection_17day;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Collection_03_Iterator {

	public static void main(String[] args) {
		
		//Iterator, 반복자
		
		// 컬렉션의 모든 요소들을 순차적으로 
		// 반복할 때 사용한다.
		
		// 컬렉션의 요소를 반복적으로 처리하는 방법을
		// 표준화 시키키 위해 나온것
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		
		Iterator<Integer> it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
