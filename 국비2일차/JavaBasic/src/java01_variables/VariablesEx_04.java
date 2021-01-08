//package선언 - 소스코드가 포함된 패키지 
package java01_variables;

//클래스 정의 코드 
public class VariablesEx_04 {

	public static void main(String[] args) {
		
	double height; // 사람의 키
	
	height = 200.5;
	
	System.out.println("이 사람의 키는 " + height);
	
	double data;
	data = height + 100;
	System.out.println(data);
	System.out.println("----------------------------------");	
	
	char alpha;
	
	alpha='T';
	System.out.println(alpha);
	
	alpha = 99;
	System.out.println(alpha);
	
	System.out.println("----------------------------------");
	boolean isRight;
	
	isRight = true;
	
	System.out.println(isRight);
	
	
	
	}//메인 메소드 정의 끝

} // 클래스 정의 끝
