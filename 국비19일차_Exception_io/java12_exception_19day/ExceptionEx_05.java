package java12_exception_19day;

class ThrowsTest{
	public void method() throws Exception {
		throw new Exception();
	}
}


public class ExceptionEx_05 {

	public static void main(String[] args) {
		// main ������ throws �� ������� �ʴ� ���� ����.
		
		ThrowsTest tt = new ThrowsTest();	
		try {
			tt.method();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
