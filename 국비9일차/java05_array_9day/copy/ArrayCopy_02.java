package java05_array_9day.copy;

import java.util.Arrays;

public class ArrayCopy_02 {

	public static void main(String[] args) {
		// �迭 �����ϱ�
		
		int [] arr1 = {10,20,30};
		int [] arr2;
		// ���� ����
		// ���� ����� ���빰�� ���ο� ������ �����ϴ� ��
		
		// ������������ �и��� ���� ������ ������ �ȴ�.
		
		
		arr2 = new int[3];
		for(int i =0; i < arr2.length; i++) {
			arr2[i] = arr1[i];
		}
		//�ݺ����� ���� ���� ����
		
		arr1[1] = -1;	
		System.out.println(arr2[1]);
		// arr2[1] �� ������ �ٲ��� �ʴ´�.
		// ���������� �ƴ� �� ��ü�� �־��־��� �����̴�.
		
//		arr2 = Arrays.copyOf(arr1, arr1.length);
//		for(int i = 0; i < arr2.length; i++) {
//			System.out.println(arr2[i]);
//		}

	}

}
