package java09_api_15day;

import java.util.Random;
import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random ran = new Random();


		//////  + UP&DOWN 게임
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

		
		
		//////   + 배스킨라빈스31 게임
		int user = 0;
		int com = 0;

		loop : while(true) {
			
			System.out.print("input ->");
			int num = scan.nextInt();
			if(num > 3 || num < 1) {
				System.out.println("Wrong NUMBER!!");
				continue;
			} // 입력값 범위 체크
			
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
			// 컴퓨터가 반복할 난수를 받음
			com = user;
			// 컴퓨터는 user다음이기 때문에 user 숫자를 받음
			if(com == 30) {
				System.out.println(31);
				System.out.println("==computer Lose==");
				break loop;
			} // 30이면 이미 졌음 비교할 필요없음
			
			System.out.println("--Computer Turn--");
			for(int i =0; i < temp; i++) {
				com += 1;
				System.out.println(com);
				if(com == 30) {
					System.out.println("==user Lose==");
					break loop;
					//컴이 30이 되면 더이상 비교 불필요
					// 유저가짐
				}else if(com > 30) {
					System.out.println(com);
					System.out.println("==computer Lose==");
					break loop;
					// 30보다 커지면 컴퓨터가 짐 비교 불필요
				}
				
			}
		}


	}

}
