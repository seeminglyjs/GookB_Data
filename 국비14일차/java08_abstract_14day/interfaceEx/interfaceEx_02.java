package java08_abstract_14day.interfaceEx;

public class interfaceEx_02 {
	
	public static void main(String[] args) {
		
		Child c = new Child();
		c.out(); // 자식클래스의 out() 메소드 호출
		
		System.out.println("--------------------------");
		
		
		Parent p;
		p = new Child();
		
		p.out(); // 자식클래스의 out() 메소드 호출(동적바인딩, 인스턴스 확인)
		// ** extends한 클래스는 부모클래스가 된다.
		// ** implements한 인터페이스도 부모 타입이 된다.
		
		System.out.println("==================================");
		
		Inter_01 i1;// 인터페이스 객체 변수	
		i1  = new Child();
		i1.out(); // Child Class 출력됨
		
		System.out.println("==================================");
		
		Inter_02 i2;// 인터페이스 객체 변수	
		i2  = new Child();
		i2.out(); // Child Class 출력됨
		
	}

}
