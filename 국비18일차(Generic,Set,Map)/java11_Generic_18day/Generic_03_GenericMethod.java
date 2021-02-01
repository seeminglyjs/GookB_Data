package java11_Generic_18day;

class Class2 {
	public <T> void display(int num) {
		int data;

	}

	//반환 타입, 매개변수에서 재네릭 타입사용
	public <T> T out (T obj) {
		T data;
		// 지역변수에서 제네릭 타입사용
		data = obj;
		return data;
	}

}

public class Generic_03_GenericMethod {
	public static void main(String[] args) {
		
		Class2 c = new Class2();
		
		c.out(12345);
		// 타입 파라미터를 전달하지 않아도
		// T -> Integer로 자동 변환이 된다.
	
		c.<Double>out(10.0);
		// 메소드의 제네릭 타입을 명시할때는
		// 메소드 앞에 작성한다.
	
	}

}
