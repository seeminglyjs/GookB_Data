package java12_exception_19day;

public class ExceptionEx_03 {

	public static void main(String[] args) {
		
		try {
			//try ���
			// ���� �߻��� �����Ǵ� �ڵ带 �ۼ���
		} catch (NullPointerException e) {
			// NullPointerException �߻��� ó��
		} catch (ArrayIndexOutOfBoundsException e) {
			// ArrayIndexOutOfBoundsException �߻��� ó��
		} catch (Exception e) {
			// ��� ���� �߻��� ó�� �ڵ�
		}
	
		// catch ������ ���� �� �ۼ��� �� �ִ�.
		
		try {
			//try ���
			// ���� �߻��� �����Ǵ� �ڵ带 �ۼ���
		} catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
			// NullPointerException �߻��� ó��
		} catch (Exception e) {
			// ��� ���� �߻��� ó�� �ڵ�
		}
	
	}

}
