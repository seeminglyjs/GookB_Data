package java10_collection_17day;

import java.util.ArrayList;
import java.util.List;

public class ArrayList2D {
	public static void main(String[] args) {

		List<ArrayList<Integer>> list2d = new ArrayList<>();

		list2d.add(new ArrayList<Integer>());
		list2d.add(new ArrayList<Integer>());
		list2d.add(new ArrayList<Integer>());

		list2d.get(0).add(10);
		list2d.get(0).add(15);
		list2d.get(0).add(20);


		list2d.get(1).add(25);
		list2d.get(1).add(30);


		list2d.get(2).add(45);
		list2d.get(2).add(50);

		for(int i = 0; i < list2d.size(); i++) {
			for(int j = 0; j < list2d.get(i).size(); j++) {
				System.out.print(list2d.get(i).get(j) + " ");
			}

			System.out.println();
		}
	}
}
