package java04_control_6day.loop;

public class BreakContinue {

	public static void main(String[] args) {
		
		for(int i = 0; i < 100; i++) {
			System.out.println(i);
			
			if( i >=5) {
				break;
			}
		}
		
		System.out.println();
		System.out.println("======================");
		
		// continue  사용시 for 문은 증감문으로 이동
		// while 문은 조건문으로 이동
		// do - while문은 do 로 넘어간다.
		
		for(int i = 0; i < 10; i ++) {
			if( i % 2 == 0) {
				continue; // i++ 로 넘어간다.
			}
			System.out.println(i);
		}
		
	}

}
