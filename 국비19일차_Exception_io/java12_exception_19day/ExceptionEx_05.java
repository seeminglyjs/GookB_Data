package java12_exception_19day;

class ThrowsTest{
	public void method() throws Exception {
		throw new Exception();
	}
}


public class ExceptionEx_05 {

	public static void main(String[] args) {
		// main 에서는 throws 를 사용하지 않는 것이 좋다.
		
		ThrowsTest tt = new ThrowsTest();	
		try {
			tt.method();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
