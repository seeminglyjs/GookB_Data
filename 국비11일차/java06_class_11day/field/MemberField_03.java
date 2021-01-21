package java06_class_11day.field;

public class MemberField_03 {
	
	private int num1 = 777;
	private static int num2 = 888;
	
	//일반 메소드
	public void method(int param) {

		System.out.println(num1);
		System.out.println(num2);
//==================================================		
		int num1 = 101; // 지역변수
		int num2 = 202;	// 지역변수
//==================================================		
		System.out.println(num1);
		System.out.println(num2);
//==================================================				
		System.out.println(this.num1); // 멤버필드
		System.out.println(MemberField_03.num2); // 정적 멤버필드
	
	}
}
