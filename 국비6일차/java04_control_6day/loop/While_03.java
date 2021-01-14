package java04_control_6day.loop;

public class While_03 {

	public static void main(String[] args) {
		
		// while 문을 이용한 구구단 출력
		
		double start = System.nanoTime();
		int num1 = 2;
		int num2 = 1;
		
		while(num1 < 10) {
			if(num2 == 10) {
				num1 ++;
				num2 = 1;
			}
			if(num1 != 10)
				System.out.println(num1 + " * " + num2 + " = " + num1 * num2);
			num2++;
		}
		double end = System.nanoTime();
		
		System.out.println(end - start);
		
//////////////////////////////////////////////////////////////////////////////////
		start = System.nanoTime();
		int dan = 2;
		while(dan <= 9) {
			int i = 1;
			while( i< 9) {
				System.out.println(dan + " * " + i + " = " + dan * i);
				
				i++;
			}
			System.out.println();
			dan++;
		}
		end = System.nanoTime();
		System.out.println(end - start);
		
	}

}
