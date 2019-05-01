package collection;

import java.util.LinkedList;
import java.util.List;

public class EnhancedForCollection {

	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		
		list.add("toy");
		list.add("box");
		list.add("Robot");
		
		for(String s : list) {
			System.out.println(s + '\t');
		}
			list.remove(0);
		System.out.println("=======================");
			for(String s :list) {
				System.out.println(s + '\t');
			}
		}
	}

