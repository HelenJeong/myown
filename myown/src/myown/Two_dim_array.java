package myown;

public class Two_dim_array {

	public static void main(String[] args) {
		
		int arr[][] = new int[][] {
			{10,20,30},
			{40,50,60},
			{70,80,90}
		};
		
//		System.out.println("arr[0][0]:" + arr[0][0]);
//		System.out.println("arr[0][1]:" + arr[0][1]);
//		System.out.println("arr[0][2]:" + arr[0][2]);
//		//System.out.println("arr[0][0]:" + arr[0][3]);
//		System.out.println("arr[1][0]:" + arr[1][0]);
//		System.out.println("arr[1][1]:" + arr[1][1]);
//		System.out.println("arr[1][2]:" + arr[1][2]);
//		//System.out.println("arr[0][0]:" + arr[1][3]);
//		System.out.println("arr[2][0]:" + arr[2][0]);
//		System.out.println("arr[2][1]:" + arr[2][1]);
//		System.out.println("arr[2][2]:" + arr[2][2]);
//		//System.out.println("arr[0][0]:" + arr[2][3]);

		for(int i=0; i<arr.length ; i++) {
			for(int j=0 ; j< arr[i].length;  j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
