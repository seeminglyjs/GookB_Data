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
		
		// �巡�� �� ctrl + i �� �ϸ� �鿩���� �ڵ� ������ �ȴ�.
		// ctrl + shift + f �� ������� ����!!!!!!!!!!
		
		




	}
}
