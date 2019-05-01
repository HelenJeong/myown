package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCollection {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("Toy");
		list.add("box");
		list.add("Robot");
		
		for(int i=0; i< list.size();i++) {
			System.out.println(list.get(i) + '\t');
			System.out.println();
		}
		
		list.remove(0);
		System.out.println("==============================");
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i) + '\t');
			System.out.println();
		}
	}

}
