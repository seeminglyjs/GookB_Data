package java05_array_9day.copy;

import java.util.Arrays;

public class ArrayCopy_01 {

	public static void main(String[] args) {
		// �迭 �����ϱ�
		
		int [] arr1 = {10,20,30};
		int [] arr2;
		
		arr2 = arr1; //���� �����ϰ� �Ѵ�.
		// object �� clone()���� �ٸ���.
		// ���������� �����
		
//		for(int i = 0; i < arr2.length; i++) {
//			System.out.println(arr2[i]);
//		}
		
		arr1[1] = -1;	
		System.out.println(arr2[1]);
		//���� ������ ������ ���� �ٲ㵵 �ٸ��迭�� ���� �ٲ��.
		// ������ �����̱� �����̴�.
		// �� �����ϴ� �ּҰ� ����Ǿ� ���� ���� ���ϰ� �ȴ�.
		
		arr2 = Arrays.copyOf(arr1, arr1.length);
		for(int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}

	}

}
