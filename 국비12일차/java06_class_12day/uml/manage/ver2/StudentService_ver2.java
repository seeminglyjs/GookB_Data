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
			System.out.print("���°�л�? ");
			idx = sc.nextInt();
			if(idx<1 || idx>3)
				System.out.println(" >> Error : 3�� �����մϴ�");
		} while(idx<1 || idx>3);

		return idx;
	}

		private void insertInfo(Student stu, int idx) {
			System.out.println(idx + " �л��� ������ �Է� �ϼ���.");
			System.out.print("�̸� ->");
			System.out.println();
			stuArr[idx].setName(sc.next());
			System.out.print("���� ->");
			System.out.println();
			stuArr[idx].setAge(sc.nextInt());
		}

	public void insertInfoAll() {
		for(int i = 0; i < stuArr.length; i++) {
			System.out.println((i + 1) + " �л��� ������ �Է� �ϼ���.");
			System.out.print("�̸� ->");
			stuArr[i].setName(sc.next());
			System.out.println();
			System.out.print("���� ->");
			System.out.println();
			stuArr[i].setAge(sc.nextInt());
		}

	}
	public void insertInfoIdx() {
		int idx = getIdx();
		insertInfo(stuArr [idx], idx);
	}


		private void insertScore(Student stu, int idx) {
			System.out.println(idx + " �л��� ������ �Է� �ϼ���.");
			System.out.print("���� ->");
			System.out.println();
			stuArr[idx].setKor(sc.nextInt());
			System.out.print("���� ->");
			System.out.println();
			stuArr[idx].setEng(sc.nextInt());
			System.out.print("���� ->");
			System.out.println();
			stuArr[idx].setMath(sc.nextInt());
			calcSum(idx);
			calcAvg(idx);
		}

	public void insertScoreAll() {
		for(int i = 0; i < stuArr.length; i++) {
			System.out.println((i + 1) + " �л��� ������ �Է� �ϼ���.");
			System.out.print("���� ->");
			System.out.println();
			stuArr[i].setKor(sc.nextInt());
			System.out.print("���� ->");
			System.out.println();
			stuArr[i].setEng(sc.nextInt());
			System.out.print("���� ->");
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


	private void calcSum(int i) {// �հ�	
		stuArr[i].setSum(stuArr[i].getKor() + stuArr[i].getEng() + stuArr[i].getMath() );
	}

	private void calcAvg(int i) {// ���
		double temp = stuArr[i].getSum() / 3.0;			 
		// sum�� ������� ���� ���� ������ �ӽ� ����
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
			System.out.print("�̸� : " + stuArr[i].getName() + "\t" + "���� : " + stuArr[i].getAge()+ "\t");
			System.out.print("���� : " + stuArr[i].getKor() + "\t" + "���� : " + stuArr[i].getEng() + "\t" + "���� : " +  stuArr[i].getMath()+ "\t");
			System.out.println("�հ� : " + stuArr[i].getSum() + "\t" + "��� : " + stuArr[i].getAvg());	
			System.out.println();
		}
	}

	public void printStuIdx() {
		int idx = getIdx();
		System.out.println();
		System.out.println("===============================");
		System.out.print("�̸� : " + stuArr[idx].getName() + "\t" + "���� : " + stuArr[idx].getAge()+ "\t");
		System.out.print("���� : " + stuArr[idx].getKor() + "\t" + "���� : " + stuArr[idx].getEng() + "\t" + "���� : " +  stuArr[idx].getMath()+ "\t");
		System.out.println("�հ� : " + stuArr[idx].getSum() + "\t" + "��� : " + stuArr[idx].getAvg());	
		System.out.println();
	}






}
