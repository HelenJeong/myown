package myown;

public class Quiz_array_01 {

	public static void main(String[] args) {
		
		int[] jumsu = {82,85,76,79,96};
		int [] rank = {1,1,1,1,1};
		int temp =0;
		
		for(int i=0; i < jumsu.length ; i++) {
			for(int j=0 ; j < jumsu.length ; j++) {
				if(jumsu[i] > jumsu[j]) { //0 1
					rank[j]++; //1+1
				}
			}
		}
		for(int i=0; i<rank.length ; i++) {
		System.out.println( "  점수:  "+jumsu[i]+ "  등수:  "+rank[i]);
		
		}
		
		
	}

}
