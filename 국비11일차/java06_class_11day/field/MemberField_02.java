package java06_class_11day.field;

public class MemberField_02 {
	
	public static String city = "Seoul";
	// static�� Ŭ���� ������ ������ �Ǹ�,
	// ������ ����� �ƴ� Ŭ���� ������ �����ؾ��Ѵ�.
	
	private int data1 = 100;
	// �ν��Ͻ� ���� non-static
	// ��ü ���� �ؾ����� static�� ���� ������
	
	public static void test() {		
		MemberField_02 m = new MemberField_02();
		System.out.println(m.data1);
	}
	
	private static int data2;
	
	public static void serData2(int data2) {
		MemberField_02.data2 = data2;
		//this ����� �Ұ����ϴ�.
	}
	
	public static int getData2() {
		return data2;
	}
	
	private static int data3;

	public void test2() {
		System.out.println(data3);
	}
	//�Ϲ� �޼��忡�� ���������� ����� ���� ������ ����.
	
}
