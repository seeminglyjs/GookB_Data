package java03_Scanner_13day;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 방법 1.
//		//버퍼 비우는 nextLine()을 이용한 처리
//		int num = scan.nextInt();
//		scan.nextLine(); //버퍼비우기
//		String str = scan.nextLine();
//		//////////////////////////////////////
		
		
		//방법2. Wrapper 클래스의 사용
		String text = scan.nextLine();
		int number = Integer.parseInt(text);
		System.out.println(number);
	
	
	}

}
