package singleton;

// 추가 작업(예외 처리) 할 수 있도록 단점 보안
public class Singleton_02 {
	public String data = "Apple"; // 데이터

	//private생성자로 다른 클래스에서의 new 연산자를 막음
	private Singleton_02() {}

	//자신 클래스에 대한 객체 생성
	private static Singleton_02 instance;

	//static 블록, 초기화블록
	// 클래스 변수를 초기화할 때 사용한다
	static {
		try {
			instance = new Singleton_02();
		}catch(Exception e) {
			e.printStackTrace();
		}		
	}



	//싱글톤 객체를 반환하는 메소드
	public static Singleton_02 getInstance() {
		return instance;
	}

}
