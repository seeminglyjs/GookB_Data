package java09_api_17day;

public class WrapperEx {

	public static void main(String[] args) {
		
//		int num1 = 10;
//		
//		
//		//Integer 참조형타입
//		Integer val1 = new Integer(20);
//		Integer val2 = new Integer(num1);
//		Integer val3 = new Integer("45");
//		
//		int num2 = val2.intValue(); // 언박싱
//		
//		
//		// 오토 박싱
//		Integer val4 = 1234;
//		Double dval = 55.334;
//		
//		// 오토 언박싱
//		int i4 = val4;
//		double d1 = dval;
//		
//		//자료형에 대한 정보
//		System.out.println(Integer.BYTES); //4b
//		System.out.println(Integer.SIZE);	//32bit
//		System.out.println(Integer.MIN_VALUE); // -2147483648
//		System.out.println(Integer.MAX_VALUE); // 2147483647
		
		
		// 문자열 파싱(parse) 추출하다.
		// 문자열에서 원하는 형식의 데이터를 추출하는 것
		
//		int num1 = Integer.parseInt("1234");
//		System.out.println(num1);
//		
//		// int num2 = Integer.parseInt("143434gg");
//		// java.lang.NumberFormatException
//		// 숫자이외의 데이터가 들어가 문제가 발생
//		
//		double d = Double.parseDouble("314.");
//		System.out.println(d);
		
		
		System.out.println(Boolean.parseBoolean("true"));
		System.out.println(Boolean.parseBoolean("false"));
		System.out.println(Boolean.parseBoolean("123")); // false
		// true가 아니면 모두 false가 나온다.
		
		
	}

}
