package java07_inherit_13day;

public class Child4 extends Parent4 {

	public Child4() {
		super(); // ���� ������, �����Ǿ� ����

		System.out.println("Child Constuctor");
	}

	public Child4(int num) {
		super.num = num;
		//super(num); �̰͵� �����ϴ�.
		//this.num = num; �ڽ�Ŭ������ ������ �ʵ���� ������ �̰͵� ��
		System.out.println("Child Constuctor");
		System.out.println(this.num);
	}


}
