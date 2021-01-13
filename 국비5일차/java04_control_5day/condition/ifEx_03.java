package java04_control_5day.condition;

import java.util.Scanner;

public class ifEx_03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int input = scan.nextInt();
		
		if(input == 10) {
			System.out.println("this is 10");
		}
		
		if(input != 10) {
			System.out.println("not 10");
		}
		
		if(input >= 1 && input <= 100) {
			System.out.println(" 1 ~ 100 ");
		}
		
		
	}
}
