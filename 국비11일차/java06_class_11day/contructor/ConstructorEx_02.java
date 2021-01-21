package java06_class_11day.contructor;

class Constructor2{
	private int num1;
	private int num2;
	
	
	public Constructor2() {
//		this.num1 = 92;
//		this.num2 = 292;
	
		//this(92,292);
		this(92);
		System.out.println("defualt");
	}
	
	public Constructor2(int num1) {
		// this.num1 = num1;
		// this 생성자 호출
		this(num1, 0);
		//생성자 코드는 가장 먼저 작성해야 한다.
		System.out.println("One");
		
	}
	
	
	public Constructor2(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
		System.out.println("Two");
//		setNum1(num1); 이것도 되기는 함
//		setNum2(num1);
	
	}
	
	
	
	//모든 멤버 필드의 값을 출력
	public void out() {
		System.out.println(num1 + " / " + num2);
	}
	
	
	//Getter / Setter
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	
}


public class ConstructorEx_02 {
	public static void main(String[] args) {
//		Constructor2 con = new Constructor2(200, 300);
//		// 200 / 300
//		Constructor2 con2 = new Constructor2(200);
//		// 200 / 0 넣지 않은 필드 값은 기본값이 들어간다.
		Constructor2 con3 = new Constructor2();
		// 92 / 292
		
		con3.out();
	}

}
