package java12_exception_19day;

public class ExceptionEx_02 {

	public static void main(String[] args) {

		int [] arr = new int [5];
		int i = 0;


		try {
			while(true) {
				arr[i] = i + 1;
				System.out.println(arr[i]);
				i++;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException �߻�");
			// �⺻���� ���Ǵ� ���� ��Ȳ ��� �޼ҵ�
			e.printStackTrace();
		}


		System.out.println("Program End");

	}

}
