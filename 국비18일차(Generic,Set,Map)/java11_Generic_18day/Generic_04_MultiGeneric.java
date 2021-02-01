package java11_Generic_18day;

class Class3 <T1, T2 >{
	private T1 data1;
	private T2 data2;
	
	
	public <K1 extends Number, K2 extends Number> void sum(K1 k1, K2 k2){
		int sum = k1.intValue() + k2.intValue();
		System.out.println(sum);
	}
	
	
	public T1 getData1() {
		return data1;
	}
	public void setData1(T1 data1) {
		this.data1 = data1;
	}
	public T2 getData2() {
		return data2;
	}
	public void setData2(T2 data2) {
		this.data2 = data2;
	}
	
	

}

public class Generic_04_MultiGeneric {
	public static void main(String[] args) {
	
	
	}

}
