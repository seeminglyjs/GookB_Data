package java05_array_9day.array2D;

public class Array2D_02 {

	public static void main(String[] args) {
		
		//2���� �迭
		
//		int [][] arr = {{1,2,3,4,5},
//						{2,3,4,5,6},
//						{4,9,7,8,6}};
		
		//����� ���ÿ� �ʱ�ȭ
		
		int [][] arr = new int[4][3];

		for(int i =0; i < 4; i++) {
			for(int j = 0; j < 3; j++) {
				arr[i][j] = (i + 1) * 10;
			}
		}

		for(int i =0; i < 4; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
