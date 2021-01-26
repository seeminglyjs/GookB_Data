package practice_14day.practice2.productEx;

public class Person {
	private String name;
	private int money;
	private Product prod;

	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void buy(Product prod) {
		this.prod = prod;
		money = money - prod.getPrice();
		if(money < 0 ) {
			System.out.println("[ NO Money!!!!!!! ]");
		}else {
			System.out.println("left Money - > " + money);
		}
		
	}

	
	////getter / setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public Product getProd() {
		return prod;
	}

	public void setProd(Product prod) {
		this.prod = prod;
	}
	
	
	
	
	
}
