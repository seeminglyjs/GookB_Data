package java08_abstract_14day.interfaceEx;

public class interfaceEx_02 {
	
	public static void main(String[] args) {
		
		Child c = new Child();
		c.out(); // �ڽ�Ŭ������ out() �޼ҵ� ȣ��
		
		System.out.println("--------------------------");
		
		
		Parent p;
		p = new Child();
		
		p.out(); // �ڽ�Ŭ������ out() �޼ҵ� ȣ��(�������ε�, �ν��Ͻ� Ȯ��)
		// ** extends�� Ŭ������ �θ�Ŭ������ �ȴ�.
		// ** implements�� �������̽��� �θ� Ÿ���� �ȴ�.
		
		System.out.println("==================================");
		
		Inter_01 i1;// �������̽� ��ü ����	
		i1  = new Child();
		i1.out(); // Child Class ��µ�
		
		System.out.println("==================================");
		
		Inter_02 i2;// �������̽� ��ü ����	
		i2  = new Child();
		i2.out(); // Child Class ��µ�
		
	}

}
