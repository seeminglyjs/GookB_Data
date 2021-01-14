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
//				System.out.println(i + " -> " + num1+ " 의 약수이다.");
//			}
//		}
//		System.out.println(num1 + " -> " + num1+ " 의 약수이다.");
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
//		int big, small; // 입력값준 큰 값 작은값 저장 변수
//		int mok, nmg; 	// 몫 나머지 저장 변수
//		int minM, maxD; // 최서 공배수  / 최대 공약수 저장변수
//		
//		if(numA >= numB) {
//			big = numA;
//			small = numB;
//		}else {
//			big = numB;
//			small = numA;
//		}
//		// 입력값 대소 비교
//		
//		while(true) {
//			mok = big / small;
//			nmg = big % small;
//			//몫 나머지 구하기
//			// nmg 0이 될때까지 계속
//			
//			if(nmg == 0) {
//				maxD = small; // 작은 값이 최대공약수
//				minM = numA * numB / maxD;
//				// 최대 공배수는 입력값 두개 곱합뒤 최대 공약수를
//				//나누면 된다.
//				System.out.println(maxD + " / " + minM);
//				break;
//			}else {
//				big = small;
//				small = nmg;
//				//다음 비교를 위해 big은 small 값 변경
//				//small은 nmg로 변경
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
////				System.out.println(i + " 는 소수이다.");
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
