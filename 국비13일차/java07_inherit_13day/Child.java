package java07_inherit_13day;

public class Child extends Parent {
	int score;
	
	//Annotation
	// 코드의 부가적인 의미를 부여할 때 사용한다.
	// 특정 동작이나 문법을 코드에 간단히 적용시킬 수 있다.
	
	//////////////////////////////////////////////////////////////
	@Override // 오버라이디 규칙을 잘 지켰는지 유효성 검사를 한다.
	// 문번을 어기면 에러가 발생한다.
	public void display() {
		//오버라이딩 메소드
		System.out.println("Child Class!!");
	}
	
	
	public void print() {
		System.out.println("Child Class!!");
	}
}
