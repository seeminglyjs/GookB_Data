package java04_control_7day.switchEx;

public class star {

	public static void main(String[] args) {
		
//		// Q1.
//		
//		for(int i = 0; i < 5; i++) {
//			System.out.print("*");
//		}
//////////////////////////////////////////////////////////////
		
		
//		// Q2.
//		
//		for(int i = 0; i < 5; i++) {
//			System.out.println("*");
//		}
//////////////////////////////////////////////////////////////
		
//		// Q3.
//		
//		for(int i =0; i < 5; i++) {
//			for(int j = 0; j < 5; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//////////////////////////////////////////////////////////////
//		
//		// Q4.
//		
//		for(int i =0; i < 5; i++) {
//			for(int j = 0; j < 5; j++) {
//				System.out.print(i + 1);
//			}
//			System.out.println();
//		}		
//////////////////////////////////////////////////////////////		
//		
//		// Q5.
//		
//		for(int i =0; i < 5; i++) {
//			for(int j = 0; j < 5; j++) {
//				System.out.print(j + 1);
//			}
//			System.out.println();
//		}		
//////////////////////////////////////////////////////////////
//			
//		// Q6.
//		
//		for(int i =0; i < 5; i++) {
//			for(int j = 0; j < 5; j++) {
//				System.out.print(i + j + 1);
//			}
//			System.out.println();
//		}	
//		
//////////////////////////////////////////////////////////////		
//		
//		// Q7.
//		
//		for(int i = 5 ; i > 0; i--) { //내풀이
//			for(int j = 0; j < 5; j++) {
//				System.out.print(i + j );
//			}
//			System.out.println();
//		}
		
//		for(int i =0; i < 5; i++) { //선생님풀이
//			for(int j =0; j < 5; j++) {
//				System.out.print(5 - i + j);
//			}
//			System.out.println();
//		}

//////////////////////////////////////////////////////////////		
//		
//		// Q8.
//		
//		for(int i = 1; i < 6; i++) {
//			for(int j = 0; j < i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}			
//////////////////////////////////////////////////////////////		
//		
//		// Q9.
//		
//		for(int i = 5; i > 0; i--) {
//			for(int j = 0; j < i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}			
//////////////////////////////////////////////////////////////		
//			
//		// Q10.
//		
//		for(int i = 0; i < 5; i++) {
//			for(int j = 0; j < i; j++) {
//				System.out.print(" ");
//			}
//			for(int j = 0; j < 5 -i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
//		for(int i = 0; i < 5; i++) { //다른풀이1
//			for(int j =0; j <5; j++) {
//				if(j < i) {
//					System.out.print(" ");
//				}else {
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//		}
//		
//		
//		for(int i = 0; i < 5; i++) { //다른풀이2
//			for(int j =0; j <5; j++) {
//				System.out.print(j < i ? " ": "*");
//			}
//			System.out.println();
//		}
		
//////////////////////////////////////////////////////////////		
//		
//		// Q11.
//
//		for(int i = 1; i < 6; i++) {
//			for(int j = 0; j < 5 -i; j++) {
//				System.out.print(" ");
//			}
//			
//			for(int j = 0; j < i; j++) {
//				System.out.print("*");
//			}
//			
//			System.out.println();
//		}
		
		for(int i = 0; i < 5; i++) { //다른풀이1
			for(int j =0; j <5; j++) {
				if(j < 5-i -1) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		
//////////////////////////////////////////////////////////////		
//			
//		// Q12.
//		
//		int count = 0;
//		for(int i = 1; i < 10; i++) {
//			if(i <= 5) {
//				for(int j = 0; j < i; j++) {
//					System.out.print("*");
//				}
//				count++;
//			}else {
//				for(int j = count -1; j > 0; j--) {
//					System.out.print("*");
//				}
//				count--;
//			}
//				
//			System.out.println();
//		}
//
//		
//		System.out.println("----------");
//		
//		final int LINE = 9; //출력할 전체 줄 수
//		
//		for(int i=0; i< LINE; i++) { //전체 행
//			
//			if( i <= LINE/2 ) { //가운데 줄까지 - 많아지는 별
//				for(int j=0; j<i+1; j++) {
//					System.out.print("*");
//				}
//			}
//			
//			if( i > LINE/2 ) { //가운데 줄 이후 - 적어지는 별
//				for(int j=0; j<LINE-i; j++) {
//					System.out.print("*");
//				}
//			}
//			
//			System.out.println(); //행마다 개행
//		}
//////////////////////////////////////////////////////////////		
//		
//		// Q13.
//		
//		int count = 7; // 처음에 두개 찍어야함
//		for(int i = 0; i < 9; i++) {
//			if( i <= 4) {
//				for(int j = 5; j > i; j--) {
//					System.out.print("*");
//				}
//				count--;
//				System.out.println();
//			}else {
//				for(int j = 0; j < count; j++) {
//					System.out.print("*");
//				}
//				count++;
//				System.out.println();
//			}
//		}
		
//		final int LINE = 9; //전체 행 수
//		
//		for(int i = 0; i < LINE; i++) { //행
//			
//			if( i <= LINE/2 ) { //가운 데 줄까지 -> 감소하는 별
//				for(int j=0; j < LINE/2+1-i; j++) {
//					System.out.print("*");
//				}
//				
//			} else { //가운데 줄 이후 -> 증가하는 별
//				for(int j = 0; j < i-LINE/2+1; j++) { //5일 떄 5 -(4) + 1 = 2가된다.
//					System.out.print("*");
//				}
//			}
//			System.out.print(i);
//			System.out.println(); //행마다 개행
//		}
		

		
	}

}
