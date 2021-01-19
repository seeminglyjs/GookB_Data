package java05_array_9day.array2D;

import java.util.Scanner;

public class Array2D_06 {

	public static void main(String[] args) {
		
		int [] arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		
		System.out.println(arr.length);
		// .참조연산자
		
		arr = new int [3];
		// 기존 heap 영영의 5개자리 배열은 제거된다.
		// gc를 통해서 제거 -> 제거되는 시점은
		// 컴퓨터 사양(메모리)에 따라 다르다.
		// gc 는 jvm 안에 포함되어 있다.
				
		
		
		//정적할당은 Stack에 저장되고
		// 동적할당은 Heap에 저장된다.
		
	}

}
