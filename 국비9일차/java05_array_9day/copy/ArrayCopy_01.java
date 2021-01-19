package java05_array_9day.copy;

import java.util.Arrays;

public class ArrayCopy_01 {

	public static void main(String[] args) {
		// 배열 복사하기
		
		int [] arr1 = {10,20,30};
		int [] arr2;
		
		arr2 = arr1; //얕은 복사하고 한다.
		// object 의 clone()과는 다르다.
		// 참조번지만 복사됨
		
//		for(int i = 0; i < arr2.length; i++) {
//			System.out.println(arr2[i]);
//		}
		
		arr1[1] = -1;	
		System.out.println(arr2[1]);
		//직접 대입은 한쪽의 값을 바꿔도 다른배열의 값도 바뀐다.
		// 참조형 변수이기 때문이다.
		// 즉 참조하는 주소가 복사되어 값이 같이 변하게 된다.
		
		arr2 = Arrays.copyOf(arr1, arr1.length);
		for(int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}

	}

}
