package java05_array_9day.copy;

import java.util.Arrays;

public class ArrayCopy_02 {

	public static void main(String[] args) {
		// 배열 복사하기
		
		int [] arr1 = {10,20,30};
		int [] arr2;
		// 깊은 복사
		// 참조 대상의 내용물을 새로운 공간에 복사하는 것
		
		// 원본데이터의 분리된 저장 공간을 가지게 된다.
		
		
		arr2 = new int[3];
		for(int i =0; i < arr2.length; i++) {
			arr2[i] = arr1[i];
		}
		//반복문을 통한 깊은 복사
		
		arr1[1] = -1;	
		System.out.println(arr2[1]);
		// arr2[1] 의 내용은 바뀌지 않는다.
		// 참조번지가 아닌 값 자체를 넣어주었기 때문이다.
		
//		arr2 = Arrays.copyOf(arr1, arr1.length);
//		for(int i = 0; i < arr2.length; i++) {
//			System.out.println(arr2[i]);
//		}

	}

}
