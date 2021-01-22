package java06_class_12day.uml.manage;

import java.util.Scanner;

public class StudentService {
	private Student stu;
	private Scanner input;
	
	public StudentService() {
		stu = new Student();
		input = new Scanner(System.in);
		// ����� ��ü ����(�ʱ�ȭ)
	}
	
	public void insertInfo() {	
		System.out.println("�̸��� ���̸� �Է��ϼ���.");		
		stu.setName(input.next());
		stu.setAge(input.nextInt());
	}
	
	public void insertScore() {
		System.out.println("������ �Է��ϼ���. ��/��/��");
		stu.setKor(input.nextInt());
		stu.setEng(input.nextInt());
		stu.setMath(input.nextInt());
		calcSum(); // �հ� �޼ҵ� ȣ��
		calcAvg(); // ��� �޼ҵ� ȣ��
	}
	
	private void calcSum() {// �հ�
		stu.setSum(stu.getKor() + stu.getEng() + stu.getMath() );
	}
	private void calcAvg() {// ���
		double temp = stu.getSum() / 3.0; 
		// sum�� ������� ���� ���� ������ �ӽ� ����
		stu.setAvg(Math.round(temp * 100) / 100.0 );
		System.out.println();
	}
	
	public void printStu() {
		System.out.println();
		System.out.println("===============================");
		System.out.print("�̸� : " + stu.getName() + "\t" + "���� : " + stu.getAge());
		System.out.print("���� : " + stu.getKor() + "\t" + "���� : " + stu.getEng() + "\t" + "���� : " +  stu.getMath());
		System.out.println("�հ� : " + stu.getSum() + "\t" + "��� : " + stu.getAvg());	
		System.out.println();
	}


}
