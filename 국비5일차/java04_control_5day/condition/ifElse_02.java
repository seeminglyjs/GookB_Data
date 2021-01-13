package java04_control_5day.condition;

import java.util.Scanner;

public class ifElse_02 {

	public static void main(String[] args) {		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input Number : ");
		int num = scan.nextInt();
		
		//입력한 숫자가 홀수 인지 짝수 인지 알아보기
		
		if(num % 2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		
		
	}
}
