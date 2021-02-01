package java11_Generic_18day;


class Class1 <T>{
	private T data;
	
	public T display(T data) {
		this.data = data;
		return data;
	}

	
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
		
}

public class Generic_02_GenericClass {

	public static void main(String[] args) {
		
		Class1<Integer> c1 = new Class1<>();
		
		int result = c1.display(100);
		System.out.println(result);
		System.out.println(c1.getData());
	}

}
