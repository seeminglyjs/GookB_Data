package java02_Operator_3day;

public class BinaryEx_02 {

	public static void main(String[] args) {
		//이항 연산자 - 대입(Assign)
		// = 
		
		// 오른쪽에 있는 값을 왼쪽에 있는 공간에 저장
		
		// 연산자 우선순위가 거의 최하위에 있는 연산자
		
		int num1 = 10; //10 대입
		int num2 = 20; // 20 대입
		
		int num3 = num1; // num1의 값 10 이 대입된다.
		
		int num4, num5, num6;
		num4 = num5 = num6 = num3; // 모두 10이 들어간다.
		
		
		//복합 대입 연산자 - 산술대입
		// += -= /= %=
		
		int num11 = 11;
		int num12 = 12;
		
		num11 += 12; // 23
		num12 -= 12; // 0
		
		
		
	}

}
