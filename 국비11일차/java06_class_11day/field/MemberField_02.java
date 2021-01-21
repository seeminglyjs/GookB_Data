package java06_class_11day.field;

public class MemberField_02 {
	
	public static String city = "Seoul";
	// static은 클래스 단위로 관리가 되며,
	// 변수명 사용이 아닌 클래스 명으로 접근해야한다.
	
	private int data1 = 100;
	// 인스턴스 변수 non-static
	// 객체 생성 해야지만 static이 접근 가능함
	
	public static void test() {		
		MemberField_02 m = new MemberField_02();
		System.out.println(m.data1);
	}
	
	private static int data2;
	
	public static void serData2(int data2) {
		MemberField_02.data2 = data2;
		//this 사용이 불가능하다.
	}
	
	public static int getData2() {
		return data2;
	}
	
	private static int data3;

	public void test2() {
		System.out.println(data3);
	}
	//일반 메서드에서 정적변수를 사용한 것은 문제가 없다.
	
}
