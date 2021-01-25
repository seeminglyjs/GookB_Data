package java07_inherit_13day.quiz;

public class Point {
	protected int  x; //x ÁÂÇ¥
	protected int  y; //y ÁÂÇ¥

	public Point() {
		//±âº» ÁÂÇ¥´Â (0, 0) À¸·Î ÇÑ´Ù.
		this.x = 0;
		this.y = 0;
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void draw() { // ÁÂÇ¥Ãâ·Â ¸Ş¼­µå
		System.out.println("x : " + x + " / " + "y : "+ y);
	}
	
/////////getter / setter//////////	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	

}
