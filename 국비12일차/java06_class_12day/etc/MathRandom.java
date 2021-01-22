package java06_class_12day.etc;

import java.util.Scanner;

public class MathRandom {

	public static void main(String[] args) {
		
		// Math 클래스
		// 산술연산 메소드를 제공한다.
		// 메소드들이 전부다 static으로 되어 있다.
		
		// Math.random() 의 기능은 0.0 보다 크거나
		// 같고 1.0보다 작은 실수 값 반환
		
		// Pseudorandom(수도 랜덤)
		// 컴퓨터는 랜덤을 만들 수 없어 가짜로 만든 것이다.
		
		
		// Pseudo -> 꾸며낸(가짜의)
		///////////////////////////////////////////////////
		
		System.out.println((int)(Math.random() * 10) - 5); // -5 ~ 5 까지
		System.out.println((int)(Math.random() * 10) + 1); // 1 ~ 10 까지
		
		
		Scanner scan = new Scanner(System.in);

		while(true) {
			int com = (int)(Math.random() * 10) + 1;
			System.out.println("input >");
			int user = scan.nextInt();
			if(com == user) {
				System.out.println(true);
				break;
			}else {
				System.out.println(false);
			}
		}







	}

}
