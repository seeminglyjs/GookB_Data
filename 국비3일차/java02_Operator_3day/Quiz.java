package java02_Operator_3day;

public class Quiz {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 6;
		int c = 10;
		int d;
		
		d = ++a * b--;
		// a  = 6 , b = 5 d = 36
		
		d = a++ + ++c - b--;
		// a = 7, b= 4, c = 11, d = 12 
		
		
		int a1 = 5; 
		int b1 = 6;
		int c1 = 10;

		boolean result1 = a1 < b1 || --a > c++;
		System.out.println(a1 + " " + b1 + " " + c1);
		
		boolean result2 = c1 < b1++ && c1-->++a1;
		System.out.println(a1 + " " + b1 +" " + c1 );
		
		// and 연산은 왼쪽에 있는 피연사자가 false라면 오른쪽 연산을 안한다.
		// or 연산은 왼쪽에 있는 피연사자가 true라면 오른쪽 연산을 안한다.
	
	}

}
