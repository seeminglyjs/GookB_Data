package java05_array_9day.copy;

import java.util.Arrays;

public class ArrayCopy_03 {

	public static void main(String[] args) {
		// �迭 �����ϱ�
		
		int [] arr1 = {10,20,30};
		int [] arr2 = new int[3];
		
		// ���� ����
	
//		System.arraycopy(src, srcPos, dest, destPos, length);
//			src : �����迭
//			srcIdx :  �����迭���� ���簡 ���۵� �ε���
//			dest : �纻 �迭
//			destIdx : �纻 �迭���� ���簡 ���۵� �ε���
//			length: ���簡 �� ����� ����
		
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
