package java07_inherit_13day;

public class IngeritEx_02 {

	public static void main(String[] args) {

		Child2 c = new Child2();

		//c.num = 555;
		//System.out.println(c.num);
		c.display();

		/////////////////////////////////////////////////////
		System.out.println();
		System.out.println("=========================");
		Parent2 p = new Parent2();
		p.num =888;
		p.display();

		/////////////////////////////////////////////////////
		System.out.println();
		System.out.println("=========================");
		
		Parent2 pc = new Child2();
		pc.display();
		
		//Child2 cp = new Parent2();
		//�ȵ�
		//Child2 cp = (Child2) new Parent2();
		//java.lang.ClassCastException ���� �߻�
		
		//�ڽ�Ŭ����Ÿ���� �θ�Ŭ����Ÿ������ ����ȯ ����	
		//�θ�Ŭ����Ÿ���� �ڽ�Ŭ����Ÿ������ ����ȯ �Ұ���
		// java.lang.ClassCastException ���� �߻�
		
	}

}
