package java02_Operator_3day;

public class BinaryEx_01 {

	public static void main(String[] args) {
		// ���� ������ - ���
		// + - * % /
		
		int num1 = 17, num2 =4; //�ǿ�����
		int result; //��� ���� ����
		
		result = num1 + num2;
		
		System.out.println(result);
		
		//mod ������ %
		
		System.out.println(num1 % num2);
		
		
		System.out.println("num1 + num2 = " + num1 + num2); //174
		System.out.println("num1 + num2 = 17" + num2); //174
		System.out.println("num1 + num2 = " + (num1 + num2)); //21
		System.out.println("num1 / num2 = " + (num1 / num2)); //4
		System.out.println("num1 % num2 = " + (num1 % num2)); //1
		
		
		System.out.println(num1 /(num2 * 1.0));
		double result2 = num1 / (num2 * 1.0);
		System.out.println((double)num1 / (double)num2);
		System.out.println(result2);
		
		//�߸��Ǽ��ϴ� ���
		System.out.println((double) (num1 / num2));
		System.out.println((double) (17 / 4));
		// -> 4.0 ���� ����� �ȴ�.
		
		
		
		

	}

}
