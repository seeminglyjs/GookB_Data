package java05_array_9day.array2D;

import java.util.Scanner;

public class Array2D_07 {

	public static void main(String[] args) {
		
//		//학생 성적 관리 프로그램
//		
//		//1~3학년
//		//2개반
//		//4먕의 학생
//		//3명과목
//		//점수
//		
//		int [][][][] score = new int[3][2][4][3];
//		//-----------------------------------------
		
		// 2명의 국어 영어 수학 점수를 저장하는 배열
		int [][] sco = new int[2][3];
		int [] sum = new int[2];
		
		double[] avg = new double [2];
		final String [] subject = {"국어", "영어", "수학"};
		
		Scanner scan = new Scanner(System.in);
		for(int i =0; i < sco.length; i++) {
			System.out.println((i + 1) + " 학생의 국어, 영어, 수학 점수를 입력하세요!");
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
