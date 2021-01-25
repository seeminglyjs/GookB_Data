package java07_inherit_13day.quiz;

public class Point {
	protected int  x; //x ��ǥ
	protected int  y; //y ��ǥ

	public Point() {
		//�⺻ ��ǥ�� (0, 0) ���� �Ѵ�.
		this.x = 0;
		this.y = 0;
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void draw() { // ��ǥ��� �޼���
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
