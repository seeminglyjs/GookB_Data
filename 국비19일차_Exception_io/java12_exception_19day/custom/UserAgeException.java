package java12_exception_19day.custom;

public class UserAgeException extends Throwable {
	// Exception ��ӽ� = Checked Exception
	// RuntimeException ��ӽ� = Unchecked Exception
	
	@Override
	public String getMessage() {
		// ���� �߻��޽��� ��ȯ �޼ҵ�
		return "���̴� 0 <= ���� <= 150 ������ ��";
	}
}
