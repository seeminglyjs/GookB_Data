package java05_array_9day.array2D;

import java.util.Scanner;

public class Array2D_07 {

	public static void main(String[] args) {
		
//		//�л� ���� ���� ���α׷�
//		
//		//1~3�г�
//		//2����
//		//4���� �л�
//		//3�����
//		//����
//		
//		int [][][][] score = new int[3][2][4][3];
//		//-----------------------------------------
		
		// 2���� ���� ���� ���� ������ �����ϴ� �迭
		int [][] sco = new int[2][3];
		int [] sum = new int[2];
		
		double[] avg = new double [2];
		final String [] subject = {"����", "����", "����"};
		
		Scanner scan = new Scanner(System.in);
		for(int i =0; i < sco.length; i++) {
			System.out.println((i + 1) + " �л��� ����, ����, ���� ������ �Է��ϼ���!");
			for(int j =0; j < sco[i].length; j++) {
				System.out.print(subject[j] + " -> ");
				sco[i][j] = scan.nextInt();	
				System.out.println();
			}
			
			for(int s = 0; s < sco[i].length; s++) {
				sum[i] += sco[i][s];
			}
			
			avg[i] = Math.round((double) sum[i] / 3 * 100) / 100.0;
			
		}

		for(int i =0; i < sco.length; i++) {
			System.out.println(sum[i] + " / " + avg[i]);
		}
	}

}
