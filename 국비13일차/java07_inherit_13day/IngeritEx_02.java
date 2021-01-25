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
		//안됨
		//Child2 cp = (Child2) new Parent2();
		//java.lang.ClassCastException 예외 발생
		
		//자식클래스타입을 부모클래스타입으로 형변환 가능	
		//부모클래스타입을 자식클래스타입으로 형변환 불가능
		// java.lang.ClassCastException 예외 발생
		
	}

}
