package java04_control_6day.loop;

import java.util.Scanner;

public class DoWhile_02 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
//		int input;
//		do {
//			System.out.print("Input number(����99) -> ");
//			input = scan.nextInt();
//			System.out.println("�Է��� �� - > " + input);
//		}while(input != 99); // ���ǽ� 
//		System.out.println("=����=");
	
	
//////////////////////////////////////////////////////////		
		
		int input = 0;
		while(input != 99) {
			System.out.print("Input number(����99) -> ");
			input = scan.nextInt();
			System.out.println("�Է��� �� - > " + input);
		}
	
	
	
	
	}

}
