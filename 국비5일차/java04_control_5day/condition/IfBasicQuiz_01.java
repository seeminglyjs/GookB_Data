package java04_control_5day.condition;

import java.util.Scanner;

public class IfBasicQuiz_01 {
	
		public static void main(String[] args) {			
		
//	 + ���� �ϳ��� �Է¹޾� ������� �������� �Ǻ��Ͻÿ�
//		>> Input Number : -3
//		>> �����Դϴ�
//
//	 + �Է��� �����Ͱ� 3�� ������� �Ǻ��Ͻÿ�
//	  (% ������ ���)
//		>> Input Number : 7
//		>> 3�� ����� �ƴմϴ�
//
//	 + �� ���� �Է� �޾� ū ���� ����Ͻÿ�
//		>> Input Number1 : 44
//		>> Input Number2 : 88
//		>> 88 �� �� ū ��
	
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
