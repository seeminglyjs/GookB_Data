package java09_api_17day;

public class StringEx {

	public static void main(String[] args) {
		
		String str1 = "aaa";
		String str2 = new String("bbb");
//		
//		
//		System.out.println("--------length()---------");
//		System.out.println("str1�� ���� ->  " + str1.length());
//		System.out.println("Cherry�� ���� -> " + "Cherry".length()); // �̷��Ե� �����ϴ�.
//		
//		System.out.println("\n-------------------equals");
//		System.out.println(str1.equals(str2)); //false
//		System.out.println("aaa".equals(str1)); //true
//	
//		System.out.println(str1 == "aaa"); // true
//		System.out.println(str2 == "bbb"); // false
//		// new �� ���ο� ������ ���ڿ� �Ҵ��
//
//		//���ڿ��� �׻� equals �� ���ؾ� �Ѵ�.
//	
//	
//		System.out.println("\n-------------------toLowerCase");
//		
//		System.out.println("AAA".toLowerCase());
//		// ���ڿ��� ��� ���ĺ��� �ҹ��ڷ� ����
//	
//		System.out.println("\n-------------------------toUpperCase");
//		
//		System.out.println("aaa".toUpperCase());
//		
//		
//		System.out.println("\n-------------------------charAt");
//		
//		char ch = str1.charAt(0);
//		System.out.println(ch);
		
//		System.out.println("\n-------------------------concat");
//		// ���ڿ� ���� �޼ҵ�
//		
//		String concat = "aaa".concat(" , hihihihihi");
//		System.out.println(concat);
//		
//		System.out.println("\n-------------------------replace");
//		
//		String replace1 = str1.replace('a', 'A');
//		System.out.println(replace1); // AAA
//		
//		System.out.println("\n-------------------------replace");
//		// ������ ���ڿ�(CharSequence)�� �ٸ� ���ڿ��� ��ȯ
//		// String�� interface CharSequence�� �ڽ� Ŭ����
//		
//		String replace3 = str1.replace("aa", "cc");
//		System.out.println(replace3); // cca
	
		
//		System.out.println("\n-------------------------contains");
//		
//		boolean bo1 = str1.contains("a");
//		System.out.println(bo1);
//		bo1 = str1.contains("b");
//		System.out.println(bo1);
			
		
		System.out.println("\n-------------------------substring");
		
		String sub = str1.substring(1); // 1��° �ε��� ���� ������
		System.out.println(sub);
		sub = str1.substring(0, 1); 
		// 0��° �ε��� ���� 1 ��° ������
		System.out.println(sub);
		
				
	}

}
