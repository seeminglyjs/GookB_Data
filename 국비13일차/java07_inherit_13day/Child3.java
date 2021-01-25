package java07_inherit_13day;

public class Child3 extends Parent3 {
	private int num = 333;
	
	public Child3() {
		System.out.println("Child Constuctor");
		System.out.println(this.num);
		System.out.println(super.num);
	}
	
	
}
