package java04_control_6day.loop;

public class For_08 {
	public static void main(String[] args) {

		//for ¹®°ú if ¹® ÁßÃ¸
		
		for(int i = 0; i < 10; i++) {
			if( i % 2 == 0) {
				System.out.println("Â¦¼ö : " + i);
			}
		}
		
		System.out.println();
		System.out.println("=============================");
		for(int i = 0; i < 10; i +=2) {
			System.out.println("Â¦¼ö : " + i);
		}
		
		
	}

}
