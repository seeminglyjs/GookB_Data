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
		// this ������ ȣ��
		this(num1, 0);
		//������ �ڵ�� ���� ���� �ۼ��ؾ� �Ѵ�.
		System.out.println("One");
		
	}
	
	
	public Constructor2(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
		System.out.println("Two");
//		setNum1(num1); �̰͵� �Ǳ�� ��
//		setNum2(num1);
	
	}
	
	
	
	//��� ��� �ʵ��� ���� ���
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
//		// 200 / 0 ���� ���� �ʵ� ���� �⺻���� ����.
		Constructor2 con3 = new Constructor2();
		// 92 / 292
		
		con3.out();
	}

}
