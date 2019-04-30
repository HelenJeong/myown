package myown;

public class Main01 {

	public static void main(String[] args) {
		
		overLoading_ex over = new overLoading_ex();
		System.out.println("결과:"+ over.sumFunc(10, 29)  );
		System.out.println("결과:" + over.sumFunc(101.11, 20.23));

	}

}

