package java06_class_10day.method;

public class Method_04 {
	
	public void returnTest01() {
		for(int i = 0; i < 100; i++) {
			if( i==5) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("close");
	}
	
//	public void str (String str){
//		str = "aaaa";
//	}
	
	public int returnTest02(int num) {
		if(num < 0) {
			return -1;
		}
		for(int i =0; i < num; i++) {
			System.out.println("aaaa");
		}
		return num;
	}
	
	
}
