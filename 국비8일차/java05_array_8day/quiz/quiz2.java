package java05_array_8day.quiz;

import java.util.Arrays;

public class quiz2 {

	public static void main(String[] args) {
		
		// Q.1
//		int [] arr = {10, 17, 3, 9, 27, 10, 8, 9, 13, 21};
//		int [] clone = new int[arr.length];
//		
//		int cnt = 0;
//		for(int i = arr.length -1; i >= 0; i--) {
//			clone[cnt] = arr[i];
//			cnt++;
//		}
//		
//		for(int i = 0; i < arr.length; i++) {
//			System.out.print(clone[i] + " ");
//		}
//////////////////////////////////////////////////////////////
		
		// Q.2
		
//		int sum1 = 0;
//		int sum2 = 0;
//		int [] arr = {10, 17, 3, 9, 27, 10, 8, 9, 13, 21};
//		for(int i = 0; i < arr.length; i++) {
//			if( i % 2 ==0) {
//				sum1 += arr[i];
//			}else {
//				sum2 += arr[i];
//			}
//		}
//		
//		System.out.println(sum2 - sum1);

		
//////////////////////////////////////////////////////////////
		
		// Q.3
		
//		int [] arr = {10, 17, 3, 9, 27, 10, 8, 9, 13, 21};
//		int [] rank = new int [arr.length];
//		int max = 0;
//		
//		for(int i = 0; i < arr.length; i++) {
//			rank[i] = 1; // 모두 1등이라고 우선 가정
//		}
//		
//		
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr.length; j++) {
//				if(arr[i] < arr[j]) {
//					rank[i]++;
//				}
//			}
//			
//		}
//		
//		for(int i = 0; i < arr.length; i++) {
//			System.out.print(rank[i] + " ");
//		}
		
		
//////////////////////////////////////////////////////////////		
		
		// Q.4
		
		int [] arr = {10, 17, 3, 9, 27, 10, 8, 9, 13, 21};
		
		int [] over_arr = new int[arr.length];
		int [] ret_arr = new int[arr.length];
		

		for(int i = 0; i < arr.length; i++) {
			boolean flag = true;
			loop : for(int j = 0; j < arr.length; j++) {
				if(i != j) {
					if(arr[j] == arr[i]) {
						for(int k = 0; k < arr.length; k++) {
							if(over_arr[k] == arr[j]) {break loop;}
						}
						over_arr[i] = arr[i];
						flag = false;
						break;
					}
				}
			}
			if(flag) {
				ret_arr[i] = arr[i];
			}
			
		}
		
		
		Arrays.sort(over_arr);
		Arrays.sort(ret_arr);
		
		for(int i = 0; i < arr.length; i++) {
			if(over_arr[i] != 0) {
				System.out.print(over_arr[i] + " ");
			}
		}
		System.out.println();
		System.out.println("==============================");
		for(int i = 0; i < arr.length; i++) {
			if(ret_arr[i] != 0) {
				System.out.print(ret_arr[i]+ " ");
			}
		}
		
		
	}

}
