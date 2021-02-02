package java12_exception_19day;

public class ExceptionEx_01 {

	public static void main(String[] args) {
		
		int [] arr = new int [5];
		int i = 0;
		
		while(true) {
			if( i < 0 || i >= arr.length) {
				// ArrayIndexOutOfBoundsException
				// 예외처리
				// throw new ArrayIndexOutOfBoundsException();
				break;		
			}
			arr[i] = i + 1;
			System.out.println(arr[i]);
			i++;
		}

	}

}
