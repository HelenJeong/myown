package myown;
import java.util.Scanner;

public class Quiz_Two_dim_array {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
			
		int arr[][] = new int[2][3];

		for(int i=0; i<arr.length ; i++) {
			for(int j=0 ; j< arr[i].length; j++) {
				System.out.println(i+"번쨰:" + j +"번째 입력:");
				arr[i][j] = input.nextInt();
			}
		}
		System.out.println("the number you put ");
		for(int j=0; j<arr.length; j++) {
			for(int k=0; k < arr[j].length ; k++)
				System.out.print(arr[j][k]+" ");
		System.out.println();
		}
		
	}

}
