package java10_collection_17day;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Collection_03_Iterator {

	public static void main(String[] args) {
		
		//Iterator, �ݺ���
		
		// �÷����� ��� ��ҵ��� ���������� 
		// �ݺ��� �� ����Ѵ�.
		
		// �÷����� ��Ҹ� �ݺ������� ó���ϴ� �����
		// ǥ��ȭ ��ŰŰ ���� ���°�
		
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
