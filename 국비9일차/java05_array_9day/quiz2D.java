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
		
		int size = 10; // �迭 �࿭�� �־��� ������ ����
		int count = 1; // �迭�� �� �� ����
		int [][] arr = new int[size][size];

		int j = -1; // ����ġ
		int i = 0; // ����ġ

		int sw = 1; // 1 �Ǵ� -1�� �� ����


		int orSize = size; // �ʱ������

		while(true) {
			for(int t = 1; t <= size; t++) {
				j += sw; //����ġ �ϳ��� ������
				arr[i][j] = count; // 1���� ���ʷ� �־���
				count++; // ������ �� �ϳ��� ����
			}

			size--; // ũ�� �ϳ� ����
			if(size <= 0) {break;}

			for(int t = 1; t <= size; t++) {
				i += sw; //���� �����Ǿ� �ְ� ����ġ �ϳ��� ������
				arr[i][j] = count; 
				count++;
			}

			sw *= -1; // ������ ������ �� �న�� �����Ұ� ����ȴ�.
			// ����� 0�� �ɶ����� �ݺ�
		}

		for(int k = 0; k < orSize; k++) {
			for(int l = 0; l < orSize; l++) {
				System.out.print(arr[k][l] + "\t");
			}
			System.out.println();
		}		

	}

}
