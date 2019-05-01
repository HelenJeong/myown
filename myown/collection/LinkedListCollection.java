package collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCollection {

	public static void main(String[] args) {
	
		List<String> list = new LinkedList<String>();
		list.add("toy");
		list.add("box");
		list.add("Robot");
		
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i) + '\t');
			System.out.println();
		}
		list.remove(0);
		System.out.println("==================");
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i) + '\t');
			System.out.println();
		}
	}

}
