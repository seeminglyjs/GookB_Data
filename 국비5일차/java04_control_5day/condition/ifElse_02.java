package java04_control_5day.condition;

import java.util.Scanner;

public class ifElse_02 {

	public static void main(String[] args) {		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input Number : ");
		int num = scan.nextInt();
		
		//�Է��� ���ڰ� Ȧ�� ���� ¦�� ���� �˾ƺ���
		
		if(num % 2 == 0) {
			System.out.println("¦��");
		}else {
			System.out.println("Ȧ��");
		}
		
		
	}
}
