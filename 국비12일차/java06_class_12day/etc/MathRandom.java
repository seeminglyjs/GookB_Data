package java06_class_12day.etc;

import java.util.Scanner;

public class MathRandom {

	public static void main(String[] args) {
		
		// Math Ŭ����
		// ������� �޼ҵ带 �����Ѵ�.
		// �޼ҵ���� ���δ� static���� �Ǿ� �ִ�.
		
		// Math.random() �� ����� 0.0 ���� ũ�ų�
		// ���� 1.0���� ���� �Ǽ� �� ��ȯ
		
		// Pseudorandom(���� ����)
		// ��ǻ�ʹ� ������ ���� �� ���� ��¥�� ���� ���̴�.
		
		
		// Pseudo -> �ٸ糽(��¥��)
		///////////////////////////////////////////////////
		
		System.out.println((int)(Math.random() * 10) - 5); // -5 ~ 5 ����
		System.out.println((int)(Math.random() * 10) + 1); // 1 ~ 10 ����
		
		
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
