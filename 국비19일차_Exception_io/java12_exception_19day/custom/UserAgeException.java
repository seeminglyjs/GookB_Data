package java12_exception_19day.custom;

public class UserAgeException extends Throwable {
	// Exception 상속시 = Checked Exception
	// RuntimeException 상속시 = Unchecked Exception
	
	@Override
	public String getMessage() {
		// 예외 발생메시지 반환 메소드
		return "나이는 0 <= 나이 <= 150 사이의 값";
	}
}
