package java05_array_8day;

public class Arrays_03 {

	public static void main(String[] args) {
	
		
		int[] arr = {10,20,30,40,50};
		
		System.out.println("�迭�� ũ�� : " + arr.length);
		
		for(int i = 0; i <arr.length ; i++) {
			System.out.println(arr[i]);
		}
	
		
		//int[] arr2 = new int [-10];
		//java.lang.NegativeArraySizeException �� �߻��Ѵ�.
		
		// arr[ -1 ] = 10;
		// java.lang.ArrayIndexOutOfBoundsException�� �߻�
		// 0���� ���� �ε����� �ֱ� ���� ���� ���ܶ� �����ʿ�
		
		
	}

}
