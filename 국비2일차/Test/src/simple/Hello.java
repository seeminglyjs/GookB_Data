
//패키지선언
//소스코드 파일이 어떤 패키지인지 알려준다.
// simple패키지에 포함된 소스코드라는 것을 알린다.
package simple; //패키지 심플
// - 패키지는 프로그램을 구성하는 코드들을 모아놓는 폴더이다.
// - 비슷한 기능이나 하나의 기능을 구현할 때 필요한 소스코드들 끼리 모아 놓는다.
// - 자바 프로젝트에는 반드시 1개 이상의 패키지로 구성한다.


//클래스 정의 코드
public class Hello {//퍼블릭 클래스 헬로
	//main 은 program의 시작점
	public static void main (String[] args) {
		
		//콘솔console 창에 문장을 출력하는 코드
		System.out.print("Hello java");
		//문장 출력
		System.out.println("안녕하세요!");
		//문장 출력 후 개행 한다.
		
	}
}//hello 클래스의 끝

//회사별 코드 컨벤션 - 코딩 스타일 규칙이 있다.
