package java03_Scanner_13day;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// ��� 1.
//		//���� ���� nextLine()�� �̿��� ó��
//		int num = scan.nextInt();
//		scan.nextLine(); //���ۺ���
//		String str = scan.nextLine();
//		//////////////////////////////////////
		
		
		//���2. Wrapper Ŭ������ ���
		String text = scan.nextLine();
		int number = Integer.parseInt(text);
		System.out.println(number);
	
	
	}

}
