package java09_api_15day;

import java.util.Random;

public class RandomEx {

	public static void main(String[] args) {
		
		Random ran = new Random();
		
//		System.out.println(ran.nextInt()); //int ������ ������ �������� ���
//		System.out.println(ran.nextBoolean()); // true // false
//		System.out.println(ran.nextDouble());  // 0.0 ~ 0.99999999999
	
	
		System.out.println(ran.nextInt(100)); // 0 ~ 99 ���� 
		System.out.println(ran.nextInt(100) + 1); // 1 ~ 100 ����
	}

}
