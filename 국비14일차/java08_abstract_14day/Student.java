package java08_abstract_14day;

public class Student extends Person{
	
	private String subject;
	
	public Student(String name, String subject) {
		super(name);
		this.subject = subject;
	}

	@Override
	public void display() {
		System.out.println("[Student] : " + name + " / " + subject );
		// 부모의 추상메서드롤 구현
	}
}
