package java07_inherit_13day.quiz;

public class Circle extends Point {
	private int radius; // ������
	
	public Circle() {
		
	}
	public Circle(int x, int y, int radius) {
		super(x,y);
		this.radius = radius;
	}
	
	
	@Override
	public void draw() {
		//�߽���
		super.draw(); 
		//���� ����
		System.out.println("���� �ѷ�");
		System.out.printf("%.1f\n", (2 * Math.PI * radius));
		// ���� �ѷ�
		System.out.println("���� ����");
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
