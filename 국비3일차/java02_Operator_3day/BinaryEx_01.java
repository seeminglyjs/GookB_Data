package java02_Operator_3day;

public class BinaryEx_01 {

	public static void main(String[] args) {
		// 이항 연산자 - 산술
		// + - * % /
		
		int num1 = 17, num2 =4; //피연산자
		int result; //결과 저장 변수
		
		result = num1 + num2;
		
		System.out.println(result);
		
		//mod 연산자 %
		
		System.out.println(num1 % num2);
		
		
		System.out.println("num1 + num2 = " + num1 + num2); //174
		System.out.println("num1 + num2 = 17" + num2); //174
		System.out.println("num1 + num2 = " + (num1 + num2)); //21
		System.out.println("num1 / num2 = " + (num1 / num2)); //4
		System.out.println("num1 % num2 = " + (num1 % num2)); //1
		
		
		System.out.println(num1 /(num2 * 1.0));
		double result2 = num1 / (num2 * 1.0);
		System.out.println((double)num1 / (double)num2);
		System.out.println(result2);
		
		//잘못실수하는 경우
		System.out.println((double) (num1 / num2));
		System.out.println((double) (17 / 4));
		// -> 4.0 으로 출력이 된다.
		
		
		
		

	}

}
