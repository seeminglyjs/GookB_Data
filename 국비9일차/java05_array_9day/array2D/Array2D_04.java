package java05_array_9day.array2D;

import java.util.Scanner;

public class Array2D_04 {

	public static void main(String[] args) {
		
		// new
		// ���� �Ҵ� ������
		
		// ���� �Ҵ� -> ���� ����
		// ���� �Ҵ� -> new  �����ڸ� �̿��� ���� ����
		
		//�Ҵ�: ���� ������ ������(���� ���� ����)
		
		//����, static : ����Ǳ� ����(����� ����)
		//����, dynamic : ���� ��
		
		
		int num; // int �� ���� ���� -> ���� �Ҵ�
		int [] arr; // int []�� ���� ���� -> ���� �Ҵ�
		
		// ���� �޼ҵ忡�� �����Ҵ�� �������� Stack �޸𸮿���
		// �� ����ȴ�.
		
		arr = new int[5]; // ���� �Ҵ�
		
		//�����Ҵ�� ���� �������� Heap�޸𸮿����� �����ȴ�.
		
		//int [] arr2 = new int[-7];
		//�迭 ����(new)�� �����Ҵ�
		// -> �����Ͻ������� �������� �𸣰� �����غ���
		// �˰Եȴ�.
	
		
		int [][] arr3 = new int[3][];
		
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < arr3.length; i++) {
			int len = scan.nextInt();
			arr3[i] = new int[len];
		}

		for(int i =0; i < arr3.length; i++) {
			for(int j =0; j < arr3[i].length; j++) {
				System.out.print(arr3[i][j] + " ");
			}
			System.out.println();
		}
	}

}
