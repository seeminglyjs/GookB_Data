package java04_control_5day.condition;

import java.util.Scanner;

public class ifElse_03 {

	public static void main(String[] args) {		

		int num = 88;

		if( num > 0 && num <= 100) {
			System.out.println(" 1 ~ 100");
		}

		System.out.println("==================");

		if( num > 0 ) {
			System.out.println("num is bigger than 0");
			if( num <= 100) {
				System.out.println(" 0 < num <= 100");
			}
		}else {
			System.out.println(" num <= 0");
			if(num ==0) {
				System.out.println("num == 0");
			}else {
				System.out.println("num < 0");
			}
		}
		
		// 드래그 후 ctrl + i 를 하면 들여쓰기 자동 정렬이 된다.
		// ctrl + shift + f 는 사용하지 말자!!!!!!!!!!
		
		




	}
}
