package java06_class_10day.method;

public class Method_03 {
// 자바의 메소드가 전달인자를 전달할 때에는 변수공간이 전달되지
//	않는다.
//	변수에 저장된 값이 전달된다.
//	전달되는 값은 참조형일 수도 있고 기본형일 수도 있다.
	
	//Call By Reference
	//메소드 호출 시 전달되는 인자값이 참조형 데이터타입일떄
	public void arrayTest(int[] arr) {
		arr[2] = 900; // 참조형 heap 영역이게 때문에
		// main 영역에 있는 arr 데이터도 같이 바뀌게 됨
		// 즉 주소가 넘겨지기 떄문에 heap 영역이 변경됨
	}
	
	//Call By Value
	//메소드 호출 시 전달되는 인자의 값이 기본형 데이터 타입일때
	public void primitiveTest(int num) {
		num = 444444; // stack 영역에 새롭게 변경한다.
		// 때문에 main 메서드 내부의 num 변수는 바뀌지
		// 않는다.
		// 클래스 자체의 num만 변경되기
		// 떄문에 return으로 값을 돌려주어
		// 야 main 영역의 num도 변경된다. 
	}

	// 리턴값을 넘겨주는 방식
	public int primitiveTest2(int num) {
		num = 444444;
		return num;
	}
	
	
	// Call By Value인 상황에서는 매개변수의 값을 변경해도
	// 원본은 그대로이다.
	
	// Call By Reference인 상황에서는 매개변수를 이용하여
	//참조된 데이터를 변경하면 원본에서도 바뀐 걸 확인할 수 있다.
	
	// -> 참조값만 복사되는 얕은 복사가 이루어 진다.
	
	
	
	
	
	
	
}
