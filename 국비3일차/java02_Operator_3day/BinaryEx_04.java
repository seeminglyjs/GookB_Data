package java02_Operator_3day;

public class BinaryEx_04 {

	public static void main(String[] args) {
		
		//���׿����� - ��
		// (&& and) 	(|| or) 	(! not)
		
		//AND ������ �ǿ����� ��� True �� �� ����� true
		//OR  ������ �ǿ��� �� �ϳ��� true �� �� ����� true
		// NOT  ������ �ǿ��ڸ� ����(�ݴ�� �ٲ�)
		
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println(b1 && b2);
		System.out.println(b1 || b2);
		System.out.println(b1  = !b2);
		
		int num = 88;
		System.out.println("====================================");
		System.out.println(num >= 1);
		System.out.println(num <= 100);
		
		System.out.println(num>=1 && num <= 100);
		System.out.println("====================================");
		System.out.println(! (num>=1 && num <= 100));
		// �Ʒ��� ����.
		System.out.println(num <1 || num > 100);
		
		
		
		
	}

}
