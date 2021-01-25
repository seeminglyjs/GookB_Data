package java07_inherit_13day;

public class Child2 extends Parent2 {
//	public int num;
	private int num;
	
	@Override
	public void display() {
		num = 111;
		//super.num = 112;
		System.out.println("Override");
	}
}
