package java08_abstract_14day;

public class Professor extends Person{
	private String major;	
	
	public Professor(String name, String major) {
		super(name);
		this.major = major;
	}
	
	@Override
	public void display() {
		System.out.println("[Professor] : " + name + " / " + major );
		//부모의 추상메소드를 구현
	}
}
