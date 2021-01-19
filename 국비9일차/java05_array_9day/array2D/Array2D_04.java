package java05_array_9day.array2D;

import java.util.Scanner;

public class Array2D_04 {

	public static void main(String[] args) {
		
		// new
		// 동작 할당 연산자
		
		// 정적 할당 -> 변수 선언
		// 동작 할당 -> new  연산자를 이용한 공간 생성
		
		//할당: 변수 공간이 생성됨(저장 공간 생성)
		
		//정적, static : 실행되기 직전(실행된 직후)
		//동적, dynamic : 실행 중
		
		
		int num; // int 형 변수 선언 -> 정적 할당
		int [] arr; // int []형 변수 선언 -> 정적 할당
		
		// 메인 메소드에서 정적할당된 변수들은 Stack 메모리영역
		// 에 저장된다.
		
		arr = new int[5]; // 동적 할당
		
		//동적할당된 저장 공간들을 Heap메모리영역에 생성된다.
		
		//int [] arr2 = new int[-7];
		//배열 생성(new)은 동적할당
		// -> 컴파일시점에는 에러인지 모르고 실행해보고
		// 알게된다.
	
		
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
