package java06_class_10day.method;

import java.util.Scanner;

public class MethodQuizEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		MethodQuiz mq = new MethodQuiz();
		
		//Q1. 1~100���
		mq.print100();
		System.out.println("---------");
	
		
		//Q2. �Է°���ŭ Hello ���
		System.out.print("�󸶱��� ���? ");
		int num = sc.nextInt(); 
		
		mq.printHello( num ); 
		System.out.println("---------");
		

		//Q3. �Է��� Ƚ����ŭ �Է��� �ؽ�Ʈ ���
		System.out.print("��� ���? ");
		int cnt = sc.nextInt();
		
		sc.nextLine(); //���� ����
		System.out.print("������ ���? ");
		String text = sc.nextLine();
		
		mq.printText(cnt, text);
	}
}
