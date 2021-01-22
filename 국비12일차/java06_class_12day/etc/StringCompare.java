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
		// 문자열을 비교할 떄 equals() 메소드를 이용
		
		if(str2.equals("Banana")) {
		// "Banana".equals(str2) <- str2가 null 임을
		// 방지하기 위해서 쓴다.
			System.out.println(true);
		}else {
			System.out.println(false);
		} // true
		
		
	}

}
