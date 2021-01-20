package java06_class_10day.method;

public class Method_02 {
	
	// 매개변수 parameter
	// 반환데이터 return
	
	public void method1() {
		System.out.println("hi");
	}
	
	public void method2(int num) {
		System.out.println("hi" + num);
	}
	
	//매개변수 X, 반환데이터 0
	public int retrunNum() {	
		return 100;
		
	}
	
	//매개변수 0, 반환데이터 0
	public int plus(int n1, int n2) {
		return n1+n2;
	}
}
