package java04_control_6day.loop;

public class For_07 {
	public static void main(String[] args) {
//		첫날에 10원을 예금하고,
//		다음날에는 전날의 2배를
//		예금하는 방식으로
//		보름(15일) 동안 저축한 금액은?
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
