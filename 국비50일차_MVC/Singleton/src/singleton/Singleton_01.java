package singleton;

//단점
// 1.인스턴스(객체)를 사용하지 않아도 생성해 놓는다

// 2. 인스턴스를 생성할 때 추가 작업을 할 수 없다
// -> 예외처리가 불가능하다

public class Singleton_01 {
	public String data = "Apple"; // 데이터
	
	
	//자신 클래스에 대한 객체 생성
	private static final Singleton_01 instance = new Singleton_01();
	
	//private생성자로 다른 클래스에서의 new 연산자를 막음
	private Singleton_01() {}
	
	//싱글톤 객체를 반환하는 메소드
	public static Singleton_01 getInstance() {
		return instance;
	}
	
}
