package java04_control_7day.switchEx;

public class Switch_02 {

	public static void main(String[] args) {
		
		//switch��, ���ù�
		// switch-case ��
		
		int num = 20;
		
		if(num == 10) {
			System.out.println("num == 10");
		}else if ( num == 20) {
			System.out.println("num == 20");
		}else if ( num == 30) {
			System.out.println("num == 30");
		}else if ( num == 40) {
			System.out.println("num == 40");
		}else {
			System.out.println("i dont No !");
		}
		// if �����ε� ���� �� �ִ�.
		// switch�� ���� ���� ���� �� ����.
	
	
		int score = 100;
		
		switch(score / 10) { // score�� 10���� ���� �� 10�� �ڸ���
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		default :
			System.out.println("cccccc");
		}
	
	
	}

}
