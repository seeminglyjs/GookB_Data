package java09_api_17day;

public class StringBuilderEx {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		
		System.out.println(sb.length()); //0
		System.out.println(sb.capacity()); // 16 ¿ë·®
		sb.append("123456789");
		System.out.println(sb);
		
		sb.insert(3, "q");
		System.out.println(sb);
		sb.replace(5, 6, "Gh");
		System.out.println(sb);
		sb.delete(5, 6);
		System.out.println(sb);
	}

}
