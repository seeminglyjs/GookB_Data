package java09_api_15day;

import java.util.Random;
import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random ran = new Random();


		//////  + UP&DOWN ����
		//		int com = ran.nextInt(50) + 1;
		//		
		//		int count = 7;
		//		
		//		while(true) {
		//			System.out.print("Input ->");
		//			int user = scan.nextInt();
		//			System.out.println();
		//			if(user == com) {
		//				System.out.println("Win");
		//				break;
		//			}else if(com > user) {
		//				System.out.println("Up");
		//				count--;
		//			}else if(com < user) {
		//				System.out.println("Down");
		//				count--;
		//			}
		//			
		//			if(count <= 0) {
		//				System.out.println("Lose");
		//				break;
		//			}
		//			
		//		}

		
		
		//////   + �轺Ų���31 ����
		int user = 0;
		int com = 0;

		loop : while(true) {
			
			System.out.print("input ->");
			int num = scan.nextInt();
			if(num > 3 || num < 1) {
				System.out.println("Wrong NUMBER!!");
				continue;
			} // �Է°� ���� üũ
			
			for(int i =0; i < num; i++) {
				user += 1; 
				if(user >= 31) {
					System.out.println(user);
					System.out.println("==user Lose==");
					break loop;
				}
				System.out.println(user);
			}
			
			int temp = ran.nextInt(num) + 1;
			// ��ǻ�Ͱ� �ݺ��� ������ ����
			com = user;
			// ��ǻ�ʹ� user�����̱� ������ user ���ڸ� ����
			if(com == 30) {
				System.out.println(31);
				System.out.println("==computer Lose==");
				break loop;
			} // 30�̸� �̹� ���� ���� �ʿ����
			
			System.out.println("--Computer Turn--");
			for(int i =0; i < temp; i++) {
				com += 1;
				System.out.println(com);
				if(com == 30) {
					System.out.println("==user Lose==");
					break loop;
					//���� 30�� �Ǹ� ���̻� �� ���ʿ�
					// ��������
				}else if(com > 30) {
					System.out.println(com);
					System.out.println("==computer Lose==");
					break loop;
					// 30���� Ŀ���� ��ǻ�Ͱ� �� �� ���ʿ�
				}
				
			}
		}


	}

}
