package java06_class_11day.contructor;

class Constructor	{
	private int num1;
	private int num2;
	
	//디폴트 생성자
	public Constructor() {
	//인스턴스가 가져야할 초기값을 만들어주는 역할
		System.out.println(num1 + " / " + num2);
		// 0 / 0
		num1 = 500;
		num2 = 600;
		
		System.out.println(num1 + " / " + num2);
		//500 / 600
	}
	
	public Constructor(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
		
		System.out.println(num1 + " / " + num2);
	}
	
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
	
	// ctrl + shift + [ 수직 화면 분활
	// ctrl + shift + - 수평 화면 분활
	
	
}

public class ConstructorEx_01 {
	public static void main(String[] args) {
		Constructor con = new Constructor();
		System.out.println("=======================");
		System.out.println();
		Constructor con2 = new Constructor(200, 500);
		System.out.println("=======================");
		System.out.println();
		
	}

}
