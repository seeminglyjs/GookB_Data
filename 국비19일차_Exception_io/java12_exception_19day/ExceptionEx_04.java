package java12_exception_19day;

public class ExceptionEx_04 {

	public static void main(String[] args) {
		
		String str = null;
		
//		System.out.println(str.length());
//		NullPointerException
//	
//		if( str == null ) {
//			
//			throw new NullPointerException();
//			// 직접 예외 발생시키기
//			// throw는 강제로 예외를 발생시킨다.
//			// 
//		}
	
		NullPointerException e = new NullPointerException();
		// 예외 정보 객체 생성(throw 되지 않는디.)
		
		if( str == null) {
			throw e; // 예외 발생 지점
		}
		
		// 예외 객체를 생성한다고 해서 예외가 발생 되는 것이
		// 아니고 예외 발생 위치는 객체를 생성된 곳으로 지정한다
		// throw 곧바로 new로 예외 객체를 만드는 것이 좋다.
	
	}

}
