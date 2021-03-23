package singleton;

// 단점보안
// 1. 예외처리(추가작업)할 수 없음
// -> getInstance()메소드 내에서 해결

// 2. 객체를 사용하지 않아도 생성한다
// -> Lazy(지연된) 초기화로 해결
// -> 싱글톤 객체를 최초로 사용될 때까지 객체 생성을 미룬다


public class Singleton_03 {
	public String data = "Apple"; // 데이터

	//private생성자로 다른 클래스에서의 new 연산자를 막음
	private Singleton_03() {}

	//자신 클래스에 대한 객체 생성
	private static Singleton_03 instance;

	//싱글톤 객체를 반환하는 메소드
	public static Singleton_03 getInstance() {
		//인스턴스를 생성한 적이 없을 때만 객체 생성
		if(instance == null) {
			try {
				instance = new Singleton_03();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		//싱글톤 객체 반환
		// 인스턴스를 생성한 것이 있으면 기존의 인스턴스 반환
		return instance;
	}

}
