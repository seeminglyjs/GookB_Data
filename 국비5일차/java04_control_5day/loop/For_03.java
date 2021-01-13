package java04_control_5day.loop;

public class For_03 {

	public static void main(String[] args) {
		// 반복문 , loop
		
		// 반복문에서는 i (iterate)의 첫 글자를 사용한 것
		
		for(int num = 10; num >= 1; num--) {
			System.out.println(num);
		}
		
		// 반복횟수 : 10
		// 범위 : 10 ~ 1
		
		
		for(int i =0; i < 10; i+=2) {
			System.out.println(i);
		}
		
		// 반복횟수 : 5
		// 범위 :  0 ~ 8
	}

}
