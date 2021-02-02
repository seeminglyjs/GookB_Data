package java12_exception_19day;

public class ExceptionEx_03 {

	public static void main(String[] args) {
		
		try {
			//try 블록
			// 예외 발생이 예측되는 코드를 작성함
		} catch (NullPointerException e) {
			// NullPointerException 발생시 처리
		} catch (ArrayIndexOutOfBoundsException e) {
			// ArrayIndexOutOfBoundsException 발생시 처리
		} catch (Exception e) {
			// 모든 예외 발생시 처리 코드
		}
	
		// catch 구문을 여러 개 작성할 수 있다.
		
		try {
			//try 블록
			// 예외 발생이 예측되는 코드를 작성함
		} catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
			// NullPointerException 발생시 처리
		} catch (Exception e) {
			// 모든 예외 발생시 처리 코드
		}
	
	}

}
