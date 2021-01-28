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
		//(Point)로 감싸주는 이유는 Object는 Point에 접근할 수 없다
		// 이는 부모가 자식을 감싸주는 것은 가능하나
		// 자식이 부모가 감쌀수는 없기 때문이다.
		// 떄문에 Object 클래스는 Object에만 접근할 수 있다.
//			return true;
//		}else {
//			return false;
//		}
			
		@Override
		public boolean equals(Object obj) {
			if(obj instanceof Point) {
				// 입력된 obj가 우선 Point의 인스턴스인지 체크
				Point p = (Point) obj;
				// 이후 필드값 비교를 위한 형변환
				return p.x == x && p.y == y;
				// 입력된 데이터와 현재 필드의 데이터 비교
				// 맞으면 false 아니면 true
			}else {
				return false;
				// 인스턴스가 아니면 false
			}	
	}
		
		@Override
		public Object clone() throws CloneNotSupportedException {
			//public으로 타입을 바꿔주어 상속클래스가 아닌 곳에서도
			// 접근할 수 있게 해준다.
			return super.clone();
		}
		
	
}
	
public class ObjectEx {
	public static void main(String[] args) {
		
//		Object obj = new Object();
//		Point p1 = new Point(10, 20);
//		
//		
//		//객체변수를 출력하면 참조값을 출력
//		System.out.println(obj);
//		System.out.println(p1);
//		// obj.toString과 같은 결과를 가진다.
//		// p1.toString과 같은 결과를 가진다.
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
//		//연산자비교(동일성 비교) identity
//		// 비교하는 객체가 같은 객체인지 검사한다.
//		// 참조값을 비교한다.
//		
//		
//		System.out.println("p2.equals(p3) :" + p2.equals(p3));
//		System.out.println("p2.equals(p4) :" + p2.equals(p4));
//		// equals 메소드 비교(동등성 비교), equality
//		// equals 메소드 비교(동등성 비교), equality
//		// 객체의 값가 같은 값을 가지는 지 검사
		
		
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
//		System.out.println(s2.hashCode()); //s1과 같다.
//		System.out.println(s3.hashCode());
//		System.out.println(s4.hashCode()); //s1과 같다.
//		// String 자체에서 hashCode를 재정의 했기 때문이다.
		
		System.out.println("======clone()======");
		
		Point oP = new Point(33, 44);
		
		Point cloneP1 = oP; //  얕은 복제
		Point cloneP2 = new Point (oP.x, oP.y); // 깊은 복제
		////////////////////////////////////////////////////
		
		//clone을 이용한 깊은 복사
		Point cloneP3 = null;
		
		try {
			cloneP3 = (Point)oP.clone();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(cloneP3);
		cloneP3.x = 55;
		
		System.out.println(oP);
		// 복제한 값을 바꿔도 문제가 되지 않는다.
		
		// 배열의 깊은 복사가 가능하다.
		// clone을 사용하면
		int [] arr = {1,2,3,4,5};
		int [] other = arr.clone();
		
		arr[1] = 888;
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(other));
		
		
		
		}
		
	}


