package java06_class_12day.etc;

public class StringCompare {

	public static void main(String[] args) {
		
//		String str1 = "apple";	
//		if( str1 =="apple") {
//			System.out.println(true);
//		}else {
//			System.out.println(false);
//		}// true
		
		String str2 = new String("Banana");
//		if( str2 == "Banana" ) {
//			System.out.println(true);
//		}else {
//			System.out.println(false);
//		} // false
		
		////////////////////////////////////////////////
		// ���ڿ��� ���� �� equals() �޼ҵ带 �̿�
		
		if(str2.equals("Banana")) {
		// "Banana".equals(str2) <- str2�� null ����
		// �����ϱ� ���ؼ� ����.
			System.out.println(true);
		}else {
			System.out.println(false);
		} // true
		
		
	}

}
