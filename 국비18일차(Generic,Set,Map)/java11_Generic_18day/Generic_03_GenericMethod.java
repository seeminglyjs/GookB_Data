package java11_Generic_18day;

class Class2 {
	public <T> void display(int num) {
		int data;

	}

	//��ȯ Ÿ��, �Ű��������� ��׸� Ÿ�Ի��
	public <T> T out (T obj) {
		T data;
		// ������������ ���׸� Ÿ�Ի��
		data = obj;
		return data;
	}

}

public class Generic_03_GenericMethod {
	public static void main(String[] args) {
		
		Class2 c = new Class2();
		
		c.out(12345);
		// Ÿ�� �Ķ���͸� �������� �ʾƵ�
		// T -> Integer�� �ڵ� ��ȯ�� �ȴ�.
	
		c.<Double>out(10.0);
		// �޼ҵ��� ���׸� Ÿ���� ����Ҷ���
		// �޼ҵ� �տ� �ۼ��Ѵ�.
	
	}

}
