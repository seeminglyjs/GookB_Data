package java06_class_11day.Overloading;

public class Overloading {

	private int x;
	private int y;
	
	
	
	public void display() {
		System.out.println(x + " / " + y);
	}

	
	// overloading�� ����� �Ű������� �ٸ��� ����
	public void display(int x, int y) {
		this.x = x;
		this.y = y;
		
		System.out.println(this.x + " / " + this.y);
	}

	public void display(double d) {
		
	}
	
	public void display(String str) {
		
	}
	// ���� Ÿ�Ը� �ٸ� ��쿡�� �����ε��� �������� �ʴ´�.
	
	
}
