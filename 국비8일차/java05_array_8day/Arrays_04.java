package java05_array_8day;

public class Arrays_04 {

	public static void main(String[] args) {
	
		// 문자열 String
		// char형들의 집합인 char[]의 개념을 사용한다.
		// 하지만 char[]과 String이 같은 데이터타입은 아니다.
		
		String str = "Apple";
		
		char[] chArr = {'A','B','C','D','F'};
		System.out.println(str.length() + " / " + chArr.length);
		
		System.out.println("문자열의 세번쨰 " + str.charAt(2));
		System.out.println("배열의 네번쨰 " + chArr[3]);
		
		char[] converted = str.toCharArray();
		//String을 char형으로 변환하는 기능
		
		System.out.println(converted[2]);
		System.out.println(converted[4]);
		
	
	}

}
