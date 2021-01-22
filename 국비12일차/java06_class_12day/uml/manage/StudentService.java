package java06_class_12day.uml.manage;

import java.util.Scanner;

public class StudentService {
	private Student stu;
	private Scanner input;
	
	public StudentService() {
		stu = new Student();
		input = new Scanner(System.in);
		// 사용할 객체 생성(초기화)
	}
	
	public void insertInfo() {	
		System.out.println("이름과 나이를 입력하세요.");		
		stu.setName(input.next());
		stu.setAge(input.nextInt());
	}
	
	public void insertScore() {
		System.out.println("점수를 입력하세요. 국/영/수");
		stu.setKor(input.nextInt());
		stu.setEng(input.nextInt());
		stu.setMath(input.nextInt());
		calcSum(); // 합계 메소드 호출
		calcAvg(); // 평균 메소드 호출
	}
	
	private void calcSum() {// 합계
		stu.setSum(stu.getKor() + stu.getEng() + stu.getMath() );
	}
	private void calcAvg() {// 평균
		double temp = stu.getSum() / 3.0; 
		// sum을 과목수로 나눈 값을 저장할 임시 변수
		stu.setAvg(Math.round(temp * 100) / 100.0 );
		System.out.println();
	}
	
	public void printStu() {
		System.out.println();
		System.out.println("===============================");
		System.out.print("이름 : " + stu.getName() + "\t" + "나이 : " + stu.getAge());
		System.out.print("국어 : " + stu.getKor() + "\t" + "영어 : " + stu.getEng() + "\t" + "수학 : " +  stu.getMath());
		System.out.println("합계 : " + stu.getSum() + "\t" + "평균 : " + stu.getAvg());	
		System.out.println();
	}


}
