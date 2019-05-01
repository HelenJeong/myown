package myown;

import java.util.ArrayList;
import java.util.List;

public class ex01 {

	public static void main(String[] args) {
//AraayList<E> : 배열기반 자료구조, 배열을 이용하여 인스턴스 저장
//ListedList<E> : 리스트 기반 자료구조, 리스트를 구성하여 인스턴스 저장, 인스턴스 저장 순서 유지, 동일 인스턴스의 중복 저장을 허용
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
