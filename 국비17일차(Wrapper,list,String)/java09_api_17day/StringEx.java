package java09_api_17day;

public class StringEx {

	public static void main(String[] args) {
		
		String str1 = "aaa";
		String str2 = new String("bbb");
//		
//		
//		System.out.println("--------length()---------");
//		System.out.println("str1의 길이 ->  " + str1.length());
//		System.out.println("Cherry의 길이 -> " + "Cherry".length()); // 이렇게도 가능하다.
//		
//		System.out.println("\n-------------------equals");
//		System.out.println(str1.equals(str2)); //false
//		System.out.println("aaa".equals(str1)); //true
//	
//		System.out.println(str1 == "aaa"); // true
//		System.out.println(str2 == "bbb"); // false
//		// new 로 새로운 힙영역 문자열 할당됨
//
//		//문자열을 항상 equals 로 비교해야 한다.
//	
//	
//		System.out.println("\n-------------------toLowerCase");
//		
//		System.out.println("AAA".toLowerCase());
//		// 문자열의 모든 알파벳을 소문자로 변경
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
//		// 문자열 연결 메소드
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
//		// 지정한 문자열(CharSequence)을 다른 문자열로 변환
//		// String은 interface CharSequence의 자식 클래스
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
		
		String sub = str1.substring(1); // 1번째 인덱스 부터 끝까지
		System.out.println(sub);
		sub = str1.substring(0, 1); 
		// 0번째 인덱스 부터 1 번째 전까지
		System.out.println(sub);
		
				
	}

}
