package java04_control_6day.loop;

public class For_07_1 {
	public static void main(String[] args) {

		int sum = 10;
	
		for(int i = 0, seed = 10; i < 14; i++) {
			seed *= 2;
			sum += seed;
		}
		
		System.out.println(sum);
		
	}

}
