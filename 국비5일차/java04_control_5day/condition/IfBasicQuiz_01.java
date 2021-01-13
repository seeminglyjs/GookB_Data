package java04_control_5day.condition;

import java.util.Scanner;

public class IfBasicQuiz_01 {
	
		public static void main(String[] args) {			
		
//	 + 숫자 하나를 입력받아 양수인지 음수인지 판별하시오
//		>> Input Number : -3
//		>> 음수입니다
//
//	 + 입력한 데이터가 3의 배수인지 판별하시오
//	  (% 연산자 사용)
//		>> Input Number : 7
//		>> 3의 배수가 아닙니다
//
//	 + 두 수를 입력 받아 큰 수를 출력하시오
//		>> Input Number1 : 44
//		>> Input Number2 : 88
//		>> 88 이 더 큰 수
	
		Scanner scan = new Scanner(System.in);
//		System.out.println("No. 1 ============================");
//		System.out.print("Input Integer ->");
//		int num = scan.nextInt();
//		
//		
//		if(num > 0) {
//			System.out.println("+++");
//			if(num % 3 == 0) {
//				System.out.println("num % 3 == 0");
//			}else {
//				System.out.println("num % 3 != 0");
//			}
//		}else {
//			System.out.println("----");
//		}
		
		System.out.println();
		System.out.println("No. 2 ============================");
		System.out.print("Input Integer ->");	
		int num2 = scan.nextInt();
		System.out.println();
		System.out.print("Input Integer ->");
		int num3 = scan.nextInt();
		System.out.println();

		if(num2 > num3) {
			System.out.println("num2 > num3");
		}else if(num2 < num3) {
			System.out.println("num2 < num3");
		}else {
			System.out.println("num2 == num3");
		}

		
	
		}
}
