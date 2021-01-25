package java07_inherit_13day;

public class Parent4 {
	protected int num = 111;
	
	public Parent4() {
		System.out.println("parent Constructor");
	}
	
	public Parent4(int num ) {
		this.num = num;
		System.out.println("parent Constructor");
		System.out.println(this.num);
	}
	
}
