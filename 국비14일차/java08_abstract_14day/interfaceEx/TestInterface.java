package java08_abstract_14day.interfaceEx;

public interface TestInterface {
	//상수 & 추상메소드만 멤버로 가진다.
	
	public static final int NUM = 123;
	// 인터페이스의 필드는 무조건 상수로 선언된다.
	//컴파일시 자동은로 public static final [type] 붙어서 따로 안써도 된다.
	// int NUM = 123; 이렇게 써도 무방하다.
	
	
	public void out();
	// abstract 키워드 없이도 선언 가능하다.
	// abstract 키워드를 써주는 경우도 많다.
	
	public void display();
	
	public default void out1(int a) {
		System.out.println(a);	
	} // default 메서드 jdk 8 부터 사용가능
	// adapter method를 사용하지 않고 default를 사용한다.
	// 모든 추상메서드를 구현하는것은 쉽지 않기 때문에
	// 사용하는 경우도 있다.
	// 강제 override를 막을 수 있다.
	
	public static void out2() {
		System.out.println("aaaa");
	} // static 메서드
}
