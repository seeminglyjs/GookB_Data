package java11_Generic_18day;

import java.util.ArrayList;

public class Generic_01_Basic {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		// ���׸��� Ư�� ������ Ÿ������ �����ϸ鼭 �ڵ带 ���
		// - > �̸� Ÿ�� �Ķ���Ͷ�� �Ѵ�.
		// (���׸� Ÿ���� �����ϴ� ��)
		// String �����͸� ���� �� ����
		// �̸� Ÿ�� ������, Type Safety��� �Ѵ�.
		// ��ü �Ǵ� �޼ҵ尡 �ǵ����� ���� ������Ÿ������
		// ���Ǵ� ��Ȳ�� �����ϴ� Ư��
		list.add("aaaa");
		list.add("bbbb");
		list.add("cccc");
		
		///////////////////////////////////////////////////////////
		
		ArrayList list2 = new ArrayList();
		
		list2.add("aaaa");
		list2.add("bbbb");
		list2.add("cccc");
		
		// String str1 = list2.get(0);
		// Object�� ���� �� ����
		String str1 = (String) list2.get(0);
		// ���� Ÿ�Ժ�ȯ�� ���־���Ѵ�.
		System.out.println(str1.getClass());
		
	}

}
