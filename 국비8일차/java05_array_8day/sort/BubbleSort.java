package java05_array_8day.sort;

public class BubbleSort {

	public static void main(String[] args) {
		
		int [] arr = {3, 2, 5, 4, 1};


		//���� 
		System.out.println("======������=======");
		for(int i =0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		//���� ����
		for(int i = 0; i < arr.length -1; i++) {
			boolean check = true;
			for(int j = 0; j < arr.length -1 - i; j++) {
				if(arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					check = false;
				}
			}
			System.out.println();
			for(int k =0; k < arr.length; k++) {
				System.out.print(arr[k] + " ");
			}
		
			if(check) {break;}
		}



		System.out.println();
		//���ĵ� ����
		System.out.println("=======������========");
		for(int i =0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}

}
