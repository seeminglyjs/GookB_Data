package java05_array_9day;

public class quiz2D {

	public static void main(String[] args) {
	
//		// Q.1 
//		
//		int [][] arr = new int[5][5];
//		
//		int count = 0;
//		for(int i = 0; i < 5; i++) {
//			for(int j = 0; j < 5; j++) {
//				count++;
//				arr[i][j] = count;
//			}
//			
//		}
//		
//		for(int i = 0; i < 5; i++) {
//			for(int j = 0; j < 5; j++) {
//				System.out.print(arr[i][j] + "\t");
//			}
//			System.out.println();
//		}
////////////////////////////////////////////////////////////		
//		// Q.2
		
//		int [][] arr = new int[5][5];
//		
//		int count = 0;
//		for(int i = 0; i < 5; i++) {
//			for(int j = 4; j >= 0; j--) {
//				count++;
//				arr[i][j] = count;
//			}
//			
//		}
//		
//		for(int i = 0; i < 5; i++) {
//			for(int j = 0; j < 5; j++) {
//				System.out.print(arr[i][j] + "\t");
//			}
//			System.out.println();
//		}
////////////////////////////////////////////////////////////		

////		// Q.3
//		
//		int [][] arr = new int[5][5];
//		
//		int count = 0;
//		for(int i = 0; i < 5; i++) {
//			for(int j = 0; j < 5; j++) {
//				count++;
//				arr[j][i] = count;
//			}
//			
//		}
//		
//		for(int i = 0; i < 5; i++) {
//			for(int j = 0; j < 5; j++) {
//				System.out.print(arr[i][j] + "\t");
//			}
//			System.out.println();
//		}
/////////////////////////////////////////////////////////////
//		// Q.4
		
//		int [][] arr = new int[5][5];
//		
//		int count = 0;
//		for(int i = 0; i < 5; i++) {
//			for(int j = 4; j >= 0; j--) {
//				count++;
//				arr[j][i] = count;
//			}
//			
//		}
//		
//		for(int i = 0; i < 5; i++) {
//			for(int j = 0; j < 5; j++) {
//				System.out.print(arr[i][j] + "\t");
//			}
//			System.out.println();
//		}		
/////////////////////////////////////////////////////////////		
//		// Q.5
		
		int size = 10; // 배열 행열에 넣어줄 사이즈 변수
		int count = 1; // 배열에 들어갈 값 변수
		int [][] arr = new int[size][size];

		int j = -1; // 열위치
		int i = 0; // 행위치

		int sw = 1; // 1 또는 -1이 될 변수


		int orSize = size; // 초기사이즈

		while(true) {
			for(int t = 1; t <= size; t++) {
				j += sw; //행위치 하나씩 더해줌
				arr[i][j] = count; // 1부터 차례로 넣어줌
				count++; // 더해줄 값 하나씩 증가
			}

			size--; // 크기 하나 감소
			if(size <= 0) {break;}

			for(int t = 1; t <= size; t++) {
				i += sw; //행은 고정되어 있고 열위치 하나씩 더해줌
				arr[i][j] = count; 
				count++;
			}

			sw *= -1; // 행증가 열증가 후 행감소 열감소가 진행된다.
			// 사이즈가 0이 될때까지 반복
		}

		for(int k = 0; k < orSize; k++) {
			for(int l = 0; l < orSize; l++) {
				System.out.print(arr[k][l] + "\t");
			}
			System.out.println();
		}		

	}

}
