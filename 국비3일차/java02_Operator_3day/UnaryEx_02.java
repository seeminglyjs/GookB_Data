package java02_Operator_3day;

public class UnaryEx_02 {

	public static void main(String[] args) {
		// ���� ������ ��ȣ ����
		
		//++ : ����������
		//-- : ���ҿ�����
		
		// �ǿ����ڷ� ������ ������ ���� 1 ����(����)��Ų��.
		
		int num;
		
		num = 15;
		
		System.out.println(num);
		System.out.println(num--); //���� ����, ���� ����
		System.out.println(num);
	
		System.out.println("================================");
		System.out.println(num);
		System.out.println(--num); //���� ����, ��ġ ����
		System.out.println(num);
	
		num = 10;
		
		System.out.println(num++ *10 + ++num); //112
		// -> 11 -> 12 -> 100 -> 112
	}	

}
