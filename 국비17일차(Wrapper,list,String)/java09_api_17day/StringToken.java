package java09_api_17day;

import java.util.StringTokenizer;

public class StringToken {

	public static void main(String[] args) {
		
		String data1 = "hi hello hola";
//		String [] token1 = data1.split(" ");
//		// " " �� �����ڷ� data1�� ��ūȭ �Ѵ�
//		// -> ����� String[] Ÿ������ ��ȯ
//		
//		for(int i = 0; i < token1.length; i++) {
//			System.out.println(token1[i]);
			
	
//			StringTokenizer str1 = new StringTokenizer(data1);
//			
//			System.out.println(str1.countTokens()); // 3
//			
//			while(str1.hasMoreTokens()) {
//				System.out.println(str1.nextToken());
//			}
			
			String data2 = "hi%!hello%!hola";
			StringTokenizer str2 = new StringTokenizer(data2, "%!");
			
			
			System.out.println(str2.nextToken());
			System.out.println(str2.nextToken());
			System.out.println(str2.nextToken());
	}

	}

