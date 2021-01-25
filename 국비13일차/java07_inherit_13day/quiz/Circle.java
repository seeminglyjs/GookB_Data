package java07_inherit_13day.quiz;

public class Circle extends Point {
	private int radius; // 반지름
	
	public Circle() {
		
	}
	public Circle(int x, int y, int radius) {
		super(x,y);
		this.radius = radius;
	}
	
	
	@Override
	public void draw() {
		//중심점
		super.draw(); 
		//원의 면적
		System.out.println("원의 둘레");
		System.out.printf("%.1f\n", (2 * Math.PI * radius));
		// 원의 둘레
		System.out.println("원의 면적");
		System.out.printf("%.1f\n ", Math.pow((Math.PI *  radius), 2));
	}
	
	/////////getter / setter//////////
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	
	
	
}
