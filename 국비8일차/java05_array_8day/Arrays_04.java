package java05_array_8day;

public class Arrays_04 {

	public static void main(String[] args) {
	
		// ���ڿ� String
		// char������ ������ char[]�� ������ ����Ѵ�.
		// ������ char[]�� String�� ���� ������Ÿ���� �ƴϴ�.
		
		String str = "Apple";
		
		char[] chArr = {'A','B','C','D','F'};
		System.out.println(str.length() + " / " + chArr.length);
		
		System.out.println("���ڿ��� ������ " + str.charAt(2));
		System.out.println("�迭�� �׹��� " + chArr[3]);
		
		char[] converted = str.toCharArray();
		//String�� char������ ��ȯ�ϴ� ���
		
		System.out.println(converted[2]);
		System.out.println(converted[4]);
		
	
	}

}
