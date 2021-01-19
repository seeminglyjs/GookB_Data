package java05_array_9day.array2D;

public class Array2D_03 {

	public static void main(String[] args) {
		
		int [][] arr;
		
		arr = new int[3][];
		
		arr[0] = new int [3];
		arr[1] = new int [2];
		arr[2] = new int [8];
		
		System.out.println(arr.length); // 3
		System.out.println(arr[0].length); //3
		System.out.println(arr[1].length); //2
		System.out.println(arr[2].length); // 8
	
		
		for(int i =0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	
	}

}
