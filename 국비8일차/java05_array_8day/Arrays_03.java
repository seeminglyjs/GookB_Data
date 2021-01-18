package java05_array_8day;

public class Arrays_03 {

	public static void main(String[] args) {
	
		
		int[] arr = {10,20,30,40,50};
		
		System.out.println("배열의 크기 : " + arr.length);
		
		for(int i = 0; i <arr.length ; i++) {
			System.out.println(arr[i]);
		}
	
		
		//int[] arr2 = new int [-10];
		//java.lang.NegativeArraySizeException 가 발생한다.
		
		// arr[ -1 ] = 10;
		// java.lang.ArrayIndexOutOfBoundsException이 발생
		// 0보다 작은 인덱스에 넣기 떄문 위에 예외라 구분필요
		
		
	}

}
