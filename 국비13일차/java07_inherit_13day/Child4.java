package java07_inherit_13day;

public class Child4 extends Parent4 {

	public Child4() {
		super(); // 수퍼 생성자, 생략되어 있음

		System.out.println("Child Constuctor");
	}

	public Child4(int num) {
		super.num = num;
		//super(num); 이것도 가능하다.
		//this.num = num; 자식클래스에 동일한 필드명이 없으면 이것도 됨
		System.out.println("Child Constuctor");
		System.out.println(this.num);
	}


}
