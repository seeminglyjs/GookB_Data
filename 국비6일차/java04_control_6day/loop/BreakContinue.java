package java04_control_6day.loop;

public class BreakContinue {

	public static void main(String[] args) {
		
		for(int i = 0; i < 100; i++) {
			System.out.println(i);
			
			if( i >=5) {
				break;
			}
		}
		
		System.out.println();
		System.out.println("======================");
		
		// continue  ���� for ���� ���������� �̵�
		// while ���� ���ǹ����� �̵�
		// do - while���� do �� �Ѿ��.
		
		for(int i = 0; i < 10; i ++) {
			if( i % 2 == 0) {
				continue; // i++ �� �Ѿ��.
			}
			System.out.println(i);
		}
		
	}

}
