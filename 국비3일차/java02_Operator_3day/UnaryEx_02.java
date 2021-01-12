package java02_Operator_3day;

public class UnaryEx_02 {

	public static void main(String[] args) {
		// 단항 연산자 부호 증감
		
		//++ : 증가연산자
		//-- : 감소연산자
		
		// 피연산자로 적용한 변수의 값을 1 증가(감소)시킨다.
		
		int num;
		
		num = 15;
		
		System.out.println(num);
		System.out.println(num--); //후위 감소, 후취 감소
		System.out.println(num);
	
		System.out.println("================================");
		System.out.println(num);
		System.out.println(--num); //전위 감소, 전치 감소
		System.out.println(num);
	
		num = 10;
		
		System.out.println(num++ *10 + ++num); //112
		// -> 11 -> 12 -> 100 -> 112
	}	

}
