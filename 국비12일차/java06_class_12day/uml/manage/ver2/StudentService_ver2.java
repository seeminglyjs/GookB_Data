package java06_class_12day.uml.manage.ver2;

import java.util.Scanner;

import java06_class_12day.uml.manage.Student;

public class StudentService_ver2 {

	private Scanner sc;
	private Student[] stuArr = new Student [3];

	public StudentService_ver2() {
		sc = new Scanner(System.in);	
		for(int i =0; i < stuArr.length; i++) {
			stuArr[i] = new Student();
		}
	}

	private int getIdx() {
		int idx;
		do {
			System.out.print("몇번째학생? ");
			idx = sc.nextInt();
			if(idx<1 || idx>3)
				System.out.println(" >> Error : 3명만 존재합니다");
		} while(idx<1 || idx>3);

		return idx;
	}

		private void insertInfo(Student stu, int idx) {
			System.out.println(idx + " 학생의 정보를 입력 하세요.");
			System.out.print("이름 ->");
			System.out.println();
			stuArr[idx].setName(sc.next());
			System.out.print("나이 ->");
			System.out.println();
			stuArr[idx].setAge(sc.nextInt());
		}

	public void insertInfoAll() {
		for(int i = 0; i < stuArr.length; i++) {
			System.out.println((i + 1) + " 학생의 정보를 입력 하세요.");
			System.out.print("이름 ->");
			stuArr[i].setName(sc.next());
			System.out.println();
			System.out.print("나이 ->");
			System.out.println();
			stuArr[i].setAge(sc.nextInt());
		}

	}
	public void insertInfoIdx() {
		int idx = getIdx();
		insertInfo(stuArr [idx], idx);
	}


		private void insertScore(Student stu, int idx) {
			System.out.println(idx + " 학생의 정보를 입력 하세요.");
			System.out.print("국어 ->");
			System.out.println();
			stuArr[idx].setKor(sc.nextInt());
			System.out.print("영어 ->");
			System.out.println();
			stuArr[idx].setEng(sc.nextInt());
			System.out.print("수학 ->");
			System.out.println();
			stuArr[idx].setMath(sc.nextInt());
			calcSum(idx);
			calcAvg(idx);
		}

	public void insertScoreAll() {
		for(int i = 0; i < stuArr.length; i++) {
			System.out.println((i + 1) + " 학생의 정보를 입력 하세요.");
			System.out.print("국어 ->");
			System.out.println();
			stuArr[i].setKor(sc.nextInt());
			System.out.print("영어 ->");
			System.out.println();
			stuArr[i].setEng(sc.nextInt());
			System.out.print("수학 ->");
			System.out.println();
			stuArr[i].setMath(sc.nextInt());
			calcSum(i);
			calcAvg(i);
		}
	}


	public void insertScoreIdx() {
		int idx = getIdx();
		insertScore(stuArr [idx], idx);
	}


	public void insertStu(int idx) {
		insertInfo(stuArr [idx], idx);
		insertScore(stuArr [idx], idx);
	}
	
	public void insertStuAll() {
		insertInfoAll();
		insertScoreAll();
	}


	private void calcSum(int i) {// 합계	
		stuArr[i].setSum(stuArr[i].getKor() + stuArr[i].getEng() + stuArr[i].getMath() );
	}

	private void calcAvg(int i) {// 평균
		double temp = stuArr[i].getSum() / 3.0;			 
		// sum을 과목수로 나눈 값을 저장할 임시 변수
		stuArr[i].setAvg(Math.round(temp * 100) / 100.0);
		System.out.println();


	}


	//	private void printStu(Student [] stuArr, int idx) {
	//		this.stuArr = stuArr;
	//	}

	public void printStuAll() {
		for(int i = 0; i < stuArr.length; i++) {
			System.out.println();
			System.out.println("===============================");
			System.out.print("이름 : " + stuArr[i].getName() + "\t" + "나이 : " + stuArr[i].getAge()+ "\t");
			System.out.print("국어 : " + stuArr[i].getKor() + "\t" + "영어 : " + stuArr[i].getEng() + "\t" + "수학 : " +  stuArr[i].getMath()+ "\t");
			System.out.println("합계 : " + stuArr[i].getSum() + "\t" + "평균 : " + stuArr[i].getAvg());	
			System.out.println();
		}
	}

	public void printStuIdx() {
		int idx = getIdx();
		System.out.println();
		System.out.println("===============================");
		System.out.print("이름 : " + stuArr[idx].getName() + "\t" + "나이 : " + stuArr[idx].getAge()+ "\t");
		System.out.print("국어 : " + stuArr[idx].getKor() + "\t" + "영어 : " + stuArr[idx].getEng() + "\t" + "수학 : " +  stuArr[idx].getMath()+ "\t");
		System.out.println("합계 : " + stuArr[idx].getSum() + "\t" + "평균 : " + stuArr[idx].getAvg());	
		System.out.println();
	}






}
