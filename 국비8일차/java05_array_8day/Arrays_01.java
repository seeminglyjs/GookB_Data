package java05_array_8day;

public class Arrays_01 {

	public static void main(String[] args) {
		
		//배열, array
		// 변수들의 나열, 묶음
		
		int [] arr; //int 형 배열 변수 선언
					//참조형 타입이다.

		arr = new int[5];
		
		arr[0] = 11; // 요소(element)를 대입한다.
		arr[1] = 22;
		arr[2] = 33;
		arr[3] = 44;
		arr[4] = 55;
//		arr[5] = 66; // -> 배열범위초과 예외 발생
		
	
	
		for(int i =0; i < 5; i++) {
			arr[i] = (i + 1) * 100;
			System.out.println(arr[i]);
		}
	
		System.out.println(arr.toString()); //배열 이름 출력하기
		//[I @ 2a139a55 -> 참조값
		
		// 참조값 : 데이터가 저장되어있는 메모리의 주소
		// @ 뒤는 16진수이다.
	}

}
