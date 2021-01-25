package java07_inherit_13day.quiz;

public class Rectangle extends Point {

	private int width;
	private int height;
	
	public Rectangle() {
		
	}
	public Rectangle(int x, int y, int width, int height) {
		super(x,y);
		this.width = width;
		this.height = height;
	}
	
	@Override
	public void draw() {	
		super.draw();
		System.out.println("사각형의 둘레");
		System.out.printf("%.1f\n", ((double)width * height));
		System.out.println("사각형의 면적");
		System.out.printf("%.1f\n", ((double)(2 * width) + (2 * height)));
	}
	
	
	
//////////getter / setter ////////////	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	
	
}
