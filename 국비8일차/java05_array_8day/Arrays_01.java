package java05_array_8day;

public class Arrays_01 {

	public static void main(String[] args) {
		
		//�迭, array
		// �������� ����, ����
		
		int [] arr; //int �� �迭 ���� ����
					//������ Ÿ���̴�.

		arr = new int[5];
		
		arr[0] = 11; // ���(element)�� �����Ѵ�.
		arr[1] = 22;
		arr[2] = 33;
		arr[3] = 44;
		arr[4] = 55;
//		arr[5] = 66; // -> �迭�����ʰ� ���� �߻�
		
	
	
		for(int i =0; i < 5; i++) {
			arr[i] = (i + 1) * 100;
			System.out.println(arr[i]);
		}
	
		System.out.println(arr.toString()); //�迭 �̸� ����ϱ�
		//[I @ 2a139a55 -> ������
		
		// ������ : �����Ͱ� ����Ǿ��ִ� �޸��� �ּ�
		// @ �ڴ� 16�����̴�.
	}

}
