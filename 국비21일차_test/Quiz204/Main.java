package Quiz204;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<fruit> list = new ArrayList<>();
		
		list.add(new fruit("aa","aa"));
		list.add(new fruit("bb","bb"));
		list.add(new fruit("cc","cc"));

		System.out.println(list);
		
		list.remove(1);
		System.out.println(list);
		
		
		int temp = 0;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getName().equals("»ç°ú") && 
					list.get(i).getFlavor().equals("´ÞÄÞ")) {
				temp = i;
				list.remove(i);
				break;
			}
		}
		
		
	}

}
