package java04_control_6day.loopQuiz;

import java.util.Scanner;

public class ans1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
////////////////////////////////////////////////////////////		
//		System.out.println("No.1===================");
//		System.out.println("Input Number");
//		int dan = scan.nextInt();
//		
//		for(int i = 1; i <= 9; i++) {
//			System.out.println(dan + " * " + i + " = " + dan * i);
//		}
//		System.out.println();
//		System.out.println();
//		
////////////////////////////////////////////////////////////		
//		System.out.println("No.2===================");
//		System.out.println("Input Number");
//		int num1 = scan.nextInt();
//		
//		for(int i = 1; i <= num1 / 2; i++ ) {
//			if(num1 % i == 0 ) {
//				System.out.println(i + " -> " + num1+ " �� ����̴�.");
//			}
//		}
//		System.out.println(num1 + " -> " + num1+ " �� ����̴�.");
//		System.out.println();
//		System.out.println();
////////////////////////////////////////////////////////////		
//		System.out.println("No.3===================");
//		int sum = 0;
//		for( int i = 1; i <= 1000; i++) {
//			if(i % 4 == 1 && i % 6 == 1) {
//				sum += i;
//			}
//		}
//		
//		System.out.println(sum);
//		System.out.println();
//		System.out.println();
////////////////////////////////////////////////////////////		
//		System.out.println("No.4===================");
//		System.out.println("Input Number");
//		int numA = scan.nextInt();
//		System.out.println("Input Number");
//		int numB = scan.nextInt();
//		
//		int big, small; // �Է°��� ū �� ������ ���� ����
//		int mok, nmg; 	// �� ������ ���� ����
//		int minM, maxD; // �ּ� �����  / �ִ� ����� ���庯��
//		
//		if(numA >= numB) {
//			big = numA;
//			small = numB;
//		}else {
//			big = numB;
//			small = numA;
//		}
//		// �Է°� ��� ��
//		
//		while(true) {
//			mok = big / small;
//			nmg = big % small;
//			//�� ������ ���ϱ�
//			// nmg 0�� �ɶ����� ���
//			
//			if(nmg == 0) {
//				maxD = small; // ���� ���� �ִ�����
//				minM = numA * numB / maxD;
//				// �ִ� ������� �Է°� �ΰ� ���յ� �ִ� �������
//				//������ �ȴ�.
//				System.out.println(maxD + " / " + minM);
//				break;
//			}else {
//				big = small;
//				small = nmg;
//				//���� �񱳸� ���� big�� small �� ����
//				//small�� nmg�� ����
//			}	
//		}
//		System.out.println();
//		System.out.println();
////////////////////////////////////////////////////////////		
//		System.out.println("No.5===================");
//		System.out.println("Input Number");
//		
//		int count = 0;
//		int num2 = scan.nextInt();
//		for(int i = 2; i <= num2; i++) {
//			boolean flag = true;
//			for(int j = 2; j < i ; j++) {
//				if(i != j) {
//					if(i % j == 0) {
//						flag = false;
//					}
//				}
//			}
//			if(flag) {
//				count++;
////				System.out.println(i + " �� �Ҽ��̴�.");
//			}
//		}
//		
//		System.out.println(count);
////////////////////////////////////////////////////////////
		System.out.println("No.6===================");
		System.out.println("Input ");
		String str = scan.next();
		System.out.println("Input ");
		String str2 = scan.next();
		int temp = str2.charAt(0);
		int cnt = 0;
		
		char [] arr = new char [str.length()];
		for(int i =0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
			if(temp == arr[i]) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
		
	}

}
