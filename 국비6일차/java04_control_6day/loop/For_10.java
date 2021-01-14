package java04_control_6day.loop;

public class For_10 {
	public static void main(String[] args) {

		//for 문과 2중 for문
			
		// alt + shift + r 로 변수명 한꺼번에 변경 가능
		// 우클릭 후 refactor 선택하면됨
		
		for(int i = 2 ; i <= 9; i++) {
			for(int j = 1 ; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
			System.out.println("=============================");
		}

	}

}
