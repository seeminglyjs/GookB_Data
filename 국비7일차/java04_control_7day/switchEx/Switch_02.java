package java04_control_7day.switchEx;

public class Switch_02 {

	public static void main(String[] args) {
		
		//switch문, 선택문
		// switch-case 문
		
		int num = 20;
		
		if(num == 10) {
			System.out.println("num == 10");
		}else if ( num == 20) {
			System.out.println("num == 20");
		}else if ( num == 30) {
			System.out.println("num == 30");
		}else if ( num == 40) {
			System.out.println("num == 40");
		}else {
			System.out.println("i dont No !");
		}
		// if 문으로도 만들 수 있다.
		// switch는 범위 값을 비교할 수 없다.
	
	
		int score = 100;
		
		switch(score / 10) { // score를 10으로 나눈 몫 10의 자리수
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		default :
			System.out.println("cccccc");
		}
	
	
	}

}
