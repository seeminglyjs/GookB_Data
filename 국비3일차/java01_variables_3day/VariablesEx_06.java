//package선언 - 소스코드가 포함된 패키지 
package java01_variables_3day;

//클래스 정의 코드 
public class VariablesEx_06 {

	public static void main(String[] args) {
		
		System.out.println(777); //int 형 리터럴 상수
		
		final int MAX; // 변수의 상수화
		
		MAX = 100;
		/* max = 200; */ //컴파일 에러 발생 
		
		//관례적으로 이름있는 상수의 이름은 모두 대문자로 작성한다.
		//일반 변수와 구분하기 위한
		//상수 명의 단어 구분은 _ 로 한다.
		
		final int STUDENT_NUM = 50;
		double avg = 1000 / STUDENT_NUM;
		
	
	}//메인 메소드 정의 끝

} // 클래스 정의 끝
