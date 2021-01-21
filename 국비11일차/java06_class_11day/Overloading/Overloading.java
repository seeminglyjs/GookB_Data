package java06_class_11day.Overloading;

public class Overloading {

	private int x;
	private int y;
	
	
	
	public void display() {
		System.out.println(x + " / " + y);
	}

	
	// overloading이 적용됨 매개변수가 다르기 때문
	public void display(int x, int y) {
		this.x = x;
		this.y = y;
		
		System.out.println(this.x + " / " + this.y);
	}

	public void display(double d) {
		
	}
	
	public void display(String str) {
		
	}
	// 리턴 타입만 다를 경우에는 오버로딩이 성립되지 않는다.
	
	
}
