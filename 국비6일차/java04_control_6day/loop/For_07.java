package java04_control_6day.loop;

public class For_07 {
	public static void main(String[] args) {
//		ù���� 10���� �����ϰ�,
//		���������� ������ 2�踦
//		�����ϴ� �������
//		����(15��) ���� ������ �ݾ���?
//			-> 327670
		
		int seed = 10;
		int sum = 10;
		
		for(int i = 0; i < 14; i++) {
			seed *= 2;
			sum += seed;
		}
		
		System.out.println(sum);
		
	}

}
