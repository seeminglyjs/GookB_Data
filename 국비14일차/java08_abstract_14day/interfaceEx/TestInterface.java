package java08_abstract_14day.interfaceEx;

public interface TestInterface {
	//��� & �߻�޼ҵ常 ����� ������.
	
	public static final int NUM = 123;
	// �������̽��� �ʵ�� ������ ����� ����ȴ�.
	//�����Ͻ� �ڵ����� public static final [type] �پ ���� �Ƚᵵ �ȴ�.
	// int NUM = 123; �̷��� �ᵵ �����ϴ�.
	
	
	public void out();
	// abstract Ű���� ���̵� ���� �����ϴ�.
	// abstract Ű���带 ���ִ� ��쵵 ����.
	
	public void display();
	
	public default void out1(int a) {
		System.out.println(a);	
	} // default �޼��� jdk 8 ���� ��밡��
	// adapter method�� ������� �ʰ� default�� ����Ѵ�.
	// ��� �߻�޼��带 �����ϴ°��� ���� �ʱ� ������
	// ����ϴ� ��쵵 �ִ�.
	// ���� override�� ���� �� �ִ�.
	
	public static void out2() {
		System.out.println("aaaa");
	} // static �޼���
}
