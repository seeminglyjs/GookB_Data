package java07_inherit_13day;

public class Child extends Parent {
	int score;
	
	//Annotation
	// �ڵ��� �ΰ����� �ǹ̸� �ο��� �� ����Ѵ�.
	// Ư�� �����̳� ������ �ڵ忡 ������ �����ų �� �ִ�.
	
	//////////////////////////////////////////////////////////////
	@Override // �������̵� ��Ģ�� �� ���״��� ��ȿ�� �˻縦 �Ѵ�.
	// ������ ���� ������ �߻��Ѵ�.
	public void display() {
		//�������̵� �޼ҵ�
		System.out.println("Child Class!!");
	}
	
	
	public void print() {
		System.out.println("Child Class!!");
	}
}
