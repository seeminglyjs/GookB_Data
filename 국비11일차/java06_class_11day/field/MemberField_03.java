package java06_class_11day.field;

public class MemberField_03 {
	
	private int num1 = 777;
	private static int num2 = 888;
	
	//�Ϲ� �޼ҵ�
	public void method(int param) {

		System.out.println(num1);
		System.out.println(num2);
//==================================================		
		int num1 = 101; // ��������
		int num2 = 202;	// ��������
//==================================================		
		System.out.println(num1);
		System.out.println(num2);
//==================================================				
		System.out.println(this.num1); // ����ʵ�
		System.out.println(MemberField_03.num2); // ���� ����ʵ�
	
	}
}
