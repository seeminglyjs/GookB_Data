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
//			// ���� ���� �߻���Ű��
//			// throw�� ������ ���ܸ� �߻���Ų��.
//			// 
//		}
	
		NullPointerException e = new NullPointerException();
		// ���� ���� ��ü ����(throw ���� �ʴµ�.)
		
		if( str == null) {
			throw e; // ���� �߻� ����
		}
		
		// ���� ��ü�� �����Ѵٰ� �ؼ� ���ܰ� �߻� �Ǵ� ����
		// �ƴϰ� ���� �߻� ��ġ�� ��ü�� ������ ������ �����Ѵ�
		// throw ��ٷ� new�� ���� ��ü�� ����� ���� ����.
	
	}

}
