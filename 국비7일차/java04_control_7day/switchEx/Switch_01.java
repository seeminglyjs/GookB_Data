package java04_control_7day.switchEx;

public class Switch_01 {

	public static void main(String[] args) {
		
		//switch문, 선택문
		// switch-case 문
//		
//		switch(비교 대상) {
//			
//		case 값1:
//			break;
//		
//		case 값2:
//			break;
//		
//		case 값3:
//			break;
//		
//		case 값4:
//			break;
//		
//		default:
//			break;
//		
//		}
		
		int num =50;
		
		switch (num) {
		
		case 10:
			System.out.println("num  == 10");
			break;
		case 20:
			System.out.println("num  == 20");
			break;
		case 30:
			System.out.println("num  == 30");
			break;
		case 40:
			System.out.println("num  == 40");
			break;
		case 50:
			System.out.println("num  == 50");
			break;
		default :
			System.out.println("I dont No!");
		}
		
		// 비교대상의 값과 case에 지정한 값이 같으면 해당
		// case 구문의 위치부터 코드가 실행된다		
		//다은 case 구문까지 모두 실행!!!!
		// 때문에 case 구문 끝에 break;를 넣어주어야한다.
		// case에 지정된 값 중에서 같은 값이 없으면 default :
		
		
		
		
		

	}

}
