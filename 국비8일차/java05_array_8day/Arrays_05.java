package java05_array_8day;

public class Arrays_05 {

	public static void main(String[] args) {
	
//		String str = "Apple";
	
		
		String [] arr; // 문자열 배열 선언
		
		arr = new String[3];
		
		arr[0] = "Apple";
		arr[1] = "Banana";
		arr[2] = "Cherry";
		
		
		for(int i =0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
