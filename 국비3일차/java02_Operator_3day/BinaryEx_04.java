package java02_Operator_3day;

public class BinaryEx_04 {

	public static void main(String[] args) {
		
		//이항연산자 - 논리
		// (&& and) 	(|| or) 	(! not)
		
		//AND 연산은 피연사자 모두 True 일 떄 결과가 true
		//OR  연산은 피연사 중 하나라도 true 일 떄 결과가 true
		// NOT  연산은 피연자를 부정(반대로 바꿈)
		
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println(b1 && b2);
		System.out.println(b1 || b2);
		System.out.println(b1  = !b2);
		
		int num = 88;
		System.out.println("====================================");
		System.out.println(num >= 1);
		System.out.println(num <= 100);
		
		System.out.println(num>=1 && num <= 100);
		System.out.println("====================================");
		System.out.println(! (num>=1 && num <= 100));
		// 아래와 같다.
		System.out.println(num <1 || num > 100);
		
		
		
		
	}

}
