package myown;

import java.util.ArrayList;
import java.util.List;

public class ex01 {

	public static void main(String[] args) {
//AraayList<E> : �迭��� �ڷᱸ��, �迭�� �̿��Ͽ� �ν��Ͻ� ����
//ListedList<E> : ����Ʈ ��� �ڷᱸ��, ����Ʈ�� �����Ͽ� �ν��Ͻ� ����, �ν��Ͻ� ���� ���� ����, ���� �ν��Ͻ��� �ߺ� ������ ���
		List<String> list = new ArrayList<>();
		list.add("Toy");
		list.add("Box");
		list.add("Roboot");
		
		for(int i=0; i< list.size();i++) {
			System.out.println(list.get(i) + '\r');
		} 
		System.out.println("===============");
		list.remove(0);
		
		for(int i=0; i< list.size(); i++) {
			System.out.println(list.get(i)+ '\r');
		}
	}

}
