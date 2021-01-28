package java09_api_15day;

import java.util.Arrays;

class Point implements Cloneable {
	int x;
	int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "[ " + x  + " / " + y + " ]";
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		if(this.x == ((Point)obj).x && this.y == ((Point)obj).y) {
		//(Point)�� �����ִ� ������ Object�� Point�� ������ �� ����
		// �̴� �θ� �ڽ��� �����ִ� ���� �����ϳ�
		// �ڽ��� �θ� ���Ҽ��� ���� �����̴�.
		// ������ Object Ŭ������ Object���� ������ �� �ִ�.
//			return true;
//		}else {
//			return false;
//		}
			
		@Override
		public boolean equals(Object obj) {
			if(obj instanceof Point) {
				// �Էµ� obj�� �켱 Point�� �ν��Ͻ����� üũ
				Point p = (Point) obj;
				// ���� �ʵ尪 �񱳸� ���� ����ȯ
				return p.x == x && p.y == y;
				// �Էµ� �����Ϳ� ���� �ʵ��� ������ ��
				// ������ false �ƴϸ� true
			}else {
				return false;
				// �ν��Ͻ��� �ƴϸ� false
			}	
	}
		
		@Override
		public Object clone() throws CloneNotSupportedException {
			//public���� Ÿ���� �ٲ��־� ���Ŭ������ �ƴ� ��������
			// ������ �� �ְ� ���ش�.
			return super.clone();
		}
		
	
}
	
public class ObjectEx {
	public static void main(String[] args) {
		
//		Object obj = new Object();
//		Point p1 = new Point(10, 20);
//		
//		
//		//��ü������ ����ϸ� �������� ���
//		System.out.println(obj);
//		System.out.println(p1);
//		// obj.toString�� ���� ����� ������.
//		// p1.toString�� ���� ����� ������.
//		
//		System.out.println("======toString()======");
//		System.out.println(obj.toString());
//		System.out.println(p1.toString());
		
		
//		System.out.println("======equals()======");
//		
		Point p2 = new Point(11, 22);
		Point p3 = new Point(11, 22);
		Point p4 = p2;
//		
//		System.out.println(p2);
//		System.out.println(p3);
//		System.out.println(p4);
//		
//		
//		System.out.println("p2==p3 :" + (p2==p3));
//		System.out.println("p2==p3 :" + (p2==p4));
//		//�����ں�(���ϼ� ��) identity
//		// ���ϴ� ��ü�� ���� ��ü���� �˻��Ѵ�.
//		// �������� ���Ѵ�.
//		
//		
//		System.out.println("p2.equals(p3) :" + p2.equals(p3));
//		System.out.println("p2.equals(p4) :" + p2.equals(p4));
//		// equals �޼ҵ� ��(��� ��), equality
//		// equals �޼ҵ� ��(��� ��), equality
//		// ��ü�� ���� ���� ���� ������ �� �˻�
		
		
//		System.out.println("======hashCode()======");
//		
//		System.out.println(p2.hashCode());
//		System.out.println(p3.hashCode());
//		System.out.println(p4.hashCode());
//		
//		
//		String s1 = new String("aaa"); 
//		String s2 = new String("aaa"); 
//		String s3 = new String("bbb");
//		String s4 = s1;
//		
//		System.out.println(s1.hashCode());
//		System.out.println(s2.hashCode()); //s1�� ����.
//		System.out.println(s3.hashCode());
//		System.out.println(s4.hashCode()); //s1�� ����.
//		// String ��ü���� hashCode�� ������ �߱� �����̴�.
		
		System.out.println("======clone()======");
		
		Point oP = new Point(33, 44);
		
		Point cloneP1 = oP; //  ���� ����
		Point cloneP2 = new Point (oP.x, oP.y); // ���� ����
		////////////////////////////////////////////////////
		
		//clone�� �̿��� ���� ����
		Point cloneP3 = null;
		
		try {
			cloneP3 = (Point)oP.clone();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(cloneP3);
		cloneP3.x = 55;
		
		System.out.println(oP);
		// ������ ���� �ٲ㵵 ������ ���� �ʴ´�.
		
		// �迭�� ���� ���簡 �����ϴ�.
		// clone�� ����ϸ�
		int [] arr = {1,2,3,4,5};
		int [] other = arr.clone();
		
		arr[1] = 888;
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(other));
		
		
		
		}
		
	}


