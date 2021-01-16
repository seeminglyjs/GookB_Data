package java04_control_7day.switchEx;

public class Switch_03 {

	public static void main(String[] args) {
		
		//switch문, 선택문
		// switch-case 문
		
		// switch에서는 boolean 타입을 사용할 수 가 없다.
		// 또한 double값도 사용할 수가 없다.
		
		char alpha = 'b';
		
		switch(alpha) {
		case 'a':
			System.out.println('a');
			break;
		case 'b':
			System.out.println('b');
			break;
		case 'c':
			System.out.println('c');
			break;
		default :
			System.out.println("i dont No!!!!!!!!!!!!!!");
		}
		
		
		
		
	}

}
