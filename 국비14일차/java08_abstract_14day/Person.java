package java08_abstract_14day;

public abstract class Person {
	
	protected String name;
	
	public Person(String name) {
		this.name = name;
	
	}
	
	public abstract void display();
	// 자식클래스가 구현하도록 강제하고 있다.
	// abstract 는 추상으로 만들기 떄문이다.
}
