package java04_control_5day.condition;

import java.util.Scanner;

public class IfBasicQuiz_02 {
	public static void main(String[] args) {
//////////////////////////////////////////////////////////////////////////////
//		
//		 + �� ���� �Է� �޾� ���� ū ���� ����Ͻÿ�
//
//			 + �� ���� �Է� �޾� ���� ¦���̰�
//			  3�� ������� �Ǻ��Ͻÿ�
//
//			 + �� ������ ������ �Է� �޾� �հ�� ����� ���ϰ�
//			  ����� 90�̻��̸� "A", 80�̻��̸� "B",
//			  70 �̻��̸� "C", 60 �̻��̸� "D",
//			  60�̸��̸� "F" �� ����Ͻÿ�.
//////////////////////////////////////////////////////////////////////////////
		
		Scanner scan = new Scanner(System.in);
		System.out.println("No.1 ==================");
		int [] arr = new int[3];
		int max = 0;
		for(int i = 0; i < arr.length; i++) {
			System.out.print(i + 1 + " -> ");
			System.out.println();
			arr[i] = scan.nextInt();
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		
		System.out.println("max - > " + max);
		
//////////////////////////////////////////////////////////////////////////////		
		
		System.out.println();
		System.out.println("No.2 ==================");
	
		System.out.println("Input Num ->");
		int numA = scan.nextInt();
		System.out.println("Input Num ->");
		int numB = scan.nextInt();
		int sum = numA + numB;
		
		if( sum % 2 == 0 && sum % 3 == 0) {
				System.out.println("sum % 2 == 0 && sum % 3 == 0 ");
		}else {
			System.out.println("No!!!!");
		}
		
//////////////////////////////////////////////////////////////////////////////	
		
		System.out.println();
		System.out.println("No.3 ==================");
		
		System.out.println("Input Num ->");
		int num1 = scan.nextInt();
		System.out.println("Input Num ->");
		int num2 = scan.nextInt();
		System.out.println("Input Num ->");
		int num3 = scan.nextInt();
		
		double ans = num1 + num2 + num3;
		double avg = Math.round(ans * 100) / 100.0;
		
		
		if( avg >= 0 && avg <= 100) {
			if(avg >= 90) {
				System.out.println("A");
			}else if(avg >= 80) {
				System.out.println("B");
			}else if(avg >= 70) {
				System.out.println("C");
			}else if(avg >= 60) {
				System.out.println("D");
			}else {
				System.out.println("F");
			}
		}else {
			System.out.println("Wrong Input");
		}
		

	}
	
}