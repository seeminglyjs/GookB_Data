package java05_array_8day.quiz;

import java.util.Scanner;

public class quiz {

	public static void main(String[] args) {
		final int MONEY = 12000;
		
		Scanner scan = new Scanner(System.in);
		int [] arr = new int [5];
		
		int sum = 0;
		for(int i =  0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
			arr[i] = arr[i] * MONEY;
			sum += arr[i];
		}
		
		for(int i =  0; i < arr.length; i++) {
			System.out.println((i + 1) + " floorTotal : " + arr[i]);
		}
		
		System.out.println(sum / MONEY + " Έν  / $ " + sum);
	}

}
