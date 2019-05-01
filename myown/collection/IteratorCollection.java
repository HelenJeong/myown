package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorCollection {

	public static void main(String[] args) {
		
	List<String> list = new LinkedList<String>();
	list.add("Toy");
	list.add("Box");
	list.add("Robot");
	list.add("Box");
	
	Iterator<String> itr = list.iterator(); //¹Ýº¹ÀÚ Ã³À½ È¹µæ
	
	while(itr.hasNext()) {
		System.out.println(itr.next()+'\t');
	System.out.println();
	}
	//¸ðµç box »èÁ¦ 
	String str;
	while(itr.hasNext()) {
		 str = itr.next();
		if(str.equals("Box")) {
			itr.remove();
		}
	}
	
	System.out.println("========================");
	itr = list.iterator(); // ¹Ýº¹ÀÚ ´Ù½Ã È¹µæ
	
	while(itr.hasNext()) {
		System.out.println(itr.next() + '\t');
		System.out.println();
	}
	}
	

}
