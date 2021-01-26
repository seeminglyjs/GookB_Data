package practice_14day.practice2.productEx;

public class Tv extends Product{
//	private String model;
//	private int price;
	
	public Tv() {
		
	}
	
//	public Tv(String model, int price) {
//		this.model = model;
//		this.price = price;
//	}
	
	
	public Tv(String model, int price) {
		super(model,price);
	}
	
	@Override
	public void out() {
		System.out.println("Tv");
		System.out.println(model + " / " + price);
	}
	
	
	//getter / setter
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
