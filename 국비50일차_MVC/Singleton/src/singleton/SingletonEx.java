package singleton;

public class SingletonEx {

	public static void main(String[] args) {
		
		Singleton_01 s1 = Singleton_01.getInstance();
		Singleton_01 s2 = Singleton_01.getInstance();
		Singleton_01 s3 = Singleton_01.getInstance();

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		//----------------------------------------------------------------
		
		//private이기 때문에 new 연산자 사용불가
//		Singleton_01 s4 = new Singleton_01();
//		Singleton_01 s5 = new Singleton_01();
		
		
		//----------------------------------------------------------------		
		System.out.println();
		System.out.println("----------singleton2-----------");
		Singleton_02 s6 = Singleton_02.getInstance();
		Singleton_02 s7 = Singleton_02.getInstance();
		System.out.println(s6);
		System.out.println(s7);
		
		//----------------------------------------------------------------
		System.out.println();
		System.out.println("----------singleton3-----------");
		Singleton_03 s8 = Singleton_03.getInstance();
		Singleton_03 s9 = Singleton_03.getInstance();
		System.out.println(s8);
		System.out.println(s9);
		
		
	}
}
