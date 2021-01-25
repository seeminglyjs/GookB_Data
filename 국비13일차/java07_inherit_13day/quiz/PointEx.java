package java07_inherit_13day.quiz;

import java.util.HashSet;
import java.util.Set;

public class PointEx {

	public static void main(String[] args) {
		
//		Circle c = new Circle(5, 5, 10);
//		c.draw();
//		System.out.println("=================");
//		Rectangle r = new Rectangle(5,5, 5, 6);
//		r.draw();
//		System.out.println("=================");
//		Point [] arrP = new Point[5];
//		
//		for(int i = 0; i < arrP.length; i++) {
//			arrP[i] = new Circle(i + 3, i + 3, i + 5);
//			arrP[i].draw();
//			System.out.println();
//			System.out.println("=================");
//			arrP[i] = new Rectangle(i + 3, i + 3, i + 5, i + 5);
//			arrP[i].draw();
//			System.out.println();
//			System.out.println("=================");
//		}
//		
//		for(Point pp : arrP) {
//			pp = new Circle(3, 3, 5);
//			pp.draw();
//			System.out.println();
//			System.out.println("=================");
//			pp = new Rectangle(3,  3,  5,  5);
//			pp.draw();
//			System.out.println();
//			System.out.println("=================");
//		}
///////////////////////////////////////////////////////////////////////		
//		Rectangle[] rects = {
//				new Rectangle(),
//				new Rectangle(1,2,3,4),
//				new Rectangle(5,6,7,8)
//		};
//		
//		for(Rectangle r : rects) {
//			r.draw();
//			System.out.println("-=-=-=-=-=-=-");
//		}
///////////////////////////////////////////////////////////////////////			

		Point [] pArr = new Point[5];
		
		pArr[0] = new Circle();
		pArr[1] = new Rectangle();
		pArr[2] = new Circle(6,8,9);
		pArr[3] = new Rectangle(6,8,9,10);
		pArr[4] = new Rectangle(9,11,22,33);
		
		for(Point p : pArr) {
			p.draw();
			System.out.println("========================");
		}
		
		
		
		
		
	}

}
