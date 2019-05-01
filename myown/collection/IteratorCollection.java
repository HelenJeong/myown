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
	
	Iterator<String> itr = list.iterator(); //�ݺ��� ó�� ȹ��
	
	while(itr.hasNext()) {
		System.out.println(itr.next()+'\t');
	System.out.println();
	}
	//��� box ���� 
	String str;
	while(itr.hasNext()) {
		 str = itr.next();
		if(str.equals("Box")) {
			itr.remove();
		}
	}
	
	System.out.println("========================");
	itr = list.iterator(); // �ݺ��� �ٽ� ȹ��
	
	while(itr.hasNext()) {
		System.out.println(itr.next() + '\t');
		System.out.println();
	}
	}
	

}
