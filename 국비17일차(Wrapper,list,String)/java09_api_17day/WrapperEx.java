package java09_api_17day;

public class WrapperEx {

	public static void main(String[] args) {
		
//		int num1 = 10;
//		
//		
//		//Integer ������Ÿ��
//		Integer val1 = new Integer(20);
//		Integer val2 = new Integer(num1);
//		Integer val3 = new Integer("45");
//		
//		int num2 = val2.intValue(); // ��ڽ�
//		
//		
//		// ���� �ڽ�
//		Integer val4 = 1234;
//		Double dval = 55.334;
//		
//		// ���� ��ڽ�
//		int i4 = val4;
//		double d1 = dval;
//		
//		//�ڷ����� ���� ����
//		System.out.println(Integer.BYTES); //4b
//		System.out.println(Integer.SIZE);	//32bit
//		System.out.println(Integer.MIN_VALUE); // -2147483648
//		System.out.println(Integer.MAX_VALUE); // 2147483647
		
		
		// ���ڿ� �Ľ�(parse) �����ϴ�.
		// ���ڿ����� ���ϴ� ������ �����͸� �����ϴ� ��
		
//		int num1 = Integer.parseInt("1234");
//		System.out.println(num1);
//		
//		// int num2 = Integer.parseInt("143434gg");
//		// java.lang.NumberFormatException
//		// �����̿��� �����Ͱ� �� ������ �߻�
//		
//		double d = Double.parseDouble("314.");
//		System.out.println(d);
		
		
		System.out.println(Boolean.parseBoolean("true"));
		System.out.println(Boolean.parseBoolean("false"));
		System.out.println(Boolean.parseBoolean("123")); // false
		// true�� �ƴϸ� ��� false�� ���´�.
		
		
	}

}
