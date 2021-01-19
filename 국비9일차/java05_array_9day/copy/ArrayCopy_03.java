package java05_array_9day.copy;

import java.util.Arrays;

public class ArrayCopy_03 {

	public static void main(String[] args) {
		// 배열 복사하기
		
		int [] arr1 = {10,20,30};
		int [] arr2 = new int[3];
		
		// 깊은 복사
	
//		System.arraycopy(src, srcPos, dest, destPos, length);
//			src : 원본배열
//			srcIdx :  원본배열에서 복사가 시작될 인덱스
//			dest : 사본 배열
//			destIdx : 사본 배열에서 복사가 시작될 인덱스
//			length: 복사가 될 요소의 개수
		
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		for(int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		arr1[1] = -1;
		System.out.println("arr2[1] -> " + arr2[1]);
		
		
//		arr2 = Arrays.copyOf(arr1, arr1.length);
//		for(int i = 0; i < arr2.length; i++) {
//			System.out.println(arr2[i]);
//		}
		
	}

}
