package java07_inherit_13day;

public class IngeritEx_01 {

	public static void main(String[] args) {
		
		Parent p = new Parent();
		
		
		p.name = "aaa";
		p.num = 35;
		//////////////////////////////////////////////
		
		
		Child c = new Child();
		c.name = "bbbb"; // inheritance
		c.num = 25; // inheritance
		c.score = 100;
		///////////////////////////////////////////////	
		
		p.display();
		System.out.println("==============================");
		//c.display(); // »ó¼Ó
		//c.print();
		c.display();
	}

}
