package java04_control_7day.switchEx;

import java.util.Scanner;

public class SwitchQuiz_Menu {
	public static void main(String[] args) {
//	- �޴� �����
//
//	===============================
//		M  e  n  u
//	===============================
//		1. Hello World ���
//		2. �̸� ���
//		3. ���� ���
//		4. ����
//	===============================
//
//	  >> _
//
//	 -> �� �޴��� �Է��ϸ� �޴��� �˸°� �����ϵ��� �ۼ�

		final int HELLO_MENU = 1;
		final int NAME_MENU = 2;
		final int GENDER_MENU = 3;
		final int END_MENU = 4;
		
		
		Scanner scan = new Scanner(System.in);
		
		int me = 0;
		
		while(me != END_MENU) {
			System.out.println("Menu -> 1 / 2 / 3 / 4 �� �Է�");
			try {
				me = scan.nextInt();
			}catch (Exception e) {
				me = END_MENU;
			}
			
			
			System.out.print(" -");
			switch(me) {
			case HELLO_MENU : // hello world
				System.out.println(">> Hello Wrold");
				break;
			case NAME_MENU : //name
				System.out.println(">> name");
				break;
			case GENDER_MENU : // gender
				System.out.println(">> gender");
				break;
			case END_MENU : // end
				System.out.println(">> end");
				break;
			case 6 : // restart
				System.out.println(">> restart");
				break;	
			default : 
				System.out.println(">> Wrong!!!!!!");
				System.out.println("Restart Please!");
			}
			
			System.out.println("==========================");
			System.out.println();
			System.out.println();
		}
		
		
		
	}
}