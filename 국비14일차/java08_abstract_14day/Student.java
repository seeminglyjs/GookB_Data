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
		// �θ��� �߻�޼���� ����
	}
}
