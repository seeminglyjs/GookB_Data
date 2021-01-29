package java09_api_15day;

import java.util.Random;
import java.util.Scanner;

public class UpDown {
	public static void main(String[] args) {
		int com; //컴퓨터의 수
		int user; //사용자의 수
		
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();

		System.out.println("=============START=============");
		com = ran.nextInt(50)+1; //컴퓨터 랜덤 생성

		for(int j=0; j<7; j++) { //7번 반복
			//사용자의 선택
			while(true) {
				System.out.print("1~50 중 하나 입력 : ");
				user = sc.nextInt();
				
				if (1<=user && user<=50)
					break;
				else
					System.out.println("1~50 !!");
				
			}
			
			if(user==com) {
				System.out.println("이겼습니다.");
				return;
			} else if(user>com) {
				System.out.println("Down");
			} else if(user < com) {
				System.out.println("Up");
			}
		}

		System.out.println("졌네. 컴퓨터는 "+com+" 이라네 \n");
	}
}
