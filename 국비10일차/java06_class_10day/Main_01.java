package java06_class_10day;

public class Main_01 {

	public static void main(String[] args) {
		
		Class_01 c01; //��ü ����
		
		c01 = new Class_01();// �ν��Ͻ�ȭ, ��ü ����
		
		c01.num = 100;
		c01.data = "Apple";

		
		System.out.println(c01.num);
		System.out.println(c01.data);
		
		
		//c01��ü������ ��� �޼ҵ� ����ϱ�
		c01.display();
		
		
		Class_01 c02 = new Class_01();
		Class_01 c03 = new Class_01();
		Class_01 c04 = new Class_01();
		Class_01 c05 = new Class_01();
		
		c02.num = 200;
		c03.num = 300;
		c04.num = 400;
		c05.num = 500;
		
		
	}

}
